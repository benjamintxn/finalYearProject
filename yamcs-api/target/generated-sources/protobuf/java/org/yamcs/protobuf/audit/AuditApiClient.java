package org.yamcs.protobuf.audit;

import org.yamcs.api.MethodHandler;
import org.yamcs.api.Observer;

@javax.annotation.processing.Generated(value = "org.yamcs.protoc.ServiceGenerator", date = "2023-11-18T19:00:35.926179Z")
public class AuditApiClient extends AbstractAuditApi<Void> {

    private final MethodHandler handler;

    public AuditApiClient(MethodHandler handler) {
        this.handler = handler;
    }

    /**
     * <pre>
     *  List audit records
     * </pre>
     */
    @Override
    public final void listAuditRecords(Void ctx, ListAuditRecordsRequest request, Observer<ListAuditRecordsResponse> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(0),
            request,
            ListAuditRecordsResponse.getDefaultInstance(),
            observer);
    }
}
