package org.yamcs.protobuf;

import com.google.protobuf.Empty;
import org.yamcs.api.MethodHandler;
import org.yamcs.api.Observer;

/**
 * <pre>
 * Methods related to the Time Correlation Service.
 * </pre>
 */
@javax.annotation.processing.Generated(value = "org.yamcs.protoc.ServiceGenerator", date = "2023-11-18T19:00:35.919807Z")
public class TimeCorrelationApiClient extends AbstractTimeCorrelationApi<Void> {

    private final MethodHandler handler;

    public TimeCorrelationApiClient(MethodHandler handler) {
        this.handler = handler;
    }

    /**
     * <pre>
     *  Get the TCO config
     * 
     *  Returns the TCO configuration comprising the accuracy, validity and the fixed delays.
     * </pre>
     */
    @Override
    public final void getConfig(Void ctx, GetTcoConfigRequest request, Observer<TcoConfig> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(0),
            request,
            TcoConfig.getDefaultInstance(),
            observer);
    }

    /**
     * <pre>
     *  Set the TCO config
     * 
     *  Set the TCO configuration. The configuration is not persisted on disk.
     * </pre>
     */
    @Override
    public final void setConfig(Void ctx, SetTcoConfigRequest request, Observer<Empty> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(1),
            request,
            Empty.getDefaultInstance(),
            observer);
    }

    /**
     * <pre>
     *  Get the TCO status
     * 
     *  Returns the TCO status comprising the currently used coefficients, the last computed deviation
     *  and the last received samples.
     * </pre>
     */
    @Override
    public final void getStatus(Void ctx, GetTcoStatusRequest request, Observer<TcoStatus> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(2),
            request,
            TcoStatus.getDefaultInstance(),
            observer);
    }

    /**
     * <pre>
     *  Set the TCO coefficients
     * 
     * Manually set the coefficients to be used for time correlation. These will overwrite 
     *  the automatic computed coefficients.
     * </pre>
     */
    @Override
    public final void setCoefficients(Void ctx, SetCoefficientsRequest request, Observer<Empty> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(3),
            request,
            Empty.getDefaultInstance(),
            observer);
    }

    /**
     * <pre>
     * Reset the time correlation.
     * 
     * The current used TCO coefficients are removed together with all collected samples.
     * </pre>
     */
    @Override
    public final void reset(Void ctx, TcoResetRequest request, Observer<Empty> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(4),
            request,
            Empty.getDefaultInstance(),
            observer);
    }

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
    @Override
    public final void addTimeOfFlightIntervals(Void ctx, AddTimeOfFlightIntervalsRequest request, Observer<Empty> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(5),
            request,
            Empty.getDefaultInstance(),
            observer);
    }

    /**
     * <pre>
     *  Delete intervals for the time of flight calculation.
     * 
     *  All the intervals with the start time
     *  falling in the requested [start, stop] interval will be removed. 
     * </pre>
     */
    @Override
    public final void deleteTimeOfFlightIntervals(Void ctx, DeleteTimeOfFlightIntervalsRequest request, Observer<Empty> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(6),
            request,
            Empty.getDefaultInstance(),
            observer);
    }
}
