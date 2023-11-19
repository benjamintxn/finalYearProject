package org.yamcs.protobuf;

import com.google.protobuf.Descriptors.MethodDescriptor;
import com.google.protobuf.Descriptors.ServiceDescriptor;
import com.google.protobuf.Empty;
import com.google.protobuf.Message;
import org.yamcs.api.Api;
import org.yamcs.api.Observer;
import org.yamcs.protobuf.Mdb.ParameterTypeInfo;

/**
 * <pre>
 *  Groups operations that support runtime changes to some parts of the MDB.
 * 
 *  These changes are always scoped to a processor, and do not persist across
 *  server restarts.
 * </pre>
 */
@javax.annotation.processing.Generated(value = "org.yamcs.protoc.ServiceGenerator", date = "2023-11-18T19:00:35.922927Z")
@SuppressWarnings("unchecked")
public abstract class AbstractMdbOverrideApi<T> implements Api<T> {

    /**
     * <pre>
     *  List MDB overrides
     * </pre>
     */
    public abstract void listMdbOverrides(T ctx, ListMdbOverridesRequest request, Observer<ListMdbOverridesResponse> observer);

    /**
     * <pre>
     *  Get overrides for an algorithm
     * </pre>
     */
    public abstract void getAlgorithmOverrides(T ctx, GetAlgorithmOverridesRequest request, Observer<GetAlgorithmOverridesResponse> observer);

    /**
     * <pre>
     *  Get elements of a parameter's definition, as changed for a
     *  specific processor.
     * 
     *  This may return empty, if there is no change, or a previous change
     *  was explicitly deleted.
     * </pre>
     */
    public abstract void getParameterOverride(T ctx, GetParameterOverrideRequest request, Observer<ParameterOverride> observer);

    /**
     * <pre>
     *  Update a parameter's definition
     * </pre>
     */
    public abstract void updateParameter(T ctx, UpdateParameterRequest request, Observer<ParameterTypeInfo> observer);

    /**
     * <pre>
     *  Update an algorithm's definition
     * </pre>
     */
    public abstract void updateAlgorithm(T ctx, UpdateAlgorithmRequest request, Observer<Empty> observer);

    /**
     * <pre>
     *  Receive notifications on processor-level MDB changes.
     * 
     *  Updates include the current state of the algorithm or
     *  parameter, also when an override is essentially removed.
     * </pre>
     */
    public abstract void subscribeMdbChanges(T ctx, SubscribeMdbChangesRequest request, Observer<MdbOverrideInfo> observer);

    @Override
    public final ServiceDescriptor getDescriptorForType() {
        return MdbOverrideServiceProto.getDescriptor().getServices().get(0);
    }

    @Override
    public final Message getRequestPrototype(MethodDescriptor method) {
        if (method.getService() != getDescriptorForType()) {
            throw new IllegalArgumentException("Method not contained by this service.");
        }
        switch (method.getIndex()) {
        case 0:
            return ListMdbOverridesRequest.getDefaultInstance();
        case 1:
            return GetAlgorithmOverridesRequest.getDefaultInstance();
        case 2:
            return GetParameterOverrideRequest.getDefaultInstance();
        case 3:
            return UpdateParameterRequest.getDefaultInstance();
        case 4:
            return UpdateAlgorithmRequest.getDefaultInstance();
        case 5:
            return SubscribeMdbChangesRequest.getDefaultInstance();
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
            return ListMdbOverridesResponse.getDefaultInstance();
        case 1:
            return GetAlgorithmOverridesResponse.getDefaultInstance();
        case 2:
            return ParameterOverride.getDefaultInstance();
        case 3:
            return ParameterTypeInfo.getDefaultInstance();
        case 4:
            return Empty.getDefaultInstance();
        case 5:
            return MdbOverrideInfo.getDefaultInstance();
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
            listMdbOverrides(ctx, (ListMdbOverridesRequest) request, (Observer<ListMdbOverridesResponse>)(Object) future);
            return;
        case 1:
            getAlgorithmOverrides(ctx, (GetAlgorithmOverridesRequest) request, (Observer<GetAlgorithmOverridesResponse>)(Object) future);
            return;
        case 2:
            getParameterOverride(ctx, (GetParameterOverrideRequest) request, (Observer<ParameterOverride>)(Object) future);
            return;
        case 3:
            updateParameter(ctx, (UpdateParameterRequest) request, (Observer<ParameterTypeInfo>)(Object) future);
            return;
        case 4:
            updateAlgorithm(ctx, (UpdateAlgorithmRequest) request, (Observer<Empty>)(Object) future);
            return;
        case 5:
            subscribeMdbChanges(ctx, (SubscribeMdbChangesRequest) request, (Observer<MdbOverrideInfo>)(Object) future);
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
