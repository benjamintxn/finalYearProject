package org.yamcs.protobuf;

import com.google.protobuf.Empty;
import org.yamcs.api.MethodHandler;
import org.yamcs.api.Observer;
import org.yamcs.protobuf.Pvalue.ParameterValue;

@javax.annotation.processing.Generated(value = "org.yamcs.protoc.ServiceGenerator", date = "2023-11-18T19:00:35.924051Z")
public class ProcessingApiClient extends AbstractProcessingApi<Void> {

    private final MethodHandler handler;

    public ProcessingApiClient(MethodHandler handler) {
        this.handler = handler;
    }

    /**
     * <pre>
     *  List processor types
     * </pre>
     */
    @Override
    public final void listProcessorTypes(Void ctx, Empty request, Observer<ListProcessorTypesResponse> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(0),
            request,
            ListProcessorTypesResponse.getDefaultInstance(),
            observer);
    }

    /**
     * <pre>
     *  List processors
     * </pre>
     */
    @Override
    public final void listProcessors(Void ctx, ListProcessorsRequest request, Observer<ListProcessorsResponse> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(1),
            request,
            ListProcessorsResponse.getDefaultInstance(),
            observer);
    }

    /**
     * <pre>
     *  Get a processor
     * </pre>
     */
    @Override
    public final void getProcessor(Void ctx, GetProcessorRequest request, Observer<ProcessorInfo> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(2),
            request,
            ProcessorInfo.getDefaultInstance(),
            observer);
    }

    /**
     * <pre>
     *  Delete a processor
     * 
     *  Only replay processors can be removed.
     * </pre>
     */
    @Override
    public final void deleteProcessor(Void ctx, DeleteProcessorRequest request, Observer<Empty> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(3),
            request,
            Empty.getDefaultInstance(),
            observer);
    }

    /**
     * <pre>
     *  Update a processor
     * </pre>
     */
    @Override
    public final void editProcessor(Void ctx, EditProcessorRequest request, Observer<Empty> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(4),
            request,
            Empty.getDefaultInstance(),
            observer);
    }

    /**
     * <pre>
     *  Create a processor
     * </pre>
     */
    @Override
    public final void createProcessor(Void ctx, CreateProcessorRequest request, Observer<Empty> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(5),
            request,
            Empty.getDefaultInstance(),
            observer);
    }

    /**
     * <pre>
     *  Get a parameter's value
     * </pre>
     */
    @Override
    public final void getParameterValue(Void ctx, GetParameterValueRequest request, Observer<ParameterValue> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(6),
            request,
            ParameterValue.getDefaultInstance(),
            observer);
    }

    /**
     * <pre>
     *  Set a parameter's value
     * 
     *  Only some type of parameters can be updated.
     * </pre>
     */
    @Override
    public final void setParameterValue(Void ctx, SetParameterValueRequest request, Observer<Empty> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(7),
            request,
            Empty.getDefaultInstance(),
            observer);
    }

    /**
     * <pre>
     *  Batch get the value of multiple parameters
     * </pre>
     */
    @Override
    public final void batchGetParameterValues(Void ctx, BatchGetParameterValuesRequest request, Observer<BatchGetParameterValuesResponse> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(8),
            request,
            BatchGetParameterValuesResponse.getDefaultInstance(),
            observer);
    }

    /**
     * <pre>
     *  Batch set the value of multiple parameters
     * </pre>
     */
    @Override
    public final void batchSetParameterValues(Void ctx, BatchSetParameterValuesRequest request, Observer<Empty> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(9),
            request,
            Empty.getDefaultInstance(),
            observer);
    }

    /**
     * <pre>
     *  Receive TM statistics updates
     * </pre>
     */
    @Override
    public final void subscribeTMStatistics(Void ctx, SubscribeTMStatisticsRequest request, Observer<Statistics> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(10),
            request,
            Statistics.getDefaultInstance(),
            observer);
    }

    /**
     * <pre>
     *  Receive parameter updates
     * 
     *  The input message can be sent multiple types, allowing to alter a
     *  subscription with the ``action`` field.
     * </pre>
     */
    @Override
    @SuppressWarnings("unchecked")
    public final Observer<SubscribeParametersRequest> subscribeParameters(Void ctx, Observer<SubscribeParametersData> observer) {
        return (Observer<SubscribeParametersRequest>)(Object) handler.streamingCall(
            getDescriptorForType().getMethods().get(11),
            SubscribeParametersRequest.getDefaultInstance(),
            SubscribeParametersData.getDefaultInstance(),
            observer);
    }

    /**
     * <pre>
     *  Receive processor updates
     * </pre>
     */
    @Override
    public final void subscribeProcessors(Void ctx, SubscribeProcessorsRequest request, Observer<ProcessorInfo> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(12),
            request,
            ProcessorInfo.getDefaultInstance(),
            observer);
    }

    /**
     * <pre>
     *  Get the algorithm status
     * </pre>
     */
    @Override
    public final void getAlgorithmStatus(Void ctx, GetAlgorithmStatusRequest request, Observer<AlgorithmStatus> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(13),
            request,
            AlgorithmStatus.getDefaultInstance(),
            observer);
    }

    /**
     * <pre>
     *  Receive algorithm status updates
     * </pre>
     */
    @Override
    public final void subscribeAlgorithmStatus(Void ctx, SubscribeAlgorithmStatusRequest request, Observer<AlgorithmStatus> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(14),
            request,
            AlgorithmStatus.getDefaultInstance(),
            observer);
    }

    /**
     * <pre>
     *  Get the algorithm trace
     * </pre>
     */
    @Override
    public final void getAlgorithmTrace(Void ctx, GetAlgorithmTraceRequest request, Observer<AlgorithmTrace> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(15),
            request,
            AlgorithmTrace.getDefaultInstance(),
            observer);
    }

    /**
     * <pre>
     *  Enable/disable algorithm tracing
     * </pre>
     */
    @Override
    public final void editAlgorithmTrace(Void ctx, EditAlgorithmTraceRequest request, Observer<Empty> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(16),
            request,
            Empty.getDefaultInstance(),
            observer);
    }
}
