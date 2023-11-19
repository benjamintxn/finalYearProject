package org.yamcs.protobuf;

import com.google.protobuf.Descriptors.MethodDescriptor;
import com.google.protobuf.Descriptors.ServiceDescriptor;
import com.google.protobuf.Empty;
import com.google.protobuf.Message;
import org.yamcs.api.Api;
import org.yamcs.api.HttpBody;
import org.yamcs.api.Observer;
import org.yamcs.protobuf.Commanding.CommandHistoryEntry;

@javax.annotation.processing.Generated(value = "org.yamcs.protoc.ServiceGenerator", date = "2023-11-18T19:00:35.930414Z")
@SuppressWarnings("unchecked")
public abstract class AbstractCommandsApi<T> implements Api<T> {

    /**
     * <pre>
     *  Issue a command
     * 
     *  After validating the input parameters, the command is added to the appropriate
     *  command queue for further dispatch.
     * </pre>
     */
    public abstract void issueCommand(T ctx, IssueCommandRequest request, Observer<IssueCommandResponse> observer);

    /**
     * <pre>
     *  Update command history
     * </pre>
     */
    public abstract void updateCommandHistory(T ctx, UpdateCommandHistoryRequest request, Observer<Empty> observer);

    /**
     * <pre>
     *  List commands
     * </pre>
     */
    public abstract void listCommands(T ctx, ListCommandsRequest request, Observer<ListCommandsResponse> observer);

    /**
     * <pre>
     *  Get a command
     * </pre>
     */
    public abstract void getCommand(T ctx, GetCommandRequest request, Observer<CommandHistoryEntry> observer);

    /**
     * <pre>
     *  Streams back commands
     * </pre>
     */
    public abstract void streamCommands(T ctx, StreamCommandsRequest request, Observer<CommandHistoryEntry> observer);

    /**
     * <pre>
     *  Receive updates on issued commands
     * </pre>
     */
    public abstract void subscribeCommands(T ctx, SubscribeCommandsRequest request, Observer<CommandHistoryEntry> observer);

    /**
     * <pre>
     *  Export a raw command
     * </pre>
     */
    public abstract void exportCommand(T ctx, ExportCommandRequest request, Observer<HttpBody> observer);

    @Override
    public final ServiceDescriptor getDescriptorForType() {
        return CommandsServiceProto.getDescriptor().getServices().get(0);
    }

    @Override
    public final Message getRequestPrototype(MethodDescriptor method) {
        if (method.getService() != getDescriptorForType()) {
            throw new IllegalArgumentException("Method not contained by this service.");
        }
        switch (method.getIndex()) {
        case 0:
            return IssueCommandRequest.getDefaultInstance();
        case 1:
            return UpdateCommandHistoryRequest.getDefaultInstance();
        case 2:
            return ListCommandsRequest.getDefaultInstance();
        case 3:
            return GetCommandRequest.getDefaultInstance();
        case 4:
            return StreamCommandsRequest.getDefaultInstance();
        case 5:
            return SubscribeCommandsRequest.getDefaultInstance();
        case 6:
            return ExportCommandRequest.getDefaultInstance();
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
            return IssueCommandResponse.getDefaultInstance();
        case 1:
            return Empty.getDefaultInstance();
        case 2:
            return ListCommandsResponse.getDefaultInstance();
        case 3:
            return CommandHistoryEntry.getDefaultInstance();
        case 4:
            return CommandHistoryEntry.getDefaultInstance();
        case 5:
            return CommandHistoryEntry.getDefaultInstance();
        case 6:
            return HttpBody.getDefaultInstance();
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
            issueCommand(ctx, (IssueCommandRequest) request, (Observer<IssueCommandResponse>)(Object) future);
            return;
        case 1:
            updateCommandHistory(ctx, (UpdateCommandHistoryRequest) request, (Observer<Empty>)(Object) future);
            return;
        case 2:
            listCommands(ctx, (ListCommandsRequest) request, (Observer<ListCommandsResponse>)(Object) future);
            return;
        case 3:
            getCommand(ctx, (GetCommandRequest) request, (Observer<CommandHistoryEntry>)(Object) future);
            return;
        case 4:
            streamCommands(ctx, (StreamCommandsRequest) request, (Observer<CommandHistoryEntry>)(Object) future);
            return;
        case 5:
            subscribeCommands(ctx, (SubscribeCommandsRequest) request, (Observer<CommandHistoryEntry>)(Object) future);
            return;
        case 6:
            exportCommand(ctx, (ExportCommandRequest) request, (Observer<HttpBody>)(Object) future);
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
