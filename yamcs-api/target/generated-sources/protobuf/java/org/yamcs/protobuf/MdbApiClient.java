package org.yamcs.protobuf;

import org.yamcs.api.HttpBody;
import org.yamcs.api.MethodHandler;
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

@javax.annotation.processing.Generated(value = "org.yamcs.protoc.ServiceGenerator", date = "2023-11-18T19:00:35.918296Z")
public class MdbApiClient extends AbstractMdbApi<Void> {

    private final MethodHandler handler;

    public MdbApiClient(MethodHandler handler) {
        this.handler = handler;
    }

    /**
     * <pre>
     *  Get a mission database
     * </pre>
     */
    @Override
    public final void getMissionDatabase(Void ctx, GetMissionDatabaseRequest request, Observer<MissionDatabase> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(0),
            request,
            MissionDatabase.getDefaultInstance(),
            observer);
    }

    /**
     * <pre>
     *  Export a java serialized dump of the mission database
     * </pre>
     */
    @Override
    public final void exportJavaMissionDatabase(Void ctx, ExportJavaMissionDatabaseRequest request, Observer<HttpBody> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(1),
            request,
            HttpBody.getDefaultInstance(),
            observer);
    }

    /**
     * <pre>
     *  List space systems
     * </pre>
     */
    @Override
    public final void listSpaceSystems(Void ctx, ListSpaceSystemsRequest request, Observer<ListSpaceSystemsResponse> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(2),
            request,
            ListSpaceSystemsResponse.getDefaultInstance(),
            observer);
    }

    /**
     * <pre>
     *  Get a space system
     * </pre>
     */
    @Override
    public final void getSpaceSystem(Void ctx, GetSpaceSystemRequest request, Observer<SpaceSystemInfo> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(3),
            request,
            SpaceSystemInfo.getDefaultInstance(),
            observer);
    }

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
    @Override
    public final void exportXtce(Void ctx, ExportXtceRequest request, Observer<HttpBody> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(4),
            request,
            HttpBody.getDefaultInstance(),
            observer);
    }

    /**
     * <pre>
     *  Stream Mission Database items.
     * 
     *  This operation is intended for tools that need to efficiently fetch
     *  the full list of parameters or commands, without using repeated
     *  pagination-based requests.
     * </pre>
     */
    @Override
    public final void streamMissionDatabase(Void ctx, StreamMissionDatabaseRequest request, Observer<MissionDatabaseItem> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(5),
            request,
            MissionDatabaseItem.getDefaultInstance(),
            observer);
    }

    /**
     * <pre>
     *  List parameters
     * </pre>
     */
    @Override
    public final void listParameters(Void ctx, ListParametersRequest request, Observer<ListParametersResponse> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(6),
            request,
            ListParametersResponse.getDefaultInstance(),
            observer);
    }

    /**
     * <pre>
     *  Get a parameter
     * </pre>
     */
    @Override
    public final void getParameter(Void ctx, GetParameterRequest request, Observer<ParameterInfo> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(7),
            request,
            ParameterInfo.getDefaultInstance(),
            observer);
    }

    /**
     * <pre>
     *  Create a parameter
     * </pre>
     */
    @Override
    public final void createParameter(Void ctx, CreateParameterRequest request, Observer<ParameterInfo> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(8),
            request,
            ParameterInfo.getDefaultInstance(),
            observer);
    }

    /**
     * <pre>
     *  Batch get of multiple parameters
     * </pre>
     */
    @Override
    public final void batchGetParameters(Void ctx, BatchGetParametersRequest request, Observer<BatchGetParametersResponse> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(9),
            request,
            BatchGetParametersResponse.getDefaultInstance(),
            observer);
    }

    /**
     * <pre>
     *  List parameter types
     * </pre>
     */
    @Override
    public final void listParameterTypes(Void ctx, ListParameterTypesRequest request, Observer<ListParameterTypesResponse> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(10),
            request,
            ListParameterTypesResponse.getDefaultInstance(),
            observer);
    }

    /**
     * <pre>
     *  Get a parameter type
     * </pre>
     */
    @Override
    public final void getParameterType(Void ctx, GetParameterTypeRequest request, Observer<ParameterTypeInfo> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(11),
            request,
            ParameterTypeInfo.getDefaultInstance(),
            observer);
    }

    /**
     * <pre>
     *  Create a parameter type
     * </pre>
     */
    @Override
    public final void createParameterType(Void ctx, CreateParameterTypeRequest request, Observer<ParameterTypeInfo> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(12),
            request,
            ParameterTypeInfo.getDefaultInstance(),
            observer);
    }

    /**
     * <pre>
     *  List containers
     * </pre>
     */
    @Override
    public final void listContainers(Void ctx, ListContainersRequest request, Observer<ListContainersResponse> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(13),
            request,
            ListContainersResponse.getDefaultInstance(),
            observer);
    }

    /**
     * <pre>
     *  Get a container
     * </pre>
     */
    @Override
    public final void getContainer(Void ctx, GetContainerRequest request, Observer<ContainerInfo> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(14),
            request,
            ContainerInfo.getDefaultInstance(),
            observer);
    }

    /**
     * <pre>
     *  List commands
     * </pre>
     */
    @Override
    public final void listCommands(Void ctx, ListCommandsRequest request, Observer<ListCommandsResponse> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(15),
            request,
            ListCommandsResponse.getDefaultInstance(),
            observer);
    }

    /**
     * <pre>
     *  Get a command
     * </pre>
     */
    @Override
    public final void getCommand(Void ctx, GetCommandRequest request, Observer<CommandInfo> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(16),
            request,
            CommandInfo.getDefaultInstance(),
            observer);
    }

    /**
     * <pre>
     *  List algorithms
     * </pre>
     */
    @Override
    public final void listAlgorithms(Void ctx, ListAlgorithmsRequest request, Observer<ListAlgorithmsResponse> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(17),
            request,
            ListAlgorithmsResponse.getDefaultInstance(),
            observer);
    }

    /**
     * <pre>
     *  Get an algorithm
     * </pre>
     */
    @Override
    public final void getAlgorithm(Void ctx, GetAlgorithmRequest request, Observer<AlgorithmInfo> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(18),
            request,
            AlgorithmInfo.getDefaultInstance(),
            observer);
    }
}
