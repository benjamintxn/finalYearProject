package org.yamcs.protobuf;

import com.google.protobuf.Descriptors.MethodDescriptor;
import com.google.protobuf.Descriptors.ServiceDescriptor;
import com.google.protobuf.Empty;
import com.google.protobuf.Message;
import org.yamcs.api.Api;
import org.yamcs.api.Observer;

/**
 * <pre>
 * Methods related to the Time Correlation Service.
 * </pre>
 */
@javax.annotation.processing.Generated(value = "org.yamcs.protoc.ServiceGenerator", date = "2023-11-18T19:00:35.919524Z")
@SuppressWarnings("unchecked")
public abstract class AbstractTimeCorrelationApi<T> implements Api<T> {

    /**
     * <pre>
     *  Get the TCO config
     * 
     *  Returns the TCO configuration comprising the accuracy, validity and the fixed delays.
     * </pre>
     */
    public abstract void getConfig(T ctx, GetTcoConfigRequest request, Observer<TcoConfig> observer);

    /**
     * <pre>
     *  Set the TCO config
     * 
     *  Set the TCO configuration. The configuration is not persisted on disk.
     * </pre>
     */
    public abstract void setConfig(T ctx, SetTcoConfigRequest request, Observer<Empty> observer);

    /**
     * <pre>
     *  Get the TCO status
     * 
     *  Returns the TCO status comprising the currently used coefficients, the last computed deviation
     *  and the last received samples.
     * </pre>
     */
    public abstract void getStatus(T ctx, GetTcoStatusRequest request, Observer<TcoStatus> observer);

    /**
     * <pre>
     *  Set the TCO coefficients
     * 
     * Manually set the coefficients to be used for time correlation. These will overwrite 
     *  the automatic computed coefficients.
     * </pre>
     */
    public abstract void setCoefficients(T ctx, SetCoefficientsRequest request, Observer<Empty> observer);

    /**
     * <pre>
     * Reset the time correlation.
     * 
     * The current used TCO coefficients are removed together with all collected samples.
     * </pre>
     */
    public abstract void reset(T ctx, TcoResetRequest request, Observer<Empty> observer);

    /**
     * <pre>
     *  Add intervals for the time of flight calculation.
     * 
     *  Each ``[ertStart, ertStop)`` interval contains a polynomial function used to compute the time of flight for the given ``ert``.
     *  The intervals can overlap and are sorted in descending order of the start time.
     *  The first (highest start time) interval where the requested ert fits, will be used for the calculation. 
     *  
     *  The formula used for calculating the time of flight for a frame/packet received
     *  at ``ert`` in the ``[ertStart, ertStop)`` interval is:
     *  
     *      ``delta = ert - ertStart``
     * 
     *      ``tof = polCoef[0] + polCoef[1] * delta + polCoef[2] * delta^2 + ...``
     *  
     *  The result of the polynomial is the ``tof`` expressed in seconds.
     * 
     * </pre>
     */
    public abstract void addTimeOfFlightIntervals(T ctx, AddTimeOfFlightIntervalsRequest request, Observer<Empty> observer);

    /**
     * <pre>
     *  Delete intervals for the time of flight calculation.
     * 
     *  All the intervals with the start time
     *  falling in the requested [start, stop] interval will be removed. 
     * </pre>
     */
    public abstract void deleteTimeOfFlightIntervals(T ctx, DeleteTimeOfFlightIntervalsRequest request, Observer<Empty> observer);

    @Override
    public final ServiceDescriptor getDescriptorForType() {
        return TcoProto.getDescriptor().getServices().get(0);
    }

    @Override
    public final Message getRequestPrototype(MethodDescriptor method) {
        if (method.getService() != getDescriptorForType()) {
            throw new IllegalArgumentException("Method not contained by this service.");
        }
        switch (method.getIndex()) {
        case 0:
            return GetTcoConfigRequest.getDefaultInstance();
        case 1:
            return SetTcoConfigRequest.getDefaultInstance();
        case 2:
            return GetTcoStatusRequest.getDefaultInstance();
        case 3:
            return SetCoefficientsRequest.getDefaultInstance();
        case 4:
            return TcoResetRequest.getDefaultInstance();
        case 5:
            return AddTimeOfFlightIntervalsRequest.getDefaultInstance();
        case 6:
            return DeleteTimeOfFlightIntervalsRequest.getDefaultInstance();
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
            return TcoConfig.getDefaultInstance();
        case 1:
            return Empty.getDefaultInstance();
        case 2:
            return TcoStatus.getDefaultInstance();
        case 3:
            return Empty.getDefaultInstance();
        case 4:
            return Empty.getDefaultInstance();
        case 5:
            return Empty.getDefaultInstance();
        case 6:
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
            getConfig(ctx, (GetTcoConfigRequest) request, (Observer<TcoConfig>)(Object) future);
            return;
        case 1:
            setConfig(ctx, (SetTcoConfigRequest) request, (Observer<Empty>)(Object) future);
            return;
        case 2:
            getStatus(ctx, (GetTcoStatusRequest) request, (Observer<TcoStatus>)(Object) future);
            return;
        case 3:
            setCoefficients(ctx, (SetCoefficientsRequest) request, (Observer<Empty>)(Object) future);
            return;
        case 4:
            reset(ctx, (TcoResetRequest) request, (Observer<Empty>)(Object) future);
            return;
        case 5:
            addTimeOfFlightIntervals(ctx, (AddTimeOfFlightIntervalsRequest) request, (Observer<Empty>)(Object) future);
            return;
        case 6:
            deleteTimeOfFlightIntervals(ctx, (DeleteTimeOfFlightIntervalsRequest) request, (Observer<Empty>)(Object) future);
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
