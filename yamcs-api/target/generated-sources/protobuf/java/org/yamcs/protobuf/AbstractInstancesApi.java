package org.yamcs.protobuf;

import com.google.protobuf.Descriptors.MethodDescriptor;
import com.google.protobuf.Descriptors.ServiceDescriptor;
import com.google.protobuf.Empty;
import com.google.protobuf.Message;
import org.yamcs.api.Api;
import org.yamcs.api.Observer;

@javax.annotation.processing.Generated(value = "org.yamcs.protoc.ServiceGenerator", date = "2023-11-18T19:00:35.929542Z")
@SuppressWarnings("unchecked")
public abstract class AbstractInstancesApi<T> implements Api<T> {

    /**
     * <pre>
     *  List instance templates
     * </pre>
     */
    public abstract void listInstanceTemplates(T ctx, Empty request, Observer<ListInstanceTemplatesResponse> observer);

    /**
     * <pre>
     *  Get an instance template
     * </pre>
     */
    public abstract void getInstanceTemplate(T ctx, GetInstanceTemplateRequest request, Observer<InstanceTemplate> observer);

    /**
     * <pre>
     *  List instances
     * </pre>
     */
    public abstract void listInstances(T ctx, ListInstancesRequest request, Observer<ListInstancesResponse> observer);

    /**
     * <pre>
     *  Receive instance updates
     * </pre>
     */
    public abstract void subscribeInstances(T ctx, Empty request, Observer<YamcsInstance> observer);

    /**
     * <pre>
     *  Get an instance
     *  
     *  If an instance does not have web services enabled, it will be listed among the
     *  results, but none of its URLs will be filled in.
     * </pre>
     */
    public abstract void getInstance(T ctx, GetInstanceRequest request, Observer<YamcsInstance> observer);

    /**
     * <pre>
     *  Create an instance
     * </pre>
     */
    public abstract void createInstance(T ctx, CreateInstanceRequest request, Observer<YamcsInstance> observer);

    /**
     * <pre>
     *  Reconfigure a templated instance
     * 
     *  Regenerates the instance configuration based on the latest
     *  template source, and with optionally modified template variables.
     * </pre>
     */
    public abstract void reconfigureInstance(T ctx, ReconfigureInstanceRequest request, Observer<YamcsInstance> observer);

    /**
     * <pre>
     *  Start an instance
     * 
     *  If the instance is in the RUNNING state, this call will do nothing.
     *  Otherwise the instance will be started.
     * </pre>
     */
    public abstract void startInstance(T ctx, StartInstanceRequest request, Observer<YamcsInstance> observer);

    /**
     * <pre>
     *  Stop an instance
     *  
     *  Stop all services of the instance. The instance state will be OFFLINE.
     *  If the instance state is already OFFLINE, this call will do nothing.
     * </pre>
     */
    public abstract void stopInstance(T ctx, StopInstanceRequest request, Observer<YamcsInstance> observer);

    /**
     * <pre>
     *  Restart an instance
     * 
     *  If the instance state is RUNNING, the instance will be stopped and then
     *  restarted. Otherwise the instance will be started. Note that the Mission
     *  Database will also be reloaded before restart.
     * </pre>
     */
    public abstract void restartInstance(T ctx, RestartInstanceRequest request, Observer<YamcsInstance> observer);

    @Override
    public final ServiceDescriptor getDescriptorForType() {
        return InstancesServiceProto.getDescriptor().getServices().get(0);
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
            return GetInstanceTemplateRequest.getDefaultInstance();
        case 2:
            return ListInstancesRequest.getDefaultInstance();
        case 3:
            return Empty.getDefaultInstance();
        case 4:
            return GetInstanceRequest.getDefaultInstance();
        case 5:
            return CreateInstanceRequest.getDefaultInstance();
        case 6:
            return ReconfigureInstanceRequest.getDefaultInstance();
        case 7:
            return StartInstanceRequest.getDefaultInstance();
        case 8:
            return StopInstanceRequest.getDefaultInstance();
        case 9:
            return RestartInstanceRequest.getDefaultInstance();
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
            return ListInstanceTemplatesResponse.getDefaultInstance();
        case 1:
            return InstanceTemplate.getDefaultInstance();
        case 2:
            return ListInstancesResponse.getDefaultInstance();
        case 3:
            return YamcsInstance.getDefaultInstance();
        case 4:
            return YamcsInstance.getDefaultInstance();
        case 5:
            return YamcsInstance.getDefaultInstance();
        case 6:
            return YamcsInstance.getDefaultInstance();
        case 7:
            return YamcsInstance.getDefaultInstance();
        case 8:
            return YamcsInstance.getDefaultInstance();
        case 9:
            return YamcsInstance.getDefaultInstance();
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
            listInstanceTemplates(ctx, (Empty) request, (Observer<ListInstanceTemplatesResponse>)(Object) future);
            return;
        case 1:
            getInstanceTemplate(ctx, (GetInstanceTemplateRequest) request, (Observer<InstanceTemplate>)(Object) future);
            return;
        case 2:
            listInstances(ctx, (ListInstancesRequest) request, (Observer<ListInstancesResponse>)(Object) future);
            return;
        case 3:
            subscribeInstances(ctx, (Empty) request, (Observer<YamcsInstance>)(Object) future);
            return;
        case 4:
            getInstance(ctx, (GetInstanceRequest) request, (Observer<YamcsInstance>)(Object) future);
            return;
        case 5:
            createInstance(ctx, (CreateInstanceRequest) request, (Observer<YamcsInstance>)(Object) future);
            return;
        case 6:
            reconfigureInstance(ctx, (ReconfigureInstanceRequest) request, (Observer<YamcsInstance>)(Object) future);
            return;
        case 7:
            startInstance(ctx, (StartInstanceRequest) request, (Observer<YamcsInstance>)(Object) future);
            return;
        case 8:
            stopInstance(ctx, (StopInstanceRequest) request, (Observer<YamcsInstance>)(Object) future);
            return;
        case 9:
            restartInstance(ctx, (RestartInstanceRequest) request, (Observer<YamcsInstance>)(Object) future);
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
