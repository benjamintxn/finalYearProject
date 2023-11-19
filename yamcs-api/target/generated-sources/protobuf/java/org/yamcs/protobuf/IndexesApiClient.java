package org.yamcs.protobuf;

import com.google.protobuf.Empty;
import org.yamcs.api.MethodHandler;
import org.yamcs.api.Observer;
import org.yamcs.protobuf.Yamcs.ArchiveRecord;

@javax.annotation.processing.Generated(value = "org.yamcs.protoc.ServiceGenerator", date = "2023-11-18T19:00:35.921068Z")
public class IndexesApiClient extends AbstractIndexesApi<Void> {

    private final MethodHandler handler;

    public IndexesApiClient(MethodHandler handler) {
        this.handler = handler;
    }

    /**
     * <pre>
     *  List command history index
     * </pre>
     */
    @Override
    public final void listCommandHistoryIndex(Void ctx, ListCommandHistoryIndexRequest request, Observer<IndexResponse> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(0),
            request,
            IndexResponse.getDefaultInstance(),
            observer);
    }

    /**
     * <pre>
     *  List event index
     * </pre>
     */
    @Override
    public final void listEventIndex(Void ctx, ListEventIndexRequest request, Observer<IndexResponse> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(1),
            request,
            IndexResponse.getDefaultInstance(),
            observer);
    }

    /**
     * <pre>
     *  List packet index
     * </pre>
     */
    @Override
    public final void listPacketIndex(Void ctx, ListPacketIndexRequest request, Observer<IndexResponse> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(2),
            request,
            IndexResponse.getDefaultInstance(),
            observer);
    }

    /**
     * <pre>
     *  List parameter index
     * </pre>
     */
    @Override
    public final void listParameterIndex(Void ctx, ListParameterIndexRequest request, Observer<IndexResponse> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(3),
            request,
            IndexResponse.getDefaultInstance(),
            observer);
    }

    /**
     * <pre>
     *  List completeness index
     * </pre>
     */
    @Override
    public final void listCompletenessIndex(Void ctx, ListCompletenessIndexRequest request, Observer<IndexResponse> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(4),
            request,
            IndexResponse.getDefaultInstance(),
            observer);
    }

    /**
     * <pre>
     *  Streams back packet index records
     * </pre>
     */
    @Override
    public final void streamPacketIndex(Void ctx, StreamPacketIndexRequest request, Observer<ArchiveRecord> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(5),
            request,
            ArchiveRecord.getDefaultInstance(),
            observer);
    }

    /**
     * <pre>
     *  Streams back parameter index records
     * </pre>
     */
    @Override
    public final void streamParameterIndex(Void ctx, StreamParameterIndexRequest request, Observer<ArchiveRecord> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(6),
            request,
            ArchiveRecord.getDefaultInstance(),
            observer);
    }

    /**
     * <pre>
     *  Streams back processed parameter index records
     * </pre>
     */
    @Override
    public final void streamCommandIndex(Void ctx, StreamCommandIndexRequest request, Observer<ArchiveRecord> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(7),
            request,
            ArchiveRecord.getDefaultInstance(),
            observer);
    }

    /**
     * <pre>
     *  Streams back event index records
     * </pre>
     */
    @Override
    public final void streamEventIndex(Void ctx, StreamEventIndexRequest request, Observer<ArchiveRecord> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(8),
            request,
            ArchiveRecord.getDefaultInstance(),
            observer);
    }

    /**
     * <pre>
     *  Streams back event index records
     * </pre>
     */
    @Override
    public final void streamCompletenessIndex(Void ctx, StreamCompletenessIndexRequest request, Observer<ArchiveRecord> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(9),
            request,
            ArchiveRecord.getDefaultInstance(),
            observer);
    }

    /**
     * <pre>
     *  Rebuild CCSDS TM Index
     * </pre>
     */
    @Override
    public final void rebuildCcsdsIndex(Void ctx, RebuildCcsdsIndexRequest request, Observer<Empty> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(10),
            request,
            Empty.getDefaultInstance(),
            observer);
    }
}
