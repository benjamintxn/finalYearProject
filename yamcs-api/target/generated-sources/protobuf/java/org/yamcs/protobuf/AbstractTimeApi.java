package org.yamcs.protobuf;

import com.google.protobuf.Descriptors.MethodDescriptor;
import com.google.protobuf.Descriptors.ServiceDescriptor;
import com.google.protobuf.Empty;
import com.google.protobuf.Message;
import com.google.protobuf.Timestamp;
import org.yamcs.api.Api;
import org.yamcs.api.Observer;

@javax.annotation.processing.Generated(value = "org.yamcs.protoc.ServiceGenerator", date = "2023-11-18T19:00:35.925493Z")
@SuppressWarnings("unchecked")
public abstract class AbstractTimeApi<T> implements Api<T> {

    /**
     * <pre>
     *  Get UTC leap seconds
     * </pre>
     */
    public abstract void getLeapSeconds(T ctx, Empty request, Observer<LeapSecondsTable> observer);

    /**
     * <pre>
     *  Set (simulation) time of an instance
     * </pre>
     */
    public abstract void setTime(T ctx, SetTimeRequest request, Observer<Empty> observer);

    /**
     * <pre>
     *  Receive time updates
     * </pre>
     */
    public abstract void subscribeTime(T ctx, SubscribeTimeRequest request, Observer<Timestamp> observer);

    @Override
    public final ServiceDescriptor getDescriptorForType() {
        return TimeServiceProto.getDescriptor().getServices().get(0);
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
            return SetTimeRequest.getDefaultInstance();
        case 2:
            return SubscribeTimeRequest.getDefaultInstance();
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
            return LeapSecondsTable.getDefaultInstance();
        case 1:
            return Empty.getDefaultInstance();
        case 2:
            return Timestamp.getDefaultInstance();
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
            getLeapSeconds(ctx, (Empty) request, (Observer<LeapSecondsTable>)(Object) future);
            return;
        case 1:
            setTime(ctx, (SetTimeRequest) request, (Observer<Empty>)(Object) future);
            return;
        case 2:
            subscribeTime(ctx, (SubscribeTimeRequest) request, (Observer<Timestamp>)(Object) future);
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
