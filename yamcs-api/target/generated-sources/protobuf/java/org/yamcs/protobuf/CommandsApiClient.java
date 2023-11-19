package org.yamcs.protobuf;

import com.google.protobuf.Empty;
import org.yamcs.api.HttpBody;
import org.yamcs.api.MethodHandler;
import org.yamcs.api.Observer;
import org.yamcs.protobuf.Commanding.CommandHistoryEntry;

@javax.annotation.processing.Generated(value = "org.yamcs.protoc.ServiceGenerator", date = "2023-11-18T19:00:35.930684Z")
public class CommandsApiClient extends AbstractCommandsApi<Void> {

    private final MethodHandler handler;

    public CommandsApiClient(MethodHandler handler) {
        this.handler = handler;
    }

    /**
     * <pre>
     *  Issue a command
     * 
     *  After validating the input parameters, the command is added to the appropriate
     *  command queue for further dispatch.
     * </pre>
     */
    @Override
    public final void issueCommand(Void ctx, IssueCommandRequest request, Observer<IssueCommandResponse> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(0),
            request,
            IssueCommandResponse.getDefaultInstance(),
            observer);
    }

    /**
     * <pre>
     *  Update command history
     * </pre>
     */
    @Override
    public final void updateCommandHistory(Void ctx, UpdateCommandHistoryRequest request, Observer<Empty> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(1),
            request,
            Empty.getDefaultInstance(),
            observer);
    }

    /**
     * <pre>
     *  List commands
     * </pre>
     */
    @Override
    public final void listCommands(Void ctx, ListCommandsRequest request, Observer<ListCommandsResponse> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(2),
            request,
            ListCommandsResponse.getDefaultInstance(),
            observer);
    }

    /**
     * <pre>
     *  Get a command
     * </pre>
     */
    @Override
    public final void getCommand(Void ctx, GetCommandRequest request, Observer<CommandHistoryEntry> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(3),
            request,
            CommandHistoryEntry.getDefaultInstance(),
            observer);
    }

    /**
     * <pre>
     *  Streams back commands
     * </pre>
     */
    @Override
    public final void streamCommands(Void ctx, StreamCommandsRequest request, Observer<CommandHistoryEntry> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(4),
            request,
            CommandHistoryEntry.getDefaultInstance(),
            observer);
    }

    /**
     * <pre>
     *  Receive updates on issued commands
     * </pre>
     */
    @Override
    public final void subscribeCommands(Void ctx, SubscribeCommandsRequest request, Observer<CommandHistoryEntry> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(5),
            request,
            CommandHistoryEntry.getDefaultInstance(),
            observer);
    }

    /**
     * <pre>
     *  Export a raw command
     * </pre>
     */
    @Override
    public final void exportCommand(Void ctx, ExportCommandRequest request, Observer<HttpBody> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(6),
            request,
            HttpBody.getDefaultInstance(),
            observer);
    }
}
