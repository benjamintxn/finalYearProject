// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: yamcs/protobuf/server/server_service.proto

package org.yamcs.protobuf;

public interface HttpTrafficOrBuilder extends
    // @@protoc_insertion_point(interface_extends:yamcs.protobuf.server.HttpTraffic)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional uint64 readBytes = 1;</code>
   * @return Whether the readBytes field is set.
   */
  boolean hasReadBytes();
  /**
   * <code>optional uint64 readBytes = 1;</code>
   * @return The readBytes.
   */
  long getReadBytes();

  /**
   * <code>optional uint64 writtenBytes = 2;</code>
   * @return Whether the writtenBytes field is set.
   */
  boolean hasWrittenBytes();
  /**
   * <code>optional uint64 writtenBytes = 2;</code>
   * @return The writtenBytes.
   */
  long getWrittenBytes();

  /**
   * <code>optional uint64 readThroughput = 3;</code>
   * @return Whether the readThroughput field is set.
   */
  boolean hasReadThroughput();
  /**
   * <code>optional uint64 readThroughput = 3;</code>
   * @return The readThroughput.
   */
  long getReadThroughput();

  /**
   * <code>optional uint64 writeThroughput = 4;</code>
   * @return Whether the writeThroughput field is set.
   */
  boolean hasWriteThroughput();
  /**
   * <code>optional uint64 writeThroughput = 4;</code>
   * @return The writeThroughput.
   */
  long getWriteThroughput();

  /**
   * <code>repeated .yamcs.protobuf.server.ClientConnectionInfo connections = 5;</code>
   */
  java.util.List<org.yamcs.protobuf.ClientConnectionInfo> 
      getConnectionsList();
  /**
   * <code>repeated .yamcs.protobuf.server.ClientConnectionInfo connections = 5;</code>
   */
  org.yamcs.protobuf.ClientConnectionInfo getConnections(int index);
  /**
   * <code>repeated .yamcs.protobuf.server.ClientConnectionInfo connections = 5;</code>
   */
  int getConnectionsCount();
  /**
   * <code>repeated .yamcs.protobuf.server.ClientConnectionInfo connections = 5;</code>
   */
  java.util.List<? extends org.yamcs.protobuf.ClientConnectionInfoOrBuilder> 
      getConnectionsOrBuilderList();
  /**
   * <code>repeated .yamcs.protobuf.server.ClientConnectionInfo connections = 5;</code>
   */
  org.yamcs.protobuf.ClientConnectionInfoOrBuilder getConnectionsOrBuilder(
      int index);
}
