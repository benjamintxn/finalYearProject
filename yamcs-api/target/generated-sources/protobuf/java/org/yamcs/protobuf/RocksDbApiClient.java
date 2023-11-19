package org.yamcs.protobuf;

import com.google.protobuf.Empty;
import org.yamcs.api.HttpBody;
import org.yamcs.api.MethodHandler;
import org.yamcs.api.Observer;

@javax.annotation.processing.Generated(value = "org.yamcs.protoc.ServiceGenerator", date = "2023-11-18T19:00:35.920661Z")
public class RocksDbApiClient extends AbstractRocksDbApi<Void> {

    private final MethodHandler handler;

    public RocksDbApiClient(MethodHandler handler) {
        this.handler = handler;
    }

    /**
     * <pre>
     *  List tablespaces
     * </pre>
     */
    @Override
    public final void listTablespaces(Void ctx, Empty request, Observer<ListRocksDbTablespacesResponse> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(0),
            request,
            ListRocksDbTablespacesResponse.getDefaultInstance(),
            observer);
    }

    /**
     * <pre>
     *  Backup database
     * </pre>
     */
    @Override
    public final void backupDatabase(Void ctx, BackupDatabaseRequest request, Observer<Empty> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(1),
            request,
            Empty.getDefaultInstance(),
            observer);
    }

    /**
     * <pre>
     *  List databases
     * </pre>
     */
    @Override
    public final void listDatabases(Void ctx, Empty request, Observer<ListRocksDbDatabasesResponse> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(2),
            request,
            ListRocksDbDatabasesResponse.getDefaultInstance(),
            observer);
    }

    /**
     * <pre>
     *  Compact database
     * </pre>
     */
    @Override
    public final void compactDatabase(Void ctx, CompactDatabaseRequest request, Observer<Empty> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(3),
            request,
            Empty.getDefaultInstance(),
            observer);
    }

    /**
     * <pre>
     *  Get a text-dump with general RocksDB info
     * </pre>
     */
    @Override
    public final void describeRocksDb(Void ctx, Empty request, Observer<HttpBody> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(4),
            request,
            HttpBody.getDefaultInstance(),
            observer);
    }

    /**
     * <pre>
     *  Get a text-dump describing a database
     * 
     *  This operation can be used to debug the inner workings of RocksDB database.
     *  For example the property rocksdb.estimate-table-readers-mem will provide an
     *  estimation of how much memory is used by the index and filter cache of
     *  RocksDB (note that the memory used by RocksDB is outside the java heap space).
     * 
     *  See also: https://github.com/facebook/rocksdb/blob/master/include/rocksdb/db.h
     * 
     *  The response contains a dump of various rocksdb properties for each column
     *  family. The single value properties are presented in a "name: value" list.
     *  The multiline properties are preceded by a line including the property name
     *  between dashes.
     * </pre>
     */
    @Override
    public final void describeDatabase(Void ctx, DescribeDatabaseRequest request, Observer<HttpBody> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(5),
            request,
            HttpBody.getDefaultInstance(),
            observer);
    }
}
