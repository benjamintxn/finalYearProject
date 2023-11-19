package org.yamcs.protobuf.links;

import com.google.protobuf.Descriptors.MethodDescriptor;
import com.google.protobuf.Descriptors.ServiceDescriptor;
import com.google.protobuf.Message;
import com.google.protobuf.Struct;
import org.yamcs.api.Api;
import org.yamcs.api.Observer;

@javax.annotation.processing.Generated(value = "org.yamcs.protoc.ServiceGenerator", date = "2023-11-18T19:00:35.927894Z")
@SuppressWarnings("unchecked")
public abstract class AbstractLinksApi<T> implements Api<T> {

    /**
     * <pre>
     *  List links
     * </pre>
     */
    public abstract void listLinks(T ctx, ListLinksRequest request, Observer<ListLinksResponse> observer);

    /**
     * <pre>
     *  Get a link
     * </pre>
     */
    public abstract void getLink(T ctx, GetLinkRequest request, Observer<LinkInfo> observer);

    /**
     * <pre>
     *  Update a link
     * </pre>
     */
    public abstract void updateLink(T ctx, EditLinkRequest request, Observer<LinkInfo> observer);

    /**
     * <pre>
     *  Enable a link
     * </pre>
     */
    public abstract void enableLink(T ctx, EnableLinkRequest request, Observer<LinkInfo> observer);

    /**
     * <pre>
     *  Disable a link
     * </pre>
     */
    public abstract void disableLink(T ctx, DisableLinkRequest request, Observer<LinkInfo> observer);

    /**
     * <pre>
     *  Reset link counters
     * </pre>
     */
    public abstract void resetLinkCounters(T ctx, ResetLinkCountersRequest request, Observer<LinkInfo> observer);

    /**
     * <pre>
     *  Receive link updates
     * </pre>
     */
    public abstract void subscribeLinks(T ctx, SubscribeLinksRequest request, Observer<LinkEvent> observer);

    /**
     * <pre>
     *  Run a link-specific action.
     * 
     *  It is up to the link implementation to register and handle
     *  any link actions.
     * </pre>
     */
    public abstract void runAction(T ctx, RunActionRequest request, Observer<Struct> observer);

    @Override
    public final ServiceDescriptor getDescriptorForType() {
        return LinksServiceProto.getDescriptor().getServices().get(0);
    }

    @Override
    public final Message getRequestPrototype(MethodDescriptor method) {
        if (method.getService() != getDescriptorForType()) {
            throw new IllegalArgumentException("Method not contained by this service.");
        }
        switch (method.getIndex()) {
        case 0:
            return ListLinksRequest.getDefaultInstance();
        case 1:
            return GetLinkRequest.getDefaultInstance();
        case 2:
            return EditLinkRequest.getDefaultInstance();
        case 3:
            return EnableLinkRequest.getDefaultInstance();
        case 4:
            return DisableLinkRequest.getDefaultInstance();
        case 5:
            return ResetLinkCountersRequest.getDefaultInstance();
        case 6:
            return SubscribeLinksRequest.getDefaultInstance();
        case 7:
            return RunActionRequest.getDefaultInstance();
        default:
            throw new IllegalStateException();
        }
    }

    @Override
    public final Message getResponsePrototype(MethodDescriptor method) {
        if (method.getService() != getDescriptorForType()) {
            throw new IllegalArgumentException("Method not contained by this service.");
        }
        switch (method.getIndex()) {
        case 0:
            return ListLinksResponse.getDefaultInstance();
        case 1:
            return LinkInfo.getDefaultInstance();
        case 2:
            return LinkInfo.getDefaultInstance();
        case 3:
            return LinkInfo.getDefaultInstance();
        case 4:
            return LinkInfo.getDefaultInstance();
        case 5:
            return LinkInfo.getDefaultInstance();
        case 6:
            return LinkEvent.getDefaultInstance();
        case 7:
            return Struct.getDefaultInstance();
        default:
            throw new IllegalStateException();
        }
    }

    @Override
    public final void callMethod(MethodDescriptor method, T ctx, Message request, Observer<Message> future) {
        if (method.getService() != getDescriptorForType()) {
            throw new IllegalArgumentException("Method not contained by this service.");
        }
        switch (method.getIndex()) {
        case 0:
            listLinks(ctx, (ListLinksRequest) request, (Observer<ListLinksResponse>)(Object) future);
            return;
        case 1:
            getLink(ctx, (GetLinkRequest) request, (Observer<LinkInfo>)(Object) future);
            return;
        case 2:
            updateLink(ctx, (EditLinkRequest) request, (Observer<LinkInfo>)(Object) future);
            return;
        case 3:
            enableLink(ctx, (EnableLinkRequest) request, (Observer<LinkInfo>)(Object) future);
            return;
        case 4:
            disableLink(ctx, (DisableLinkRequest) request, (Observer<LinkInfo>)(Object) future);
            return;
        case 5:
            resetLinkCounters(ctx, (ResetLinkCountersRequest) request, (Observer<LinkInfo>)(Object) future);
            return;
        case 6:
            subscribeLinks(ctx, (SubscribeLinksRequest) request, (Observer<LinkEvent>)(Object) future);
            return;
        case 7:
            runAction(ctx, (RunActionRequest) request, (Observer<Struct>)(Object) future);
            return;
        default:
            throw new IllegalStateException();
        }
    }

    @Override
    public final Observer<Message> callMethod(MethodDescriptor method, T ctx, Observer<Message> future) {
        if (method.getService() != getDescriptorForType()) {
            throw new IllegalArgumentException("Method not contained by this service.");
        }
        switch (method.getIndex()) {
        default:
            throw new IllegalStateException();
        }
    }
}
