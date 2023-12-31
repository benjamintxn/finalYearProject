// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: yamcs/protobuf/alarms/alarms.proto

package org.yamcs.protobuf;

/**
 * Protobuf type {@code yamcs.protobuf.alarms.AcknowledgeInfo}
 */
public final class AcknowledgeInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:yamcs.protobuf.alarms.AcknowledgeInfo)
    AcknowledgeInfoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AcknowledgeInfo.newBuilder() to construct.
  private AcknowledgeInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AcknowledgeInfo() {
    acknowledgedBy_ = "";
    acknowledgeMessage_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AcknowledgeInfo();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.yamcs.protobuf.AlarmsProto.internal_static_yamcs_protobuf_alarms_AcknowledgeInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.yamcs.protobuf.AlarmsProto.internal_static_yamcs_protobuf_alarms_AcknowledgeInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.yamcs.protobuf.AcknowledgeInfo.class, org.yamcs.protobuf.AcknowledgeInfo.Builder.class);
  }

  private int bitField0_;
  public static final int ACKNOWLEDGEDBY_FIELD_NUMBER = 1;
  private volatile java.lang.Object acknowledgedBy_;
  /**
   * <code>optional string acknowledgedBy = 1;</code>
   * @return Whether the acknowledgedBy field is set.
   */
  @java.lang.Override
  public boolean hasAcknowledgedBy() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>optional string acknowledgedBy = 1;</code>
   * @return The acknowledgedBy.
   */
  @java.lang.Override
  public java.lang.String getAcknowledgedBy() {
    java.lang.Object ref = acknowledgedBy_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (bs.isValidUtf8()) {
        acknowledgedBy_ = s;
      }
      return s;
    }
  }
  /**
   * <code>optional string acknowledgedBy = 1;</code>
   * @return The bytes for acknowledgedBy.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getAcknowledgedByBytes() {
    java.lang.Object ref = acknowledgedBy_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      acknowledgedBy_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ACKNOWLEDGEMESSAGE_FIELD_NUMBER = 2;
  private volatile java.lang.Object acknowledgeMessage_;
  /**
   * <code>optional string acknowledgeMessage = 2;</code>
   * @return Whether the acknowledgeMessage field is set.
   */
  @java.lang.Override
  public boolean hasAcknowledgeMessage() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <code>optional string acknowledgeMessage = 2;</code>
   * @return The acknowledgeMessage.
   */
  @java.lang.Override
  public java.lang.String getAcknowledgeMessage() {
    java.lang.Object ref = acknowledgeMessage_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (bs.isValidUtf8()) {
        acknowledgeMessage_ = s;
      }
      return s;
    }
  }
  /**
   * <code>optional string acknowledgeMessage = 2;</code>
   * @return The bytes for acknowledgeMessage.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getAcknowledgeMessageBytes() {
    java.lang.Object ref = acknowledgeMessage_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      acknowledgeMessage_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ACKNOWLEDGETIME_FIELD_NUMBER = 5;
  private com.google.protobuf.Timestamp acknowledgeTime_;
  /**
   * <code>optional .google.protobuf.Timestamp acknowledgeTime = 5;</code>
   * @return Whether the acknowledgeTime field is set.
   */
  @java.lang.Override
  public boolean hasAcknowledgeTime() {
    return ((bitField0_ & 0x00000004) != 0);
  }
  /**
   * <code>optional .google.protobuf.Timestamp acknowledgeTime = 5;</code>
   * @return The acknowledgeTime.
   */
  @java.lang.Override
  public com.google.protobuf.Timestamp getAcknowledgeTime() {
    return acknowledgeTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : acknowledgeTime_;
  }
  /**
   * <code>optional .google.protobuf.Timestamp acknowledgeTime = 5;</code>
   */
  @java.lang.Override
  public com.google.protobuf.TimestampOrBuilder getAcknowledgeTimeOrBuilder() {
    return acknowledgeTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : acknowledgeTime_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (((bitField0_ & 0x00000001) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, acknowledgedBy_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, acknowledgeMessage_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      output.writeMessage(5, getAcknowledgeTime());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, acknowledgedBy_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, acknowledgeMessage_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(5, getAcknowledgeTime());
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof org.yamcs.protobuf.AcknowledgeInfo)) {
      return super.equals(obj);
    }
    org.yamcs.protobuf.AcknowledgeInfo other = (org.yamcs.protobuf.AcknowledgeInfo) obj;

    if (hasAcknowledgedBy() != other.hasAcknowledgedBy()) return false;
    if (hasAcknowledgedBy()) {
      if (!getAcknowledgedBy()
          .equals(other.getAcknowledgedBy())) return false;
    }
    if (hasAcknowledgeMessage() != other.hasAcknowledgeMessage()) return false;
    if (hasAcknowledgeMessage()) {
      if (!getAcknowledgeMessage()
          .equals(other.getAcknowledgeMessage())) return false;
    }
    if (hasAcknowledgeTime() != other.hasAcknowledgeTime()) return false;
    if (hasAcknowledgeTime()) {
      if (!getAcknowledgeTime()
          .equals(other.getAcknowledgeTime())) return false;
    }
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasAcknowledgedBy()) {
      hash = (37 * hash) + ACKNOWLEDGEDBY_FIELD_NUMBER;
      hash = (53 * hash) + getAcknowledgedBy().hashCode();
    }
    if (hasAcknowledgeMessage()) {
      hash = (37 * hash) + ACKNOWLEDGEMESSAGE_FIELD_NUMBER;
      hash = (53 * hash) + getAcknowledgeMessage().hashCode();
    }
    if (hasAcknowledgeTime()) {
      hash = (37 * hash) + ACKNOWLEDGETIME_FIELD_NUMBER;
      hash = (53 * hash) + getAcknowledgeTime().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.yamcs.protobuf.AcknowledgeInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.yamcs.protobuf.AcknowledgeInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.yamcs.protobuf.AcknowledgeInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.yamcs.protobuf.AcknowledgeInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.yamcs.protobuf.AcknowledgeInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.yamcs.protobuf.AcknowledgeInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.yamcs.protobuf.AcknowledgeInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.yamcs.protobuf.AcknowledgeInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.yamcs.protobuf.AcknowledgeInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.yamcs.protobuf.AcknowledgeInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.yamcs.protobuf.AcknowledgeInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.yamcs.protobuf.AcknowledgeInfo parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(org.yamcs.protobuf.AcknowledgeInfo prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code yamcs.protobuf.alarms.AcknowledgeInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:yamcs.protobuf.alarms.AcknowledgeInfo)
      org.yamcs.protobuf.AcknowledgeInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.yamcs.protobuf.AlarmsProto.internal_static_yamcs_protobuf_alarms_AcknowledgeInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.yamcs.protobuf.AlarmsProto.internal_static_yamcs_protobuf_alarms_AcknowledgeInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.yamcs.protobuf.AcknowledgeInfo.class, org.yamcs.protobuf.AcknowledgeInfo.Builder.class);
    }

    // Construct using org.yamcs.protobuf.AcknowledgeInfo.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getAcknowledgeTimeFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      acknowledgedBy_ = "";
      bitField0_ = (bitField0_ & ~0x00000001);
      acknowledgeMessage_ = "";
      bitField0_ = (bitField0_ & ~0x00000002);
      if (acknowledgeTimeBuilder_ == null) {
        acknowledgeTime_ = null;
      } else {
        acknowledgeTimeBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000004);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.yamcs.protobuf.AlarmsProto.internal_static_yamcs_protobuf_alarms_AcknowledgeInfo_descriptor;
    }

    @java.lang.Override
    public org.yamcs.protobuf.AcknowledgeInfo getDefaultInstanceForType() {
      return org.yamcs.protobuf.AcknowledgeInfo.getDefaultInstance();
    }

    @java.lang.Override
    public org.yamcs.protobuf.AcknowledgeInfo build() {
      org.yamcs.protobuf.AcknowledgeInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.yamcs.protobuf.AcknowledgeInfo buildPartial() {
      org.yamcs.protobuf.AcknowledgeInfo result = new org.yamcs.protobuf.AcknowledgeInfo(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        to_bitField0_ |= 0x00000001;
      }
      result.acknowledgedBy_ = acknowledgedBy_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        to_bitField0_ |= 0x00000002;
      }
      result.acknowledgeMessage_ = acknowledgeMessage_;
      if (((from_bitField0_ & 0x00000004) != 0)) {
        if (acknowledgeTimeBuilder_ == null) {
          result.acknowledgeTime_ = acknowledgeTime_;
        } else {
          result.acknowledgeTime_ = acknowledgeTimeBuilder_.build();
        }
        to_bitField0_ |= 0x00000004;
      }
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof org.yamcs.protobuf.AcknowledgeInfo) {
        return mergeFrom((org.yamcs.protobuf.AcknowledgeInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.yamcs.protobuf.AcknowledgeInfo other) {
      if (other == org.yamcs.protobuf.AcknowledgeInfo.getDefaultInstance()) return this;
      if (other.hasAcknowledgedBy()) {
        bitField0_ |= 0x00000001;
        acknowledgedBy_ = other.acknowledgedBy_;
        onChanged();
      }
      if (other.hasAcknowledgeMessage()) {
        bitField0_ |= 0x00000002;
        acknowledgeMessage_ = other.acknowledgeMessage_;
        onChanged();
      }
      if (other.hasAcknowledgeTime()) {
        mergeAcknowledgeTime(other.getAcknowledgeTime());
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              acknowledgedBy_ = input.readBytes();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              acknowledgeMessage_ = input.readBytes();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 42: {
              input.readMessage(
                  getAcknowledgeTimeFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000004;
              break;
            } // case 42
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private java.lang.Object acknowledgedBy_ = "";
    /**
     * <code>optional string acknowledgedBy = 1;</code>
     * @return Whether the acknowledgedBy field is set.
     */
    public boolean hasAcknowledgedBy() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional string acknowledgedBy = 1;</code>
     * @return The acknowledgedBy.
     */
    public java.lang.String getAcknowledgedBy() {
      java.lang.Object ref = acknowledgedBy_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          acknowledgedBy_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string acknowledgedBy = 1;</code>
     * @return The bytes for acknowledgedBy.
     */
    public com.google.protobuf.ByteString
        getAcknowledgedByBytes() {
      java.lang.Object ref = acknowledgedBy_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        acknowledgedBy_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string acknowledgedBy = 1;</code>
     * @param value The acknowledgedBy to set.
     * @return This builder for chaining.
     */
    public Builder setAcknowledgedBy(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
      acknowledgedBy_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string acknowledgedBy = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearAcknowledgedBy() {
      bitField0_ = (bitField0_ & ~0x00000001);
      acknowledgedBy_ = getDefaultInstance().getAcknowledgedBy();
      onChanged();
      return this;
    }
    /**
     * <code>optional string acknowledgedBy = 1;</code>
     * @param value The bytes for acknowledgedBy to set.
     * @return This builder for chaining.
     */
    public Builder setAcknowledgedByBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
      acknowledgedBy_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object acknowledgeMessage_ = "";
    /**
     * <code>optional string acknowledgeMessage = 2;</code>
     * @return Whether the acknowledgeMessage field is set.
     */
    public boolean hasAcknowledgeMessage() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>optional string acknowledgeMessage = 2;</code>
     * @return The acknowledgeMessage.
     */
    public java.lang.String getAcknowledgeMessage() {
      java.lang.Object ref = acknowledgeMessage_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          acknowledgeMessage_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string acknowledgeMessage = 2;</code>
     * @return The bytes for acknowledgeMessage.
     */
    public com.google.protobuf.ByteString
        getAcknowledgeMessageBytes() {
      java.lang.Object ref = acknowledgeMessage_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        acknowledgeMessage_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string acknowledgeMessage = 2;</code>
     * @param value The acknowledgeMessage to set.
     * @return This builder for chaining.
     */
    public Builder setAcknowledgeMessage(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
      acknowledgeMessage_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string acknowledgeMessage = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearAcknowledgeMessage() {
      bitField0_ = (bitField0_ & ~0x00000002);
      acknowledgeMessage_ = getDefaultInstance().getAcknowledgeMessage();
      onChanged();
      return this;
    }
    /**
     * <code>optional string acknowledgeMessage = 2;</code>
     * @param value The bytes for acknowledgeMessage to set.
     * @return This builder for chaining.
     */
    public Builder setAcknowledgeMessageBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
      acknowledgeMessage_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.Timestamp acknowledgeTime_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> acknowledgeTimeBuilder_;
    /**
     * <code>optional .google.protobuf.Timestamp acknowledgeTime = 5;</code>
     * @return Whether the acknowledgeTime field is set.
     */
    public boolean hasAcknowledgeTime() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>optional .google.protobuf.Timestamp acknowledgeTime = 5;</code>
     * @return The acknowledgeTime.
     */
    public com.google.protobuf.Timestamp getAcknowledgeTime() {
      if (acknowledgeTimeBuilder_ == null) {
        return acknowledgeTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : acknowledgeTime_;
      } else {
        return acknowledgeTimeBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .google.protobuf.Timestamp acknowledgeTime = 5;</code>
     */
    public Builder setAcknowledgeTime(com.google.protobuf.Timestamp value) {
      if (acknowledgeTimeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        acknowledgeTime_ = value;
        onChanged();
      } else {
        acknowledgeTimeBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      return this;
    }
    /**
     * <code>optional .google.protobuf.Timestamp acknowledgeTime = 5;</code>
     */
    public Builder setAcknowledgeTime(
        com.google.protobuf.Timestamp.Builder builderForValue) {
      if (acknowledgeTimeBuilder_ == null) {
        acknowledgeTime_ = builderForValue.build();
        onChanged();
      } else {
        acknowledgeTimeBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      return this;
    }
    /**
     * <code>optional .google.protobuf.Timestamp acknowledgeTime = 5;</code>
     */
    public Builder mergeAcknowledgeTime(com.google.protobuf.Timestamp value) {
      if (acknowledgeTimeBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0) &&
            acknowledgeTime_ != null &&
            acknowledgeTime_ != com.google.protobuf.Timestamp.getDefaultInstance()) {
          acknowledgeTime_ =
            com.google.protobuf.Timestamp.newBuilder(acknowledgeTime_).mergeFrom(value).buildPartial();
        } else {
          acknowledgeTime_ = value;
        }
        onChanged();
      } else {
        acknowledgeTimeBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000004;
      return this;
    }
    /**
     * <code>optional .google.protobuf.Timestamp acknowledgeTime = 5;</code>
     */
    public Builder clearAcknowledgeTime() {
      if (acknowledgeTimeBuilder_ == null) {
        acknowledgeTime_ = null;
        onChanged();
      } else {
        acknowledgeTimeBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000004);
      return this;
    }
    /**
     * <code>optional .google.protobuf.Timestamp acknowledgeTime = 5;</code>
     */
    public com.google.protobuf.Timestamp.Builder getAcknowledgeTimeBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getAcknowledgeTimeFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .google.protobuf.Timestamp acknowledgeTime = 5;</code>
     */
    public com.google.protobuf.TimestampOrBuilder getAcknowledgeTimeOrBuilder() {
      if (acknowledgeTimeBuilder_ != null) {
        return acknowledgeTimeBuilder_.getMessageOrBuilder();
      } else {
        return acknowledgeTime_ == null ?
            com.google.protobuf.Timestamp.getDefaultInstance() : acknowledgeTime_;
      }
    }
    /**
     * <code>optional .google.protobuf.Timestamp acknowledgeTime = 5;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> 
        getAcknowledgeTimeFieldBuilder() {
      if (acknowledgeTimeBuilder_ == null) {
        acknowledgeTimeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder>(
                getAcknowledgeTime(),
                getParentForChildren(),
                isClean());
        acknowledgeTime_ = null;
      }
      return acknowledgeTimeBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:yamcs.protobuf.alarms.AcknowledgeInfo)
  }

  // @@protoc_insertion_point(class_scope:yamcs.protobuf.alarms.AcknowledgeInfo)
  private static final org.yamcs.protobuf.AcknowledgeInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.yamcs.protobuf.AcknowledgeInfo();
  }

  public static org.yamcs.protobuf.AcknowledgeInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<AcknowledgeInfo>
      PARSER = new com.google.protobuf.AbstractParser<AcknowledgeInfo>() {
    @java.lang.Override
    public AcknowledgeInfo parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<AcknowledgeInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AcknowledgeInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.yamcs.protobuf.AcknowledgeInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

