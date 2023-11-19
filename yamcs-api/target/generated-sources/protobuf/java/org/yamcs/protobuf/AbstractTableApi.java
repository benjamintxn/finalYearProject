package org.yamcs.protobuf;

import com.google.protobuf.Descriptors.MethodDescriptor;
import com.google.protobuf.Descriptors.ServiceDescriptor;
import com.google.protobuf.Message;
import org.yamcs.api.Api;
import org.yamcs.api.Observer;
import org.yamcs.protobuf.Table.ExecuteSqlRequest;
import org.yamcs.protobuf.Table.GetStreamRequest;
import org.yamcs.protobuf.Table.GetTableDataRequest;
import org.yamcs.protobuf.Table.GetTableRequest;
import org.yamcs.protobuf.Table.ListStreamsRequest;
import org.yamcs.protobuf.Table.ListStreamsResponse;
import org.yamcs.protobuf.Table.ListTablesRequest;
import org.yamcs.protobuf.Table.ListTablesResponse;
import org.yamcs.protobuf.Table.ReadRowsRequest;
import org.yamcs.protobuf.Table.RebuildHistogramRequest;
import org.yamcs.protobuf.Table.RebuildHistogramResponse;
import org.yamcs.protobuf.Table.ResultSet;
import org.yamcs.protobuf.Table.Row;
import org.yamcs.protobuf.Table.StreamData;
import org.yamcs.protobuf.Table.StreamInfo;
import org.yamcs.protobuf.Table.SubscribeStreamRequest;
import org.yamcs.protobuf.Table.SubscribeStreamStatisticsRequest;
import org.yamcs.protobuf.Table.TableData;
import org.yamcs.protobuf.Table.TableInfo;
import org.yamcs.protobuf.Table.WriteRowsRequest;
import org.yamcs.protobuf.Table.WriteRowsResponse;

/**
 * <pre>
 *  Service for reading and writing to Yamcs tables and streams
 * </pre>
 */
@javax.annotation.processing.Generated(value = "org.yamcs.protoc.ServiceGenerator", date = "2023-11-18T19:00:35.926228Z")
@SuppressWarnings("unchecked")
public abstract class AbstractTableApi<T> implements Api<T> {

    /**
     * <pre>
     *  Execute SQL
     * </pre>
     */
    public abstract void executeSql(T ctx, ExecuteSqlRequest request, Observer<ResultSet> observer);

    /**
     * <pre>
     *  Execute streaming SQL
     * </pre>
     */
    public abstract void executeStreamingSql(T ctx, ExecuteSqlRequest request, Observer<ResultSet> observer);

    /**
     * <pre>
     *  List streams
     * 
     *  Note that this will only list the fixed columns of the stream.
     *  Tuples may always have extra columns.
     * </pre>
     */
    public abstract void listStreams(T ctx, ListStreamsRequest request, Observer<ListStreamsResponse> observer);

    /**
     * <pre>
     *  Receive updates on stream stats
     * </pre>
     */
    public abstract void subscribeStreamStatistics(T ctx, SubscribeStreamStatisticsRequest request, Observer<StreamEvent> observer);

    /**
     * <pre>
     *  Get a stream
     * </pre>
     */
    public abstract void getStream(T ctx, GetStreamRequest request, Observer<StreamInfo> observer);

    /**
     * <pre>
     *  Receive stream updates
     * </pre>
     */
    public abstract void subscribeStream(T ctx, SubscribeStreamRequest request, Observer<StreamData> observer);

    /**
     * <pre>
     *  List tables
     * 
     *  The response will only include fixed columns of the table. Tuples may always
     *  add extra value columns.
     * </pre>
     */
    public abstract void listTables(T ctx, ListTablesRequest request, Observer<ListTablesResponse> observer);

    /**
     * <pre>
     *  Get a table
     * </pre>
     */
    public abstract void getTable(T ctx, GetTableRequest request, Observer<TableInfo> observer);

    /**
     * <pre>
     *  Get table data
     * </pre>
     */
    public abstract void getTableData(T ctx, GetTableDataRequest request, Observer<TableData> observer);

    /**
     * <pre>
     *  Streams back the contents of all rows in key order
     * 
     *  The ``ColumnInfo`` message assigns an integer ``id`` for each column
     *  and the ``id`` is present in each cell belonging to that column (this
     *  is done in order to avoid sending the ``ColumnInfo`` with each ``Cell``).
     *  The column id starts from 0 and are incremented with each new column found.
     *  The ids are only valid during one single dump.
     *  The dumped data does not contain information on any table characteristics
     *  such as (primary) key, partitioning or other storage options.
     * </pre>
     */
    public abstract void readRows(T ctx, ReadRowsRequest request, Observer<Row> observer);

    /**
     * <pre>
     *  Imports a stream of rows
     * 
     *  The table has to exist in order to load data into it.
     * 
     *  As soon as the server detects an error with one of the written
     *  rows, it will forcefully close the connection and send back an
     *  early error message. The client should stop streaming and handle
     *  the error.
     * 
     *  Note that the erratic condition causes the connection to be closed
     *  even if the ``Keep-Alive`` request header was enabled.
     * 
     *  The error response is of type ``ExceptionMessage`` and contains a
     *  detail message of type ``WriteRowsExceptionDetail`` that provides
     *  the number of rows that were successfully written by the client.
     *  The client can use this information to link the error message to a
     *  row (i.e. the bad row is at position ``count + 1`` of the stream).
     * 
     *  One possible error could be that the table has defined a (primary)
     *  key and one of the loaded rows contains no value for one of the
     *  columns of the key.
     * 
     *  The table load will overwrite any data existing in the table with the 
     *  same key as the imported row.
     * 
     *  The table load will not update the histograms so a histogram rebuild
     *  is required after the load.  
     * </pre>
     */
    public abstract Observer<WriteRowsRequest> writeRows(T ctx, Observer<WriteRowsResponse> observer);

    /**
     * <pre>
     *  Rebuilds histograms - this is required after a table load.
     * 
     *  Currently the time interval passed in the request will be used to select the
     *  partitions which will be rebuild - any partition overlapping with the interval will be rebuilt.
     *  If the table is not partitioned by time,  the histogram for the entire table will be rebuild.
     * </pre>
     */
    public abstract void rebuildHistogram(T ctx, RebuildHistogramRequest request, Observer<RebuildHistogramResponse> observer);

    @Override
    public final ServiceDescriptor getDescriptorForType() {
        return Table.getDescriptor().getServices().get(0);
    }

    @Override
    public final Message getRequestPrototype(MethodDescriptor method) {
        if (method.getService() != getDescriptorForType()) {
            throw new IllegalArgumentException("Method not contained by this service.");
        }
        switch (method.getIndex()) {
        case 0:
            return ExecuteSqlRequest.getDefaultInstance();
        case 1:
            return ExecuteSqlRequest.getDefaultInstance();
        case 2:
            return ListStreamsRequest.getDefaultInstance();
        case 3:
            return SubscribeStreamStatisticsRequest.getDefaultInstance();
        case 4:
            return GetStreamRequest.getDefaultInstance();
        case 5:
            return SubscribeStreamRequest.getDefaultInstance();
        case 6:
            return ListTablesRequest.getDefaultInstance();
        case 7:
            return GetTableRequest.getDefaultInstance();
        case 8:
            return GetTableDataRequest.getDefaultInstance();
        case 9:
            return ReadRowsRequest.getDefaultInstance();
        case 10:
            return WriteRowsRequest.getDefaultInstance();
        case 11:
            return RebuildHistogramRequest.getDefaultInstance();
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
            return ResultSet.getDefaultInstance();
        case 1:
            return ResultSet.getDefaultInstance();
        case 2:
            return ListStreamsResponse.getDefaultInstance();
        case 3:
            return StreamEvent.getDefaultInstance();
        case 4:
            return StreamInfo.getDefaultInstance();
        case 5:
            return StreamData.getDefaultInstance();
        case 6:
            return ListTablesResponse.getDefaultInstance();
        case 7:
            return TableInfo.getDefaultInstance();
        case 8:
            return TableData.getDefaultInstance();
        case 9:
            return Row.getDefaultInstance();
        case 10:
            return WriteRowsResponse.getDefaultInstance();
        case 11:
            return RebuildHistogramResponse.getDefaultInstance();
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
            executeSql(ctx, (ExecuteSqlRequest) request, (Observer<ResultSet>)(Object) future);
            return;
        case 1:
            executeStreamingSql(ctx, (ExecuteSqlRequest) request, (Observer<ResultSet>)(Object) future);
            return;
        case 2:
            listStreams(ctx, (ListStreamsRequest) request, (Observer<ListStreamsResponse>)(Object) future);
            return;
        case 3:
            subscribeStreamStatistics(ctx, (SubscribeStreamStatisticsRequest) request, (Observer<StreamEvent>)(Object) future);
            return;
        case 4:
            getStream(ctx, (GetStreamRequest) request, (Observer<StreamInfo>)(Object) future);
            return;
        case 5:
            subscribeStream(ctx, (SubscribeStreamRequest) request, (Observer<StreamData>)(Object) future);
            return;
        case 6:
            listTables(ctx, (ListTablesRequest) request, (Observer<ListTablesResponse>)(Object) future);
            return;
        case 7:
            getTable(ctx, (GetTableRequest) request, (Observer<TableInfo>)(Object) future);
            return;
        case 8:
            getTableData(ctx, (GetTableDataRequest) request, (Observer<TableData>)(Object) future);
            return;
        case 9:
            readRows(ctx, (ReadRowsRequest) request, (Observer<Row>)(Object) future);
            return;
        case 11:
            rebuildHistogram(ctx, (RebuildHistogramRequest) request, (Observer<RebuildHistogramResponse>)(Object) future);
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
        case 10:
            return (Observer<Message>)(Object) writeRows(ctx, (Observer<WriteRowsResponse>)(Object) future);
        default:
            throw new IllegalStateException();
        }
    }
}
