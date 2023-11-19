package org.yamcs.protobuf;

import com.google.protobuf.Descriptors.MethodDescriptor;
import com.google.protobuf.Descriptors.ServiceDescriptor;
import com.google.protobuf.Empty;
import com.google.protobuf.Message;
import org.yamcs.api.Api;
import org.yamcs.api.Observer;

@javax.annotation.processing.Generated(value = "org.yamcs.protoc.ServiceGenerator", date = "2023-11-18T19:00:35.932247Z")
@SuppressWarnings("unchecked")
public abstract class AbstractServicesApi<T> implements Api<T> {

    /**
     * <pre>
     *  List services
     * </pre>
     */
    public abstract void listServices(T ctx, ListServicesRequest request, Observer<ListServicesResponse> observer);

    /**
     * <pre>
     *  Get a service
     * </pre>
     */
    public abstract void getService(T ctx, GetServiceRequest request, Observer<ServiceInfo> observer);

    /**
     * <pre>
     *  Start a service
     * </pre>
     */
    public abstract void startService(T ctx, StartServiceRequest request, Observer<Empty> observer);

    /**
     * <pre>
     *  Stop a service
     * 
     *  Once stopped, a service cannot be resumed. Instead a new service
     *  instance will be created and started.
     * </pre>
     */
    public abstract void stopService(T ctx, StopServiceRequest request, Observer<Empty> observer);

    @Override
    public final ServiceDescriptor getDescriptorForType() {
        return ServicesServiceProto.getDescriptor().getServices().get(0);
    }

    @Override
    public final Message getRequestPrototype(MethodDescriptor method) {
        if (method.getService() != getDescriptorForType()) {
            throw new IllegalArgumentException("Method not contained by this service.");
        }
        switch (method.getIndex()) {
        case 0:
            return ListServicesRequest.getDefaultInstance();
        case 1:
            return GetServiceRequest.getDefaultInstance();
        case 2:
            return StartServiceRequest.getDefaultInstance();
        case 3:
            return StopServiceRequest.getDefaultInstance();
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
            return ListServicesResponse.getDefaultInstance();
        case 1:
            return ServiceInfo.getDefaultInstance();
        case 2:
            return Empty.getDefaultInstance();
        case 3:
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
            listServices(ctx, (ListServicesRequest) request, (Observer<ListServicesResponse>)(Object) future);
            return;
        case 1:
            getService(ctx, (GetServiceRequest) request, (Observer<ServiceInfo>)(Object) future);
            return;
        case 2:
            startService(ctx, (StartServiceRequest) request, (Observer<Empty>)(Object) future);
            return;
        case 3:
            stopService(ctx, (StopServiceRequest) request, (Observer<Empty>)(Object) future);
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
