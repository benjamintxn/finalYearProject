package org.yamcs.protobuf;

import com.google.protobuf.Empty;
import org.yamcs.api.MethodHandler;
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
@javax.annotation.processing.Generated(value = "org.yamcs.protoc.ServiceGenerator", date = "2023-11-18T19:00:35.923530Z")
public class MdbOverrideApiClient extends AbstractMdbOverrideApi<Void> {

    private final MethodHandler handler;

    public MdbOverrideApiClient(MethodHandler handler) {
        this.handler = handler;
    }

    /**
     * <pre>
     *  List MDB overrides
     * </pre>
     */
    @Override
    public final void listMdbOverrides(Void ctx, ListMdbOverridesRequest request, Observer<ListMdbOverridesResponse> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(0),
            request,
            ListMdbOverridesResponse.getDefaultInstance(),
            observer);
    }

    /**
     * <pre>
     *  Get overrides for an algorithm
     * </pre>
     */
    @Override
    public final void getAlgorithmOverrides(Void ctx, GetAlgorithmOverridesRequest request, Observer<GetAlgorithmOverridesResponse> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(1),
            request,
            GetAlgorithmOverridesResponse.getDefaultInstance(),
            observer);
    }

    /**
     * <pre>
     *  Get elements of a parameter's definition, as changed for a
     *  specific processor.
     * 
     *  This may return empty, if there is no change, or a previous change
     *  was explicitly deleted.
     * </pre>
     */
    @Override
    public final void getParameterOverride(Void ctx, GetParameterOverrideRequest request, Observer<ParameterOverride> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(2),
            request,
            ParameterOverride.getDefaultInstance(),
            observer);
    }

    /**
     * <pre>
     *  Update a parameter's definition
     * </pre>
     */
    @Override
    public final void updateParameter(Void ctx, UpdateParameterRequest request, Observer<ParameterTypeInfo> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(3),
            request,
            ParameterTypeInfo.getDefaultInstance(),
            observer);
    }

    /**
     * <pre>
     *  Update an algorithm's definition
     * </pre>
     */
    @Override
    public final void updateAlgorithm(Void ctx, UpdateAlgorithmRequest request, Observer<Empty> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(4),
            request,
            Empty.getDefaultInstance(),
            observer);
    }

    /**
     * <pre>
     *  Receive notifications on processor-level MDB changes.
     * 
     *  Updates include the current state of the algorithm or
     *  parameter, also when an override is essentially removed.
     * </pre>
     */
    @Override
    public final void subscribeMdbChanges(Void ctx, SubscribeMdbChangesRequest request, Observer<MdbOverrideInfo> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(5),
            request,
            MdbOverrideInfo.getDefaultInstance(),
            observer);
    }
}
