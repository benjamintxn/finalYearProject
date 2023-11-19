package org.yamcs.protobuf;

import com.google.protobuf.Empty;
import org.yamcs.api.MethodHandler;
import org.yamcs.api.Observer;

@javax.annotation.processing.Generated(value = "org.yamcs.protoc.ServiceGenerator", date = "2023-11-18T19:00:35.916537Z")
public class DatabaseApiClient extends AbstractDatabaseApi<Void> {

    private final MethodHandler handler;

    public DatabaseApiClient(MethodHandler handler) {
        this.handler = handler;
    }

    /**
     * <pre>
     *  List databases
     * </pre>
     */
    @Override
    public final void listDatabases(Void ctx, Empty request, Observer<ListDatabasesResponse> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(0),
            request,
            ListDatabasesResponse.getDefaultInstance(),
            observer);
    }

    /**
     * <pre>
     *  Get database
     * </pre>
     */
    @Override
    public final void getDatabase(Void ctx, GetDatabaseRequest request, Observer<DatabaseInfo> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(1),
            request,
            DatabaseInfo.getDefaultInstance(),
            observer);
    }
}
