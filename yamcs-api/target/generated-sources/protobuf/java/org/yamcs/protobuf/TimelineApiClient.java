package org.yamcs.protobuf;

import org.yamcs.api.MethodHandler;
import org.yamcs.api.Observer;

/**
 * <pre>
 * Methods related to the Timeline Service.
 * </pre>
 */
@javax.annotation.processing.Generated(value = "org.yamcs.protoc.ServiceGenerator", date = "2023-11-18T19:00:35.932020Z")
public class TimelineApiClient extends AbstractTimelineApi<Void> {

    private final MethodHandler handler;

    public TimelineApiClient(MethodHandler handler) {
        this.handler = handler;
    }

    /**
     * <pre>
     *  Create an item
     * </pre>
     */
    @Override
    public final void createItem(Void ctx, CreateItemRequest request, Observer<TimelineItem> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(0),
            request,
            TimelineItem.getDefaultInstance(),
            observer);
    }

    /**
     * <pre>
     *  Get an item
     * </pre>
     */
    @Override
    public final void getItem(Void ctx, GetItemRequest request, Observer<TimelineItem> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(1),
            request,
            TimelineItem.getDefaultInstance(),
            observer);
    }

    /**
     * <pre>
     *  Update an item
     * </pre>
     */
    @Override
    public final void updateItem(Void ctx, UpdateItemRequest request, Observer<TimelineItem> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(2),
            request,
            TimelineItem.getDefaultInstance(),
            observer);
    }

    /**
     * <pre>
     *  List items
     * </pre>
     */
    @Override
    public final void listItems(Void ctx, ListItemsRequest request, Observer<ListItemsResponse> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(3),
            request,
            ListItemsResponse.getDefaultInstance(),
            observer);
    }

    /**
     * <pre>
     *  Delete an item
     * </pre>
     */
    @Override
    public final void deleteItem(Void ctx, DeleteItemRequest request, Observer<TimelineItem> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(4),
            request,
            TimelineItem.getDefaultInstance(),
            observer);
    }

    /**
     * <pre>
     *  Get an item log
     * </pre>
     */
    @Override
    public final void getItemLog(Void ctx, GetItemLogRequest request, Observer<TimelineItemLog> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(5),
            request,
            TimelineItemLog.getDefaultInstance(),
            observer);
    }

    /**
     * <pre>
     * add an entry to the item log table
     *  The timestamp from the messages is used if specified; if not specified, the current mission time will be used 
     * </pre>
     */
    @Override
    public final void addItemLog(Void ctx, AddItemLogRequest request, Observer<LogEntry> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(6),
            request,
            LogEntry.getDefaultInstance(),
            observer);
    }

    /**
     * <pre>
     *  Delete a group
     * </pre>
     */
    @Override
    public final void deleteTimelineGroup(Void ctx, DeleteTimelineGroupRequest request, Observer<TimelineItem> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(7),
            request,
            TimelineItem.getDefaultInstance(),
            observer);
    }

    /**
     * <pre>
     *  List timeline sources
     * 
     *  Usually there is a source named 'rdb' which provides items from an internal RocksDB database.
     *  Other external sources may be created by adding plugins (e.g. a shift planner)
     * </pre>
     */
    @Override
    public final void listSources(Void ctx, ListSourcesRequest request, Observer<ListSourcesResponse> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(8),
            request,
            ListSourcesResponse.getDefaultInstance(),
            observer);
    }

    /**
     * <pre>
     *  List all tags available for the 'rdb' source.
     * 
     *  Note that currently the 'rdb' source does not discard unused tags
     *  (e.g. if all item using one tag have been deleted, the tag will still be returned by this call)
     * </pre>
     */
    @Override
    public final void listTags(Void ctx, ListTimelineTagsRequest request, Observer<ListTimelineTagsResponse> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(9),
            request,
            ListTimelineTagsResponse.getDefaultInstance(),
            observer);
    }

    /**
     * <pre>
     *  Add a band.
     * </pre>
     */
    @Override
    public final void addBand(Void ctx, AddBandRequest request, Observer<TimelineBand> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(10),
            request,
            TimelineBand.getDefaultInstance(),
            observer);
    }

    /**
     * <pre>
     *  Get a band
     * </pre>
     */
    @Override
    public final void getBand(Void ctx, GetBandRequest request, Observer<TimelineBand> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(11),
            request,
            TimelineBand.getDefaultInstance(),
            observer);
    }

    /**
     * <pre>
     *  List all bands
     * </pre>
     */
    @Override
    public final void listBands(Void ctx, ListBandsRequest request, Observer<ListBandsResponse> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(12),
            request,
            ListBandsResponse.getDefaultInstance(),
            observer);
    }

    /**
     * <pre>
     *  Update a band
     * </pre>
     */
    @Override
    public final void updateBand(Void ctx, UpdateBandRequest request, Observer<TimelineBand> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(13),
            request,
            TimelineBand.getDefaultInstance(),
            observer);
    }

    /**
     * <pre>
     *  Delete a band
     * </pre>
     */
    @Override
    public final void deleteBand(Void ctx, DeleteBandRequest request, Observer<TimelineBand> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(14),
            request,
            TimelineBand.getDefaultInstance(),
            observer);
    }

    /**
     * <pre>
     *  Add a view
     * </pre>
     */
    @Override
    public final void addView(Void ctx, AddViewRequest request, Observer<TimelineView> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(15),
            request,
            TimelineView.getDefaultInstance(),
            observer);
    }

    /**
     * <pre>
     *  Get a view
     * </pre>
     */
    @Override
    public final void getView(Void ctx, GetViewRequest request, Observer<TimelineView> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(16),
            request,
            TimelineView.getDefaultInstance(),
            observer);
    }

    /**
     * <pre>
     *  List all views
     * </pre>
     */
    @Override
    public final void listViews(Void ctx, ListViewsRequest request, Observer<ListViewsResponse> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(17),
            request,
            ListViewsResponse.getDefaultInstance(),
            observer);
    }

    /**
     * <pre>
     *  Update a view
     * </pre>
     */
    @Override
    public final void updateView(Void ctx, UpdateViewRequest request, Observer<TimelineView> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(18),
            request,
            TimelineView.getDefaultInstance(),
            observer);
    }

    /**
     * <pre>
     *  Delete a view
     * </pre>
     */
    @Override
    public final void deleteView(Void ctx, DeleteViewRequest request, Observer<TimelineView> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(19),
            request,
            TimelineView.getDefaultInstance(),
            observer);
    }
}
