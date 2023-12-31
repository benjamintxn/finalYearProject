// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: yamcs/protobuf/commanding/queues_service.proto

package org.yamcs.protobuf;

public final class QueuesServiceProto {
  private QueuesServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_yamcs_protobuf_commanding_ListQueuesRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_yamcs_protobuf_commanding_ListQueuesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_yamcs_protobuf_commanding_ListQueuesResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_yamcs_protobuf_commanding_ListQueuesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_yamcs_protobuf_commanding_SubscribeQueueStatisticsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_yamcs_protobuf_commanding_SubscribeQueueStatisticsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_yamcs_protobuf_commanding_SubscribeQueueEventsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_yamcs_protobuf_commanding_SubscribeQueueEventsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_yamcs_protobuf_commanding_GetQueueRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_yamcs_protobuf_commanding_GetQueueRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_yamcs_protobuf_commanding_EnableQueueRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_yamcs_protobuf_commanding_EnableQueueRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_yamcs_protobuf_commanding_DisableQueueRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_yamcs_protobuf_commanding_DisableQueueRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_yamcs_protobuf_commanding_BlockQueueRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_yamcs_protobuf_commanding_BlockQueueRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_yamcs_protobuf_commanding_ListQueuedCommandsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_yamcs_protobuf_commanding_ListQueuedCommandsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_yamcs_protobuf_commanding_ListQueuedCommandsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_yamcs_protobuf_commanding_ListQueuedCommandsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_yamcs_protobuf_commanding_AcceptCommandRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_yamcs_protobuf_commanding_AcceptCommandRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_yamcs_protobuf_commanding_RejectCommandRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_yamcs_protobuf_commanding_RejectCommandRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n.yamcs/protobuf/commanding/queues_servi" +
      "ce.proto\022\031yamcs.protobuf.commanding\032\033goo" +
      "gle/protobuf/empty.proto\032\033yamcs/api/anno" +
      "tations.proto\032*yamcs/protobuf/commanding" +
      "/commanding.proto\"8\n\021ListQueuesRequest\022\020" +
      "\n\010instance\030\001 \001(\t\022\021\n\tprocessor\030\002 \001(\t\"Q\n\022L" +
      "istQueuesResponse\022;\n\006queues\030\001 \003(\0132+.yamc" +
      "s.protobuf.commanding.CommandQueueInfo\"F" +
      "\n\037SubscribeQueueStatisticsRequest\022\020\n\010ins" +
      "tance\030\001 \001(\t\022\021\n\tprocessor\030\002 \001(\t\"B\n\033Subscr" +
      "ibeQueueEventsRequest\022\020\n\010instance\030\001 \001(\t\022" +
      "\021\n\tprocessor\030\002 \001(\t\"E\n\017GetQueueRequest\022\020\n" +
      "\010instance\030\001 \001(\t\022\021\n\tprocessor\030\002 \001(\t\022\r\n\005qu" +
      "eue\030\003 \001(\t\"H\n\022EnableQueueRequest\022\020\n\010insta" +
      "nce\030\001 \001(\t\022\021\n\tprocessor\030\002 \001(\t\022\r\n\005queue\030\003 " +
      "\001(\t\"I\n\023DisableQueueRequest\022\020\n\010instance\030\001" +
      " \001(\t\022\021\n\tprocessor\030\002 \001(\t\022\r\n\005queue\030\003 \001(\t\"G" +
      "\n\021BlockQueueRequest\022\020\n\010instance\030\001 \001(\t\022\021\n" +
      "\tprocessor\030\002 \001(\t\022\r\n\005queue\030\003 \001(\t\"O\n\031ListQ" +
      "ueuedCommandsRequest\022\020\n\010instance\030\001 \001(\t\022\021" +
      "\n\tprocessor\030\002 \001(\t\022\r\n\005queue\030\003 \001(\t\"\\\n\032List" +
      "QueuedCommandsResponse\022>\n\010commands\030\001 \003(\013" +
      "2,.yamcs.protobuf.commanding.CommandQueu" +
      "eEntry\"[\n\024AcceptCommandRequest\022\020\n\010instan" +
      "ce\030\001 \001(\t\022\021\n\tprocessor\030\002 \001(\t\022\r\n\005queue\030\003 \001" +
      "(\t\022\017\n\007command\030\004 \001(\t\"[\n\024RejectCommandRequ" +
      "est\022\020\n\010instance\030\001 \001(\t\022\021\n\tprocessor\030\002 \001(\t" +
      "\022\r\n\005queue\030\003 \001(\t\022\017\n\007command\030\004 \001(\t2\240\017\n\tQue" +
      "uesApi\022\236\001\n\nListQueues\022,.yamcs.protobuf.c" +
      "ommanding.ListQueuesRequest\032-.yamcs.prot" +
      "obuf.commanding.ListQueuesResponse\"3\212\222\003/" +
      "\n-/api/processors/{instance}/{processor}" +
      "/queues\022\240\001\n\010GetQueue\022*.yamcs.protobuf.co" +
      "mmanding.GetQueueRequest\032+.yamcs.protobu" +
      "f.commanding.CommandQueueInfo\";\212\222\0037\n5/ap" +
      "i/processors/{instance}/{processor}/queu" +
      "es/{queue}\022\342\001\n\013EnableQueue\022-.yamcs.proto" +
      "buf.commanding.EnableQueueRequest\032+.yamc" +
      "s.protobuf.commanding.CommandQueueInfo\"w" +
      "\212\222\003s\032</api/processors/{instance}/{proces" +
      "sor}/queues/{queue}:enableb3Queue \'{queu" +
      "e}\' enabled for processor \'{processor}\'\022" +
      "\346\001\n\014DisableQueue\022..yamcs.protobuf.comman" +
      "ding.DisableQueueRequest\032+.yamcs.protobu" +
      "f.commanding.CommandQueueInfo\"y\212\222\003u\032=/ap" +
      "i/processors/{instance}/{processor}/queu" +
      "es/{queue}:disableb4Queue \'{queue}\' disa" +
      "bled for processor \'{processor}\'\022\337\001\n\nBlo" +
      "ckQueue\022,.yamcs.protobuf.commanding.Bloc" +
      "kQueueRequest\032+.yamcs.protobuf.commandin" +
      "g.CommandQueueInfo\"v\212\222\003r\032;/api/processor" +
      "s/{instance}/{processor}/queues/{queue}:" +
      "blockb3Queue \'{queue}\' blocked for proce" +
      "ssor \'{processor}\'\022\230\001\n\030SubscribeQueueSta" +
      "tistics\022:.yamcs.protobuf.commanding.Subs" +
      "cribeQueueStatisticsRequest\032+.yamcs.prot" +
      "obuf.commanding.CommandQueueInfo\"\021\332\222\003\r\n\013" +
      "queue-stats0\001\022\222\001\n\024SubscribeQueueEvents\0226" +
      ".yamcs.protobuf.commanding.SubscribeQueu" +
      "eEventsRequest\032,.yamcs.protobuf.commandi" +
      "ng.CommandQueueEvent\"\022\332\222\003\016\n\014queue-events" +
      "0\001\022\212\002\n\022ListQueuedCommands\0224.yamcs.protob" +
      "uf.commanding.ListQueuedCommandsRequest\032" +
      "5.yamcs.protobuf.commanding.ListQueuedCo" +
      "mmandsResponse\"\206\001\212\222\003\201\001\n>/api/processors/" +
      "{instance}/{processor}/queues/{queue}/co" +
      "mmandsZ?\n=/api/processors/{instance}/{pr" +
      "ocessor}/queues/{queue}/entries\022\257\001\n\rAcce" +
      "ptCommand\022/.yamcs.protobuf.commanding.Ac" +
      "ceptCommandRequest\032\026.google.protobuf.Emp" +
      "ty\"U\212\222\003Q\032O/api/processors/{instance}/{pr" +
      "ocessor}/queues/{queue}/commands/{comman" +
      "d}:accept\022\257\001\n\rRejectCommand\022/.yamcs.prot" +
      "obuf.commanding.RejectCommandRequest\032\026.g" +
      "oogle.protobuf.Empty\"U\212\222\003Q\032O/api/process" +
      "ors/{instance}/{processor}/queues/{queue" +
      "}/commands/{command}:rejectB*\n\022org.yamcs" +
      ".protobufB\022QueuesServiceProtoP\001"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.EmptyProto.getDescriptor(),
          org.yamcs.api.AnnotationsProto.getDescriptor(),
          org.yamcs.protobuf.Commanding.getDescriptor(),
        });
    internal_static_yamcs_protobuf_commanding_ListQueuesRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_yamcs_protobuf_commanding_ListQueuesRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_yamcs_protobuf_commanding_ListQueuesRequest_descriptor,
        new java.lang.String[] { "Instance", "Processor", });
    internal_static_yamcs_protobuf_commanding_ListQueuesResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_yamcs_protobuf_commanding_ListQueuesResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_yamcs_protobuf_commanding_ListQueuesResponse_descriptor,
        new java.lang.String[] { "Queues", });
    internal_static_yamcs_protobuf_commanding_SubscribeQueueStatisticsRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_yamcs_protobuf_commanding_SubscribeQueueStatisticsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_yamcs_protobuf_commanding_SubscribeQueueStatisticsRequest_descriptor,
        new java.lang.String[] { "Instance", "Processor", });
    internal_static_yamcs_protobuf_commanding_SubscribeQueueEventsRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_yamcs_protobuf_commanding_SubscribeQueueEventsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_yamcs_protobuf_commanding_SubscribeQueueEventsRequest_descriptor,
        new java.lang.String[] { "Instance", "Processor", });
    internal_static_yamcs_protobuf_commanding_GetQueueRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_yamcs_protobuf_commanding_GetQueueRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_yamcs_protobuf_commanding_GetQueueRequest_descriptor,
        new java.lang.String[] { "Instance", "Processor", "Queue", });
    internal_static_yamcs_protobuf_commanding_EnableQueueRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_yamcs_protobuf_commanding_EnableQueueRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_yamcs_protobuf_commanding_EnableQueueRequest_descriptor,
        new java.lang.String[] { "Instance", "Processor", "Queue", });
    internal_static_yamcs_protobuf_commanding_DisableQueueRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_yamcs_protobuf_commanding_DisableQueueRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_yamcs_protobuf_commanding_DisableQueueRequest_descriptor,
        new java.lang.String[] { "Instance", "Processor", "Queue", });
    internal_static_yamcs_protobuf_commanding_BlockQueueRequest_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_yamcs_protobuf_commanding_BlockQueueRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_yamcs_protobuf_commanding_BlockQueueRequest_descriptor,
        new java.lang.String[] { "Instance", "Processor", "Queue", });
    internal_static_yamcs_protobuf_commanding_ListQueuedCommandsRequest_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_yamcs_protobuf_commanding_ListQueuedCommandsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_yamcs_protobuf_commanding_ListQueuedCommandsRequest_descriptor,
        new java.lang.String[] { "Instance", "Processor", "Queue", });
    internal_static_yamcs_protobuf_commanding_ListQueuedCommandsResponse_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_yamcs_protobuf_commanding_ListQueuedCommandsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_yamcs_protobuf_commanding_ListQueuedCommandsResponse_descriptor,
        new java.lang.String[] { "Commands", });
    internal_static_yamcs_protobuf_commanding_AcceptCommandRequest_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_yamcs_protobuf_commanding_AcceptCommandRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_yamcs_protobuf_commanding_AcceptCommandRequest_descriptor,
        new java.lang.String[] { "Instance", "Processor", "Queue", "Command", });
    internal_static_yamcs_protobuf_commanding_RejectCommandRequest_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_yamcs_protobuf_commanding_RejectCommandRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_yamcs_protobuf_commanding_RejectCommandRequest_descriptor,
        new java.lang.String[] { "Instance", "Processor", "Queue", "Command", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(org.yamcs.api.AnnotationsProto.route);
    registry.add(org.yamcs.api.AnnotationsProto.websocket);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.protobuf.EmptyProto.getDescriptor();
    org.yamcs.api.AnnotationsProto.getDescriptor();
    org.yamcs.protobuf.Commanding.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
