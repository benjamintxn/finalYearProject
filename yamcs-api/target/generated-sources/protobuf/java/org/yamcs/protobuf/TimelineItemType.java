// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: yamcs/protobuf/timeline/timeline.proto

package org.yamcs.protobuf;

/**
 * Protobuf enum {@code yamcs.protobuf.timeline.TimelineItemType}
 */
public enum TimelineItemType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   *events are the most generic timeline items.
   * </pre>
   *
   * <code>EVENT = 1;</code>
   */
  EVENT(1),
  /**
   * <pre>
   *unlike events, activities have an execution status
   *manual activity's execution status is controlled by an operator
   * </pre>
   *
   * <code>MANUAL_ACTIVITY = 2;</code>
   */
  MANUAL_ACTIVITY(2),
  /**
   * <pre>
   *activity which is automatically executed on the server (the status changes automatically)
   * </pre>
   *
   * <code>AUTO_ACTIVITY = 3;</code>
   */
  AUTO_ACTIVITY(3),
  /**
   * <pre>
   *a grouping of other items (events and/or activities)
   * </pre>
   *
   * <code>ITEM_GROUP = 4;</code>
   */
  ITEM_GROUP(4),
  /**
   * <pre>
   *a grouping of activities - unlike the ITEM_GROUP, this group in itself is an automated activity
   * </pre>
   *
   * <code>ACTIVITY_GROUP = 5;</code>
   */
  ACTIVITY_GROUP(5),
  ;

  /**
   * <pre>
   *events are the most generic timeline items.
   * </pre>
   *
   * <code>EVENT = 1;</code>
   */
  public static final int EVENT_VALUE = 1;
  /**
   * <pre>
   *unlike events, activities have an execution status
   *manual activity's execution status is controlled by an operator
   * </pre>
   *
   * <code>MANUAL_ACTIVITY = 2;</code>
   */
  public static final int MANUAL_ACTIVITY_VALUE = 2;
  /**
   * <pre>
   *activity which is automatically executed on the server (the status changes automatically)
   * </pre>
   *
   * <code>AUTO_ACTIVITY = 3;</code>
   */
  public static final int AUTO_ACTIVITY_VALUE = 3;
  /**
   * <pre>
   *a grouping of other items (events and/or activities)
   * </pre>
   *
   * <code>ITEM_GROUP = 4;</code>
   */
  public static final int ITEM_GROUP_VALUE = 4;
  /**
   * <pre>
   *a grouping of activities - unlike the ITEM_GROUP, this group in itself is an automated activity
   * </pre>
   *
   * <code>ACTIVITY_GROUP = 5;</code>
   */
  public static final int ACTIVITY_GROUP_VALUE = 5;


  public final int getNumber() {
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static TimelineItemType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static TimelineItemType forNumber(int value) {
    switch (value) {
      case 1: return EVENT;
      case 2: return MANUAL_ACTIVITY;
      case 3: return AUTO_ACTIVITY;
      case 4: return ITEM_GROUP;
      case 5: return ACTIVITY_GROUP;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<TimelineItemType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      TimelineItemType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<TimelineItemType>() {
          public TimelineItemType findValueByNumber(int number) {
            return TimelineItemType.forNumber(number);
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
    return org.yamcs.protobuf.TimelineProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final TimelineItemType[] VALUES = values();

  public static TimelineItemType valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private TimelineItemType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:yamcs.protobuf.timeline.TimelineItemType)
}

