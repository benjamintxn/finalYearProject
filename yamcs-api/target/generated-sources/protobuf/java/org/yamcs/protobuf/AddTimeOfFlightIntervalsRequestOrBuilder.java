// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: yamcs/protobuf/tco/tco.proto

package org.yamcs.protobuf;

public interface AddTimeOfFlightIntervalsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:yamcs.protobuf.tco.AddTimeOfFlightIntervalsRequest)
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
   * Service name.
   * </pre>
   *
   * <code>optional string serviceName = 2;</code>
   * @return Whether the serviceName field is set.
   */
  boolean hasServiceName();
  /**
   * <pre>
   * Service name.
   * </pre>
   *
   * <code>optional string serviceName = 2;</code>
   * @return The serviceName.
   */
  java.lang.String getServiceName();
  /**
   * <pre>
   * Service name.
   * </pre>
   *
   * <code>optional string serviceName = 2;</code>
   * @return The bytes for serviceName.
   */
  com.google.protobuf.ByteString
      getServiceNameBytes();

  /**
   * <pre>
   *intervals for time of flight calculation
   * </pre>
   *
   * <code>repeated .yamcs.protobuf.tco.TofInterval intervals = 3;</code>
   */
  java.util.List<org.yamcs.protobuf.TofInterval> 
      getIntervalsList();
  /**
   * <pre>
   *intervals for time of flight calculation
   * </pre>
   *
   * <code>repeated .yamcs.protobuf.tco.TofInterval intervals = 3;</code>
   */
  org.yamcs.protobuf.TofInterval getIntervals(int index);
  /**
   * <pre>
   *intervals for time of flight calculation
   * </pre>
   *
   * <code>repeated .yamcs.protobuf.tco.TofInterval intervals = 3;</code>
   */
  int getIntervalsCount();
  /**
   * <pre>
   *intervals for time of flight calculation
   * </pre>
   *
   * <code>repeated .yamcs.protobuf.tco.TofInterval intervals = 3;</code>
   */
  java.util.List<? extends org.yamcs.protobuf.TofIntervalOrBuilder> 
      getIntervalsOrBuilderList();
  /**
   * <pre>
   *intervals for time of flight calculation
   * </pre>
   *
   * <code>repeated .yamcs.protobuf.tco.TofInterval intervals = 3;</code>
   */
  org.yamcs.protobuf.TofIntervalOrBuilder getIntervalsOrBuilder(
      int index);
}
