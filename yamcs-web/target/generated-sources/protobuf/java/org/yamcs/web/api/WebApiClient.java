package org.yamcs.web.api;

import org.yamcs.api.MethodHandler;
import org.yamcs.api.Observer;

@javax.annotation.processing.Generated(value = "org.yamcs.protoc.ServiceGenerator", date = "2023-11-18T19:01:08.291655Z")
public class WebApiClient extends AbstractWebApi<Void> {

    private final MethodHandler handler;

    public WebApiClient(MethodHandler handler) {
        this.handler = handler;
    }

    /**
     * <pre>
     *  Get web configuration for an instance
     * </pre>
     */
    @Override
    public final void getInstanceConfiguration(Void ctx, GetInstanceConfigurationRequest request, Observer<InstanceConfiguration> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(0),
            request,
            InstanceConfiguration.getDefaultInstance(),
            observer);
    }
}
