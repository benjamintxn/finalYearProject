// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: yamcs/protobuf/cop1/cop1.proto

package org.yamcs.protobuf;

/**
 * Protobuf enum {@code yamcs.protobuf.cop1.TimeoutType}
 */
public enum TimeoutType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>UNINITIALIZE = 0;</code>
   */
  UNINITIALIZE(0),
  /**
   * <code>SUSPEND = 1;</code>
   */
  SUSPEND(1),
  ;

  /**
   * <code>UNINITIALIZE = 0;</code>
   */
  public static final int UNINITIALIZE_VALUE = 0;
  /**
   * <code>SUSPEND = 1;</code>
   */
  public static final int SUSPEND_VALUE = 1;


  public final int getNumber() {
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static TimeoutType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static TimeoutType forNumber(int value) {
    switch (value) {
      case 0: return UNINITIALIZE;
      case 1: return SUSPEND;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<TimeoutType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      TimeoutType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<TimeoutType>() {
          public TimeoutType findValueByNumber(int number) {
            return TimeoutType.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return org.yamcs.protobuf.Cop1Proto.getDescriptor().getEnumTypes().get(2);
  }

  private static final TimeoutType[] VALUES = values();

  public static TimeoutType valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private TimeoutType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:yamcs.protobuf.cop1.TimeoutType)
}

