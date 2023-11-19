package org.yamcs.protobuf;

import com.google.protobuf.Descriptors.MethodDescriptor;
import com.google.protobuf.Descriptors.ServiceDescriptor;
import com.google.protobuf.Empty;
import com.google.protobuf.Message;
import org.yamcs.api.Api;
import org.yamcs.api.Observer;

/**
 * <pre>
 *  Methods for virtual channel TC links that have ``useCop1: true``.
 *  This service contains methods for setting/getting the configuration and
 *  performing various operations.
 *  In addition, a websocket subscription is available that will allow receiving periodically the status.
 * </pre>
 */
@javax.annotation.processing.Generated(value = "org.yamcs.protoc.ServiceGenerator", date = "2023-11-18T19:00:35.924376Z")
@SuppressWarnings("unchecked")
public abstract class AbstractCop1Api<T> implements Api<T> {

    /**
     * <pre>
     *  Initialize COP-1 in case state is UNITIALIZED
     * </pre>
     */
    public abstract void initialize(T ctx, InitializeRequest request, Observer<Empty> observer);

    /**
     * <pre>
     *  Resume COP-1 operation in case state is SUSPENDED
     * </pre>
     */
    public abstract void resume(T ctx, ResumeRequest request, Observer<Empty> observer);

    /**
     * <pre>
     *  Disable COP-1 operation
     * 
     *  This causes the sent queue to be purged.
     *  All TCs from the wait queue, as well as newly received TCs
     *  are sent immediately
     * </pre>
     */
    public abstract void disable(T ctx, DisableRequest request, Observer<Empty> observer);

    /**
     * <pre>
     *  Update configuration settings
     * </pre>
     */
    public abstract void updateConfig(T ctx, UpdateConfigRequest request, Observer<Cop1Config> observer);

    /**
     * <pre>
     *  Get COP-1 configuration
     * </pre>
     */
    public abstract void getConfig(T ctx, GetConfigRequest request, Observer<Cop1Config> observer);

    /**
     * <pre>
     *  Get COP-1 status
     * </pre>
     */
    public abstract void getStatus(T ctx, GetStatusRequest request, Observer<Cop1Status> observer);

    /**
     * <pre>
     *  Receive COP-1 status updates
     * </pre>
     */
    public abstract void subscribeStatus(T ctx, SubscribeStatusRequest request, Observer<Cop1Status> observer);

    @Override
    public final ServiceDescriptor getDescriptorForType() {
        return Cop1Proto.getDescriptor().getServices().get(0);
    }

    @Override
    public final Message getRequestPrototype(MethodDescriptor method) {
        if (method.getService() != getDescriptorForType()) {
            throw new IllegalArgumentException("Method not contained by this service.");
        }
        switch (method.getIndex()) {
        case 0:
            return InitializeRequest.getDefaultInstance();
        case 1:
            return ResumeRequest.getDefaultInstance();
        case 2:
            return DisableRequest.getDefaultInstance();
        case 3:
            return UpdateConfigRequest.getDefaultInstance();
        case 4:
            return GetConfigRequest.getDefaultInstance();
        case 5:
            return GetStatusRequest.getDefaultInstance();
        case 6:
            return SubscribeStatusRequest.getDefaultInstance();
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
            return Empty.getDefaultInstance();
        case 1:
            return Empty.getDefaultInstance();
        case 2:
            return Empty.getDefaultInstance();
        case 3:
            return Cop1Config.getDefaultInstance();
        case 4:
            return Cop1Config.getDefaultInstance();
        case 5:
            return Cop1Status.getDefaultInstance();
        case 6:
            return Cop1Status.getDefaultInstance();
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
            initialize(ctx, (InitializeRequest) request, (Observer<Empty>)(Object) future);
            return;
        case 1:
            resume(ctx, (ResumeRequest) request, (Observer<Empty>)(Object) future);
            return;
        case 2:
            disable(ctx, (DisableRequest) request, (Observer<Empty>)(Object) future);
            return;
        case 3:
            updateConfig(ctx, (UpdateConfigRequest) request, (Observer<Cop1Config>)(Object) future);
            return;
        case 4:
            getConfig(ctx, (GetConfigRequest) request, (Observer<Cop1Config>)(Object) future);
            return;
        case 5:
            getStatus(ctx, (GetStatusRequest) request, (Observer<Cop1Status>)(Object) future);
            return;
        case 6:
            subscribeStatus(ctx, (SubscribeStatusRequest) request, (Observer<Cop1Status>)(Object) future);
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
