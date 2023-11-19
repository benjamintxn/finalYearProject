package org.yamcs.protobuf;

import com.google.protobuf.Descriptors.MethodDescriptor;
import com.google.protobuf.Descriptors.ServiceDescriptor;
import com.google.protobuf.Empty;
import com.google.protobuf.Message;
import org.yamcs.api.Api;
import org.yamcs.api.Observer;

@javax.annotation.processing.Generated(value = "org.yamcs.protoc.ServiceGenerator", date = "2023-11-18T19:00:35.931429Z")
@SuppressWarnings("unchecked")
public abstract class AbstractClearanceApi<T> implements Api<T> {

    /**
     * <pre>
     *  List clearances
     * </pre>
     */
    public abstract void listClearances(T ctx, Empty request, Observer<ListClearancesResponse> observer);

    /**
     * <pre>
     *  Update a user's clearance
     * </pre>
     */
    public abstract void updateClearance(T ctx, UpdateClearanceRequest request, Observer<ClearanceInfo> observer);

    /**
     * <pre>
     *  Delete a user's clearance
     * </pre>
     */
    public abstract void deleteClearance(T ctx, DeleteClearanceRequest request, Observer<Empty> observer);

    /**
     * <pre>
     *  Receive updates on own clearance
     * </pre>
     */
    public abstract void subscribeClearance(T ctx, Empty request, Observer<ClearanceInfo> observer);

    @Override
    public final ServiceDescriptor getDescriptorForType() {
        return ClearanceServiceProto.getDescriptor().getServices().get(0);
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
            return UpdateClearanceRequest.getDefaultInstance();
        case 2:
            return DeleteClearanceRequest.getDefaultInstance();
        case 3:
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
            return ListClearancesResponse.getDefaultInstance();
        case 1:
            return ClearanceInfo.getDefaultInstance();
        case 2:
            return Empty.getDefaultInstance();
        case 3:
            return ClearanceInfo.getDefaultInstance();
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
            listClearances(ctx, (Empty) request, (Observer<ListClearancesResponse>)(Object) future);
            return;
        case 1:
            updateClearance(ctx, (UpdateClearanceRequest) request, (Observer<ClearanceInfo>)(Object) future);
            return;
        case 2:
            deleteClearance(ctx, (DeleteClearanceRequest) request, (Observer<Empty>)(Object) future);
            return;
        case 3:
            subscribeClearance(ctx, (Empty) request, (Observer<ClearanceInfo>)(Object) future);
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
