// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: yamcs/protobuf/commanding/queues_service.proto

package org.yamcs.protobuf;

public interface ListQueuedCommandsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:yamcs.protobuf.commanding.ListQueuedCommandsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .yamcs.protobuf.commanding.CommandQueueEntry commands = 1;</code>
   */
  java.util.List<org.yamcs.protobuf.Commanding.CommandQueueEntry> 
      getCommandsList();
  /**
   * <code>repeated .yamcs.protobuf.commanding.CommandQueueEntry commands = 1;</code>
   */
  org.yamcs.protobuf.Commanding.CommandQueueEntry getCommands(int index);
  /**
   * <code>repeated .yamcs.protobuf.commanding.CommandQueueEntry commands = 1;</code>
   */
  int getCommandsCount();
  /**
   * <code>repeated .yamcs.protobuf.commanding.CommandQueueEntry commands = 1;</code>
   */
  java.util.List<? extends org.yamcs.protobuf.Commanding.CommandQueueEntryOrBuilder> 
      getCommandsOrBuilderList();
  /**
   * <code>repeated .yamcs.protobuf.commanding.CommandQueueEntry commands = 1;</code>
   */
  org.yamcs.protobuf.Commanding.CommandQueueEntryOrBuilder getCommandsOrBuilder(
      int index);
}
