package org.yamcs.protobuf.links;

import com.google.protobuf.Struct;
import org.yamcs.api.MethodHandler;
import org.yamcs.api.Observer;

@javax.annotation.processing.Generated(value = "org.yamcs.protoc.ServiceGenerator", date = "2023-11-18T19:00:35.928374Z")
public class LinksApiClient extends AbstractLinksApi<Void> {

    private final MethodHandler handler;

    public LinksApiClient(MethodHandler handler) {
        this.handler = handler;
    }

    /**
     * <pre>
     *  List links
     * </pre>
     */
    @Override
    public final void listLinks(Void ctx, ListLinksRequest request, Observer<ListLinksResponse> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(0),
            request,
            ListLinksResponse.getDefaultInstance(),
            observer);
    }

    /**
     * <pre>
     *  Get a link
     * </pre>
     */
    @Override
    public final void getLink(Void ctx, GetLinkRequest request, Observer<LinkInfo> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(1),
            request,
            LinkInfo.getDefaultInstance(),
            observer);
    }

    /**
     * <pre>
     *  Update a link
     * </pre>
     */
    @Override
    public final void updateLink(Void ctx, EditLinkRequest request, Observer<LinkInfo> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(2),
            request,
            LinkInfo.getDefaultInstance(),
            observer);
    }

    /**
     * <pre>
     *  Enable a link
     * </pre>
     */
    @Override
    public final void enableLink(Void ctx, EnableLinkRequest request, Observer<LinkInfo> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(3),
            request,
            LinkInfo.getDefaultInstance(),
            observer);
    }

    /**
     * <pre>
     *  Disable a link
     * </pre>
     */
    @Override
    public final void disableLink(Void ctx, DisableLinkRequest request, Observer<LinkInfo> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(4),
            request,
            LinkInfo.getDefaultInstance(),
            observer);
    }

    /**
     * <pre>
     *  Reset link counters
     * </pre>
     */
    @Override
    public final void resetLinkCounters(Void ctx, ResetLinkCountersRequest request, Observer<LinkInfo> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(5),
            request,
            LinkInfo.getDefaultInstance(),
            observer);
    }

    /**
     * <pre>
     *  Receive link updates
     * </pre>
     */
    @Override
    public final void subscribeLinks(Void ctx, SubscribeLinksRequest request, Observer<LinkEvent> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(6),
            request,
            LinkEvent.getDefaultInstance(),
            observer);
    }

    /**
     * <pre>
     *  Run a link-specific action.
     * 
     *  It is up to the link implementation to register and handle
     *  any link actions.
     * </pre>
     */
    @Override
    public final void runAction(Void ctx, RunActionRequest request, Observer<Struct> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(7),
            request,
            Struct.getDefaultInstance(),
            observer);
    }
}
