package org.yamcs.protobuf;

import com.google.protobuf.Descriptors.MethodDescriptor;
import com.google.protobuf.Descriptors.ServiceDescriptor;
import com.google.protobuf.Empty;
import com.google.protobuf.Message;
import org.yamcs.api.Api;
import org.yamcs.api.Observer;
import org.yamcs.protobuf.Commanding.CommandQueueEvent;
import org.yamcs.protobuf.Commanding.CommandQueueInfo;

@javax.annotation.processing.Generated(value = "org.yamcs.protoc.ServiceGenerator", date = "2023-11-18T19:00:35.930850Z")
@SuppressWarnings("unchecked")
public abstract class AbstractQueuesApi<T> implements Api<T> {

    /**
     * <pre>
     *  List command queues
     * </pre>
     */
    public abstract void listQueues(T ctx, ListQueuesRequest request, Observer<ListQueuesResponse> observer);

    /**
     * <pre>
     *  Get a command queue
     * </pre>
     */
    public abstract void getQueue(T ctx, GetQueueRequest request, Observer<CommandQueueInfo> observer);

    /**
     * <pre>
     *  Enable a command queue
     * </pre>
     */
    public abstract void enableQueue(T ctx, EnableQueueRequest request, Observer<CommandQueueInfo> observer);

    /**
     * <pre>
     *  Disable a command queue
     * </pre>
     */
    public abstract void disableQueue(T ctx, DisableQueueRequest request, Observer<CommandQueueInfo> observer);

    /**
     * <pre>
     *  Block a command queue
     * </pre>
     */
    public abstract void blockQueue(T ctx, BlockQueueRequest request, Observer<CommandQueueInfo> observer);

    /**
     * <pre>
     *  Receive updates on queue stats
     * </pre>
     */
    public abstract void subscribeQueueStatistics(T ctx, SubscribeQueueStatisticsRequest request, Observer<CommandQueueInfo> observer);

    /**
     * <pre>
     *  Receive updates on queue events
     * </pre>
     */
    public abstract void subscribeQueueEvents(T ctx, SubscribeQueueEventsRequest request, Observer<CommandQueueEvent> observer);

    /**
     * <pre>
     *  List queued commands
     * </pre>
     */
    public abstract void listQueuedCommands(T ctx, ListQueuedCommandsRequest request, Observer<ListQueuedCommandsResponse> observer);

    /**
     * <pre>
     *  Accept a queued command
     * </pre>
     */
    public abstract void acceptCommand(T ctx, AcceptCommandRequest request, Observer<Empty> observer);

    /**
     * <pre>
     *  Reject a queued command
     * </pre>
     */
    public abstract void rejectCommand(T ctx, RejectCommandRequest request, Observer<Empty> observer);

    @Override
    public final ServiceDescriptor getDescriptorForType() {
        return QueuesServiceProto.getDescriptor().getServices().get(0);
    }

    @Override
    public final Message getRequestPrototype(MethodDescriptor method) {
        if (method.getService() != getDescriptorForType()) {
            throw new IllegalArgumentException("Method not contained by this service.");
        }
        switch (method.getIndex()) {
        case 0:
            return ListQueuesRequest.getDefaultInstance();
        case 1:
            return GetQueueRequest.getDefaultInstance();
        case 2:
            return EnableQueueRequest.getDefaultInstance();
        case 3:
            return DisableQueueRequest.getDefaultInstance();
        case 4:
            return BlockQueueRequest.getDefaultInstance();
        case 5:
            return SubscribeQueueStatisticsRequest.getDefaultInstance();
        case 6:
            return SubscribeQueueEventsRequest.getDefaultInstance();
        case 7:
            return ListQueuedCommandsRequest.getDefaultInstance();
        case 8:
            return AcceptCommandRequest.getDefaultInstance();
        case 9:
            return RejectCommandRequest.getDefaultInstance();
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
            return ListQueuesResponse.getDefaultInstance();
        case 1:
            return CommandQueueInfo.getDefaultInstance();
        case 2:
            return CommandQueueInfo.getDefaultInstance();
        case 3:
            return CommandQueueInfo.getDefaultInstance();
        case 4:
            return CommandQueueInfo.getDefaultInstance();
        case 5:
            return CommandQueueInfo.getDefaultInstance();
        case 6:
            return CommandQueueEvent.getDefaultInstance();
        case 7:
            return ListQueuedCommandsResponse.getDefaultInstance();
        case 8:
            return Empty.getDefaultInstance();
        case 9:
            return Empty.getDefaultInstance();
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
            listQueues(ctx, (ListQueuesRequest) request, (Observer<ListQueuesResponse>)(Object) future);
            return;
        case 1:
            getQueue(ctx, (GetQueueRequest) request, (Observer<CommandQueueInfo>)(Object) future);
            return;
        case 2:
            enableQueue(ctx, (EnableQueueRequest) request, (Observer<CommandQueueInfo>)(Object) future);
            return;
        case 3:
            disableQueue(ctx, (DisableQueueRequest) request, (Observer<CommandQueueInfo>)(Object) future);
            return;
        case 4:
            blockQueue(ctx, (BlockQueueRequest) request, (Observer<CommandQueueInfo>)(Object) future);
            return;
        case 5:
            subscribeQueueStatistics(ctx, (SubscribeQueueStatisticsRequest) request, (Observer<CommandQueueInfo>)(Object) future);
            return;
        case 6:
            subscribeQueueEvents(ctx, (SubscribeQueueEventsRequest) request, (Observer<CommandQueueEvent>)(Object) future);
            return;
        case 7:
            listQueuedCommands(ctx, (ListQueuedCommandsRequest) request, (Observer<ListQueuedCommandsResponse>)(Object) future);
            return;
        case 8:
            acceptCommand(ctx, (AcceptCommandRequest) request, (Observer<Empty>)(Object) future);
            return;
        case 9:
            rejectCommand(ctx, (RejectCommandRequest) request, (Observer<Empty>)(Object) future);
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
