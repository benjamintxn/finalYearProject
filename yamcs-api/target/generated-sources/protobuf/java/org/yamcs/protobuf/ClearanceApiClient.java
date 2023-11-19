package org.yamcs.protobuf;

import com.google.protobuf.Empty;
import org.yamcs.api.MethodHandler;
import org.yamcs.api.Observer;

@javax.annotation.processing.Generated(value = "org.yamcs.protoc.ServiceGenerator", date = "2023-11-18T19:00:35.931505Z")
public class ClearanceApiClient extends AbstractClearanceApi<Void> {

    private final MethodHandler handler;

    public ClearanceApiClient(MethodHandler handler) {
        this.handler = handler;
    }

    /**
     * <pre>
     *  List clearances
     * </pre>
     */
    @Override
    public final void listClearances(Void ctx, Empty request, Observer<ListClearancesResponse> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(0),
            request,
            ListClearancesResponse.getDefaultInstance(),
            observer);
    }

    /**
     * <pre>
     *  Update a user's clearance
     * </pre>
     */
    @Override
    public final void updateClearance(Void ctx, UpdateClearanceRequest request, Observer<ClearanceInfo> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(1),
            request,
            ClearanceInfo.getDefaultInstance(),
            observer);
    }

    /**
     * <pre>
     *  Delete a user's clearance
     * </pre>
     */
    @Override
    public final void deleteClearance(Void ctx, DeleteClearanceRequest request, Observer<Empty> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(2),
            request,
            Empty.getDefaultInstance(),
            observer);
    }

    /**
     * <pre>
     *  Receive updates on own clearance
     * </pre>
     */
    @Override
    public final void subscribeClearance(Void ctx, Empty request, Observer<ClearanceInfo> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(3),
            request,
            ClearanceInfo.getDefaultInstance(),
            observer);
    }
}
