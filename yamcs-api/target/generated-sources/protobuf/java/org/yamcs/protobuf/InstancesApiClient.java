package org.yamcs.protobuf;

import com.google.protobuf.Empty;
import org.yamcs.api.MethodHandler;
import org.yamcs.api.Observer;

@javax.annotation.processing.Generated(value = "org.yamcs.protoc.ServiceGenerator", date = "2023-11-18T19:00:35.929873Z")
public class InstancesApiClient extends AbstractInstancesApi<Void> {

    private final MethodHandler handler;

    public InstancesApiClient(MethodHandler handler) {
        this.handler = handler;
    }

    /**
     * <pre>
     *  List instance templates
     * </pre>
     */
    @Override
    public final void listInstanceTemplates(Void ctx, Empty request, Observer<ListInstanceTemplatesResponse> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(0),
            request,
            ListInstanceTemplatesResponse.getDefaultInstance(),
            observer);
    }

    /**
     * <pre>
     *  Get an instance template
     * </pre>
     */
    @Override
    public final void getInstanceTemplate(Void ctx, GetInstanceTemplateRequest request, Observer<InstanceTemplate> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(1),
            request,
            InstanceTemplate.getDefaultInstance(),
            observer);
    }

    /**
     * <pre>
     *  List instances
     * </pre>
     */
    @Override
    public final void listInstances(Void ctx, ListInstancesRequest request, Observer<ListInstancesResponse> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(2),
            request,
            ListInstancesResponse.getDefaultInstance(),
            observer);
    }

    /**
     * <pre>
     *  Receive instance updates
     * </pre>
     */
    @Override
    public final void subscribeInstances(Void ctx, Empty request, Observer<YamcsInstance> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(3),
            request,
            YamcsInstance.getDefaultInstance(),
            observer);
    }

    /**
     * <pre>
     *  Get an instance
     *  
     *  If an instance does not have web services enabled, it will be listed among the
     *  results, but none of its URLs will be filled in.
     * </pre>
     */
    @Override
    public final void getInstance(Void ctx, GetInstanceRequest request, Observer<YamcsInstance> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(4),
            request,
            YamcsInstance.getDefaultInstance(),
            observer);
    }

    /**
     * <pre>
     *  Create an instance
     * </pre>
     */
    @Override
    public final void createInstance(Void ctx, CreateInstanceRequest request, Observer<YamcsInstance> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(5),
            request,
            YamcsInstance.getDefaultInstance(),
            observer);
    }

    /**
     * <pre>
     *  Reconfigure a templated instance
     * 
     *  Regenerates the instance configuration based on the latest
     *  template source, and with optionally modified template variables.
     * </pre>
     */
    @Override
    public final void reconfigureInstance(Void ctx, ReconfigureInstanceRequest request, Observer<YamcsInstance> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(6),
            request,
            YamcsInstance.getDefaultInstance(),
            observer);
    }

    /**
     * <pre>
     *  Start an instance
     * 
     *  If the instance is in the RUNNING state, this call will do nothing.
     *  Otherwise the instance will be started.
     * </pre>
     */
    @Override
    public final void startInstance(Void ctx, StartInstanceRequest request, Observer<YamcsInstance> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(7),
            request,
            YamcsInstance.getDefaultInstance(),
            observer);
    }

    /**
     * <pre>
     *  Stop an instance
     *  
     *  Stop all services of the instance. The instance state will be OFFLINE.
     *  If the instance state is already OFFLINE, this call will do nothing.
     * </pre>
     */
    @Override
    public final void stopInstance(Void ctx, StopInstanceRequest request, Observer<YamcsInstance> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(8),
            request,
            YamcsInstance.getDefaultInstance(),
            observer);
    }

    /**
     * <pre>
     *  Restart an instance
     * 
     *  If the instance state is RUNNING, the instance will be stopped and then
     *  restarted. Otherwise the instance will be started. Note that the Mission
     *  Database will also be reloaded before restart.
     * </pre>
     */
    @Override
    public final void restartInstance(Void ctx, RestartInstanceRequest request, Observer<YamcsInstance> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(9),
            request,
            YamcsInstance.getDefaultInstance(),
            observer);
    }
}
