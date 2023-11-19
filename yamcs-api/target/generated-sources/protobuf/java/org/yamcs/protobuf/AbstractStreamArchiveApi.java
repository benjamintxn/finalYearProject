package org.yamcs.protobuf;

import com.google.protobuf.Descriptors.MethodDescriptor;
import com.google.protobuf.Descriptors.ServiceDescriptor;
import com.google.protobuf.Message;
import org.yamcs.api.Api;
import org.yamcs.api.HttpBody;
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

@javax.annotation.processing.Generated(value = "org.yamcs.protoc.ServiceGenerator", date = "2023-11-18T19:00:35.921320Z")
@SuppressWarnings("unchecked")
public abstract class AbstractStreamArchiveApi<T> implements Api<T> {

    /**
     * <pre>
     *  List parameter groups
     * </pre>
     */
    public abstract void listParameterGroups(T ctx, ListParameterGroupsRequest request, Observer<ParameterGroupInfo> observer);

    /**
     * <pre>
     *  List parameter history
     * </pre>
     */
    public abstract void listParameterHistory(T ctx, ListParameterHistoryRequest request, Observer<ListParameterHistoryResponse> observer);

    /**
     * <pre>
     *  Streams back parameter values
     * </pre>
     */
    public abstract void streamParameterValues(T ctx, StreamParameterValuesRequest request, Observer<ParameterData> observer);

    /**
     * <pre>
     *  Get parameter samples
     * </pre>
     */
    public abstract void getParameterSamples(T ctx, GetParameterSamplesRequest request, Observer<TimeSeries> observer);

    /**
     * <pre>
     *  Export parameter values in CSV format
     * </pre>
     */
    public abstract void exportParameterValues(T ctx, ExportParameterValuesRequest request, Observer<HttpBody> observer);

    @Override
    public final ServiceDescriptor getDescriptorForType() {
        return Archive.getDescriptor().getServices().get(0);
    }

    @Override
    public final Message getRequestPrototype(MethodDescriptor method) {
        if (method.getService() != getDescriptorForType()) {
            throw new IllegalArgumentException("Method not contained by this service.");
        }
        switch (method.getIndex()) {
        case 0:
            return ListParameterGroupsRequest.getDefaultInstance();
        case 1:
            return ListParameterHistoryRequest.getDefaultInstance();
        case 2:
            return StreamParameterValuesRequest.getDefaultInstance();
        case 3:
            return GetParameterSamplesRequest.getDefaultInstance();
        case 4:
            return ExportParameterValuesRequest.getDefaultInstance();
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
            return ParameterGroupInfo.getDefaultInstance();
        case 1:
            return ListParameterHistoryResponse.getDefaultInstance();
        case 2:
            return ParameterData.getDefaultInstance();
        case 3:
            return TimeSeries.getDefaultInstance();
        case 4:
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
            listParameterGroups(ctx, (ListParameterGroupsRequest) request, (Observer<ParameterGroupInfo>)(Object) future);
            return;
        case 1:
            listParameterHistory(ctx, (ListParameterHistoryRequest) request, (Observer<ListParameterHistoryResponse>)(Object) future);
            return;
        case 2:
            streamParameterValues(ctx, (StreamParameterValuesRequest) request, (Observer<ParameterData>)(Object) future);
            return;
        case 3:
            getParameterSamples(ctx, (GetParameterSamplesRequest) request, (Observer<TimeSeries>)(Object) future);
            return;
        case 4:
            exportParameterValues(ctx, (ExportParameterValuesRequest) request, (Observer<HttpBody>)(Object) future);
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
