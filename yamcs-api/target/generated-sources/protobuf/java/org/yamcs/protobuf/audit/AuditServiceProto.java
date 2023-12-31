// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: yamcs/protobuf/audit/audit.proto

package org.yamcs.protobuf.audit;

public final class AuditServiceProto {
  private AuditServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_yamcs_protobuf_audit_ListAuditRecordsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_yamcs_protobuf_audit_ListAuditRecordsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_yamcs_protobuf_audit_ListAuditRecordsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_yamcs_protobuf_audit_ListAuditRecordsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_yamcs_protobuf_audit_AuditRecord_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_yamcs_protobuf_audit_AuditRecord_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n yamcs/protobuf/audit/audit.proto\022\024yamc" +
      "s.protobuf.audit\032\034google/protobuf/struct" +
      ".proto\032\037google/protobuf/timestamp.proto\032" +
      "\033yamcs/api/annotations.proto\"\271\001\n\027ListAud" +
      "itRecordsRequest\022\020\n\010instance\030\001 \001(\t\022\r\n\005li" +
      "mit\030\002 \001(\005\022\014\n\004next\030\003 \001(\t\022)\n\005start\030\004 \001(\0132\032" +
      ".google.protobuf.Timestamp\022(\n\004stop\030\005 \001(\013" +
      "2\032.google.protobuf.Timestamp\022\t\n\001q\030\006 \001(\t\022" +
      "\017\n\007service\030\007 \001(\t\"i\n\030ListAuditRecordsResp" +
      "onse\0222\n\007records\030\001 \003(\0132!.yamcs.protobuf.a" +
      "udit.AuditRecord\022\031\n\021continuationToken\030\002 " +
      "\001(\t\"\241\001\n\013AuditRecord\022(\n\004time\030\001 \001(\0132\032.goog" +
      "le.protobuf.Timestamp\022\017\n\007service\030\002 \001(\t\022\016" +
      "\n\006method\030\003 \001(\t\022\014\n\004user\030\004 \001(\t\022\017\n\007summary\030" +
      "\005 \001(\t\022(\n\007request\030\006 \001(\0132\027.google.protobuf" +
      ".Struct2\243\001\n\010AuditApi\022\226\001\n\020ListAuditRecord" +
      "s\022-.yamcs.protobuf.audit.ListAuditRecord" +
      "sRequest\032..yamcs.protobuf.audit.ListAudi" +
      "tRecordsResponse\"#\212\222\003\037\n\035/api/audit/recor" +
      "ds/{instance}B/\n\030org.yamcs.protobuf.audi" +
      "tB\021AuditServiceProtoP\001"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.StructProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
          org.yamcs.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_yamcs_protobuf_audit_ListAuditRecordsRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_yamcs_protobuf_audit_ListAuditRecordsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_yamcs_protobuf_audit_ListAuditRecordsRequest_descriptor,
        new java.lang.String[] { "Instance", "Limit", "Next", "Start", "Stop", "Q", "Service", });
    internal_static_yamcs_protobuf_audit_ListAuditRecordsResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_yamcs_protobuf_audit_ListAuditRecordsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_yamcs_protobuf_audit_ListAuditRecordsResponse_descriptor,
        new java.lang.String[] { "Records", "ContinuationToken", });
    internal_static_yamcs_protobuf_audit_AuditRecord_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_yamcs_protobuf_audit_AuditRecord_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_yamcs_protobuf_audit_AuditRecord_descriptor,
        new java.lang.String[] { "Time", "Service", "Method", "User", "Summary", "Request", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(org.yamcs.api.AnnotationsProto.route);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.protobuf.StructProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    org.yamcs.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
