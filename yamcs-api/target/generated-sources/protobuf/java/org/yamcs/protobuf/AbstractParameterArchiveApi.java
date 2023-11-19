package org.yamcs.protobuf;

import com.google.protobuf.Descriptors.MethodDescriptor;
import com.google.protobuf.Descriptors.ServiceDescriptor;
import com.google.protobuf.Empty;
import com.google.protobuf.Message;
import org.yamcs.api.Api;
import org.yamcs.api.Observer;
import org.yamcs.protobuf.Archive.GetParameterSamplesRequest;
import org.yamcs.protobuf.Archive.ListParameterHistoryRequest;
import org.yamcs.protobuf.Archive.ListParameterHistoryResponse;
import org.yamcs.protobuf.Pvalue.Ranges;
import org.yamcs.protobuf.Pvalue.TimeSeries;

@javax.annotation.processing.Generated(value = "org.yamcs.protoc.ServiceGenerator", date = "2023-11-18T19:00:35.921778Z")
@SuppressWarnings("unchecked")
public abstract class AbstractParameterArchiveApi<T> implements Api<T> {

    /**
     * <pre>
     *  Rebuild range
     * 
     *  The back filler has to be enabled for this purpose. The back filling process does not
     *  remove data but just overwrites it. That means that if the parameter replay returns
     *  less parameters than originally stored in the archive, the old parameters will still
     *  be found in the archive.
     * 
     *  It also means that if a replay returns the parameter of a different type than
     *  originally stored, the old ones will still be stored. This is because the parameter
     *  archive treats parameter with the same name but different type as different parameters.
     *  Each of them is given an id and the id is stored in the archive.
     * </pre>
     */
    public abstract void rebuildRange(T ctx, RebuildRangeRequest request, Observer<Empty> observer);

    /**
     * <pre>
     *  Get parameter samples
     * 
     *  This divides the query interval in a number of intervals and returns aggregated
     *  statistics (max, min, avg) about each interval.
     * 
     *  This operation is useful when making high-level overviews (such as plots) of a
     *  parameter's value over large time intervals without having to retrieve each
     *  and every individual parameter value.
     * 
     *  By default this operation fetches data from the parameter archive and/or
     *  parameter cache. If these services are not configured, you can still get
     *  correct results by specifying the option ``source=replay`` as detailed below.
     * </pre>
     */
    public abstract void getParameterSamples(T ctx, GetParameterSamplesRequest request, Observer<TimeSeries> observer);

    /**
     * <pre>
     *  Get parameter ranges
     * 
     *  A range is a tuple ``(start, stop, value, count)`` that represents the time
     *  interval for which the parameter has been steadily coming in with the same
     *  value. This request is useful for retrieving an overview for parameters that
     *  change unfrequently in a large time interval. For example an on/off status
     *  of a device, or some operational status. Two consecutive ranges containing
     *  the same value will be returned if there was a gap in the data. The gap is
     *  determined according to the parameter expiration time configured in the
     *  Mission Database.
     * </pre>
     */
    public abstract void getParameterRanges(T ctx, GetParameterRangesRequest request, Observer<Ranges> observer);

    /**
     * <pre>
     *  List parameter history
     * </pre>
     */
    public abstract void listParameterHistory(T ctx, ListParameterHistoryRequest request, Observer<ListParameterHistoryResponse> observer);

    /**
     * <pre>
     *  Get information about the archived parameters.
     * 
     *  Each combination of (parameter name, raw type, engineering type) is assigned a
     *  unique parameter id.
     *  
     *  The parameters are grouped such that the samples of all parameters from one group
     *  have the same timestamp. For example all parameters extracted from one TM packet
     *  have usually the same timestamp and are part of the same group.
     * 
     *  Each group is assigned a unique group id.
     * 
     *  A parameter can be part of multiple groups. For instance a parameter appearing
     *  in the header of a packet is part of all groups made by inherited containers
     *  (i.e. each packet with that header will compose another group).
     * 
     *  For each group, the parameter archive stores one common record for the timestamps
     *  and individual records for the raw and engineering values of each parameter. If a
     *  parameter appears in multiple groups, retrieving its value means combining
     *  (time-based merge operation). The records beloging to the groups in which the
     *  parameter appears.
     * 
     *  The response to this method contains the parameter id, name, engineering type,
     *  raw type and the groups of which this parameter is part of.
     * </pre>
     */
    public abstract void getArchivedParametersInfo(T ctx, GetArchivedParametersInfoRequest request, Observer<ArchivedParametersInfoResponse> observer);

    /**
     * <pre>
     *  For a given parameter id, get the list of segments available for that parameter.
     *  A segment contains multiple samples (maximum ~70 minutes) of the same parameter.
     * </pre>
     */
    public abstract void getArchivedParameterSegments(T ctx, GetArchivedParameterSegmentsRequest request, Observer<ArchivedParameterSegmentsResponse> observer);

    /**
     * <pre>
     * For a given group id, get the list of parameters which are part of the group
     * </pre>
     */
    public abstract void getArchivedParameterGroup(T ctx, GetArchivedParameterGroupRequest request, Observer<ArchivedParameterGroupResponse> observer);

    @Override
    public final ServiceDescriptor getDescriptorForType() {
        return ParameterArchiveServiceProto.getDescriptor().getServices().get(0);
    }

    @Override
    public final Message getRequestPrototype(MethodDescriptor method) {
        if (method.getService() != getDescriptorForType()) {
            throw new IllegalArgumentException("Method not contained by this service.");
        }
        switch (method.getIndex()) {
        case 0:
            return RebuildRangeRequest.getDefaultInstance();
        case 1:
            return GetParameterSamplesRequest.getDefaultInstance();
        case 2:
            return GetParameterRangesRequest.getDefaultInstance();
        case 3:
            return ListParameterHistoryRequest.getDefaultInstance();
        case 4:
            return GetArchivedParametersInfoRequest.getDefaultInstance();
        case 5:
            return GetArchivedParameterSegmentsRequest.getDefaultInstance();
        case 6:
            return GetArchivedParameterGroupRequest.getDefaultInstance();
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
            return Empty.getDefaultInstance();
        case 1:
            return TimeSeries.getDefaultInstance();
        case 2:
            return Ranges.getDefaultInstance();
        case 3:
            return ListParameterHistoryResponse.getDefaultInstance();
        case 4:
            return ArchivedParametersInfoResponse.getDefaultInstance();
        case 5:
            return ArchivedParameterSegmentsResponse.getDefaultInstance();
        case 6:
            return ArchivedParameterGroupResponse.getDefaultInstance();
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
            rebuildRange(ctx, (RebuildRangeRequest) request, (Observer<Empty>)(Object) future);
            return;
        case 1:
            getParameterSamples(ctx, (GetParameterSamplesRequest) request, (Observer<TimeSeries>)(Object) future);
            return;
        case 2:
            getParameterRanges(ctx, (GetParameterRangesRequest) request, (Observer<Ranges>)(Object) future);
            return;
        case 3:
            listParameterHistory(ctx, (ListParameterHistoryRequest) request, (Observer<ListParameterHistoryResponse>)(Object) future);
            return;
        case 4:
            getArchivedParametersInfo(ctx, (GetArchivedParametersInfoRequest) request, (Observer<ArchivedParametersInfoResponse>)(Object) future);
            return;
        case 5:
            getArchivedParameterSegments(ctx, (GetArchivedParameterSegmentsRequest) request, (Observer<ArchivedParameterSegmentsResponse>)(Object) future);
            return;
        case 6:
            getArchivedParameterGroup(ctx, (GetArchivedParameterGroupRequest) request, (Observer<ArchivedParameterGroupResponse>)(Object) future);
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
