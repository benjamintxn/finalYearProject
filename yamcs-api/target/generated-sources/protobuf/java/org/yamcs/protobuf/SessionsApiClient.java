package org.yamcs.protobuf;

import com.google.protobuf.Empty;
import org.yamcs.api.MethodHandler;
import org.yamcs.api.Observer;

@javax.annotation.processing.Generated(value = "org.yamcs.protoc.ServiceGenerator", date = "2023-11-18T19:00:35.925871Z")
public class SessionsApiClient extends AbstractSessionsApi<Void> {

    private final MethodHandler handler;

    public SessionsApiClient(MethodHandler handler) {
        this.handler = handler;
    }

    /**
     * <pre>
     *  List sessions
     * </pre>
     */
    @Override
    public final void listSessions(Void ctx, Empty request, Observer<ListSessionsResponse> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(0),
            request,
            ListSessionsResponse.getDefaultInstance(),
            observer);
    }
}
