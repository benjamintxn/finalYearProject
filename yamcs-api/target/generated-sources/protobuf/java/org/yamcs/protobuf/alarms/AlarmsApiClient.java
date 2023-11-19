package org.yamcs.protobuf.alarms;

import com.google.protobuf.Empty;
import org.yamcs.api.MethodHandler;
import org.yamcs.api.Observer;
import org.yamcs.protobuf.AlarmData;

@javax.annotation.processing.Generated(value = "org.yamcs.protoc.ServiceGenerator", date = "2023-11-18T19:00:35.924877Z")
public class AlarmsApiClient extends AbstractAlarmsApi<Void> {

    private final MethodHandler handler;

    public AlarmsApiClient(MethodHandler handler) {
        this.handler = handler;
    }

    /**
     * <pre>
     *  List alarms
     * </pre>
     */
    @Override
    public final void listAlarms(Void ctx, ListAlarmsRequest request, Observer<ListAlarmsResponse> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(0),
            request,
            ListAlarmsResponse.getDefaultInstance(),
            observer);
    }

    /**
     * <pre>
     *  List alarms
     * </pre>
     */
    @Override
    public final void listProcessorAlarms(Void ctx, ListProcessorAlarmsRequest request, Observer<ListProcessorAlarmsResponse> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(1),
            request,
            ListProcessorAlarmsResponse.getDefaultInstance(),
            observer);
    }

    /**
     * <pre>
     *  Update an alarm
     * </pre>
     */
    @Override
    public final void editAlarm(Void ctx, EditAlarmRequest request, Observer<Empty> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(2),
            request,
            Empty.getDefaultInstance(),
            observer);
    }

    /**
     * <pre>
     *  Acknowledge an alarm
     * </pre>
     */
    @Override
    public final void acknowledgeAlarm(Void ctx, AcknowledgeAlarmRequest request, Observer<Empty> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(3),
            request,
            Empty.getDefaultInstance(),
            observer);
    }

    /**
     * <pre>
     *  Shelve an alarm
     * </pre>
     */
    @Override
    public final void shelveAlarm(Void ctx, ShelveAlarmRequest request, Observer<Empty> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(4),
            request,
            Empty.getDefaultInstance(),
            observer);
    }

    /**
     * <pre>
     *  Unshelve an alarm
     * </pre>
     */
    @Override
    public final void unshelveAlarm(Void ctx, UnshelveAlarmRequest request, Observer<Empty> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(5),
            request,
            Empty.getDefaultInstance(),
            observer);
    }

    /**
     * <pre>
     *  Clear an alarm
     * </pre>
     */
    @Override
    public final void clearAlarm(Void ctx, ClearAlarmRequest request, Observer<Empty> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(6),
            request,
            Empty.getDefaultInstance(),
            observer);
    }

    /**
     * <pre>
     *  Receive alarm status updates
     * </pre>
     */
    @Override
    public final void subscribeGlobalStatus(Void ctx, SubscribeGlobalStatusRequest request, Observer<GlobalAlarmStatus> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(7),
            request,
            GlobalAlarmStatus.getDefaultInstance(),
            observer);
    }

    /**
     * <pre>
     *  Receive alarm updates
     * </pre>
     */
    @Override
    public final void subscribeAlarms(Void ctx, SubscribeAlarmsRequest request, Observer<AlarmData> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(8),
            request,
            AlarmData.getDefaultInstance(),
            observer);
    }
}
