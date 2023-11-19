package org.yamcs.http.api;

import java.util.concurrent.TimeUnit;

import org.yamcs.YamcsServer;
import org.yamcs.YamcsServerInstance;
import org.yamcs.api.Observer;
import org.yamcs.client.utils.WellKnownTypes;
import org.yamcs.http.BadRequestException;
import org.yamcs.http.Context;
import org.yamcs.http.InternalServerErrorException;
import org.yamcs.http.NotFoundException;
import org.yamcs.http.audit.AuditLog;
import org.yamcs.management.LinkListener;
import org.yamcs.management.LinkManager;
import org.yamcs.mdb.MdbFactory;
import org.yamcs.parameter.SystemParametersProducer;
import org.yamcs.parameter.SystemParametersService;
import org.yamcs.protobuf.links.AbstractLinksApi;
import org.yamcs.protobuf.links.DisableLinkRequest;
import org.yamcs.protobuf.links.EditLinkRequest;
import org.yamcs.protobuf.links.EnableLinkRequest;
import org.yamcs.protobuf.links.GetLinkRequest;
import org.yamcs.protobuf.links.LinkActionInfo;
import org.yamcs.protobuf.links.LinkEvent;
import org.yamcs.protobuf.links.LinkInfo;
import org.yamcs.protobuf.links.ListLinksRequest;
import org.yamcs.protobuf.links.ListLinksResponse;
import org.yamcs.protobuf.links.ResetLinkCountersRequest;
import org.yamcs.protobuf.links.RunActionRequest;
import org.yamcs.protobuf.links.SubscribeLinksRequest;
import org.yamcs.security.SystemPrivilege;
import org.yamcs.tctm.Link;
import org.yamcs.tctm.LinkAction;
import org.yamcs.tctm.LinkAction.ActionStyle;
import org.yamcs.tctm.LinkActionProvider;
import org.yamcs.xtce.Parameter;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Struct;
import com.google.protobuf.util.JsonFormat;

public class LinksApi extends AbstractLinksApi<Context> {

    public LinksApi(AuditLog auditLog) {
        auditLog.addPrivilegeChecker(getClass().getSimpleName(), user -> {
            return user.hasSystemPrivilege(SystemPrivilege.ReadLinks);
        });
    }

    @Override
    public void listLinks(Context ctx, ListLinksRequest request, Observer<ListLinksResponse> observer) {
        ctx.checkSystemPrivilege(SystemPrivilege.ReadLinks);

        var responseb = ListLinksResponse.newBuilder();

        if (request.hasInstance()) {
            var linkManager = InstancesApi.verifyInstanceObj(request.getInstance()).getLinkManager();
            for (var link : linkManager.getLinks()) {
                responseb.addLinks(toLink(request.getInstance(), link));
            }
        } else {
            for (YamcsServerInstance ysi : YamcsServer.getInstances()) {
                var linkManager = ysi.getLinkManager();
                for (var link : linkManager.getLinks()) {
                    responseb.addLinks(toLink(request.getInstance(), link));
                }
            }
        }

        observer.complete(responseb.build());
    }

    @Override
    public void subscribeLinks(Context ctx, SubscribeLinksRequest request, Observer<LinkEvent> observer) {
        ctx.checkSystemPrivilege(SystemPrivilege.ReadLinks);
        String instance = InstancesApi.verifyInstance(request.getInstance());
        YamcsServerInstance ysi = InstancesApi.verifyInstanceObj(instance);

        LinkManager linkManager = ysi.getLinkManager();
        for (Link link : linkManager.getLinks()) {
            observer.next(LinkEvent.newBuilder()
                    .setType(LinkEvent.Type.REGISTERED)
                    .setLinkInfo(toLink(instance, link))
                    .build());
        }

        LinkListener listener = new LinkListener() {
            @Override
            public void linkRegistered(LinkInfo linkInfo) {
                if (instance.equals(linkInfo.getInstance())) {
                    observer.next(LinkEvent.newBuilder()
                            .setType(LinkEvent.Type.REGISTERED)
                            .setLinkInfo(linkInfo)
                            .build());
                }
            }

            @Override
            public void linkUnregistered(LinkInfo linkInfo) {
                // NOP
            }

            @Override
            public void linkChanged(LinkInfo linkInfo) {
                if (instance.equals(linkInfo.getInstance())) {
                    observer.next(LinkEvent.newBuilder()
                            .setType(LinkEvent.Type.UPDATED)
                            .setLinkInfo(linkInfo)
                            .build());
                }
            }
        };

        var exec = YamcsServer.getServer().getThreadPoolExecutor();
        var future = exec.scheduleAtFixedRate(() -> {
            var b = LinkEvent.newBuilder()
                    .setType(LinkEvent.Type.UPDATE_ALL);
            for (var link : linkManager.getLinks()) {
                b.addLinks(toLink(instance, link));
            }
            observer.next(b.build());
        }, 0, 1, TimeUnit.SECONDS);
        observer.setCancelHandler(() -> {
            future.cancel(false);
            linkManager.removeLinkListener(listener);
        });
        linkManager.addLinkListener(listener);
    }

    @Override
    public void getLink(Context ctx, GetLinkRequest request, Observer<LinkInfo> observer) {
        ctx.checkSystemPrivilege(SystemPrivilege.ReadLinks);

        Link link = verifyLink(request.getInstance(), request.getLink());
        observer.complete(toLink(request.getInstance(), link));
    }

    @Override
    public void enableLink(Context ctx, EnableLinkRequest request, Observer<LinkInfo> observer) {
        ctx.checkSystemPrivilege(SystemPrivilege.ControlLinks);
        Link link = verifyLink(request.getInstance(), request.getLink());
        LinkManager lmgr = InstancesApi.verifyInstanceObj(request.getInstance()).getLinkManager();
        try {
            lmgr.enableLink(link.getName());
        } catch (IllegalArgumentException e) {
            throw new NotFoundException(e);
        }

        observer.complete(toLink(request.getInstance(), link));
    }

    @Override
    public void disableLink(Context ctx, DisableLinkRequest request, Observer<LinkInfo> observer) {
        ctx.checkSystemPrivilege(SystemPrivilege.ControlLinks);
        Link link = verifyLink(request.getInstance(), request.getLink());
        LinkManager lmgr = InstancesApi.verifyInstanceObj(request.getInstance()).getLinkManager();
        try {
            lmgr.disableLink(link.getName());
        } catch (IllegalArgumentException e) {
            throw new NotFoundException(e);
        }

        observer.complete(toLink(request.getInstance(), link));
    }

    @Override
    public void resetLinkCounters(Context ctx, ResetLinkCountersRequest request, Observer<LinkInfo> observer) {
        ctx.checkSystemPrivilege(SystemPrivilege.ControlLinks);
        Link link = verifyLink(request.getInstance(), request.getLink());
        LinkManager lmgr = InstancesApi.verifyInstanceObj(request.getInstance()).getLinkManager();
        try {
            lmgr.resetCounters(link.getName());
        } catch (IllegalArgumentException e) {
            throw new NotFoundException(e);
        }

        observer.complete(toLink(request.getInstance(), link));
    }

    @Override
    public void updateLink(Context ctx, EditLinkRequest request, Observer<LinkInfo> observer) {
        ctx.checkSystemPrivilege(SystemPrivilege.ControlLinks);

        Link link = verifyLink(request.getInstance(), request.getLink());

        String state = null;
        if (request.hasState()) {
            state = request.getState();
        }

        LinkManager lmgr = InstancesApi.verifyInstanceObj(request.getInstance()).getLinkManager();
        if (state != null) {
            switch (state.toLowerCase()) {
            case "enabled":
                try {
                    lmgr.enableLink(link.getName());
                } catch (IllegalArgumentException e) {
                    throw new NotFoundException(e);
                }
                break;
            case "disabled":
                try {
                    lmgr.disableLink(link.getName());
                } catch (IllegalArgumentException e) {
                    throw new NotFoundException(e);
                }
                break;
            default:
                throw new BadRequestException("Unsupported link state '" + state + "'");
            }
        }

        if (request.hasResetCounters() && request.getResetCounters()) {
            try {
                lmgr.resetCounters(link.getName());
            } catch (IllegalArgumentException e) {
                throw new NotFoundException(e);
            }
        }

        observer.complete(toLink(request.getInstance(), link));
    }

    @Override
    public void runAction(Context ctx, RunActionRequest request, Observer<Struct> observer) {
        ctx.checkSystemPrivilege(SystemPrivilege.ControlLinks);
        verifyLink(request.getInstance(), request.getLink());

        Gson gson = new Gson();
        JsonObject actionMessage = null;
        try {
            String json = JsonFormat.printer().print(request.getMessage());
            actionMessage = gson.fromJson(json, JsonElement.class).getAsJsonObject();
        } catch (InvalidProtocolBufferException e) {
            // Should not happen, it's already been converted from JSON through transcoding
            throw new InternalServerErrorException(e);
        }

        var linkManager = InstancesApi.verifyInstanceObj(request.getInstance()).getLinkManager();
        var link = linkManager.getLink(request.getLink());

        if (link instanceof LinkActionProvider) {
            var action = ((LinkActionProvider) link).getAction(request.getAction());
            if (action != null) {
                if (!action.isEnabled()) {
                    throw new BadRequestException("Action '" + request.getAction() + "' is not enabled");
                }

                JsonElement response = action.execute(link, actionMessage);
                if (response == null) {
                    observer.next(Struct.getDefaultInstance());
                } else {
                    var json = response.toString();
                    var responseb = Struct.newBuilder();
                    try {
                        JsonFormat.parser().merge(json, responseb);
                    } catch (InvalidProtocolBufferException e) {
                        throw new InternalServerErrorException(e);
                    }
                    observer.next(responseb.build());
                }
                return;
            }
        }

        throw new BadRequestException("Unknown action '" + request.getAction() + "'");
    }

    public static Link verifyLink(String instance, String linkName) {
        YamcsServerInstance ysi = InstancesApi.verifyInstanceObj(instance);
        LinkManager lmgr = ysi.getLinkManager();
        Link link = lmgr.getLink(linkName);
        if (link == null) {
            throw new NotFoundException("No link named '" + linkName + "' within instance '" + instance + "'");
        }
        return link;
    }

    private static LinkInfo toLink(String yamcsInstance, Link link) {
        var b = LinkInfo.newBuilder()
                .setInstance(yamcsInstance)
                .setName(link.getName())
                .setDisabled(link.isDisabled())
                .setStatus(link.getLinkStatus().name())
                .setType(link.getClass().getName())
                .setDataInCount(link.getDataInCount())
                .setDataOutCount(link.getDataOutCount());
        var detailedStatus = link.getDetailedStatus();
        if (detailedStatus != null) {
            b.setDetailedStatus(detailedStatus);
        }
        var extra = link.getExtraInfo();
        if (extra != null) {
            b.setExtra(WellKnownTypes.toStruct(extra));
        }
        var parent = link.getParent();
        if (parent != null) {
            b.setParentName(parent.getName());
        }
        if (link instanceof LinkActionProvider) {
            b.clearActions();
            for (var action : ((LinkActionProvider) link).getActions()) {
                b.addActions(toLinkActionInfo(action));
            }
        }
        if (link instanceof SystemParametersProducer) {
            var systemParametersService = SystemParametersService.getInstance(yamcsInstance);
            if (systemParametersService != null) {
                var mdb = MdbFactory.getInstance(yamcsInstance);
                var spaceSystemName = systemParametersService.getNamespace() + "/" + link.getName();
                var spaceSystem = mdb.getSpaceSystem(spaceSystemName);
                if (spaceSystem != null) {
                    spaceSystem.getParameters(true).stream()
                            .map(Parameter::getQualifiedName)
                            .sorted(String.CASE_INSENSITIVE_ORDER)
                            .forEach(b::addParameters);
                }
            }
        }

        return b.build();
    }

    private static LinkActionInfo toLinkActionInfo(LinkAction linkAction) {
        var b = LinkActionInfo.newBuilder()
                .setId(linkAction.getId())
                .setLabel(linkAction.getLabel())
                .setStyle(linkAction.getStyle().name())
                .setEnabled(linkAction.isEnabled());
        if (linkAction.getStyle() == ActionStyle.CHECK_BOX) {
            b.setChecked(linkAction.isChecked());
        }
        return b.build();
    }
}
