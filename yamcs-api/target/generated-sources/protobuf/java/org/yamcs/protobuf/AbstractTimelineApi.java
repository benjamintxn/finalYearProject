package org.yamcs.protobuf;

import com.google.protobuf.Descriptors.MethodDescriptor;
import com.google.protobuf.Descriptors.ServiceDescriptor;
import com.google.protobuf.Message;
import org.yamcs.api.Api;
import org.yamcs.api.Observer;

/**
 * <pre>
 * Methods related to the Timeline Service.
 * </pre>
 */
@javax.annotation.processing.Generated(value = "org.yamcs.protoc.ServiceGenerator", date = "2023-11-18T19:00:35.931557Z")
@SuppressWarnings("unchecked")
public abstract class AbstractTimelineApi<T> implements Api<T> {

    /**
     * <pre>
     *  Create an item
     * </pre>
     */
    public abstract void createItem(T ctx, CreateItemRequest request, Observer<TimelineItem> observer);

    /**
     * <pre>
     *  Get an item
     * </pre>
     */
    public abstract void getItem(T ctx, GetItemRequest request, Observer<TimelineItem> observer);

    /**
     * <pre>
     *  Update an item
     * </pre>
     */
    public abstract void updateItem(T ctx, UpdateItemRequest request, Observer<TimelineItem> observer);

    /**
     * <pre>
     *  List items
     * </pre>
     */
    public abstract void listItems(T ctx, ListItemsRequest request, Observer<ListItemsResponse> observer);

    /**
     * <pre>
     *  Delete an item
     * </pre>
     */
    public abstract void deleteItem(T ctx, DeleteItemRequest request, Observer<TimelineItem> observer);

    /**
     * <pre>
     *  Get an item log
     * </pre>
     */
    public abstract void getItemLog(T ctx, GetItemLogRequest request, Observer<TimelineItemLog> observer);

    /**
     * <pre>
     * add an entry to the item log table
     *  The timestamp from the messages is used if specified; if not specified, the current mission time will be used 
     * </pre>
     */
    public abstract void addItemLog(T ctx, AddItemLogRequest request, Observer<LogEntry> observer);

    /**
     * <pre>
     *  Delete a group
     * </pre>
     */
    public abstract void deleteTimelineGroup(T ctx, DeleteTimelineGroupRequest request, Observer<TimelineItem> observer);

    /**
     * <pre>
     *  List timeline sources
     * 
     *  Usually there is a source named 'rdb' which provides items from an internal RocksDB database.
     *  Other external sources may be created by adding plugins (e.g. a shift planner)
     * </pre>
     */
    public abstract void listSources(T ctx, ListSourcesRequest request, Observer<ListSourcesResponse> observer);

    /**
     * <pre>
     *  List all tags available for the 'rdb' source.
     * 
     *  Note that currently the 'rdb' source does not discard unused tags
     *  (e.g. if all item using one tag have been deleted, the tag will still be returned by this call)
     * </pre>
     */
    public abstract void listTags(T ctx, ListTimelineTagsRequest request, Observer<ListTimelineTagsResponse> observer);

    /**
     * <pre>
     *  Add a band.
     * </pre>
     */
    public abstract void addBand(T ctx, AddBandRequest request, Observer<TimelineBand> observer);

    /**
     * <pre>
     *  Get a band
     * </pre>
     */
    public abstract void getBand(T ctx, GetBandRequest request, Observer<TimelineBand> observer);

    /**
     * <pre>
     *  List all bands
     * </pre>
     */
    public abstract void listBands(T ctx, ListBandsRequest request, Observer<ListBandsResponse> observer);

    /**
     * <pre>
     *  Update a band
     * </pre>
     */
    public abstract void updateBand(T ctx, UpdateBandRequest request, Observer<TimelineBand> observer);

    /**
     * <pre>
     *  Delete a band
     * </pre>
     */
    public abstract void deleteBand(T ctx, DeleteBandRequest request, Observer<TimelineBand> observer);

    /**
     * <pre>
     *  Add a view
     * </pre>
     */
    public abstract void addView(T ctx, AddViewRequest request, Observer<TimelineView> observer);

    /**
     * <pre>
     *  Get a view
     * </pre>
     */
    public abstract void getView(T ctx, GetViewRequest request, Observer<TimelineView> observer);

    /**
     * <pre>
     *  List all views
     * </pre>
     */
    public abstract void listViews(T ctx, ListViewsRequest request, Observer<ListViewsResponse> observer);

    /**
     * <pre>
     *  Update a view
     * </pre>
     */
    public abstract void updateView(T ctx, UpdateViewRequest request, Observer<TimelineView> observer);

    /**
     * <pre>
     *  Delete a view
     * </pre>
     */
    public abstract void deleteView(T ctx, DeleteViewRequest request, Observer<TimelineView> observer);

    @Override
    public final ServiceDescriptor getDescriptorForType() {
        return TimelineProto.getDescriptor().getServices().get(0);
    }

    @Override
    public final Message getRequestPrototype(MethodDescriptor method) {
        if (method.getService() != getDescriptorForType()) {
            throw new IllegalArgumentException("Method not contained by this service.");
        }
        switch (method.getIndex()) {
        case 0:
            return CreateItemRequest.getDefaultInstance();
        case 1:
            return GetItemRequest.getDefaultInstance();
        case 2:
            return UpdateItemRequest.getDefaultInstance();
        case 3:
            return ListItemsRequest.getDefaultInstance();
        case 4:
            return DeleteItemRequest.getDefaultInstance();
        case 5:
            return GetItemLogRequest.getDefaultInstance();
        case 6:
            return AddItemLogRequest.getDefaultInstance();
        case 7:
            return DeleteTimelineGroupRequest.getDefaultInstance();
        case 8:
            return ListSourcesRequest.getDefaultInstance();
        case 9:
            return ListTimelineTagsRequest.getDefaultInstance();
        case 10:
            return AddBandRequest.getDefaultInstance();
        case 11:
            return GetBandRequest.getDefaultInstance();
        case 12:
            return ListBandsRequest.getDefaultInstance();
        case 13:
            return UpdateBandRequest.getDefaultInstance();
        case 14:
            return DeleteBandRequest.getDefaultInstance();
        case 15:
            return AddViewRequest.getDefaultInstance();
        case 16:
            return GetViewRequest.getDefaultInstance();
        case 17:
            return ListViewsRequest.getDefaultInstance();
        case 18:
            return UpdateViewRequest.getDefaultInstance();
        case 19:
            return DeleteViewRequest.getDefaultInstance();
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
            return TimelineItem.getDefaultInstance();
        case 1:
            return TimelineItem.getDefaultInstance();
        case 2:
            return TimelineItem.getDefaultInstance();
        case 3:
            return ListItemsResponse.getDefaultInstance();
        case 4:
            return TimelineItem.getDefaultInstance();
        case 5:
            return TimelineItemLog.getDefaultInstance();
        case 6:
            return LogEntry.getDefaultInstance();
        case 7:
            return TimelineItem.getDefaultInstance();
        case 8:
            return ListSourcesResponse.getDefaultInstance();
        case 9:
            return ListTimelineTagsResponse.getDefaultInstance();
        case 10:
            return TimelineBand.getDefaultInstance();
        case 11:
            return TimelineBand.getDefaultInstance();
        case 12:
            return ListBandsResponse.getDefaultInstance();
        case 13:
            return TimelineBand.getDefaultInstance();
        case 14:
            return TimelineBand.getDefaultInstance();
        case 15:
            return TimelineView.getDefaultInstance();
        case 16:
            return TimelineView.getDefaultInstance();
        case 17:
            return ListViewsResponse.getDefaultInstance();
        case 18:
            return TimelineView.getDefaultInstance();
        case 19:
            return TimelineView.getDefaultInstance();
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
            createItem(ctx, (CreateItemRequest) request, (Observer<TimelineItem>)(Object) future);
            return;
        case 1:
            getItem(ctx, (GetItemRequest) request, (Observer<TimelineItem>)(Object) future);
            return;
        case 2:
            updateItem(ctx, (UpdateItemRequest) request, (Observer<TimelineItem>)(Object) future);
            return;
        case 3:
            listItems(ctx, (ListItemsRequest) request, (Observer<ListItemsResponse>)(Object) future);
            return;
        case 4:
            deleteItem(ctx, (DeleteItemRequest) request, (Observer<TimelineItem>)(Object) future);
            return;
        case 5:
            getItemLog(ctx, (GetItemLogRequest) request, (Observer<TimelineItemLog>)(Object) future);
            return;
        case 6:
            addItemLog(ctx, (AddItemLogRequest) request, (Observer<LogEntry>)(Object) future);
            return;
        case 7:
            deleteTimelineGroup(ctx, (DeleteTimelineGroupRequest) request, (Observer<TimelineItem>)(Object) future);
            return;
        case 8:
            listSources(ctx, (ListSourcesRequest) request, (Observer<ListSourcesResponse>)(Object) future);
            return;
        case 9:
            listTags(ctx, (ListTimelineTagsRequest) request, (Observer<ListTimelineTagsResponse>)(Object) future);
            return;
        case 10:
            addBand(ctx, (AddBandRequest) request, (Observer<TimelineBand>)(Object) future);
            return;
        case 11:
            getBand(ctx, (GetBandRequest) request, (Observer<TimelineBand>)(Object) future);
            return;
        case 12:
            listBands(ctx, (ListBandsRequest) request, (Observer<ListBandsResponse>)(Object) future);
            return;
        case 13:
            updateBand(ctx, (UpdateBandRequest) request, (Observer<TimelineBand>)(Object) future);
            return;
        case 14:
            deleteBand(ctx, (DeleteBandRequest) request, (Observer<TimelineBand>)(Object) future);
            return;
        case 15:
            addView(ctx, (AddViewRequest) request, (Observer<TimelineView>)(Object) future);
            return;
        case 16:
            getView(ctx, (GetViewRequest) request, (Observer<TimelineView>)(Object) future);
            return;
        case 17:
            listViews(ctx, (ListViewsRequest) request, (Observer<ListViewsResponse>)(Object) future);
            return;
        case 18:
            updateView(ctx, (UpdateViewRequest) request, (Observer<TimelineView>)(Object) future);
            return;
        case 19:
            deleteView(ctx, (DeleteViewRequest) request, (Observer<TimelineView>)(Object) future);
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
