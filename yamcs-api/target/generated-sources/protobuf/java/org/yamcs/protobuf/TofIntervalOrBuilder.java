// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: yamcs/protobuf/tco/tco.proto

package org.yamcs.protobuf;

public interface TofIntervalOrBuilder extends
    // @@protoc_insertion_point(interface_extends:yamcs.protobuf.tco.TofInterval)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional .google.protobuf.Timestamp ertStart = 1;</code>
   * @return Whether the ertStart field is set.
   */
  boolean hasErtStart();
  /**
   * <code>optional .google.protobuf.Timestamp ertStart = 1;</code>
   * @return The ertStart.
   */
  com.google.protobuf.Timestamp getErtStart();
  /**
   * <code>optional .google.protobuf.Timestamp ertStart = 1;</code>
   */
  com.google.protobuf.TimestampOrBuilder getErtStartOrBuilder();

  /**
   * <code>optional .google.protobuf.Timestamp ertStop = 2;</code>
   * @return Whether the ertStop field is set.
   */
  boolean hasErtStop();
  /**
   * <code>optional .google.protobuf.Timestamp ertStop = 2;</code>
   * @return The ertStop.
   */
  com.google.protobuf.Timestamp getErtStop();
  /**
   * <code>optional .google.protobuf.Timestamp ertStop = 2;</code>
   */
  com.google.protobuf.TimestampOrBuilder getErtStopOrBuilder();

  /**
   * <code>repeated double polCoef = 3;</code>
   * @return A list containing the polCoef.
   */
  java.util.List<java.lang.Double> getPolCoefList();
  /**
   * <code>repeated double polCoef = 3;</code>
   * @return The count of polCoef.
   */
  int getPolCoefCount();
  /**
   * <code>repeated double polCoef = 3;</code>
   * @param index The index of the element to return.
   * @return The polCoef at the given index.
   */
  double getPolCoef(int index);
}
