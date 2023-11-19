package org.yamcs.protobuf;

import com.google.protobuf.Empty;
import org.yamcs.api.MethodHandler;
import org.yamcs.api.Observer;
import org.yamcs.protobuf.Commanding.CommandQueueEvent;
import org.yamcs.protobuf.Commanding.CommandQueueInfo;

@javax.annotation.processing.Generated(value = "org.yamcs.protoc.ServiceGenerator", date = "2023-11-18T19:00:35.931113Z")
public class QueuesApiClient extends AbstractQueuesApi<Void> {

    private final MethodHandler handler;

    public QueuesApiClient(MethodHandler handler) {
        this.handler = handler;
    }

    /**
     * <pre>
     *  List command queues
     * </pre>
     */
    @Override
    public final void listQueues(Void ctx, ListQueuesRequest request, Observer<ListQueuesResponse> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(0),
            request,
            ListQueuesResponse.getDefaultInstance(),
            observer);
    }

    /**
     * <pre>
     *  Get a command queue
     * </pre>
     */
    @Override
    public final void getQueue(Void ctx, GetQueueRequest request, Observer<CommandQueueInfo> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(1),
            request,
            CommandQueueInfo.getDefaultInstance(),
            observer);
    }

    /**
     * <pre>
     *  Enable a command queue
     * </pre>
     */
    @Override
    public final void enableQueue(Void ctx, EnableQueueRequest request, Observer<CommandQueueInfo> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(2),
            request,
            CommandQueueInfo.getDefaultInstance(),
            observer);
    }

    /**
     * <pre>
     *  Disable a command queue
     * </pre>
     */
    @Override
    public final void disableQueue(Void ctx, DisableQueueRequest request, Observer<CommandQueueInfo> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(3),
            request,
            CommandQueueInfo.getDefaultInstance(),
            observer);
    }

    /**
     * <pre>
     *  Block a command queue
     * </pre>
     */
    @Override
    public final void blockQueue(Void ctx, BlockQueueRequest request, Observer<CommandQueueInfo> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(4),
            request,
            CommandQueueInfo.getDefaultInstance(),
            observer);
    }

    /**
     * <pre>
     *  Receive updates on queue stats
     * </pre>
     */
    @Override
    public final void subscribeQueueStatistics(Void ctx, SubscribeQueueStatisticsRequest request, Observer<CommandQueueInfo> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(5),
            request,
            CommandQueueInfo.getDefaultInstance(),
            observer);
    }

    /**
     * <pre>
     *  Receive updates on queue events
     * </pre>
     */
    @Override
    public final void subscribeQueueEvents(Void ctx, SubscribeQueueEventsRequest request, Observer<CommandQueueEvent> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(6),
            request,
            CommandQueueEvent.getDefaultInstance(),
            observer);
    }

    /**
     * <pre>
     *  List queued commands
     * </pre>
     */
    @Override
    public final void listQueuedCommands(Void ctx, ListQueuedCommandsRequest request, Observer<ListQueuedCommandsResponse> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(7),
            request,
            ListQueuedCommandsResponse.getDefaultInstance(),
            observer);
    }

    /**
     * <pre>
     *  Accept a queued command
     * </pre>
     */
    @Override
    public final void acceptCommand(Void ctx, AcceptCommandRequest request, Observer<Empty> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(8),
            request,
            Empty.getDefaultInstance(),
            observer);
    }

    /**
     * <pre>
     *  Reject a queued command
     * </pre>
     */
    @Override
    public final void rejectCommand(Void ctx, RejectCommandRequest request, Observer<Empty> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(9),
            request,
            Empty.getDefaultInstance(),
            observer);
    }
}
