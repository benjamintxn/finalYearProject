// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: yamcs/protobuf/tse/tse.proto

package org.yamcs.tse.api;

public final class TseProto {
  private TseProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_yamcs_protobuf_tse_TseCommand_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_yamcs_protobuf_tse_TseCommand_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_yamcs_protobuf_tse_TseCommand_ArgumentMappingEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_yamcs_protobuf_tse_TseCommand_ArgumentMappingEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_yamcs_protobuf_tse_TseCommand_ParameterMappingEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_yamcs_protobuf_tse_TseCommand_ParameterMappingEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_yamcs_protobuf_tse_TseCommandResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_yamcs_protobuf_tse_TseCommandResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_yamcs_protobuf_tse_TseCommanderMessage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_yamcs_protobuf_tse_TseCommanderMessage_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034yamcs/protobuf/tse/tse.proto\022\022yamcs.pr" +
      "otobuf.tse\032\032yamcs/protobuf/yamcs.proto\032*" +
      "yamcs/protobuf/commanding/commanding.pro" +
      "to\032\"yamcs/protobuf/pvalue/pvalue.proto\"\233" +
      "\003\n\nTseCommand\0220\n\002id\030\006 \001(\0132$.yamcs.protob" +
      "uf.commanding.CommandId\022\022\n\ninstrument\030\001 " +
      "\001(\t\022\017\n\007command\030\002 \001(\t\022\020\n\010response\030\003 \001(\t\022L" +
      "\n\017argumentMapping\030\004 \003(\01323.yamcs.protobuf" +
      ".tse.TseCommand.ArgumentMappingEntry\022N\n\020" +
      "parameterMapping\030\005 \003(\01324.yamcs.protobuf." +
      "tse.TseCommand.ParameterMappingEntry\032M\n\024" +
      "ArgumentMappingEntry\022\013\n\003key\030\001 \001(\t\022$\n\005val" +
      "ue\030\002 \001(\0132\025.yamcs.protobuf.Value:\0028\001\0327\n\025P" +
      "arameterMappingEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005val" +
      "ue\030\002 \001(\t:\0028\001\"m\n\022TseCommandResponse\0220\n\002id" +
      "\030\001 \001(\0132$.yamcs.protobuf.commanding.Comma" +
      "ndId\022\017\n\007success\030\002 \001(\010\022\024\n\014errorMessage\030\003 " +
      "\001(\t\"\223\001\n\023TseCommanderMessage\022?\n\017commandRe" +
      "sponse\030\001 \001(\0132&.yamcs.protobuf.tse.TseCom" +
      "mandResponse\022;\n\rparameterData\030\002 \001(\0132$.ya" +
      "mcs.protobuf.pvalue.ParameterDataB\037\n\021org" +
      ".yamcs.tse.apiB\010TseProtoP\001"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          org.yamcs.protobuf.Yamcs.getDescriptor(),
          org.yamcs.protobuf.Commanding.getDescriptor(),
          org.yamcs.protobuf.Pvalue.getDescriptor(),
        });
    internal_static_yamcs_protobuf_tse_TseCommand_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_yamcs_protobuf_tse_TseCommand_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_yamcs_protobuf_tse_TseCommand_descriptor,
        new java.lang.String[] { "Id", "Instrument", "Command", "Response", "ArgumentMapping", "ParameterMapping", });
    internal_static_yamcs_protobuf_tse_TseCommand_ArgumentMappingEntry_descriptor =
      internal_static_yamcs_protobuf_tse_TseCommand_descriptor.getNestedTypes().get(0);
    internal_static_yamcs_protobuf_tse_TseCommand_ArgumentMappingEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_yamcs_protobuf_tse_TseCommand_ArgumentMappingEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_yamcs_protobuf_tse_TseCommand_ParameterMappingEntry_descriptor =
      internal_static_yamcs_protobuf_tse_TseCommand_descriptor.getNestedTypes().get(1);
    internal_static_yamcs_protobuf_tse_TseCommand_ParameterMappingEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_yamcs_protobuf_tse_TseCommand_ParameterMappingEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_yamcs_protobuf_tse_TseCommandResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_yamcs_protobuf_tse_TseCommandResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_yamcs_protobuf_tse_TseCommandResponse_descriptor,
        new java.lang.String[] { "Id", "Success", "ErrorMessage", });
    internal_static_yamcs_protobuf_tse_TseCommanderMessage_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_yamcs_protobuf_tse_TseCommanderMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_yamcs_protobuf_tse_TseCommanderMessage_descriptor,
        new java.lang.String[] { "CommandResponse", "ParameterData", });
    org.yamcs.protobuf.Yamcs.getDescriptor();
    org.yamcs.protobuf.Commanding.getDescriptor();
    org.yamcs.protobuf.Pvalue.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
