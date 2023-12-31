// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: yamcs/protobuf/tco/tco.proto

package org.yamcs.protobuf;

public final class TcoProto {
  private TcoProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_yamcs_protobuf_tco_GetTcoConfigRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_yamcs_protobuf_tco_GetTcoConfigRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_yamcs_protobuf_tco_SetTcoConfigRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_yamcs_protobuf_tco_SetTcoConfigRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_yamcs_protobuf_tco_TcoResetRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_yamcs_protobuf_tco_TcoResetRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_yamcs_protobuf_tco_TcoConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_yamcs_protobuf_tco_TcoConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_yamcs_protobuf_tco_GetTcoStatusRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_yamcs_protobuf_tco_GetTcoStatusRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_yamcs_protobuf_tco_SetCoefficientsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_yamcs_protobuf_tco_SetCoefficientsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_yamcs_protobuf_tco_AddTimeOfFlightIntervalsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_yamcs_protobuf_tco_AddTimeOfFlightIntervalsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_yamcs_protobuf_tco_DeleteTimeOfFlightIntervalsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_yamcs_protobuf_tco_DeleteTimeOfFlightIntervalsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_yamcs_protobuf_tco_TcoCoefficients_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_yamcs_protobuf_tco_TcoCoefficients_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_yamcs_protobuf_tco_TcoStatus_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_yamcs_protobuf_tco_TcoStatus_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_yamcs_protobuf_tco_TcoSample_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_yamcs_protobuf_tco_TcoSample_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_yamcs_protobuf_tco_TofInterval_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_yamcs_protobuf_tco_TofInterval_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034yamcs/protobuf/tco/tco.proto\022\022yamcs.pr" +
      "otobuf.tco\032\033yamcs/api/annotations.proto\032" +
      "\033google/protobuf/empty.proto\032\037google/pro" +
      "tobuf/timestamp.proto\"<\n\023GetTcoConfigReq" +
      "uest\022\020\n\010instance\030\001 \001(\t\022\023\n\013serviceName\030\002 " +
      "\001(\t\"k\n\023SetTcoConfigRequest\022\020\n\010instance\030\001" +
      " \001(\t\022\023\n\013serviceName\030\002 \001(\t\022-\n\006config\030\003 \001(" +
      "\0132\035.yamcs.protobuf.tco.TcoConfig\"8\n\017TcoR" +
      "esetRequest\022\020\n\010instance\030\001 \001(\t\022\023\n\013service" +
      "Name\030\002 \001(\t\"Y\n\tTcoConfig\022\020\n\010accuracy\030\001 \001(" +
      "\001\022\020\n\010validity\030\002 \001(\001\022\024\n\014onboardDelay\030\003 \001(" +
      "\001\022\022\n\ndefaultTof\030\004 \001(\001\"<\n\023GetTcoStatusReq" +
      "uest\022\020\n\010instance\030\001 \001(\t\022\023\n\013serviceName\030\002 " +
      "\001(\t\"z\n\026SetCoefficientsRequest\022\020\n\010instanc" +
      "e\030\001 \001(\t\022\023\n\013serviceName\030\002 \001(\t\0229\n\014coeffici" +
      "ents\030\003 \001(\0132#.yamcs.protobuf.tco.TcoCoeff" +
      "icients\"|\n\037AddTimeOfFlightIntervalsReque" +
      "st\022\020\n\010instance\030\001 \001(\t\022\023\n\013serviceName\030\002 \001(" +
      "\t\0222\n\tintervals\030\003 \003(\0132\037.yamcs.protobuf.tc" +
      "o.TofInterval\"\240\001\n\"DeleteTimeOfFlightInte" +
      "rvalsRequest\022\020\n\010instance\030\001 \001(\t\022\023\n\013servic" +
      "eName\030\002 \001(\t\022)\n\005start\030\003 \001(\0132\032.google.prot" +
      "obuf.Timestamp\022(\n\004stop\030\004 \001(\0132\032.google.pr" +
      "otobuf.Timestamp\"i\n\017TcoCoefficients\022\'\n\003u" +
      "tc\030\001 \001(\0132\032.google.protobuf.Timestamp\022\013\n\003" +
      "obt\030\002 \001(\004\022\020\n\010gradient\030\003 \001(\001\022\016\n\006offset\030\004 " +
      "\001(\001\"\277\001\n\tTcoStatus\0229\n\014coefficients\030\001 \001(\0132" +
      "#.yamcs.protobuf.tco.TcoCoefficients\0224\n\020" +
      "coefficientsTime\030\002 \001(\0132\032.google.protobuf" +
      ".Timestamp\022\021\n\tdeviation\030\003 \001(\001\022.\n\007samples" +
      "\030\004 \003(\0132\035.yamcs.protobuf.tco.TcoSample\"A\n" +
      "\tTcoSample\022\'\n\003utc\030\001 \001(\0132\032.google.protobu" +
      "f.Timestamp\022\013\n\003obt\030\002 \001(\004\"y\n\013TofInterval\022" +
      ",\n\010ertStart\030\001 \001(\0132\032.google.protobuf.Time" +
      "stamp\022+\n\007ertStop\030\002 \001(\0132\032.google.protobuf" +
      ".Timestamp\022\017\n\007polCoef\030\003 \003(\0012\217\010\n\022TimeCorr" +
      "elationApi\022\203\001\n\tGetConfig\022\'.yamcs.protobu" +
      "f.tco.GetTcoConfigRequest\032\035.yamcs.protob" +
      "uf.tco.TcoConfig\".\212\222\003*\n(/api/tco/{instan" +
      "ce}/{serviceName}/config\022\204\001\n\tSetConfig\022\'" +
      ".yamcs.protobuf.tco.SetTcoConfigRequest\032" +
      "\026.google.protobuf.Empty\"6\212\222\0032\032(/api/tco/" +
      "{instance}/{serviceName}/config:\006config\022" +
      "\203\001\n\tGetStatus\022\'.yamcs.protobuf.tco.GetTc" +
      "oStatusRequest\032\035.yamcs.protobuf.tco.TcoS" +
      "tatus\".\212\222\003*\n(/api/tco/{instance}/{servic" +
      "eName}/status\022\231\001\n\017SetCoefficients\022*.yamc" +
      "s.protobuf.tco.SetCoefficientsRequest\032\026." +
      "google.protobuf.Empty\"B\212\222\003>\032./api/tco/{i" +
      "nstance}/{serviceName}/coefficients:\014coe" +
      "fficients\022s\n\005Reset\022#.yamcs.protobuf.tco." +
      "TcoResetRequest\032\026.google.protobuf.Empty\"" +
      "-\212\222\003)\032\'/api/tco/{instance}/{serviceName}" +
      ":reset\022\244\001\n\030AddTimeOfFlightIntervals\0223.ya" +
      "mcs.protobuf.tco.AddTimeOfFlightInterval" +
      "sRequest\032\026.google.protobuf.Empty\";\212\222\0037\0322" +
      "/api/tco/{instance}/{serviceName}/tof:ad" +
      "dIntervals:\001*\022\255\001\n\033DeleteTimeOfFlightInte" +
      "rvals\0226.yamcs.protobuf.tco.DeleteTimeOfF" +
      "lightIntervalsRequest\032\026.google.protobuf." +
      "Empty\">\212\222\003:\0325/api/tco/{instance}/{servic" +
      "eName}/tof:deleteIntervals:\001*B \n\022org.yam" +
      "cs.protobufB\010TcoProtoP\001"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          org.yamcs.api.AnnotationsProto.getDescriptor(),
          com.google.protobuf.EmptyProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_yamcs_protobuf_tco_GetTcoConfigRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_yamcs_protobuf_tco_GetTcoConfigRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_yamcs_protobuf_tco_GetTcoConfigRequest_descriptor,
        new java.lang.String[] { "Instance", "ServiceName", });
    internal_static_yamcs_protobuf_tco_SetTcoConfigRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_yamcs_protobuf_tco_SetTcoConfigRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_yamcs_protobuf_tco_SetTcoConfigRequest_descriptor,
        new java.lang.String[] { "Instance", "ServiceName", "Config", });
    internal_static_yamcs_protobuf_tco_TcoResetRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_yamcs_protobuf_tco_TcoResetRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_yamcs_protobuf_tco_TcoResetRequest_descriptor,
        new java.lang.String[] { "Instance", "ServiceName", });
    internal_static_yamcs_protobuf_tco_TcoConfig_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_yamcs_protobuf_tco_TcoConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_yamcs_protobuf_tco_TcoConfig_descriptor,
        new java.lang.String[] { "Accuracy", "Validity", "OnboardDelay", "DefaultTof", });
    internal_static_yamcs_protobuf_tco_GetTcoStatusRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_yamcs_protobuf_tco_GetTcoStatusRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_yamcs_protobuf_tco_GetTcoStatusRequest_descriptor,
        new java.lang.String[] { "Instance", "ServiceName", });
    internal_static_yamcs_protobuf_tco_SetCoefficientsRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_yamcs_protobuf_tco_SetCoefficientsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_yamcs_protobuf_tco_SetCoefficientsRequest_descriptor,
        new java.lang.String[] { "Instance", "ServiceName", "Coefficients", });
    internal_static_yamcs_protobuf_tco_AddTimeOfFlightIntervalsRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_yamcs_protobuf_tco_AddTimeOfFlightIntervalsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_yamcs_protobuf_tco_AddTimeOfFlightIntervalsRequest_descriptor,
        new java.lang.String[] { "Instance", "ServiceName", "Intervals", });
    internal_static_yamcs_protobuf_tco_DeleteTimeOfFlightIntervalsRequest_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_yamcs_protobuf_tco_DeleteTimeOfFlightIntervalsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_yamcs_protobuf_tco_DeleteTimeOfFlightIntervalsRequest_descriptor,
        new java.lang.String[] { "Instance", "ServiceName", "Start", "Stop", });
    internal_static_yamcs_protobuf_tco_TcoCoefficients_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_yamcs_protobuf_tco_TcoCoefficients_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_yamcs_protobuf_tco_TcoCoefficients_descriptor,
        new java.lang.String[] { "Utc", "Obt", "Gradient", "Offset", });
    internal_static_yamcs_protobuf_tco_TcoStatus_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_yamcs_protobuf_tco_TcoStatus_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_yamcs_protobuf_tco_TcoStatus_descriptor,
        new java.lang.String[] { "Coefficients", "CoefficientsTime", "Deviation", "Samples", });
    internal_static_yamcs_protobuf_tco_TcoSample_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_yamcs_protobuf_tco_TcoSample_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_yamcs_protobuf_tco_TcoSample_descriptor,
        new java.lang.String[] { "Utc", "Obt", });
    internal_static_yamcs_protobuf_tco_TofInterval_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_yamcs_protobuf_tco_TofInterval_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_yamcs_protobuf_tco_TofInterval_descriptor,
        new java.lang.String[] { "ErtStart", "ErtStop", "PolCoef", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(org.yamcs.api.AnnotationsProto.route);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    org.yamcs.api.AnnotationsProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
