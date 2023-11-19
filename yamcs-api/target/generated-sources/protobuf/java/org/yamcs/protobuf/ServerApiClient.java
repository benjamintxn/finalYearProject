package org.yamcs.protobuf;

import com.google.protobuf.Empty;
import org.yamcs.api.HttpBody;
import org.yamcs.api.MethodHandler;
import org.yamcs.api.Observer;

/**
 * <pre>
 *  Handles incoming requests related to api routes
 * </pre>
 */
@javax.annotation.processing.Generated(value = "org.yamcs.protoc.ServiceGenerator", date = "2023-11-18T19:00:35.925324Z")
public class ServerApiClient extends AbstractServerApi<Void> {

    private final MethodHandler handler;

    public ServerApiClient(MethodHandler handler) {
        this.handler = handler;
    }

    /**
     * <pre>
     *  Get general server info
     * </pre>
     */
    @Override
    public final void getServerInfo(Void ctx, Empty request, Observer<GetServerInfoResponse> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(0),
            request,
            GetServerInfoResponse.getDefaultInstance(),
            observer);
    }

    /**
     * <pre>
     *  Get system info
     * </pre>
     */
    @Override
    public final void getSystemInfo(Void ctx, Empty request, Observer<SystemInfo> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(1),
            request,
            SystemInfo.getDefaultInstance(),
            observer);
    }

    /**
     * <pre>
     *  Receive system info updates
     * </pre>
     */
    @Override
    public final void subscribeSystemInfo(Void ctx, Empty request, Observer<SystemInfo> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(2),
            request,
            SystemInfo.getDefaultInstance(),
            observer);
    }

    /**
     * <pre>
     *  List routes
     * </pre>
     */
    @Override
    public final void listRoutes(Void ctx, Empty request, Observer<ListRoutesResponse> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(3),
            request,
            ListRoutesResponse.getDefaultInstance(),
            observer);
    }

    /**
     * <pre>
     *  List topics
     * </pre>
     */
    @Override
    public final void listTopics(Void ctx, Empty request, Observer<ListTopicsResponse> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(4),
            request,
            ListTopicsResponse.getDefaultInstance(),
            observer);
    }

    /**
     * <pre>
     *  List threads
     * </pre>
     */
    @Override
    public final void listThreads(Void ctx, ListThreadsRequest request, Observer<ListThreadsResponse> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(5),
            request,
            ListThreadsResponse.getDefaultInstance(),
            observer);
    }

    /**
     * <pre>
     *  Get info on a single thread
     * </pre>
     */
    @Override
    public final void getThread(Void ctx, GetThreadRequest request, Observer<ThreadInfo> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(6),
            request,
            ThreadInfo.getDefaultInstance(),
            observer);
    }

    /**
     * <pre>
     *  Get a text-dump with thread information
     * </pre>
     */
    @Override
    public final void dumpThreads(Void ctx, Empty request, Observer<HttpBody> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(7),
            request,
            HttpBody.getDefaultInstance(),
            observer);
    }

    /**
     * <pre>
     *  Get HTTP traffic
     * </pre>
     */
    @Override
    public final void getHttpTraffic(Void ctx, Empty request, Observer<HttpTraffic> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(8),
            request,
            HttpTraffic.getDefaultInstance(),
            observer);
    }
}
