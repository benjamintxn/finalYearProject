// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: yamcs/protobuf/processing/mdb_override_service.proto

package org.yamcs.protobuf;

public interface MdbOverrideInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:yamcs.protobuf.processing.MdbOverrideInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional .yamcs.protobuf.processing.MdbOverrideInfo.OverrideType type = 1;</code>
   * @return Whether the type field is set.
   */
  boolean hasType();
  /**
   * <code>optional .yamcs.protobuf.processing.MdbOverrideInfo.OverrideType type = 1;</code>
   * @return The type.
   */
  org.yamcs.protobuf.MdbOverrideInfo.OverrideType getType();

  /**
   * <code>optional .yamcs.protobuf.processing.AlgorithmTextOverride algorithmTextOverride = 2;</code>
   * @return Whether the algorithmTextOverride field is set.
   */
  boolean hasAlgorithmTextOverride();
  /**
   * <code>optional .yamcs.protobuf.processing.AlgorithmTextOverride algorithmTextOverride = 2;</code>
   * @return The algorithmTextOverride.
   */
  org.yamcs.protobuf.AlgorithmTextOverride getAlgorithmTextOverride();
  /**
   * <code>optional .yamcs.protobuf.processing.AlgorithmTextOverride algorithmTextOverride = 2;</code>
   */
  org.yamcs.protobuf.AlgorithmTextOverrideOrBuilder getAlgorithmTextOverrideOrBuilder();

  /**
   * <code>optional .yamcs.protobuf.processing.ParameterOverride parameterOverride = 3;</code>
   * @return Whether the parameterOverride field is set.
   */
  boolean hasParameterOverride();
  /**
   * <code>optional .yamcs.protobuf.processing.ParameterOverride parameterOverride = 3;</code>
   * @return The parameterOverride.
   */
  org.yamcs.protobuf.ParameterOverride getParameterOverride();
  /**
   * <code>optional .yamcs.protobuf.processing.ParameterOverride parameterOverride = 3;</code>
   */
  org.yamcs.protobuf.ParameterOverrideOrBuilder getParameterOverrideOrBuilder();
}
