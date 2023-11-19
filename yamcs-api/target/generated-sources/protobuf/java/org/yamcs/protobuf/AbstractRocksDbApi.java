package org.yamcs.protobuf;

import com.google.protobuf.Descriptors.MethodDescriptor;
import com.google.protobuf.Descriptors.ServiceDescriptor;
import com.google.protobuf.Empty;
import com.google.protobuf.Message;
import org.yamcs.api.Api;
import org.yamcs.api.HttpBody;
import org.yamcs.api.Observer;

@javax.annotation.processing.Generated(value = "org.yamcs.protoc.ServiceGenerator", date = "2023-11-18T19:00:35.920493Z")
@SuppressWarnings("unchecked")
public abstract class AbstractRocksDbApi<T> implements Api<T> {

    /**
     * <pre>
     *  List tablespaces
     * </pre>
     */
    public abstract void listTablespaces(T ctx, Empty request, Observer<ListRocksDbTablespacesResponse> observer);

    /**
     * <pre>
     *  Backup database
     * </pre>
     */
    public abstract void backupDatabase(T ctx, BackupDatabaseRequest request, Observer<Empty> observer);

    /**
     * <pre>
     *  List databases
     * </pre>
     */
    public abstract void listDatabases(T ctx, Empty request, Observer<ListRocksDbDatabasesResponse> observer);

    /**
     * <pre>
     *  Compact database
     * </pre>
     */
    public abstract void compactDatabase(T ctx, CompactDatabaseRequest request, Observer<Empty> observer);

    /**
     * <pre>
     *  Get a text-dump with general RocksDB info
     * </pre>
     */
    public abstract void describeRocksDb(T ctx, Empty request, Observer<HttpBody> observer);

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
    public abstract void describeDatabase(T ctx, DescribeDatabaseRequest request, Observer<HttpBody> observer);

    @Override
    public final ServiceDescriptor getDescriptorForType() {
        return RocksDbServiceProto.getDescriptor().getServices().get(0);
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
            return BackupDatabaseRequest.getDefaultInstance();
        case 2:
            return Empty.getDefaultInstance();
        case 3:
            return CompactDatabaseRequest.getDefaultInstance();
        case 4:
            return Empty.getDefaultInstance();
        case 5:
            return DescribeDatabaseRequest.getDefaultInstance();
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
            return ListRocksDbTablespacesResponse.getDefaultInstance();
        case 1:
            return Empty.getDefaultInstance();
        case 2:
            return ListRocksDbDatabasesResponse.getDefaultInstance();
        case 3:
            return Empty.getDefaultInstance();
        case 4:
            return HttpBody.getDefaultInstance();
        case 5:
            return HttpBody.getDefaultInstance();
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
            listTablespaces(ctx, (Empty) request, (Observer<ListRocksDbTablespacesResponse>)(Object) future);
            return;
        case 1:
            backupDatabase(ctx, (BackupDatabaseRequest) request, (Observer<Empty>)(Object) future);
            return;
        case 2:
            listDatabases(ctx, (Empty) request, (Observer<ListRocksDbDatabasesResponse>)(Object) future);
            return;
        case 3:
            compactDatabase(ctx, (CompactDatabaseRequest) request, (Observer<Empty>)(Object) future);
            return;
        case 4:
            describeRocksDb(ctx, (Empty) request, (Observer<HttpBody>)(Object) future);
            return;
        case 5:
            describeDatabase(ctx, (DescribeDatabaseRequest) request, (Observer<HttpBody>)(Object) future);
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
