package org.yamcs.protobuf;

import com.google.protobuf.Descriptors.MethodDescriptor;
import com.google.protobuf.Descriptors.ServiceDescriptor;
import com.google.protobuf.Empty;
import com.google.protobuf.Message;
import org.yamcs.api.Api;
import org.yamcs.api.HttpBody;
import org.yamcs.api.Observer;

/**
 * <pre>
 *  Handles incoming requests related to api routes
 * </pre>
 */
@javax.annotation.processing.Generated(value = "org.yamcs.protoc.ServiceGenerator", date = "2023-11-18T19:00:35.925081Z")
@SuppressWarnings("unchecked")
public abstract class AbstractServerApi<T> implements Api<T> {

    /**
     * <pre>
     *  Get general server info
     * </pre>
     */
    public abstract void getServerInfo(T ctx, Empty request, Observer<GetServerInfoResponse> observer);

    /**
     * <pre>
     *  Get system info
     * </pre>
     */
    public abstract void getSystemInfo(T ctx, Empty request, Observer<SystemInfo> observer);

    /**
     * <pre>
     *  Receive system info updates
     * </pre>
     */
    public abstract void subscribeSystemInfo(T ctx, Empty request, Observer<SystemInfo> observer);

    /**
     * <pre>
     *  List routes
     * </pre>
     */
    public abstract void listRoutes(T ctx, Empty request, Observer<ListRoutesResponse> observer);

    /**
     * <pre>
     *  List topics
     * </pre>
     */
    public abstract void listTopics(T ctx, Empty request, Observer<ListTopicsResponse> observer);

    /**
     * <pre>
     *  List threads
     * </pre>
     */
    public abstract void listThreads(T ctx, ListThreadsRequest request, Observer<ListThreadsResponse> observer);

    /**
     * <pre>
     *  Get info on a single thread
     * </pre>
     */
    public abstract void getThread(T ctx, GetThreadRequest request, Observer<ThreadInfo> observer);

    /**
     * <pre>
     *  Get a text-dump with thread information
     * </pre>
     */
    public abstract void dumpThreads(T ctx, Empty request, Observer<HttpBody> observer);

    /**
     * <pre>
     *  Get HTTP traffic
     * </pre>
     */
    public abstract void getHttpTraffic(T ctx, Empty request, Observer<HttpTraffic> observer);

    @Override
    public final ServiceDescriptor getDescriptorForType() {
        return ServerServiceProto.getDescriptor().getServices().get(0);
    }

    @Override
    public final Message getRequestPrototype(MethodDescriptor method) {
        if (method.getService() != getDescriptorForType()) {
            throw new IllegalArgumentException("Method not contained by this service.");
        }
        switch (method.getIndex()) {
        case 0:
            return Empty.getDefaultInstance();
        case 1:
            return Empty.getDefaultInstance();
        case 2:
            return Empty.getDefaultInstance();
        case 3:
            return Empty.getDefaultInstance();
        case 4:
            return Empty.getDefaultInstance();
        case 5:
            return ListThreadsRequest.getDefaultInstance();
        case 6:
            return GetThreadRequest.getDefaultInstance();
        case 7:
            return Empty.getDefaultInstance();
        case 8:
            return Empty.getDefaultInstance();
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
            return GetServerInfoResponse.getDefaultInstance();
        case 1:
            return SystemInfo.getDefaultInstance();
        case 2:
            return SystemInfo.getDefaultInstance();
        case 3:
            return ListRoutesResponse.getDefaultInstance();
        case 4:
            return ListTopicsResponse.getDefaultInstance();
        case 5:
            return ListThreadsResponse.getDefaultInstance();
        case 6:
            return ThreadInfo.getDefaultInstance();
        case 7:
            return HttpBody.getDefaultInstance();
        case 8:
            return HttpTraffic.getDefaultInstance();
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
            getServerInfo(ctx, (Empty) request, (Observer<GetServerInfoResponse>)(Object) future);
            return;
        case 1:
            getSystemInfo(ctx, (Empty) request, (Observer<SystemInfo>)(Object) future);
            return;
        case 2:
            subscribeSystemInfo(ctx, (Empty) request, (Observer<SystemInfo>)(Object) future);
            return;
        case 3:
            listRoutes(ctx, (Empty) request, (Observer<ListRoutesResponse>)(Object) future);
            return;
        case 4:
            listTopics(ctx, (Empty) request, (Observer<ListTopicsResponse>)(Object) future);
            return;
        case 5:
            listThreads(ctx, (ListThreadsRequest) request, (Observer<ListThreadsResponse>)(Object) future);
            return;
        case 6:
            getThread(ctx, (GetThreadRequest) request, (Observer<ThreadInfo>)(Object) future);
            return;
        case 7:
            dumpThreads(ctx, (Empty) request, (Observer<HttpBody>)(Object) future);
            return;
        case 8:
            getHttpTraffic(ctx, (Empty) request, (Observer<HttpTraffic>)(Object) future);
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
