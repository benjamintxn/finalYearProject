package org.yamcs.protobuf;

import org.yamcs.api.HttpBody;
import org.yamcs.api.MethodHandler;
import org.yamcs.api.Observer;

@javax.annotation.processing.Generated(value = "org.yamcs.protoc.ServiceGenerator", date = "2023-11-18T19:00:35.928969Z")
public class PacketsApiClient extends AbstractPacketsApi<Void> {

    private final MethodHandler handler;

    public PacketsApiClient(MethodHandler handler) {
        this.handler = handler;
    }

    /**
     * <pre>
     *  List packet names
     * </pre>
     */
    @Override
    public final void listPacketNames(Void ctx, ListPacketNamesRequest request, Observer<ListPacketNamesResponse> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(0),
            request,
            ListPacketNamesResponse.getDefaultInstance(),
            observer);
    }

    /**
     * <pre>
     *  List packets
     * </pre>
     */
    @Override
    public final void listPackets(Void ctx, ListPacketsRequest request, Observer<ListPacketsResponse> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(1),
            request,
            ListPacketsResponse.getDefaultInstance(),
            observer);
    }

    /**
     * <pre>
     *  Get a packet
     * </pre>
     */
    @Override
    public final void getPacket(Void ctx, GetPacketRequest request, Observer<TmPacketData> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(2),
            request,
            TmPacketData.getDefaultInstance(),
            observer);
    }

    /**
     * <pre>
     *  Extract data from a stored packet
     * 
     *  This call uses the current Mission Database to perform a standalone
     *  extraction of a single stored packet, returning contained parameter
     *  values, and corresponding bit positions.
     * </pre>
     */
    @Override
    public final void extractPacket(Void ctx, ExtractPacketRequest request, Observer<ExtractPacketResponse> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(3),
            request,
            ExtractPacketResponse.getDefaultInstance(),
            observer);
    }

    /**
     * <pre>
     *  Streams back packets
     * </pre>
     */
    @Override
    public final void streamPackets(Void ctx, StreamPacketsRequest request, Observer<TmPacketData> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(4),
            request,
            TmPacketData.getDefaultInstance(),
            observer);
    }

    /**
     * <pre>
     *  Export a raw packet
     * </pre>
     */
    @Override
    public final void exportPacket(Void ctx, ExportPacketRequest request, Observer<HttpBody> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(5),
            request,
            HttpBody.getDefaultInstance(),
            observer);
    }

    /**
     * <pre>
     *  Export raw packets
     * </pre>
     */
    @Override
    public final void exportPackets(Void ctx, ExportPacketsRequest request, Observer<HttpBody> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(6),
            request,
            HttpBody.getDefaultInstance(),
            observer);
    }

    /**
     * <pre>
     *  Subscribe to packets
     * 
     *  This subscription is performed at stream or processor level.
     * 
     *  The identifier of the packets is not filled in.
     * </pre>
     */
    @Override
    public final void subscribePackets(Void ctx, SubscribePacketsRequest request, Observer<TmPacketData> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(7),
            request,
            TmPacketData.getDefaultInstance(),
            observer);
    }

    /**
     * <pre>
     *  Subscribe to containers
     * </pre>
     */
    @Override
    public final void subscribeContainers(Void ctx, SubscribeContainersRequest request, Observer<ContainerData> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(8),
            request,
            ContainerData.getDefaultInstance(),
            observer);
    }
}
