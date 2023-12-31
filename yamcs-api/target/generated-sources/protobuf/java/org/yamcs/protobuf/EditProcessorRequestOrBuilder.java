// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: yamcs/protobuf/processing/processing.proto

package org.yamcs.protobuf;

public interface EditProcessorRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:yamcs.protobuf.processing.EditProcessorRequest)
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
   * Processor name.
   * </pre>
   *
   * <code>optional string processor = 2;</code>
   * @return Whether the processor field is set.
   */
  boolean hasProcessor();
  /**
   * <pre>
   * Processor name.
   * </pre>
   *
   * <code>optional string processor = 2;</code>
   * @return The processor.
   */
  java.lang.String getProcessor();
  /**
   * <pre>
   * Processor name.
   * </pre>
   *
   * <code>optional string processor = 2;</code>
   * @return The bytes for processor.
   */
  com.google.protobuf.ByteString
      getProcessorBytes();

  /**
   * <pre>
   * The state this replay processor should be updated to. Either ``paused`` or
   * ``running``.
   * </pre>
   *
   * <code>optional string state = 3;</code>
   * @return Whether the state field is set.
   */
  boolean hasState();
  /**
   * <pre>
   * The state this replay processor should be updated to. Either ``paused`` or
   * ``running``.
   * </pre>
   *
   * <code>optional string state = 3;</code>
   * @return The state.
   */
  java.lang.String getState();
  /**
   * <pre>
   * The state this replay processor should be updated to. Either ``paused`` or
   * ``running``.
   * </pre>
   *
   * <code>optional string state = 3;</code>
   * @return The bytes for state.
   */
  com.google.protobuf.ByteString
      getStateBytes();

  /**
   * <pre>
   * The time where the processing needs to jump towards. Must be a date string
   * in ISO 8601 format.
   * </pre>
   *
   * <code>optional .google.protobuf.Timestamp seek = 4;</code>
   * @return Whether the seek field is set.
   */
  boolean hasSeek();
  /**
   * <pre>
   * The time where the processing needs to jump towards. Must be a date string
   * in ISO 8601 format.
   * </pre>
   *
   * <code>optional .google.protobuf.Timestamp seek = 4;</code>
   * @return The seek.
   */
  com.google.protobuf.Timestamp getSeek();
  /**
   * <pre>
   * The time where the processing needs to jump towards. Must be a date string
   * in ISO 8601 format.
   * </pre>
   *
   * <code>optional .google.protobuf.Timestamp seek = 4;</code>
   */
  com.google.protobuf.TimestampOrBuilder getSeekOrBuilder();

  /**
   * <pre>
   * The speed of the processor. One of:
   * * ``afap``
   * * a speed factor relative to the original speed. Example: ``2x``
   * * a fixed delay value in milliseconds. Example: ``2000``
   * </pre>
   *
   * <code>optional string speed = 5;</code>
   * @return Whether the speed field is set.
   */
  boolean hasSpeed();
  /**
   * <pre>
   * The speed of the processor. One of:
   * * ``afap``
   * * a speed factor relative to the original speed. Example: ``2x``
   * * a fixed delay value in milliseconds. Example: ``2000``
   * </pre>
   *
   * <code>optional string speed = 5;</code>
   * @return The speed.
   */
  java.lang.String getSpeed();
  /**
   * <pre>
   * The speed of the processor. One of:
   * * ``afap``
   * * a speed factor relative to the original speed. Example: ``2x``
   * * a fixed delay value in milliseconds. Example: ``2000``
   * </pre>
   *
   * <code>optional string speed = 5;</code>
   * @return The bytes for speed.
   */
  com.google.protobuf.ByteString
      getSpeedBytes();

  /**
   * <pre>
   * New start time
   * </pre>
   *
   * <code>optional .google.protobuf.Timestamp start = 6;</code>
   * @return Whether the start field is set.
   */
  boolean hasStart();
  /**
   * <pre>
   * New start time
   * </pre>
   *
   * <code>optional .google.protobuf.Timestamp start = 6;</code>
   * @return The start.
   */
  com.google.protobuf.Timestamp getStart();
  /**
   * <pre>
   * New start time
   * </pre>
   *
   * <code>optional .google.protobuf.Timestamp start = 6;</code>
   */
  com.google.protobuf.TimestampOrBuilder getStartOrBuilder();

  /**
   * <pre>
   * New stop time
   * </pre>
   *
   * <code>optional .google.protobuf.Timestamp stop = 7;</code>
   * @return Whether the stop field is set.
   */
  boolean hasStop();
  /**
   * <pre>
   * New stop time
   * </pre>
   *
   * <code>optional .google.protobuf.Timestamp stop = 7;</code>
   * @return The stop.
   */
  com.google.protobuf.Timestamp getStop();
  /**
   * <pre>
   * New stop time
   * </pre>
   *
   * <code>optional .google.protobuf.Timestamp stop = 7;</code>
   */
  com.google.protobuf.TimestampOrBuilder getStopOrBuilder();

  /**
   * <pre>
   * Continue replaying from ``start`` after having reached ``stop``.
   * </pre>
   *
   * <code>optional bool loop = 8;</code>
   * @return Whether the loop field is set.
   */
  boolean hasLoop();
  /**
   * <pre>
   * Continue replaying from ``start`` after having reached ``stop``.
   * </pre>
   *
   * <code>optional bool loop = 8;</code>
   * @return The loop.
   */
  boolean getLoop();
}
