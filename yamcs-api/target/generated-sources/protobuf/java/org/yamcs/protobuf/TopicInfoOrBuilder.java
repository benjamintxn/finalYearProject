// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: yamcs/protobuf/server/server_service.proto

package org.yamcs.protobuf;

public interface TopicInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:yamcs.protobuf.server.TopicInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional string topic = 1;</code>
   * @return Whether the topic field is set.
   */
  boolean hasTopic();
  /**
   * <code>optional string topic = 1;</code>
   * @return The topic.
   */
  java.lang.String getTopic();
  /**
   * <code>optional string topic = 1;</code>
   * @return The bytes for topic.
   */
  com.google.protobuf.ByteString
      getTopicBytes();

  /**
   * <code>optional string service = 2;</code>
   * @return Whether the service field is set.
   */
  boolean hasService();
  /**
   * <code>optional string service = 2;</code>
   * @return The service.
   */
  java.lang.String getService();
  /**
   * <code>optional string service = 2;</code>
   * @return The bytes for service.
   */
  com.google.protobuf.ByteString
      getServiceBytes();

  /**
   * <code>optional string method = 3;</code>
   * @return Whether the method field is set.
   */
  boolean hasMethod();
  /**
   * <code>optional string method = 3;</code>
   * @return The method.
   */
  java.lang.String getMethod();
  /**
   * <code>optional string method = 3;</code>
   * @return The bytes for method.
   */
  com.google.protobuf.ByteString
      getMethodBytes();

  /**
   * <code>optional string description = 4;</code>
   * @return Whether the description field is set.
   */
  boolean hasDescription();
  /**
   * <code>optional string description = 4;</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <code>optional string description = 4;</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <code>optional string inputType = 5;</code>
   * @return Whether the inputType field is set.
   */
  boolean hasInputType();
  /**
   * <code>optional string inputType = 5;</code>
   * @return The inputType.
   */
  java.lang.String getInputType();
  /**
   * <code>optional string inputType = 5;</code>
   * @return The bytes for inputType.
   */
  com.google.protobuf.ByteString
      getInputTypeBytes();

  /**
   * <code>optional string outputType = 6;</code>
   * @return Whether the outputType field is set.
   */
  boolean hasOutputType();
  /**
   * <code>optional string outputType = 6;</code>
   * @return The outputType.
   */
  java.lang.String getOutputType();
  /**
   * <code>optional string outputType = 6;</code>
   * @return The bytes for outputType.
   */
  com.google.protobuf.ByteString
      getOutputTypeBytes();

  /**
   * <code>optional bool deprecated = 7;</code>
   * @return Whether the deprecated field is set.
   */
  boolean hasDeprecated();
  /**
   * <code>optional bool deprecated = 7;</code>
   * @return The deprecated.
   */
  boolean getDeprecated();
}
