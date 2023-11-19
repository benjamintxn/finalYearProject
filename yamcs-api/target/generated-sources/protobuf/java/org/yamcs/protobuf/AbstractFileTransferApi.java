package org.yamcs.protobuf;

import com.google.protobuf.Descriptors.MethodDescriptor;
import com.google.protobuf.Descriptors.ServiceDescriptor;
import com.google.protobuf.Empty;
import com.google.protobuf.Message;
import org.yamcs.api.Api;
import org.yamcs.api.Observer;

@javax.annotation.processing.Generated(value = "org.yamcs.protoc.ServiceGenerator", date = "2023-11-18T19:00:35.929132Z")
@SuppressWarnings("unchecked")
public abstract class AbstractFileTransferApi<T> implements Api<T> {

    /**
     * <pre>
     *  List file transfer services
     * </pre>
     */
    public abstract void listFileTransferServices(T ctx, ListFileTransferServicesRequest request, Observer<ListFileTransferServicesResponse> observer);

    /**
     * <pre>
     *  List transfers
     * </pre>
     */
    public abstract void listTransfers(T ctx, ListTransfersRequest request, Observer<ListTransfersResponse> observer);

    /**
     * <pre>
     *  Get a transfer
     * </pre>
     */
    public abstract void getTransfer(T ctx, GetTransferRequest request, Observer<TransferInfo> observer);

    /**
     * <pre>
     *  Create a transfer
     * </pre>
     */
    public abstract void createTransfer(T ctx, CreateTransferRequest request, Observer<TransferInfo> observer);

    /**
     * <pre>
     *  Pause a transfer
     * </pre>
     */
    public abstract void pauseTransfer(T ctx, PauseTransferRequest request, Observer<Empty> observer);

    /**
     * <pre>
     *  Cancel a transfer
     * 
     *  The ongoing transfer is aborted, partially uploaded/downloaded files
     *  are retained.
     * </pre>
     */
    public abstract void cancelTransfer(T ctx, CancelTransferRequest request, Observer<Empty> observer);

    /**
     * <pre>
     *  Resume a transfer
     * </pre>
     */
    public abstract void resumeTransfer(T ctx, ResumeTransferRequest request, Observer<Empty> observer);

    /**
     * <pre>
     *  Receive transfer updates
     * </pre>
     */
    public abstract void subscribeTransfers(T ctx, SubscribeTransfersRequest request, Observer<TransferInfo> observer);

    /**
     * <pre>
     *  Receive remote file lists
     * </pre>
     */
    public abstract void subscribeRemoteFileList(T ctx, SubscribeTransfersRequest request, Observer<ListFilesResponse> observer);

    /**
     * <pre>
     *  Request file list from remote
     * </pre>
     */
    public abstract void fetchFileList(T ctx, ListFilesRequest request, Observer<Empty> observer);

    /**
     * <pre>
     *  Get latest file list
     * </pre>
     */
    public abstract void getFileList(T ctx, ListFilesRequest request, Observer<ListFilesResponse> observer);

    @Override
    public final ServiceDescriptor getDescriptorForType() {
        return FileTransferProto.getDescriptor().getServices().get(0);
    }

    @Override
    public final Message getRequestPrototype(MethodDescriptor method) {
        if (method.getService() != getDescriptorForType()) {
            throw new IllegalArgumentException("Method not contained by this service.");
        }
        switch (method.getIndex()) {
        case 0:
            return ListFileTransferServicesRequest.getDefaultInstance();
        case 1:
            return ListTransfersRequest.getDefaultInstance();
        case 2:
            return GetTransferRequest.getDefaultInstance();
        case 3:
            return CreateTransferRequest.getDefaultInstance();
        case 4:
            return PauseTransferRequest.getDefaultInstance();
        case 5:
            return CancelTransferRequest.getDefaultInstance();
        case 6:
            return ResumeTransferRequest.getDefaultInstance();
        case 7:
            return SubscribeTransfersRequest.getDefaultInstance();
        case 8:
            return SubscribeTransfersRequest.getDefaultInstance();
        case 9:
            return ListFilesRequest.getDefaultInstance();
        case 10:
            return ListFilesRequest.getDefaultInstance();
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
            return ListFileTransferServicesResponse.getDefaultInstance();
        case 1:
            return ListTransfersResponse.getDefaultInstance();
        case 2:
            return TransferInfo.getDefaultInstance();
        case 3:
            return TransferInfo.getDefaultInstance();
        case 4:
            return Empty.getDefaultInstance();
        case 5:
            return Empty.getDefaultInstance();
        case 6:
            return Empty.getDefaultInstance();
        case 7:
            return TransferInfo.getDefaultInstance();
        case 8:
            return ListFilesResponse.getDefaultInstance();
        case 9:
            return Empty.getDefaultInstance();
        case 10:
            return ListFilesResponse.getDefaultInstance();
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
            listFileTransferServices(ctx, (ListFileTransferServicesRequest) request, (Observer<ListFileTransferServicesResponse>)(Object) future);
            return;
        case 1:
            listTransfers(ctx, (ListTransfersRequest) request, (Observer<ListTransfersResponse>)(Object) future);
            return;
        case 2:
            getTransfer(ctx, (GetTransferRequest) request, (Observer<TransferInfo>)(Object) future);
            return;
        case 3:
            createTransfer(ctx, (CreateTransferRequest) request, (Observer<TransferInfo>)(Object) future);
            return;
        case 4:
            pauseTransfer(ctx, (PauseTransferRequest) request, (Observer<Empty>)(Object) future);
            return;
        case 5:
            cancelTransfer(ctx, (CancelTransferRequest) request, (Observer<Empty>)(Object) future);
            return;
        case 6:
            resumeTransfer(ctx, (ResumeTransferRequest) request, (Observer<Empty>)(Object) future);
            return;
        case 7:
            subscribeTransfers(ctx, (SubscribeTransfersRequest) request, (Observer<TransferInfo>)(Object) future);
            return;
        case 8:
            subscribeRemoteFileList(ctx, (SubscribeTransfersRequest) request, (Observer<ListFilesResponse>)(Object) future);
            return;
        case 9:
            fetchFileList(ctx, (ListFilesRequest) request, (Observer<Empty>)(Object) future);
            return;
        case 10:
            getFileList(ctx, (ListFilesRequest) request, (Observer<ListFilesResponse>)(Object) future);
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
