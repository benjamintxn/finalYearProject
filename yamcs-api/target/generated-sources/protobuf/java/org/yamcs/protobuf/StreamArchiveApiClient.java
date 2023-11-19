package org.yamcs.protobuf;

import org.yamcs.api.HttpBody;
import org.yamcs.api.MethodHandler;
import org.yamcs.api.Observer;
import org.yamcs.protobuf.Archive.ExportParameterValuesRequest;
import org.yamcs.protobuf.Archive.GetParameterSamplesRequest;
import org.yamcs.protobuf.Archive.ListParameterGroupsRequest;
import org.yamcs.protobuf.Archive.ListParameterHistoryRequest;
import org.yamcs.protobuf.Archive.ListParameterHistoryResponse;
import org.yamcs.protobuf.Archive.ParameterGroupInfo;
import org.yamcs.protobuf.Archive.StreamParameterValuesRequest;
import org.yamcs.protobuf.Pvalue.ParameterData;
import org.yamcs.protobuf.Pvalue.TimeSeries;

@javax.annotation.processing.Generated(value = "org.yamcs.protoc.ServiceGenerator", date = "2023-11-18T19:00:35.921602Z")
public class StreamArchiveApiClient extends AbstractStreamArchiveApi<Void> {

    private final MethodHandler handler;

    public StreamArchiveApiClient(MethodHandler handler) {
        this.handler = handler;
    }

    /**
     * <pre>
     *  List parameter groups
     * </pre>
     */
    @Override
    public final void listParameterGroups(Void ctx, ListParameterGroupsRequest request, Observer<ParameterGroupInfo> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(0),
            request,
            ParameterGroupInfo.getDefaultInstance(),
            observer);
    }

    /**
     * <pre>
     *  List parameter history
     * </pre>
     */
    @Override
    public final void listParameterHistory(Void ctx, ListParameterHistoryRequest request, Observer<ListParameterHistoryResponse> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(1),
            request,
            ListParameterHistoryResponse.getDefaultInstance(),
            observer);
    }

    /**
     * <pre>
     *  Streams back parameter values
     * </pre>
     */
    @Override
    public final void streamParameterValues(Void ctx, StreamParameterValuesRequest request, Observer<ParameterData> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(2),
            request,
            ParameterData.getDefaultInstance(),
            observer);
    }

    /**
     * <pre>
     *  Get parameter samples
     * </pre>
     */
    @Override
    public final void getParameterSamples(Void ctx, GetParameterSamplesRequest request, Observer<TimeSeries> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(3),
            request,
            TimeSeries.getDefaultInstance(),
            observer);
    }

    /**
     * <pre>
     *  Export parameter values in CSV format
     * </pre>
     */
    @Override
    public final void exportParameterValues(Void ctx, ExportParameterValuesRequest request, Observer<HttpBody> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(4),
            request,
            HttpBody.getDefaultInstance(),
            observer);
    }
}
