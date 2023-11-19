package org.yamcs.protobuf.alarms;

import com.google.protobuf.Descriptors.MethodDescriptor;
import com.google.protobuf.Descriptors.ServiceDescriptor;
import com.google.protobuf.Empty;
import com.google.protobuf.Message;
import org.yamcs.api.Api;
import org.yamcs.api.Observer;
import org.yamcs.protobuf.AlarmData;

@javax.annotation.processing.Generated(value = "org.yamcs.protoc.ServiceGenerator", date = "2023-11-18T19:00:35.924672Z")
@SuppressWarnings("unchecked")
public abstract class AbstractAlarmsApi<T> implements Api<T> {

    /**
     * <pre>
     *  List alarms
     * </pre>
     */
    public abstract void listAlarms(T ctx, ListAlarmsRequest request, Observer<ListAlarmsResponse> observer);

    /**
     * <pre>
     *  List alarms
     * </pre>
     */
    public abstract void listProcessorAlarms(T ctx, ListProcessorAlarmsRequest request, Observer<ListProcessorAlarmsResponse> observer);

    /**
     * <pre>
     *  Update an alarm
     * </pre>
     */
    public abstract void editAlarm(T ctx, EditAlarmRequest request, Observer<Empty> observer);

    /**
     * <pre>
     *  Acknowledge an alarm
     * </pre>
     */
    public abstract void acknowledgeAlarm(T ctx, AcknowledgeAlarmRequest request, Observer<Empty> observer);

    /**
     * <pre>
     *  Shelve an alarm
     * </pre>
     */
    public abstract void shelveAlarm(T ctx, ShelveAlarmRequest request, Observer<Empty> observer);

    /**
     * <pre>
     *  Unshelve an alarm
     * </pre>
     */
    public abstract void unshelveAlarm(T ctx, UnshelveAlarmRequest request, Observer<Empty> observer);

    /**
     * <pre>
     *  Clear an alarm
     * </pre>
     */
    public abstract void clearAlarm(T ctx, ClearAlarmRequest request, Observer<Empty> observer);

    /**
     * <pre>
     *  Receive alarm status updates
     * </pre>
     */
    public abstract void subscribeGlobalStatus(T ctx, SubscribeGlobalStatusRequest request, Observer<GlobalAlarmStatus> observer);

    /**
     * <pre>
     *  Receive alarm updates
     * </pre>
     */
    public abstract void subscribeAlarms(T ctx, SubscribeAlarmsRequest request, Observer<AlarmData> observer);

    @Override
    public final ServiceDescriptor getDescriptorForType() {
        return AlarmsServiceProto.getDescriptor().getServices().get(0);
    }

    @Override
    public final Message getRequestPrototype(MethodDescriptor method) {
        if (method.getService() != getDescriptorForType()) {
            throw new IllegalArgumentException("Method not contained by this service.");
        }
        switch (method.getIndex()) {
        case 0:
            return ListAlarmsRequest.getDefaultInstance();
        case 1:
            return ListProcessorAlarmsRequest.getDefaultInstance();
        case 2:
            return EditAlarmRequest.getDefaultInstance();
        case 3:
            return AcknowledgeAlarmRequest.getDefaultInstance();
        case 4:
            return ShelveAlarmRequest.getDefaultInstance();
        case 5:
            return UnshelveAlarmRequest.getDefaultInstance();
        case 6:
            return ClearAlarmRequest.getDefaultInstance();
        case 7:
            return SubscribeGlobalStatusRequest.getDefaultInstance();
        case 8:
            return SubscribeAlarmsRequest.getDefaultInstance();
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
            return ListAlarmsResponse.getDefaultInstance();
        case 1:
            return ListProcessorAlarmsResponse.getDefaultInstance();
        case 2:
            return Empty.getDefaultInstance();
        case 3:
            return Empty.getDefaultInstance();
        case 4:
            return Empty.getDefaultInstance();
        case 5:
            return Empty.getDefaultInstance();
        case 6:
            return Empty.getDefaultInstance();
        case 7:
            return GlobalAlarmStatus.getDefaultInstance();
        case 8:
            return AlarmData.getDefaultInstance();
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
            listAlarms(ctx, (ListAlarmsRequest) request, (Observer<ListAlarmsResponse>)(Object) future);
            return;
        case 1:
            listProcessorAlarms(ctx, (ListProcessorAlarmsRequest) request, (Observer<ListProcessorAlarmsResponse>)(Object) future);
            return;
        case 2:
            editAlarm(ctx, (EditAlarmRequest) request, (Observer<Empty>)(Object) future);
            return;
        case 3:
            acknowledgeAlarm(ctx, (AcknowledgeAlarmRequest) request, (Observer<Empty>)(Object) future);
            return;
        case 4:
            shelveAlarm(ctx, (ShelveAlarmRequest) request, (Observer<Empty>)(Object) future);
            return;
        case 5:
            unshelveAlarm(ctx, (UnshelveAlarmRequest) request, (Observer<Empty>)(Object) future);
            return;
        case 6:
            clearAlarm(ctx, (ClearAlarmRequest) request, (Observer<Empty>)(Object) future);
            return;
        case 7:
            subscribeGlobalStatus(ctx, (SubscribeGlobalStatusRequest) request, (Observer<GlobalAlarmStatus>)(Object) future);
            return;
        case 8:
            subscribeAlarms(ctx, (SubscribeAlarmsRequest) request, (Observer<AlarmData>)(Object) future);
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
