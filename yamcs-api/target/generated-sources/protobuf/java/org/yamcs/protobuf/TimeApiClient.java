package org.yamcs.protobuf;

import com.google.protobuf.Empty;
import com.google.protobuf.Timestamp;
import org.yamcs.api.MethodHandler;
import org.yamcs.api.Observer;

@javax.annotation.processing.Generated(value = "org.yamcs.protoc.ServiceGenerator", date = "2023-11-18T19:00:35.925639Z")
public class TimeApiClient extends AbstractTimeApi<Void> {

    private final MethodHandler handler;

    public TimeApiClient(MethodHandler handler) {
        this.handler = handler;
    }

    /**
     * <pre>
     *  Get UTC leap seconds
     * </pre>
     */
    @Override
    public final void getLeapSeconds(Void ctx, Empty request, Observer<LeapSecondsTable> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(0),
            request,
            LeapSecondsTable.getDefaultInstance(),
            observer);
    }

    /**
     * <pre>
     *  Set (simulation) time of an instance
     * </pre>
     */
    @Override
    public final void setTime(Void ctx, SetTimeRequest request, Observer<Empty> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(1),
            request,
            Empty.getDefaultInstance(),
            observer);
    }

    /**
     * <pre>
     *  Receive time updates
     * </pre>
     */
    @Override
    public final void subscribeTime(Void ctx, SubscribeTimeRequest request, Observer<Timestamp> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(2),
            request,
            Timestamp.getDefaultInstance(),
            observer);
    }
}
