package org.yamcs.protobuf;

import com.google.protobuf.Descriptors.MethodDescriptor;
import com.google.protobuf.Descriptors.ServiceDescriptor;
import com.google.protobuf.Message;
import org.yamcs.api.Api;
import org.yamcs.api.HttpBody;
import org.yamcs.api.Observer;
import org.yamcs.protobuf.Mdb.AlgorithmInfo;
import org.yamcs.protobuf.Mdb.BatchGetParametersRequest;
import org.yamcs.protobuf.Mdb.BatchGetParametersResponse;
import org.yamcs.protobuf.Mdb.CommandInfo;
import org.yamcs.protobuf.Mdb.ContainerInfo;
import org.yamcs.protobuf.Mdb.CreateParameterRequest;
import org.yamcs.protobuf.Mdb.CreateParameterTypeRequest;
import org.yamcs.protobuf.Mdb.ExportJavaMissionDatabaseRequest;
import org.yamcs.protobuf.Mdb.ExportXtceRequest;
import org.yamcs.protobuf.Mdb.GetAlgorithmRequest;
import org.yamcs.protobuf.Mdb.GetCommandRequest;
import org.yamcs.protobuf.Mdb.GetContainerRequest;
import org.yamcs.protobuf.Mdb.GetMissionDatabaseRequest;
import org.yamcs.protobuf.Mdb.GetParameterRequest;
import org.yamcs.protobuf.Mdb.GetParameterTypeRequest;
import org.yamcs.protobuf.Mdb.GetSpaceSystemRequest;
import org.yamcs.protobuf.Mdb.ListAlgorithmsRequest;
import org.yamcs.protobuf.Mdb.ListAlgorithmsResponse;
import org.yamcs.protobuf.Mdb.ListCommandsRequest;
import org.yamcs.protobuf.Mdb.ListCommandsResponse;
import org.yamcs.protobuf.Mdb.ListContainersRequest;
import org.yamcs.protobuf.Mdb.ListContainersResponse;
import org.yamcs.protobuf.Mdb.ListParameterTypesRequest;
import org.yamcs.protobuf.Mdb.ListParameterTypesResponse;
import org.yamcs.protobuf.Mdb.ListParametersRequest;
import org.yamcs.protobuf.Mdb.ListParametersResponse;
import org.yamcs.protobuf.Mdb.ListSpaceSystemsRequest;
import org.yamcs.protobuf.Mdb.ListSpaceSystemsResponse;
import org.yamcs.protobuf.Mdb.MissionDatabase;
import org.yamcs.protobuf.Mdb.MissionDatabaseItem;
import org.yamcs.protobuf.Mdb.ParameterInfo;
import org.yamcs.protobuf.Mdb.ParameterTypeInfo;
import org.yamcs.protobuf.Mdb.SpaceSystemInfo;
import org.yamcs.protobuf.Mdb.StreamMissionDatabaseRequest;

@javax.annotation.processing.Generated(value = "org.yamcs.protoc.ServiceGenerator", date = "2023-11-18T19:00:35.916631Z")
@SuppressWarnings("unchecked")
public abstract class AbstractMdbApi<T> implements Api<T> {

    /**
     * <pre>
     *  Get a mission database
     * </pre>
     */
    public abstract void getMissionDatabase(T ctx, GetMissionDatabaseRequest request, Observer<MissionDatabase> observer);

    /**
     * <pre>
     *  Export a java serialized dump of the mission database
     * </pre>
     */
    public abstract void exportJavaMissionDatabase(T ctx, ExportJavaMissionDatabaseRequest request, Observer<HttpBody> observer);

    /**
     * <pre>
     *  List space systems
     * </pre>
     */
    public abstract void listSpaceSystems(T ctx, ListSpaceSystemsRequest request, Observer<ListSpaceSystemsResponse> observer);

    /**
     * <pre>
     *  Get a space system
     * </pre>
     */
    public abstract void getSpaceSystem(T ctx, GetSpaceSystemRequest request, Observer<SpaceSystemInfo> observer);

    /**
     * <pre>
     *  Export an XTCE representation of a space system.
     * 
     *  If the requested space system is not the root, containers will have
     *  their qualified name stripped by the top name. In addition there may
     *  also be references to objects from space systems that are not part of
     *  the export.
     * </pre>
     */
    public abstract void exportXtce(T ctx, ExportXtceRequest request, Observer<HttpBody> observer);

    /**
     * <pre>
     *  Stream Mission Database items.
     * 
     *  This operation is intended for tools that need to efficiently fetch
     *  the full list of parameters or commands, without using repeated
     *  pagination-based requests.
     * </pre>
     */
    public abstract void streamMissionDatabase(T ctx, StreamMissionDatabaseRequest request, Observer<MissionDatabaseItem> observer);

    /**
     * <pre>
     *  List parameters
     * </pre>
     */
    public abstract void listParameters(T ctx, ListParametersRequest request, Observer<ListParametersResponse> observer);

    /**
     * <pre>
     *  Get a parameter
     * </pre>
     */
    public abstract void getParameter(T ctx, GetParameterRequest request, Observer<ParameterInfo> observer);

    /**
     * <pre>
     *  Create a parameter
     * </pre>
     */
    public abstract void createParameter(T ctx, CreateParameterRequest request, Observer<ParameterInfo> observer);

    /**
     * <pre>
     *  Batch get of multiple parameters
     * </pre>
     */
    public abstract void batchGetParameters(T ctx, BatchGetParametersRequest request, Observer<BatchGetParametersResponse> observer);

    /**
     * <pre>
     *  List parameter types
     * </pre>
     */
    public abstract void listParameterTypes(T ctx, ListParameterTypesRequest request, Observer<ListParameterTypesResponse> observer);

    /**
     * <pre>
     *  Get a parameter type
     * </pre>
     */
    public abstract void getParameterType(T ctx, GetParameterTypeRequest request, Observer<ParameterTypeInfo> observer);

    /**
     * <pre>
     *  Create a parameter type
     * </pre>
     */
    public abstract void createParameterType(T ctx, CreateParameterTypeRequest request, Observer<ParameterTypeInfo> observer);

    /**
     * <pre>
     *  List containers
     * </pre>
     */
    public abstract void listContainers(T ctx, ListContainersRequest request, Observer<ListContainersResponse> observer);

    /**
     * <pre>
     *  Get a container
     * </pre>
     */
    public abstract void getContainer(T ctx, GetContainerRequest request, Observer<ContainerInfo> observer);

    /**
     * <pre>
     *  List commands
     * </pre>
     */
    public abstract void listCommands(T ctx, ListCommandsRequest request, Observer<ListCommandsResponse> observer);

    /**
     * <pre>
     *  Get a command
     * </pre>
     */
    public abstract void getCommand(T ctx, GetCommandRequest request, Observer<CommandInfo> observer);

    /**
     * <pre>
     *  List algorithms
     * </pre>
     */
    public abstract void listAlgorithms(T ctx, ListAlgorithmsRequest request, Observer<ListAlgorithmsResponse> observer);

    /**
     * <pre>
     *  Get an algorithm
     * </pre>
     */
    public abstract void getAlgorithm(T ctx, GetAlgorithmRequest request, Observer<AlgorithmInfo> observer);

    @Override
    public final ServiceDescriptor getDescriptorForType() {
        return Mdb.getDescriptor().getServices().get(0);
    }

    @Override
    public final Message getRequestPrototype(MethodDescriptor method) {
        if (method.getService() != getDescriptorForType()) {
            throw new IllegalArgumentException("Method not contained by this service.");
        }
        switch (method.getIndex()) {
        case 0:
            return GetMissionDatabaseRequest.getDefaultInstance();
        case 1:
            return ExportJavaMissionDatabaseRequest.getDefaultInstance();
        case 2:
            return ListSpaceSystemsRequest.getDefaultInstance();
        case 3:
            return GetSpaceSystemRequest.getDefaultInstance();
        case 4:
            return ExportXtceRequest.getDefaultInstance();
        case 5:
            return StreamMissionDatabaseRequest.getDefaultInstance();
        case 6:
            return ListParametersRequest.getDefaultInstance();
        case 7:
            return GetParameterRequest.getDefaultInstance();
        case 8:
            return CreateParameterRequest.getDefaultInstance();
        case 9:
            return BatchGetParametersRequest.getDefaultInstance();
        case 10:
            return ListParameterTypesRequest.getDefaultInstance();
        case 11:
            return GetParameterTypeRequest.getDefaultInstance();
        case 12:
            return CreateParameterTypeRequest.getDefaultInstance();
        case 13:
            return ListContainersRequest.getDefaultInstance();
        case 14:
            return GetContainerRequest.getDefaultInstance();
        case 15:
            return ListCommandsRequest.getDefaultInstance();
        case 16:
            return GetCommandRequest.getDefaultInstance();
        case 17:
            return ListAlgorithmsRequest.getDefaultInstance();
        case 18:
            return GetAlgorithmRequest.getDefaultInstance();
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
            return MissionDatabase.getDefaultInstance();
        case 1:
            return HttpBody.getDefaultInstance();
        case 2:
            return ListSpaceSystemsResponse.getDefaultInstance();
        case 3:
            return SpaceSystemInfo.getDefaultInstance();
        case 4:
            return HttpBody.getDefaultInstance();
        case 5:
            return MissionDatabaseItem.getDefaultInstance();
        case 6:
            return ListParametersResponse.getDefaultInstance();
        case 7:
            return ParameterInfo.getDefaultInstance();
        case 8:
            return ParameterInfo.getDefaultInstance();
        case 9:
            return BatchGetParametersResponse.getDefaultInstance();
        case 10:
            return ListParameterTypesResponse.getDefaultInstance();
        case 11:
            return ParameterTypeInfo.getDefaultInstance();
        case 12:
            return ParameterTypeInfo.getDefaultInstance();
        case 13:
            return ListContainersResponse.getDefaultInstance();
        case 14:
            return ContainerInfo.getDefaultInstance();
        case 15:
            return ListCommandsResponse.getDefaultInstance();
        case 16:
            return CommandInfo.getDefaultInstance();
        case 17:
            return ListAlgorithmsResponse.getDefaultInstance();
        case 18:
            return AlgorithmInfo.getDefaultInstance();
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
            getMissionDatabase(ctx, (GetMissionDatabaseRequest) request, (Observer<MissionDatabase>)(Object) future);
            return;
        case 1:
            exportJavaMissionDatabase(ctx, (ExportJavaMissionDatabaseRequest) request, (Observer<HttpBody>)(Object) future);
            return;
        case 2:
            listSpaceSystems(ctx, (ListSpaceSystemsRequest) request, (Observer<ListSpaceSystemsResponse>)(Object) future);
            return;
        case 3:
            getSpaceSystem(ctx, (GetSpaceSystemRequest) request, (Observer<SpaceSystemInfo>)(Object) future);
            return;
        case 4:
            exportXtce(ctx, (ExportXtceRequest) request, (Observer<HttpBody>)(Object) future);
            return;
        case 5:
            streamMissionDatabase(ctx, (StreamMissionDatabaseRequest) request, (Observer<MissionDatabaseItem>)(Object) future);
            return;
        case 6:
            listParameters(ctx, (ListParametersRequest) request, (Observer<ListParametersResponse>)(Object) future);
            return;
        case 7:
            getParameter(ctx, (GetParameterRequest) request, (Observer<ParameterInfo>)(Object) future);
            return;
        case 8:
            createParameter(ctx, (CreateParameterRequest) request, (Observer<ParameterInfo>)(Object) future);
            return;
        case 9:
            batchGetParameters(ctx, (BatchGetParametersRequest) request, (Observer<BatchGetParametersResponse>)(Object) future);
            return;
        case 10:
            listParameterTypes(ctx, (ListParameterTypesRequest) request, (Observer<ListParameterTypesResponse>)(Object) future);
            return;
        case 11:
            getParameterType(ctx, (GetParameterTypeRequest) request, (Observer<ParameterTypeInfo>)(Object) future);
            return;
        case 12:
            createParameterType(ctx, (CreateParameterTypeRequest) request, (Observer<ParameterTypeInfo>)(Object) future);
            return;
        case 13:
            listContainers(ctx, (ListContainersRequest) request, (Observer<ListContainersResponse>)(Object) future);
            return;
        case 14:
            getContainer(ctx, (GetContainerRequest) request, (Observer<ContainerInfo>)(Object) future);
            return;
        case 15:
            listCommands(ctx, (ListCommandsRequest) request, (Observer<ListCommandsResponse>)(Object) future);
            return;
        case 16:
            getCommand(ctx, (GetCommandRequest) request, (Observer<CommandInfo>)(Object) future);
            return;
        case 17:
            listAlgorithms(ctx, (ListAlgorithmsRequest) request, (Observer<ListAlgorithmsResponse>)(Object) future);
            return;
        case 18:
            getAlgorithm(ctx, (GetAlgorithmRequest) request, (Observer<AlgorithmInfo>)(Object) future);
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
