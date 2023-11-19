package org.yamcs.protobuf;

import org.yamcs.api.MethodHandler;
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
@javax.annotation.processing.Generated(value = "org.yamcs.protoc.ServiceGenerator", date = "2023-11-18T19:00:35.927096Z")
public class TableApiClient extends AbstractTableApi<Void> {

    private final MethodHandler handler;

    public TableApiClient(MethodHandler handler) {
        this.handler = handler;
    }

    /**
     * <pre>
     *  Execute SQL
     * </pre>
     */
    @Override
    public final void executeSql(Void ctx, ExecuteSqlRequest request, Observer<ResultSet> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(0),
            request,
            ResultSet.getDefaultInstance(),
            observer);
    }

    /**
     * <pre>
     *  Execute streaming SQL
     * </pre>
     */
    @Override
    public final void executeStreamingSql(Void ctx, ExecuteSqlRequest request, Observer<ResultSet> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(1),
            request,
            ResultSet.getDefaultInstance(),
            observer);
    }

    /**
     * <pre>
     *  List streams
     * 
     *  Note that this will only list the fixed columns of the stream.
     *  Tuples may always have extra columns.
     * </pre>
     */
    @Override
    public final void listStreams(Void ctx, ListStreamsRequest request, Observer<ListStreamsResponse> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(2),
            request,
            ListStreamsResponse.getDefaultInstance(),
            observer);
    }

    /**
     * <pre>
     *  Receive updates on stream stats
     * </pre>
     */
    @Override
    public final void subscribeStreamStatistics(Void ctx, SubscribeStreamStatisticsRequest request, Observer<StreamEvent> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(3),
            request,
            StreamEvent.getDefaultInstance(),
            observer);
    }

    /**
     * <pre>
     *  Get a stream
     * </pre>
     */
    @Override
    public final void getStream(Void ctx, GetStreamRequest request, Observer<StreamInfo> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(4),
            request,
            StreamInfo.getDefaultInstance(),
            observer);
    }

    /**
     * <pre>
     *  Receive stream updates
     * </pre>
     */
    @Override
    public final void subscribeStream(Void ctx, SubscribeStreamRequest request, Observer<StreamData> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(5),
            request,
            StreamData.getDefaultInstance(),
            observer);
    }

    /**
     * <pre>
     *  List tables
     * 
     *  The response will only include fixed columns of the table. Tuples may always
     *  add extra value columns.
     * </pre>
     */
    @Override
    public final void listTables(Void ctx, ListTablesRequest request, Observer<ListTablesResponse> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(6),
            request,
            ListTablesResponse.getDefaultInstance(),
            observer);
    }

    /**
     * <pre>
     *  Get a table
     * </pre>
     */
    @Override
    public final void getTable(Void ctx, GetTableRequest request, Observer<TableInfo> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(7),
            request,
            TableInfo.getDefaultInstance(),
            observer);
    }

    /**
     * <pre>
     *  Get table data
     * </pre>
     */
    @Override
    public final void getTableData(Void ctx, GetTableDataRequest request, Observer<TableData> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(8),
            request,
            TableData.getDefaultInstance(),
            observer);
    }

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
    @Override
    public final void readRows(Void ctx, ReadRowsRequest request, Observer<Row> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(9),
            request,
            Row.getDefaultInstance(),
            observer);
    }

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
    @Override
    @SuppressWarnings("unchecked")
    public final Observer<WriteRowsRequest> writeRows(Void ctx, Observer<WriteRowsResponse> observer) {
        return (Observer<WriteRowsRequest>)(Object) handler.streamingCall(
            getDescriptorForType().getMethods().get(10),
            WriteRowsRequest.getDefaultInstance(),
            WriteRowsResponse.getDefaultInstance(),
            observer);
    }

    /**
     * <pre>
     *  Rebuilds histograms - this is required after a table load.
     * 
     *  Currently the time interval passed in the request will be used to select the
     *  partitions which will be rebuild - any partition overlapping with the interval will be rebuilt.
     *  If the table is not partitioned by time,  the histogram for the entire table will be rebuild.
     * </pre>
     */
    @Override
    public final void rebuildHistogram(Void ctx, RebuildHistogramRequest request, Observer<RebuildHistogramResponse> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(11),
            request,
            RebuildHistogramResponse.getDefaultInstance(),
            observer);
    }
}
