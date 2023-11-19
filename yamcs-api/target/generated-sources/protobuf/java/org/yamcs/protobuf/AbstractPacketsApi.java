package org.yamcs.protobuf;

import com.google.protobuf.Descriptors.MethodDescriptor;
import com.google.protobuf.Descriptors.ServiceDescriptor;
import com.google.protobuf.Message;
import org.yamcs.api.Api;
import org.yamcs.api.HttpBody;
import org.yamcs.api.Observer;

@javax.annotation.processing.Generated(value = "org.yamcs.protoc.ServiceGenerator", date = "2023-11-18T19:00:35.928596Z")
@SuppressWarnings("unchecked")
public abstract class AbstractPacketsApi<T> implements Api<T> {

    /**
     * <pre>
     *  List packet names
     * </pre>
     */
    public abstract void listPacketNames(T ctx, ListPacketNamesRequest request, Observer<ListPacketNamesResponse> observer);

    /**
     * <pre>
     *  List packets
     * </pre>
     */
    public abstract void listPackets(T ctx, ListPacketsRequest request, Observer<ListPacketsResponse> observer);

    /**
     * <pre>
     *  Get a packet
     * </pre>
     */
    public abstract void getPacket(T ctx, GetPacketRequest request, Observer<TmPacketData> observer);

    /**
     * <pre>
     *  Extract data from a stored packet
     * 
     *  This call uses the current Mission Database to perform a standalone
     *  extraction of a single stored packet, returning contained parameter
     *  values, and corresponding bit positions.
     * </pre>
     */
    public abstract void extractPacket(T ctx, ExtractPacketRequest request, Observer<ExtractPacketResponse> observer);

    /**
     * <pre>
     *  Streams back packets
     * </pre>
     */
    public abstract void streamPackets(T ctx, StreamPacketsRequest request, Observer<TmPacketData> observer);

    /**
     * <pre>
     *  Export a raw packet
     * </pre>
     */
    public abstract void exportPacket(T ctx, ExportPacketRequest request, Observer<HttpBody> observer);

    /**
     * <pre>
     *  Export raw packets
     * </pre>
     */
    public abstract void exportPackets(T ctx, ExportPacketsRequest request, Observer<HttpBody> observer);

    /**
     * <pre>
     *  Subscribe to packets
     * 
     *  This subscription is performed at stream or processor level.
     * 
     *  The identifier of the packets is not filled in.
     * </pre>
     */
    public abstract void subscribePackets(T ctx, SubscribePacketsRequest request, Observer<TmPacketData> observer);

    /**
     * <pre>
     *  Subscribe to containers
     * </pre>
     */
    public abstract void subscribeContainers(T ctx, SubscribeContainersRequest request, Observer<ContainerData> observer);

    @Override
    public final ServiceDescriptor getDescriptorForType() {
        return PacketsServiceProto.getDescriptor().getServices().get(0);
    }

    @Override
    public final Message getRequestPrototype(MethodDescriptor method) {
        if (method.getService() != getDescriptorForType()) {
            throw new IllegalArgumentException("Method not contained by this service.");
        }
        switch (method.getIndex()) {
        case 0:
            return ListPacketNamesRequest.getDefaultInstance();
        case 1:
            return ListPacketsRequest.getDefaultInstance();
        case 2:
            return GetPacketRequest.getDefaultInstance();
        case 3:
            return ExtractPacketRequest.getDefaultInstance();
        case 4:
            return StreamPacketsRequest.getDefaultInstance();
        case 5:
            return ExportPacketRequest.getDefaultInstance();
        case 6:
            return ExportPacketsRequest.getDefaultInstance();
        case 7:
            return SubscribePacketsRequest.getDefaultInstance();
        case 8:
            return SubscribeContainersRequest.getDefaultInstance();
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
            return ListPacketNamesResponse.getDefaultInstance();
        case 1:
            return ListPacketsResponse.getDefaultInstance();
        case 2:
            return TmPacketData.getDefaultInstance();
        case 3:
            return ExtractPacketResponse.getDefaultInstance();
        case 4:
            return TmPacketData.getDefaultInstance();
        case 5:
            return HttpBody.getDefaultInstance();
        case 6:
            return HttpBody.getDefaultInstance();
        case 7:
            return TmPacketData.getDefaultInstance();
        case 8:
            return ContainerData.getDefaultInstance();
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
            listPacketNames(ctx, (ListPacketNamesRequest) request, (Observer<ListPacketNamesResponse>)(Object) future);
            return;
        case 1:
            listPackets(ctx, (ListPacketsRequest) request, (Observer<ListPacketsResponse>)(Object) future);
            return;
        case 2:
            getPacket(ctx, (GetPacketRequest) request, (Observer<TmPacketData>)(Object) future);
            return;
        case 3:
            extractPacket(ctx, (ExtractPacketRequest) request, (Observer<ExtractPacketResponse>)(Object) future);
            return;
        case 4:
            streamPackets(ctx, (StreamPacketsRequest) request, (Observer<TmPacketData>)(Object) future);
            return;
        case 5:
            exportPacket(ctx, (ExportPacketRequest) request, (Observer<HttpBody>)(Object) future);
            return;
        case 6:
            exportPackets(ctx, (ExportPacketsRequest) request, (Observer<HttpBody>)(Object) future);
            return;
        case 7:
            subscribePackets(ctx, (SubscribePacketsRequest) request, (Observer<TmPacketData>)(Object) future);
            return;
        case 8:
            subscribeContainers(ctx, (SubscribeContainersRequest) request, (Observer<ContainerData>)(Object) future);
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
