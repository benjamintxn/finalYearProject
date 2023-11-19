package org.yamcs.protobuf;

import com.google.protobuf.Empty;
import org.yamcs.api.MethodHandler;
import org.yamcs.api.Observer;

@javax.annotation.processing.Generated(value = "org.yamcs.protoc.ServiceGenerator", date = "2023-11-18T19:00:35.930101Z")
public class ReplicationApiClient extends AbstractReplicationApi<Void> {

    private final MethodHandler handler;

    public ReplicationApiClient(MethodHandler handler) {
        this.handler = handler;
    }

    /**
     * <pre>
     *  Get replication info
     * </pre>
     */
    @Override
    public final void getReplicationInfo(Void ctx, Empty request, Observer<ReplicationInfo> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(0),
            request,
            ReplicationInfo.getDefaultInstance(),
            observer);
    }

    /**
     * <pre>
     *  Receive replication updates
     * </pre>
     */
    @Override
    public final void subscribeReplicationInfo(Void ctx, Empty request, Observer<ReplicationInfo> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(1),
            request,
            ReplicationInfo.getDefaultInstance(),
            observer);
    }
}
