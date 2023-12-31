// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: yamcs/protobuf/events/events_service.proto

package org.yamcs.protobuf;

public interface ListEventsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:yamcs.protobuf.events.ListEventsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .yamcs.protobuf.events.Event event = 1;</code>
   */
  java.util.List<org.yamcs.protobuf.Event> 
      getEventList();
  /**
   * <code>repeated .yamcs.protobuf.events.Event event = 1;</code>
   */
  org.yamcs.protobuf.Event getEvent(int index);
  /**
   * <code>repeated .yamcs.protobuf.events.Event event = 1;</code>
   */
  int getEventCount();
  /**
   * <code>repeated .yamcs.protobuf.events.Event event = 1;</code>
   */
  java.util.List<? extends org.yamcs.protobuf.EventOrBuilder> 
      getEventOrBuilderList();
  /**
   * <code>repeated .yamcs.protobuf.events.Event event = 1;</code>
   */
  org.yamcs.protobuf.EventOrBuilder getEventOrBuilder(
      int index);

  /**
   * <pre>
   * Token indicating the response is only partial. More results can then
   * be obtained by performing the same request (including all original
   * query parameters) and setting the ``next`` parameter to this token.
   * </pre>
   *
   * <code>optional string continuationToken = 2;</code>
   * @return Whether the continuationToken field is set.
   */
  boolean hasContinuationToken();
  /**
   * <pre>
   * Token indicating the response is only partial. More results can then
   * be obtained by performing the same request (including all original
   * query parameters) and setting the ``next`` parameter to this token.
   * </pre>
   *
   * <code>optional string continuationToken = 2;</code>
   * @return The continuationToken.
   */
  java.lang.String getContinuationToken();
  /**
   * <pre>
   * Token indicating the response is only partial. More results can then
   * be obtained by performing the same request (including all original
   * query parameters) and setting the ``next`` parameter to this token.
   * </pre>
   *
   * <code>optional string continuationToken = 2;</code>
   * @return The bytes for continuationToken.
   */
  com.google.protobuf.ByteString
      getContinuationTokenBytes();
}
