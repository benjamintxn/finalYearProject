package org.yamcs.protobuf;

import com.google.protobuf.Empty;
import org.yamcs.api.MethodHandler;
import org.yamcs.api.Observer;

@javax.annotation.processing.Generated(value = "org.yamcs.protoc.ServiceGenerator", date = "2023-11-18T19:00:35.932375Z")
public class ServicesApiClient extends AbstractServicesApi<Void> {

    private final MethodHandler handler;

    public ServicesApiClient(MethodHandler handler) {
        this.handler = handler;
    }

    /**
     * <pre>
     *  List services
     * </pre>
     */
    @Override
    public final void listServices(Void ctx, ListServicesRequest request, Observer<ListServicesResponse> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(0),
            request,
            ListServicesResponse.getDefaultInstance(),
            observer);
    }

    /**
     * <pre>
     *  Get a service
     * </pre>
     */
    @Override
    public final void getService(Void ctx, GetServiceRequest request, Observer<ServiceInfo> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(1),
            request,
            ServiceInfo.getDefaultInstance(),
            observer);
    }

    /**
     * <pre>
     *  Start a service
     * </pre>
     */
    @Override
    public final void startService(Void ctx, StartServiceRequest request, Observer<Empty> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(2),
            request,
            Empty.getDefaultInstance(),
            observer);
    }

    /**
     * <pre>
     *  Stop a service
     * 
     *  Once stopped, a service cannot be resumed. Instead a new service
     *  instance will be created and started.
     * </pre>
     */
    @Override
    public final void stopService(Void ctx, StopServiceRequest request, Observer<Empty> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(3),
            request,
            Empty.getDefaultInstance(),
            observer);
    }
}
