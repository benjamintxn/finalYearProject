package org.yamcs.protobuf;

import com.google.protobuf.Empty;
import org.yamcs.api.MethodHandler;
import org.yamcs.api.Observer;

@javax.annotation.processing.Generated(value = "org.yamcs.protoc.ServiceGenerator", date = "2023-11-18T19:00:35.929388Z")
public class FileTransferApiClient extends AbstractFileTransferApi<Void> {

    private final MethodHandler handler;

    public FileTransferApiClient(MethodHandler handler) {
        this.handler = handler;
    }

    /**
     * <pre>
     *  List file transfer services
     * </pre>
     */
    @Override
    public final void listFileTransferServices(Void ctx, ListFileTransferServicesRequest request, Observer<ListFileTransferServicesResponse> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(0),
            request,
            ListFileTransferServicesResponse.getDefaultInstance(),
            observer);
    }

    /**
     * <pre>
     *  List transfers
     * </pre>
     */
    @Override
    public final void listTransfers(Void ctx, ListTransfersRequest request, Observer<ListTransfersResponse> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(1),
            request,
            ListTransfersResponse.getDefaultInstance(),
            observer);
    }

    /**
     * <pre>
     *  Get a transfer
     * </pre>
     */
    @Override
    public final void getTransfer(Void ctx, GetTransferRequest request, Observer<TransferInfo> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(2),
            request,
            TransferInfo.getDefaultInstance(),
            observer);
    }

    /**
     * <pre>
     *  Create a transfer
     * </pre>
     */
    @Override
    public final void createTransfer(Void ctx, CreateTransferRequest request, Observer<TransferInfo> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(3),
            request,
            TransferInfo.getDefaultInstance(),
            observer);
    }

    /**
     * <pre>
     *  Pause a transfer
     * </pre>
     */
    @Override
    public final void pauseTransfer(Void ctx, PauseTransferRequest request, Observer<Empty> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(4),
            request,
            Empty.getDefaultInstance(),
            observer);
    }

    /**
     * <pre>
     *  Cancel a transfer
     * 
     *  The ongoing transfer is aborted, partially uploaded/downloaded files
     *  are retained.
     * </pre>
     */
    @Override
    public final void cancelTransfer(Void ctx, CancelTransferRequest request, Observer<Empty> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(5),
            request,
            Empty.getDefaultInstance(),
            observer);
    }

    /**
     * <pre>
     *  Resume a transfer
     * </pre>
     */
    @Override
    public final void resumeTransfer(Void ctx, ResumeTransferRequest request, Observer<Empty> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(6),
            request,
            Empty.getDefaultInstance(),
            observer);
    }

    /**
     * <pre>
     *  Receive transfer updates
     * </pre>
     */
    @Override
    public final void subscribeTransfers(Void ctx, SubscribeTransfersRequest request, Observer<TransferInfo> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(7),
            request,
            TransferInfo.getDefaultInstance(),
            observer);
    }

    /**
     * <pre>
     *  Receive remote file lists
     * </pre>
     */
    @Override
    public final void subscribeRemoteFileList(Void ctx, SubscribeTransfersRequest request, Observer<ListFilesResponse> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(8),
            request,
            ListFilesResponse.getDefaultInstance(),
            observer);
    }

    /**
     * <pre>
     *  Request file list from remote
     * </pre>
     */
    @Override
    public final void fetchFileList(Void ctx, ListFilesRequest request, Observer<Empty> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(9),
            request,
            Empty.getDefaultInstance(),
            observer);
    }

    /**
     * <pre>
     *  Get latest file list
     * </pre>
     */
    @Override
    public final void getFileList(Void ctx, ListFilesRequest request, Observer<ListFilesResponse> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(10),
            request,
            ListFilesResponse.getDefaultInstance(),
            observer);
    }
}
