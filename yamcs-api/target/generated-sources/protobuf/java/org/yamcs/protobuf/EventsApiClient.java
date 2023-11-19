package org.yamcs.protobuf;

import org.yamcs.api.HttpBody;
import org.yamcs.api.MethodHandler;
import org.yamcs.api.Observer;

@javax.annotation.processing.Generated(value = "org.yamcs.protoc.ServiceGenerator", date = "2023-11-18T19:00:35.930278Z")
public class EventsApiClient extends AbstractEventsApi<Void> {

    private final MethodHandler handler;

    public EventsApiClient(MethodHandler handler) {
        this.handler = handler;
    }

    /**
     * <pre>
     *  List events
     * </pre>
     */
    @Override
    public final void listEvents(Void ctx, ListEventsRequest request, Observer<ListEventsResponse> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(0),
            request,
            ListEventsResponse.getDefaultInstance(),
            observer);
    }

    /**
     * <pre>
     *  Create an event
     * </pre>
     */
    @Override
    public final void createEvent(Void ctx, CreateEventRequest request, Observer<Event> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(1),
            request,
            Event.getDefaultInstance(),
            observer);
    }

    /**
     * <pre>
     *  List event sources
     * </pre>
     */
    @Override
    public final void listEventSources(Void ctx, ListEventSourcesRequest request, Observer<ListEventSourcesResponse> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(2),
            request,
            ListEventSourcesResponse.getDefaultInstance(),
            observer);
    }

    /**
     * <pre>
     *  Streams back events
     * </pre>
     */
    @Override
    public final void streamEvents(Void ctx, StreamEventsRequest request, Observer<Event> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(3),
            request,
            Event.getDefaultInstance(),
            observer);
    }

    /**
     * <pre>
     *  Export events in CSV format
     * </pre>
     */
    @Override
    public final void exportEvents(Void ctx, ExportEventsRequest request, Observer<HttpBody> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(4),
            request,
            HttpBody.getDefaultInstance(),
            observer);
    }

    /**
     * <pre>
     *  Receive event updates
     * </pre>
     */
    @Override
    public final void subscribeEvents(Void ctx, SubscribeEventsRequest request, Observer<Event> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(5),
            request,
            Event.getDefaultInstance(),
            observer);
    }
}
