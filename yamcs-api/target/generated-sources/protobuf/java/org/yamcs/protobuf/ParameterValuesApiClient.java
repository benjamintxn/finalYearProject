package org.yamcs.protobuf;

import org.yamcs.api.MethodHandler;
import org.yamcs.api.Observer;

@javax.annotation.processing.Generated(value = "org.yamcs.protoc.ServiceGenerator", date = "2023-11-18T19:00:35.920307Z")
public class ParameterValuesApiClient extends AbstractParameterValuesApi<Void> {

    private final MethodHandler handler;

    public ParameterValuesApiClient(MethodHandler handler) {
        this.handler = handler;
    }

    /**
     * <pre>
     *  Load a stream of parameter values
     * </pre>
     */
    @Override
    @SuppressWarnings("unchecked")
    public final Observer<LoadParameterValuesRequest> loadParameterValues(Void ctx, Observer<LoadParameterValuesResponse> observer) {
        return (Observer<LoadParameterValuesRequest>)(Object) handler.streamingCall(
            getDescriptorForType().getMethods().get(0),
            LoadParameterValuesRequest.getDefaultInstance(),
            LoadParameterValuesResponse.getDefaultInstance(),
            observer);
    }
}
