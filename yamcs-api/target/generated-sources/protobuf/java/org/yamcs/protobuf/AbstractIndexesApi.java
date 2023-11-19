package org.yamcs.protobuf;

import com.google.protobuf.Descriptors.MethodDescriptor;
import com.google.protobuf.Descriptors.ServiceDescriptor;
import com.google.protobuf.Empty;
import com.google.protobuf.Message;
import org.yamcs.api.Api;
import org.yamcs.api.Observer;
import org.yamcs.protobuf.Yamcs.ArchiveRecord;

@javax.annotation.processing.Generated(value = "org.yamcs.protoc.ServiceGenerator", date = "2023-11-18T19:00:35.920791Z")
@SuppressWarnings("unchecked")
public abstract class AbstractIndexesApi<T> implements Api<T> {

    /**
     * <pre>
     *  List command history index
     * </pre>
     */
    public abstract void listCommandHistoryIndex(T ctx, ListCommandHistoryIndexRequest request, Observer<IndexResponse> observer);

    /**
     * <pre>
     *  List event index
     * </pre>
     */
    public abstract void listEventIndex(T ctx, ListEventIndexRequest request, Observer<IndexResponse> observer);

    /**
     * <pre>
     *  List packet index
     * </pre>
     */
    public abstract void listPacketIndex(T ctx, ListPacketIndexRequest request, Observer<IndexResponse> observer);

    /**
     * <pre>
     *  List parameter index
     * </pre>
     */
    public abstract void listParameterIndex(T ctx, ListParameterIndexRequest request, Observer<IndexResponse> observer);

    /**
     * <pre>
     *  List completeness index
     * </pre>
     */
    public abstract void listCompletenessIndex(T ctx, ListCompletenessIndexRequest request, Observer<IndexResponse> observer);

    /**
     * <pre>
     *  Streams back packet index records
     * </pre>
     */
    public abstract void streamPacketIndex(T ctx, StreamPacketIndexRequest request, Observer<ArchiveRecord> observer);

    /**
     * <pre>
     *  Streams back parameter index records
     * </pre>
     */
    public abstract void streamParameterIndex(T ctx, StreamParameterIndexRequest request, Observer<ArchiveRecord> observer);

    /**
     * <pre>
     *  Streams back processed parameter index records
     * </pre>
     */
    public abstract void streamCommandIndex(T ctx, StreamCommandIndexRequest request, Observer<ArchiveRecord> observer);

    /**
     * <pre>
     *  Streams back event index records
     * </pre>
     */
    public abstract void streamEventIndex(T ctx, StreamEventIndexRequest request, Observer<ArchiveRecord> observer);

    /**
     * <pre>
     *  Streams back event index records
     * </pre>
     */
    public abstract void streamCompletenessIndex(T ctx, StreamCompletenessIndexRequest request, Observer<ArchiveRecord> observer);

    /**
     * <pre>
     *  Rebuild CCSDS TM Index
     * </pre>
     */
    public abstract void rebuildCcsdsIndex(T ctx, RebuildCcsdsIndexRequest request, Observer<Empty> observer);

    @Override
    public final ServiceDescriptor getDescriptorForType() {
        return IndexServiceProto.getDescriptor().getServices().get(0);
    }

    @Override
    public final Message getRequestPrototype(MethodDescriptor method) {
        if (method.getService() != getDescriptorForType()) {
            throw new IllegalArgumentException("Method not contained by this service.");
        }
        switch (method.getIndex()) {
        case 0:
            return ListCommandHistoryIndexRequest.getDefaultInstance();
        case 1:
            return ListEventIndexRequest.getDefaultInstance();
        case 2:
            return ListPacketIndexRequest.getDefaultInstance();
        case 3:
            return ListParameterIndexRequest.getDefaultInstance();
        case 4:
            return ListCompletenessIndexRequest.getDefaultInstance();
        case 5:
            return StreamPacketIndexRequest.getDefaultInstance();
        case 6:
            return StreamParameterIndexRequest.getDefaultInstance();
        case 7:
            return StreamCommandIndexRequest.getDefaultInstance();
        case 8:
            return StreamEventIndexRequest.getDefaultInstance();
        case 9:
            return StreamCompletenessIndexRequest.getDefaultInstance();
        case 10:
            return RebuildCcsdsIndexRequest.getDefaultInstance();
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
            return IndexResponse.getDefaultInstance();
        case 1:
            return IndexResponse.getDefaultInstance();
        case 2:
            return IndexResponse.getDefaultInstance();
        case 3:
            return IndexResponse.getDefaultInstance();
        case 4:
            return IndexResponse.getDefaultInstance();
        case 5:
            return ArchiveRecord.getDefaultInstance();
        case 6:
            return ArchiveRecord.getDefaultInstance();
        case 7:
            return ArchiveRecord.getDefaultInstance();
        case 8:
            return ArchiveRecord.getDefaultInstance();
        case 9:
            return ArchiveRecord.getDefaultInstance();
        case 10:
            return Empty.getDefaultInstance();
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
            listCommandHistoryIndex(ctx, (ListCommandHistoryIndexRequest) request, (Observer<IndexResponse>)(Object) future);
            return;
        case 1:
            listEventIndex(ctx, (ListEventIndexRequest) request, (Observer<IndexResponse>)(Object) future);
            return;
        case 2:
            listPacketIndex(ctx, (ListPacketIndexRequest) request, (Observer<IndexResponse>)(Object) future);
            return;
        case 3:
            listParameterIndex(ctx, (ListParameterIndexRequest) request, (Observer<IndexResponse>)(Object) future);
            return;
        case 4:
            listCompletenessIndex(ctx, (ListCompletenessIndexRequest) request, (Observer<IndexResponse>)(Object) future);
            return;
        case 5:
            streamPacketIndex(ctx, (StreamPacketIndexRequest) request, (Observer<ArchiveRecord>)(Object) future);
            return;
        case 6:
            streamParameterIndex(ctx, (StreamParameterIndexRequest) request, (Observer<ArchiveRecord>)(Object) future);
            return;
        case 7:
            streamCommandIndex(ctx, (StreamCommandIndexRequest) request, (Observer<ArchiveRecord>)(Object) future);
            return;
        case 8:
            streamEventIndex(ctx, (StreamEventIndexRequest) request, (Observer<ArchiveRecord>)(Object) future);
            return;
        case 9:
            streamCompletenessIndex(ctx, (StreamCompletenessIndexRequest) request, (Observer<ArchiveRecord>)(Object) future);
            return;
        case 10:
            rebuildCcsdsIndex(ctx, (RebuildCcsdsIndexRequest) request, (Observer<Empty>)(Object) future);
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
