// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: yamcs/protobuf/commanding/commands_service.proto

package org.yamcs.protobuf;

public interface ListCommandsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:yamcs.protobuf.commanding.ListCommandsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Yamcs instance name.
   * </pre>
   *
   * <code>optional string instance = 1;</code>
   * @return Whether the instance field is set.
   */
  boolean hasInstance();
  /**
   * <pre>
   * Yamcs instance name.
   * </pre>
   *
   * <code>optional string instance = 1;</code>
   * @return The instance.
   */
  java.lang.String getInstance();
  /**
   * <pre>
   * Yamcs instance name.
   * </pre>
   *
   * <code>optional string instance = 1;</code>
   * @return The bytes for instance.
   */
  com.google.protobuf.ByteString
      getInstanceBytes();

  /**
   * <pre>
   * The zero-based row number at which to start outputting results.
   * Default: ``0``
   * 
   * This option is deprecated and will be removed in a later version.
   * Use the returned continuationToken instead.
   * </pre>
   *
   * <code>optional int64 pos = 2 [deprecated = true];</code>
   * @deprecated
   * @return Whether the pos field is set.
   */
  @java.lang.Deprecated boolean hasPos();
  /**
   * <pre>
   * The zero-based row number at which to start outputting results.
   * Default: ``0``
   * 
   * This option is deprecated and will be removed in a later version.
   * Use the returned continuationToken instead.
   * </pre>
   *
   * <code>optional int64 pos = 2 [deprecated = true];</code>
   * @deprecated
   * @return The pos.
   */
  @java.lang.Deprecated long getPos();

  /**
   * <pre>
   * The maximum number of returned records per page. Choose this value too
   * high and you risk hitting the maximum response size limit enforced by
   * the server. Default: ``100``
   * </pre>
   *
   * <code>optional int32 limit = 3;</code>
   * @return Whether the limit field is set.
   */
  boolean hasLimit();
  /**
   * <pre>
   * The maximum number of returned records per page. Choose this value too
   * high and you risk hitting the maximum response size limit enforced by
   * the server. Default: ``100``
   * </pre>
   *
   * <code>optional int32 limit = 3;</code>
   * @return The limit.
   */
  int getLimit();

  /**
   * <pre>
   * The order of the returned results. Can be either ``asc`` or ``desc``.
   * Default: ``desc``
   * </pre>
   *
   * <code>optional string order = 4;</code>
   * @return Whether the order field is set.
   */
  boolean hasOrder();
  /**
   * <pre>
   * The order of the returned results. Can be either ``asc`` or ``desc``.
   * Default: ``desc``
   * </pre>
   *
   * <code>optional string order = 4;</code>
   * @return The order.
   */
  java.lang.String getOrder();
  /**
   * <pre>
   * The order of the returned results. Can be either ``asc`` or ``desc``.
   * Default: ``desc``
   * </pre>
   *
   * <code>optional string order = 4;</code>
   * @return The bytes for order.
   */
  com.google.protobuf.ByteString
      getOrderBytes();

  /**
   * <pre>
   * Text to search in the name of the command. This searches both the
   * qualified name, and any aliases.
   * </pre>
   *
   * <code>optional string q = 5;</code>
   * @return Whether the q field is set.
   */
  boolean hasQ();
  /**
   * <pre>
   * Text to search in the name of the command. This searches both the
   * qualified name, and any aliases.
   * </pre>
   *
   * <code>optional string q = 5;</code>
   * @return The q.
   */
  java.lang.String getQ();
  /**
   * <pre>
   * Text to search in the name of the command. This searches both the
   * qualified name, and any aliases.
   * </pre>
   *
   * <code>optional string q = 5;</code>
   * @return The bytes for q.
   */
  com.google.protobuf.ByteString
      getQBytes();

  /**
   * <pre>
   * Continuation token returned by a previous page response.
   * </pre>
   *
   * <code>optional string next = 6;</code>
   * @return Whether the next field is set.
   */
  boolean hasNext();
  /**
   * <pre>
   * Continuation token returned by a previous page response.
   * </pre>
   *
   * <code>optional string next = 6;</code>
   * @return The next.
   */
  java.lang.String getNext();
  /**
   * <pre>
   * Continuation token returned by a previous page response.
   * </pre>
   *
   * <code>optional string next = 6;</code>
   * @return The bytes for next.
   */
  com.google.protobuf.ByteString
      getNextBytes();

  /**
   * <pre>
   * Filter the lower bound of the command's generation time. Specify a date
   * string in ISO 8601 format. This bound is inclusive.
   * </pre>
   *
   * <code>optional .google.protobuf.Timestamp start = 7;</code>
   * @return Whether the start field is set.
   */
  boolean hasStart();
  /**
   * <pre>
   * Filter the lower bound of the command's generation time. Specify a date
   * string in ISO 8601 format. This bound is inclusive.
   * </pre>
   *
   * <code>optional .google.protobuf.Timestamp start = 7;</code>
   * @return The start.
   */
  com.google.protobuf.Timestamp getStart();
  /**
   * <pre>
   * Filter the lower bound of the command's generation time. Specify a date
   * string in ISO 8601 format. This bound is inclusive.
   * </pre>
   *
   * <code>optional .google.protobuf.Timestamp start = 7;</code>
   */
  com.google.protobuf.TimestampOrBuilder getStartOrBuilder();

  /**
   * <pre>
   * Filter the upper bound of the command's generation time. Specify a date
   * string in ISO 8601 format. This bound is exclusive.
   * </pre>
   *
   * <code>optional .google.protobuf.Timestamp stop = 8;</code>
   * @return Whether the stop field is set.
   */
  boolean hasStop();
  /**
   * <pre>
   * Filter the upper bound of the command's generation time. Specify a date
   * string in ISO 8601 format. This bound is exclusive.
   * </pre>
   *
   * <code>optional .google.protobuf.Timestamp stop = 8;</code>
   * @return The stop.
   */
  com.google.protobuf.Timestamp getStop();
  /**
   * <pre>
   * Filter the upper bound of the command's generation time. Specify a date
   * string in ISO 8601 format. This bound is exclusive.
   * </pre>
   *
   * <code>optional .google.protobuf.Timestamp stop = 8;</code>
   */
  com.google.protobuf.TimestampOrBuilder getStopOrBuilder();

  /**
   * <pre>
   * Filter the results by the used queue.
   * </pre>
   *
   * <code>optional string queue = 9;</code>
   * @return Whether the queue field is set.
   */
  boolean hasQueue();
  /**
   * <pre>
   * Filter the results by the used queue.
   * </pre>
   *
   * <code>optional string queue = 9;</code>
   * @return The queue.
   */
  java.lang.String getQueue();
  /**
   * <pre>
   * Filter the results by the used queue.
   * </pre>
   *
   * <code>optional string queue = 9;</code>
   * @return The bytes for queue.
   */
  com.google.protobuf.ByteString
      getQueueBytes();
}
