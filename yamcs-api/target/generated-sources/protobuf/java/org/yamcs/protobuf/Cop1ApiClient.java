package org.yamcs.protobuf;

import com.google.protobuf.Empty;
import org.yamcs.api.MethodHandler;
import org.yamcs.api.Observer;

/**
 * <pre>
 *  Methods for virtual channel TC links that have ``useCop1: true``.
 *  This service contains methods for setting/getting the configuration and
 *  performing various operations.
 *  In addition, a websocket subscription is available that will allow receiving periodically the status.
 * </pre>
 */
@javax.annotation.processing.Generated(value = "org.yamcs.protoc.ServiceGenerator", date = "2023-11-18T19:00:35.924524Z")
public class Cop1ApiClient extends AbstractCop1Api<Void> {

    private final MethodHandler handler;

    public Cop1ApiClient(MethodHandler handler) {
        this.handler = handler;
    }

    /**
     * <pre>
     *  Initialize COP-1 in case state is UNITIALIZED
     * </pre>
     */
    @Override
    public final void initialize(Void ctx, InitializeRequest request, Observer<Empty> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(0),
            request,
            Empty.getDefaultInstance(),
            observer);
    }

    /**
     * <pre>
     *  Resume COP-1 operation in case state is SUSPENDED
     * </pre>
     */
    @Override
    public final void resume(Void ctx, ResumeRequest request, Observer<Empty> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(1),
            request,
            Empty.getDefaultInstance(),
            observer);
    }

    /**
     * <pre>
     *  Disable COP-1 operation
     * 
     *  This causes the sent queue to be purged.
     *  All TCs from the wait queue, as well as newly received TCs
     *  are sent immediately
     * </pre>
     */
    @Override
    public final void disable(Void ctx, DisableRequest request, Observer<Empty> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(2),
            request,
            Empty.getDefaultInstance(),
            observer);
    }

    /**
     * <pre>
     *  Update configuration settings
     * </pre>
     */
    @Override
    public final void updateConfig(Void ctx, UpdateConfigRequest request, Observer<Cop1Config> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(3),
            request,
            Cop1Config.getDefaultInstance(),
            observer);
    }

    /**
     * <pre>
     *  Get COP-1 configuration
     * </pre>
     */
    @Override
    public final void getConfig(Void ctx, GetConfigRequest request, Observer<Cop1Config> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(4),
            request,
            Cop1Config.getDefaultInstance(),
            observer);
    }

    /**
     * <pre>
     *  Get COP-1 status
     * </pre>
     */
    @Override
    public final void getStatus(Void ctx, GetStatusRequest request, Observer<Cop1Status> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(5),
            request,
            Cop1Status.getDefaultInstance(),
            observer);
    }

    /**
     * <pre>
     *  Receive COP-1 status updates
     * </pre>
     */
    @Override
    public final void subscribeStatus(Void ctx, SubscribeStatusRequest request, Observer<Cop1Status> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(6),
            request,
            Cop1Status.getDefaultInstance(),
            observer);
    }
}
