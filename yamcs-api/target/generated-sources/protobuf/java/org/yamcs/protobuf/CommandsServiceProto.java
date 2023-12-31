// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: yamcs/protobuf/commanding/commands_service.proto

package org.yamcs.protobuf;

public final class CommandsServiceProto {
  private CommandsServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_yamcs_protobuf_commanding_ListCommandsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_yamcs_protobuf_commanding_ListCommandsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_yamcs_protobuf_commanding_IssueCommandRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_yamcs_protobuf_commanding_IssueCommandRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_yamcs_protobuf_commanding_IssueCommandRequest_Assignment_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_yamcs_protobuf_commanding_IssueCommandRequest_Assignment_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_yamcs_protobuf_commanding_IssueCommandRequest_VerifierConfigEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_yamcs_protobuf_commanding_IssueCommandRequest_VerifierConfigEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_yamcs_protobuf_commanding_IssueCommandRequest_ExtraEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_yamcs_protobuf_commanding_IssueCommandRequest_ExtraEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_yamcs_protobuf_commanding_IssueCommandResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_yamcs_protobuf_commanding_IssueCommandResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_yamcs_protobuf_commanding_IssueCommandResponse_AliasesEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_yamcs_protobuf_commanding_IssueCommandResponse_AliasesEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_yamcs_protobuf_commanding_UpdateCommandHistoryRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_yamcs_protobuf_commanding_UpdateCommandHistoryRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_yamcs_protobuf_commanding_ListCommandsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_yamcs_protobuf_commanding_ListCommandsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_yamcs_protobuf_commanding_GetCommandRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_yamcs_protobuf_commanding_GetCommandRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_yamcs_protobuf_commanding_ExportCommandRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_yamcs_protobuf_commanding_ExportCommandRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_yamcs_protobuf_commanding_StreamCommandsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_yamcs_protobuf_commanding_StreamCommandsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_yamcs_protobuf_commanding_SubscribeCommandsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_yamcs_protobuf_commanding_SubscribeCommandsRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n0yamcs/protobuf/commanding/commands_ser" +
      "vice.proto\022\031yamcs.protobuf.commanding\032\033g" +
      "oogle/protobuf/empty.proto\032\034google/proto" +
      "buf/struct.proto\032\037google/protobuf/timest" +
      "amp.proto\032\033yamcs/api/annotations.proto\032\030" +
      "yamcs/api/httpbody.proto\032*yamcs/protobuf" +
      "/commanding/commanding.proto\032\032yamcs/prot" +
      "obuf/yamcs.proto\"\323\001\n\023ListCommandsRequest" +
      "\022\020\n\010instance\030\001 \001(\t\022\017\n\003pos\030\002 \001(\003B\002\030\001\022\r\n\005l" +
      "imit\030\003 \001(\005\022\r\n\005order\030\004 \001(\t\022\t\n\001q\030\005 \001(\t\022\014\n\004" +
      "next\030\006 \001(\t\022)\n\005start\030\007 \001(\0132\032.google.proto" +
      "buf.Timestamp\022(\n\004stop\030\010 \001(\0132\032.google.pro" +
      "tobuf.Timestamp\022\r\n\005queue\030\t \001(\t\"\325\005\n\023Issue" +
      "CommandRequest\022\020\n\010instance\030\006 \001(\t\022\021\n\tproc" +
      "essor\030\007 \001(\t\022\014\n\004name\030\010 \001(\t\022%\n\004args\030\020 \001(\0132" +
      "\027.google.protobuf.Struct\022Q\n\nassignment\030\001" +
      " \003(\01329.yamcs.protobuf.commanding.IssueCo" +
      "mmandRequest.AssignmentB\002\030\001\022\016\n\006origin\030\002 " +
      "\001(\t\022\026\n\016sequenceNumber\030\003 \001(\005\022\016\n\006dryRun\030\004 " +
      "\001(\010\022\017\n\007comment\030\005 \001(\t\022\016\n\006stream\030\013 \001(\t\022&\n\036" +
      "disableTransmissionConstraints\030\014 \001(\010\022\030\n\020" +
      "disableVerifiers\030\r \001(\010\022Z\n\016verifierConfig" +
      "\030\016 \003(\0132B.yamcs.protobuf.commanding.Issue" +
      "CommandRequest.VerifierConfigEntry\022H\n\005ex" +
      "tra\030\017 \003(\01329.yamcs.protobuf.commanding.Is" +
      "sueCommandRequest.ExtraEntry\032)\n\nAssignme" +
      "nt\022\014\n\004name\030\001 \001(\t\022\r\n\005value\030\002 \001(\t\032`\n\023Verif" +
      "ierConfigEntry\022\013\n\003key\030\001 \001(\t\0228\n\005value\030\002 \001" +
      "(\0132).yamcs.protobuf.commanding.VerifierC" +
      "onfig:\0028\001\032C\n\nExtraEntry\022\013\n\003key\030\001 \001(\t\022$\n\005" +
      "value\030\002 \001(\0132\025.yamcs.protobuf.Value:\0028\001\"\241" +
      "\003\n\024IssueCommandResponse\022\n\n\002id\030\005 \001(\t\0222\n\016g" +
      "enerationTime\030\006 \001(\0132\032.google.protobuf.Ti" +
      "mestamp\022\016\n\006origin\030\007 \001(\t\022\026\n\016sequenceNumbe" +
      "r\030\010 \001(\005\022\023\n\013commandName\030\t \001(\t\022M\n\007aliases\030" +
      "\016 \003(\0132<.yamcs.protobuf.commanding.IssueC" +
      "ommandResponse.AliasesEntry\022A\n\013assignmen" +
      "ts\030\014 \003(\0132,.yamcs.protobuf.commanding.Com" +
      "mandAssignment\022\031\n\021unprocessedBinary\030\r \001(" +
      "\014\022\016\n\006binary\030\004 \001(\014\022\020\n\010username\030\013 \001(\t\022\r\n\005q" +
      "ueue\030\n \001(\t\032.\n\014AliasesEntry\022\013\n\003key\030\001 \001(\t\022" +
      "\r\n\005value\030\002 \001(\t:\0028\001\"\244\001\n\033UpdateCommandHist" +
      "oryRequest\022\020\n\010instance\030\001 \001(\t\022\021\n\tprocesso" +
      "r\030\002 \001(\t\022\014\n\004name\030\003 \001(\t\022\n\n\002id\030\004 \001(\t\022F\n\natt" +
      "ributes\030\005 \003(\01322.yamcs.protobuf.commandin" +
      "g.CommandHistoryAttribute\"p\n\024ListCommand" +
      "sResponse\022=\n\005entry\030\001 \003(\0132..yamcs.protobu" +
      "f.commanding.CommandHistoryEntry\022\031\n\021cont" +
      "inuationToken\030\002 \001(\t\"1\n\021GetCommandRequest" +
      "\022\020\n\010instance\030\001 \001(\t\022\n\n\002id\030\002 \001(\t\"4\n\024Export" +
      "CommandRequest\022\020\n\010instance\030\001 \001(\t\022\n\n\002id\030\002" +
      " \001(\t\"\214\001\n\025StreamCommandsRequest\022\020\n\010instan" +
      "ce\030\001 \001(\t\022)\n\005start\030\002 \001(\0132\032.google.protobu" +
      "f.Timestamp\022(\n\004stop\030\003 \001(\0132\032.google.proto" +
      "buf.Timestamp\022\014\n\004name\030\004 \003(\t\"[\n\030Subscribe" +
      "CommandsRequest\022\020\n\010instance\030\001 \001(\t\022\021\n\tpro" +
      "cessor\030\002 \001(\t\022\032\n\022ignorePastCommands\030\003 \001(\010" +
      "2\356\010\n\013CommandsApi\022\261\001\n\014IssueCommand\022..yamc" +
      "s.protobuf.commanding.IssueCommandReques" +
      "t\032/.yamcs.protobuf.commanding.IssueComma" +
      "ndResponse\"@\212\222\003<\0327/api/processors/{insta" +
      "nce}/{processor}/commands/{name*}:\001*\022\256\001\n" +
      "\024UpdateCommandHistory\0226.yamcs.protobuf.c" +
      "ommanding.UpdateCommandHistoryRequest\032\026." +
      "google.protobuf.Empty\"F\212\222\003B\032=/api/proces" +
      "sors/{instance}/{processor}/commandhisto" +
      "ry/{name*}:\001*\022\227\001\n\014ListCommands\022..yamcs.p" +
      "rotobuf.commanding.ListCommandsRequest\032/" +
      ".yamcs.protobuf.commanding.ListCommandsR" +
      "esponse\"&\212\222\003\"\n /api/archive/{instance}/c" +
      "ommands\022\227\001\n\nGetCommand\022,.yamcs.protobuf." +
      "commanding.GetCommandRequest\032..yamcs.pro" +
      "tobuf.commanding.CommandHistoryEntry\"+\212\222" +
      "\003\'\n%/api/archive/{instance}/commands/{id" +
      "}\022\254\001\n\016StreamCommands\0220.yamcs.protobuf.co" +
      "mmanding.StreamCommandsRequest\032..yamcs.p" +
      "rotobuf.commanding.CommandHistoryEntry\"6" +
      "\212\222\0032\032-/api/stream-archive/{instance}:str" +
      "eamCommands:\001*0\001\022\212\001\n\021SubscribeCommands\0223" +
      ".yamcs.protobuf.commanding.SubscribeComm" +
      "andsRequest\032..yamcs.protobuf.commanding." +
      "CommandHistoryEntry\"\016\332\222\003\n\n\010commands0\001\022\211\001" +
      "\n\rExportCommand\022/.yamcs.protobuf.command" +
      "ing.ExportCommandRequest\032\023.yamcs.api.Htt" +
      "pBody\"2\212\222\003.\n,/api/archive/{instance}/com" +
      "mands/{id}:exportB,\n\022org.yamcs.protobufB" +
      "\024CommandsServiceProtoP\001"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.EmptyProto.getDescriptor(),
          com.google.protobuf.StructProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
          org.yamcs.api.AnnotationsProto.getDescriptor(),
          org.yamcs.api.HttpBodyProto.getDescriptor(),
          org.yamcs.protobuf.Commanding.getDescriptor(),
          org.yamcs.protobuf.Yamcs.getDescriptor(),
        });
    internal_static_yamcs_protobuf_commanding_ListCommandsRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_yamcs_protobuf_commanding_ListCommandsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_yamcs_protobuf_commanding_ListCommandsRequest_descriptor,
        new java.lang.String[] { "Instance", "Pos", "Limit", "Order", "Q", "Next", "Start", "Stop", "Queue", });
    internal_static_yamcs_protobuf_commanding_IssueCommandRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_yamcs_protobuf_commanding_IssueCommandRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_yamcs_protobuf_commanding_IssueCommandRequest_descriptor,
        new java.lang.String[] { "Instance", "Processor", "Name", "Args", "Assignment", "Origin", "SequenceNumber", "DryRun", "Comment", "Stream", "DisableTransmissionConstraints", "DisableVerifiers", "VerifierConfig", "Extra", });
    internal_static_yamcs_protobuf_commanding_IssueCommandRequest_Assignment_descriptor =
      internal_static_yamcs_protobuf_commanding_IssueCommandRequest_descriptor.getNestedTypes().get(0);
    internal_static_yamcs_protobuf_commanding_IssueCommandRequest_Assignment_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_yamcs_protobuf_commanding_IssueCommandRequest_Assignment_descriptor,
        new java.lang.String[] { "Name", "Value", });
    internal_static_yamcs_protobuf_commanding_IssueCommandRequest_VerifierConfigEntry_descriptor =
      internal_static_yamcs_protobuf_commanding_IssueCommandRequest_descriptor.getNestedTypes().get(1);
    internal_static_yamcs_protobuf_commanding_IssueCommandRequest_VerifierConfigEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_yamcs_protobuf_commanding_IssueCommandRequest_VerifierConfigEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_yamcs_protobuf_commanding_IssueCommandRequest_ExtraEntry_descriptor =
      internal_static_yamcs_protobuf_commanding_IssueCommandRequest_descriptor.getNestedTypes().get(2);
    internal_static_yamcs_protobuf_commanding_IssueCommandRequest_ExtraEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_yamcs_protobuf_commanding_IssueCommandRequest_ExtraEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_yamcs_protobuf_commanding_IssueCommandResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_yamcs_protobuf_commanding_IssueCommandResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_yamcs_protobuf_commanding_IssueCommandResponse_descriptor,
        new java.lang.String[] { "Id", "GenerationTime", "Origin", "SequenceNumber", "CommandName", "Aliases", "Assignments", "UnprocessedBinary", "Binary", "Username", "Queue", });
    internal_static_yamcs_protobuf_commanding_IssueCommandResponse_AliasesEntry_descriptor =
      internal_static_yamcs_protobuf_commanding_IssueCommandResponse_descriptor.getNestedTypes().get(0);
    internal_static_yamcs_protobuf_commanding_IssueCommandResponse_AliasesEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_yamcs_protobuf_commanding_IssueCommandResponse_AliasesEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_yamcs_protobuf_commanding_UpdateCommandHistoryRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_yamcs_protobuf_commanding_UpdateCommandHistoryRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_yamcs_protobuf_commanding_UpdateCommandHistoryRequest_descriptor,
        new java.lang.String[] { "Instance", "Processor", "Name", "Id", "Attributes", });
    internal_static_yamcs_protobuf_commanding_ListCommandsResponse_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_yamcs_protobuf_commanding_ListCommandsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_yamcs_protobuf_commanding_ListCommandsResponse_descriptor,
        new java.lang.String[] { "Entry", "ContinuationToken", });
    internal_static_yamcs_protobuf_commanding_GetCommandRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_yamcs_protobuf_commanding_GetCommandRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_yamcs_protobuf_commanding_GetCommandRequest_descriptor,
        new java.lang.String[] { "Instance", "Id", });
    internal_static_yamcs_protobuf_commanding_ExportCommandRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_yamcs_protobuf_commanding_ExportCommandRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_yamcs_protobuf_commanding_ExportCommandRequest_descriptor,
        new java.lang.String[] { "Instance", "Id", });
    internal_static_yamcs_protobuf_commanding_StreamCommandsRequest_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_yamcs_protobuf_commanding_StreamCommandsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_yamcs_protobuf_commanding_StreamCommandsRequest_descriptor,
        new java.lang.String[] { "Instance", "Start", "Stop", "Name", });
    internal_static_yamcs_protobuf_commanding_SubscribeCommandsRequest_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_yamcs_protobuf_commanding_SubscribeCommandsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_yamcs_protobuf_commanding_SubscribeCommandsRequest_descriptor,
        new java.lang.String[] { "Instance", "Processor", "IgnorePastCommands", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(org.yamcs.api.AnnotationsProto.route);
    registry.add(org.yamcs.api.AnnotationsProto.websocket);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.StructProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    org.yamcs.api.AnnotationsProto.getDescriptor();
    org.yamcs.api.HttpBodyProto.getDescriptor();
    org.yamcs.protobuf.Commanding.getDescriptor();
    org.yamcs.protobuf.Yamcs.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
