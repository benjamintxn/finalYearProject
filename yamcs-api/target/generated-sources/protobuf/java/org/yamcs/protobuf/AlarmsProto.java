// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: yamcs/protobuf/alarms/alarms.proto

package org.yamcs.protobuf;

public final class AlarmsProto {
  private AlarmsProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_yamcs_protobuf_alarms_AcknowledgeInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_yamcs_protobuf_alarms_AcknowledgeInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_yamcs_protobuf_alarms_ShelveInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_yamcs_protobuf_alarms_ShelveInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_yamcs_protobuf_alarms_ClearInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_yamcs_protobuf_alarms_ClearInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_yamcs_protobuf_alarms_AlarmData_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_yamcs_protobuf_alarms_AlarmData_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_yamcs_protobuf_alarms_ParameterAlarmData_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_yamcs_protobuf_alarms_ParameterAlarmData_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_yamcs_protobuf_alarms_EventAlarmData_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_yamcs_protobuf_alarms_EventAlarmData_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\"yamcs/protobuf/alarms/alarms.proto\022\025ya" +
      "mcs.protobuf.alarms\032\037google/protobuf/tim" +
      "estamp.proto\032\032yamcs/protobuf/yamcs.proto" +
      "\032\034yamcs/protobuf/mdb/mdb.proto\032\"yamcs/pr" +
      "otobuf/pvalue/pvalue.proto\032\"yamcs/protob" +
      "uf/events/events.proto\"z\n\017AcknowledgeInf" +
      "o\022\026\n\016acknowledgedBy\030\001 \001(\t\022\032\n\022acknowledge" +
      "Message\030\002 \001(\t\0223\n\017acknowledgeTime\030\005 \001(\0132\032" +
      ".google.protobuf.Timestamp\"\234\001\n\nShelveInf" +
      "o\022\021\n\tshelvedBy\030\001 \001(\t\022\025\n\rshelveMessage\030\002 " +
      "\001(\t\022.\n\nshelveTime\030\003 \001(\0132\032.google.protobu" +
      "f.Timestamp\0224\n\020shelveExpiration\030\004 \001(\0132\032." +
      "google.protobuf.Timestamp\"c\n\tClearInfo\022\021" +
      "\n\tclearedBy\030\001 \001(\t\022-\n\tclearTime\030\002 \001(\0132\032.g" +
      "oogle.protobuf.Timestamp\022\024\n\014clearMessage" +
      "\030\003 \001(\t\"\365\005\n\tAlarmData\022.\n\004type\030\001 \001(\0162 .yam" +
      "cs.protobuf.alarms.AlarmType\022/\n\013triggerT" +
      "ime\030\002 \001(\0132\032.google.protobuf.Timestamp\022)\n" +
      "\002id\030\003 \001(\0132\035.yamcs.protobuf.NamedObjectId" +
      "\022\016\n\006seqNum\030\004 \001(\r\0226\n\010severity\030\005 \001(\0162$.yam" +
      "cs.protobuf.alarms.AlarmSeverity\022\022\n\nviol" +
      "ations\030\006 \001(\r\022\r\n\005count\030\007 \001(\r\022?\n\017acknowled" +
      "geInfo\030\010 \001(\0132&.yamcs.protobuf.alarms.Ack" +
      "nowledgeInfo\022F\n\020notificationType\030\t \001(\0162," +
      ".yamcs.protobuf.alarms.AlarmNotification" +
      "Type\022B\n\017parameterDetail\030\n \001(\0132).yamcs.pr" +
      "otobuf.alarms.ParameterAlarmData\022:\n\013even" +
      "tDetail\030\013 \001(\0132%.yamcs.protobuf.alarms.Ev" +
      "entAlarmData\022\020\n\010latching\030\014 \001(\010\022\021\n\tproces" +
      "sOK\030\r \001(\010\022\021\n\ttriggered\030\016 \001(\010\022\024\n\014acknowle" +
      "dged\030\017 \001(\010\0225\n\nshelveInfo\030\020 \001(\0132!.yamcs.p" +
      "rotobuf.alarms.ShelveInfo\0223\n\tclearInfo\030\021" +
      " \001(\0132 .yamcs.protobuf.alarms.ClearInfo\022." +
      "\n\nupdateTime\030\022 \001(\0132\032.google.protobuf.Tim" +
      "estamp\"\204\002\n\022ParameterAlarmData\022;\n\014trigger" +
      "Value\030\001 \001(\0132%.yamcs.protobuf.pvalue.Para" +
      "meterValue\022>\n\017mostSevereValue\030\002 \001(\0132%.ya" +
      "mcs.protobuf.pvalue.ParameterValue\022;\n\014cu" +
      "rrentValue\030\003 \001(\0132%.yamcs.protobuf.pvalue" +
      ".ParameterValue\0224\n\tparameter\030\004 \001(\0132!.yam" +
      "cs.protobuf.mdb.ParameterInfo\"\257\001\n\016EventA" +
      "larmData\0222\n\014triggerEvent\030\001 \001(\0132\034.yamcs.p" +
      "rotobuf.events.Event\0225\n\017mostSevereEvent\030" +
      "\002 \001(\0132\034.yamcs.protobuf.events.Event\0222\n\014c" +
      "urrentEvent\030\003 \001(\0132\034.yamcs.protobuf.event" +
      "s.Event*\254\001\n\025AlarmNotificationType\022\n\n\006ACT" +
      "IVE\020\001\022\r\n\tTRIGGERED\020\002\022\026\n\022SEVERITY_INCREAS" +
      "ED\020\003\022\021\n\rVALUE_UPDATED\020\004\022\020\n\014ACKNOWLEDGED\020" +
      "\005\022\013\n\007CLEARED\020\006\022\007\n\003RTN\020\007\022\013\n\007SHELVED\020\010\022\r\n\t" +
      "UNSHELVED\020\t\022\t\n\005RESET\020\n*%\n\tAlarmType\022\r\n\tP" +
      "ARAMETER\020\001\022\t\n\005EVENT\020\002*O\n\rAlarmSeverity\022\t" +
      "\n\005WATCH\020\001\022\013\n\007WARNING\020\002\022\014\n\010DISTRESS\020\003\022\014\n\010" +
      "CRITICAL\020\004\022\n\n\006SEVERE\020\005B#\n\022org.yamcs.prot" +
      "obufB\013AlarmsProtoP\001"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.TimestampProto.getDescriptor(),
          org.yamcs.protobuf.Yamcs.getDescriptor(),
          org.yamcs.protobuf.Mdb.getDescriptor(),
          org.yamcs.protobuf.Pvalue.getDescriptor(),
          org.yamcs.protobuf.EventsProto.getDescriptor(),
        });
    internal_static_yamcs_protobuf_alarms_AcknowledgeInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_yamcs_protobuf_alarms_AcknowledgeInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_yamcs_protobuf_alarms_AcknowledgeInfo_descriptor,
        new java.lang.String[] { "AcknowledgedBy", "AcknowledgeMessage", "AcknowledgeTime", });
    internal_static_yamcs_protobuf_alarms_ShelveInfo_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_yamcs_protobuf_alarms_ShelveInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_yamcs_protobuf_alarms_ShelveInfo_descriptor,
        new java.lang.String[] { "ShelvedBy", "ShelveMessage", "ShelveTime", "ShelveExpiration", });
    internal_static_yamcs_protobuf_alarms_ClearInfo_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_yamcs_protobuf_alarms_ClearInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_yamcs_protobuf_alarms_ClearInfo_descriptor,
        new java.lang.String[] { "ClearedBy", "ClearTime", "ClearMessage", });
    internal_static_yamcs_protobuf_alarms_AlarmData_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_yamcs_protobuf_alarms_AlarmData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_yamcs_protobuf_alarms_AlarmData_descriptor,
        new java.lang.String[] { "Type", "TriggerTime", "Id", "SeqNum", "Severity", "Violations", "Count", "AcknowledgeInfo", "NotificationType", "ParameterDetail", "EventDetail", "Latching", "ProcessOK", "Triggered", "Acknowledged", "ShelveInfo", "ClearInfo", "UpdateTime", });
    internal_static_yamcs_protobuf_alarms_ParameterAlarmData_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_yamcs_protobuf_alarms_ParameterAlarmData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_yamcs_protobuf_alarms_ParameterAlarmData_descriptor,
        new java.lang.String[] { "TriggerValue", "MostSevereValue", "CurrentValue", "Parameter", });
    internal_static_yamcs_protobuf_alarms_EventAlarmData_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_yamcs_protobuf_alarms_EventAlarmData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_yamcs_protobuf_alarms_EventAlarmData_descriptor,
        new java.lang.String[] { "TriggerEvent", "MostSevereEvent", "CurrentEvent", });
    com.google.protobuf.TimestampProto.getDescriptor();
    org.yamcs.protobuf.Yamcs.getDescriptor();
    org.yamcs.protobuf.Mdb.getDescriptor();
    org.yamcs.protobuf.Pvalue.getDescriptor();
    org.yamcs.protobuf.EventsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
