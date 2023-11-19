package org.yamcs.protobuf;

import com.google.protobuf.Descriptors.MethodDescriptor;
import com.google.protobuf.Descriptors.ServiceDescriptor;
import com.google.protobuf.Message;
import org.yamcs.api.Api;
import org.yamcs.api.HttpBody;
import org.yamcs.api.Observer;

@javax.annotation.processing.Generated(value = "org.yamcs.protoc.ServiceGenerator", date = "2023-11-18T19:00:35.930134Z")
@SuppressWarnings("unchecked")
public abstract class AbstractEventsApi<T> implements Api<T> {

    /**
     * <pre>
     *  List events
     * </pre>
     */
    public abstract void listEvents(T ctx, ListEventsRequest request, Observer<ListEventsResponse> observer);

    /**
     * <pre>
     *  Create an event
     * </pre>
     */
    public abstract void createEvent(T ctx, CreateEventRequest request, Observer<Event> observer);

    /**
     * <pre>
     *  List event sources
     * </pre>
     */
    public abstract void listEventSources(T ctx, ListEventSourcesRequest request, Observer<ListEventSourcesResponse> observer);

    /**
     * <pre>
     *  Streams back events
     * </pre>
     */
    public abstract void streamEvents(T ctx, StreamEventsRequest request, Observer<Event> observer);

    /**
     * <pre>
     *  Export events in CSV format
     * </pre>
     */
    public abstract void exportEvents(T ctx, ExportEventsRequest request, Observer<HttpBody> observer);

    /**
     * <pre>
     *  Receive event updates
     * </pre>
     */
    public abstract void subscribeEvents(T ctx, SubscribeEventsRequest request, Observer<Event> observer);

    @Override
    public final ServiceDescriptor getDescriptorForType() {
        return EventsServiceProto.getDescriptor().getServices().get(0);
    }

    @Override
    public final Message getRequestPrototype(MethodDescriptor method) {
        if (method.getService() != getDescriptorForType()) {
            throw new IllegalArgumentException("Method not contained by this service.");
        }
        switch (method.getIndex()) {
        case 0:
            return ListEventsRequest.getDefaultInstance();
        case 1:
            return CreateEventRequest.getDefaultInstance();
        case 2:
            return ListEventSourcesRequest.getDefaultInstance();
        case 3:
            return StreamEventsRequest.getDefaultInstance();
        case 4:
            return ExportEventsRequest.getDefaultInstance();
        case 5:
            return SubscribeEventsRequest.getDefaultInstance();
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
            return ListEventsResponse.getDefaultInstance();
        case 1:
            return Event.getDefaultInstance();
        case 2:
            return ListEventSourcesResponse.getDefaultInstance();
        case 3:
            return Event.getDefaultInstance();
        case 4:
            return HttpBody.getDefaultInstance();
        case 5:
            return Event.getDefaultInstance();
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
            listEvents(ctx, (ListEventsRequest) request, (Observer<ListEventsResponse>)(Object) future);
            return;
        case 1:
            createEvent(ctx, (CreateEventRequest) request, (Observer<Event>)(Object) future);
            return;
        case 2:
            listEventSources(ctx, (ListEventSourcesRequest) request, (Observer<ListEventSourcesResponse>)(Object) future);
            return;
        case 3:
            streamEvents(ctx, (StreamEventsRequest) request, (Observer<Event>)(Object) future);
            return;
        case 4:
            exportEvents(ctx, (ExportEventsRequest) request, (Observer<HttpBody>)(Object) future);
            return;
        case 5:
            subscribeEvents(ctx, (SubscribeEventsRequest) request, (Observer<Event>)(Object) future);
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
