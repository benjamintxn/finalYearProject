package org.yamcs.protobuf;

import com.google.protobuf.Empty;
import org.yamcs.api.MethodHandler;
import org.yamcs.api.Observer;
import org.yamcs.protobuf.Archive.GetParameterSamplesRequest;
import org.yamcs.protobuf.Archive.ListParameterHistoryRequest;
import org.yamcs.protobuf.Archive.ListParameterHistoryResponse;
import org.yamcs.protobuf.Pvalue.Ranges;
import org.yamcs.protobuf.Pvalue.TimeSeries;

@javax.annotation.processing.Generated(value = "org.yamcs.protoc.ServiceGenerator", date = "2023-11-18T19:00:35.922067Z")
public class ParameterArchiveApiClient extends AbstractParameterArchiveApi<Void> {

    private final MethodHandler handler;

    public ParameterArchiveApiClient(MethodHandler handler) {
        this.handler = handler;
    }

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
    @Override
    public final void rebuildRange(Void ctx, RebuildRangeRequest request, Observer<Empty> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(0),
            request,
            Empty.getDefaultInstance(),
            observer);
    }

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
    @Override
    public final void getParameterSamples(Void ctx, GetParameterSamplesRequest request, Observer<TimeSeries> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(1),
            request,
            TimeSeries.getDefaultInstance(),
            observer);
    }

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
    @Override
    public final void getParameterRanges(Void ctx, GetParameterRangesRequest request, Observer<Ranges> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(2),
            request,
            Ranges.getDefaultInstance(),
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
            getDescriptorForType().getMethods().get(3),
            request,
            ListParameterHistoryResponse.getDefaultInstance(),
            observer);
    }

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
    @Override
    public final void getArchivedParametersInfo(Void ctx, GetArchivedParametersInfoRequest request, Observer<ArchivedParametersInfoResponse> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(4),
            request,
            ArchivedParametersInfoResponse.getDefaultInstance(),
            observer);
    }

    /**
     * <pre>
     *  For a given parameter id, get the list of segments available for that parameter.
     *  A segment contains multiple samples (maximum ~70 minutes) of the same parameter.
     * </pre>
     */
    @Override
    public final void getArchivedParameterSegments(Void ctx, GetArchivedParameterSegmentsRequest request, Observer<ArchivedParameterSegmentsResponse> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(5),
            request,
            ArchivedParameterSegmentsResponse.getDefaultInstance(),
            observer);
    }

    /**
     * <pre>
     * For a given group id, get the list of parameters which are part of the group
     * </pre>
     */
    @Override
    public final void getArchivedParameterGroup(Void ctx, GetArchivedParameterGroupRequest request, Observer<ArchivedParameterGroupResponse> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(6),
            request,
            ArchivedParameterGroupResponse.getDefaultInstance(),
            observer);
    }
}
