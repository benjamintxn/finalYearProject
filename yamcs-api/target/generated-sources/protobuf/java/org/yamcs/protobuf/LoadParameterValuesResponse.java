// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: yamcs/protobuf/pvalue/pvalue_service.proto

package org.yamcs.protobuf;

/**
 * Protobuf type {@code yamcs.protobuf.pvalue.LoadParameterValuesResponse}
 */
public final class LoadParameterValuesResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:yamcs.protobuf.pvalue.LoadParameterValuesResponse)
    LoadParameterValuesResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use LoadParameterValuesResponse.newBuilder() to construct.
  private LoadParameterValuesResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private LoadParameterValuesResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new LoadParameterValuesResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.yamcs.protobuf.ParameterValuesServiceProto.internal_static_yamcs_protobuf_pvalue_LoadParameterValuesResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.yamcs.protobuf.ParameterValuesServiceProto.internal_static_yamcs_protobuf_pvalue_LoadParameterValuesResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.yamcs.protobuf.LoadParameterValuesResponse.class, org.yamcs.protobuf.LoadParameterValuesResponse.Builder.class);
  }

  private int bitField0_;
  public static final int VALUECOUNT_FIELD_NUMBER = 1;
  private int valueCount_;
  /**
   * <pre>
   * The number of values that were loaded
   * </pre>
   *
   * <code>optional uint32 valueCount = 1;</code>
   * @return Whether the valueCount field is set.
   */
  @java.lang.Override
  public boolean hasValueCount() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * The number of values that were loaded
   * </pre>
   *
   * <code>optional uint32 valueCount = 1;</code>
   * @return The valueCount.
   */
  @java.lang.Override
  public int getValueCount() {
    return valueCount_;
  }

  public static final int MINGENERATIONTIME_FIELD_NUMBER = 2;
  private com.google.protobuf.Timestamp minGenerationTime_;
  /**
   * <pre>
   * The earliest generation time of all received values
   * </pre>
   *
   * <code>optional .google.protobuf.Timestamp minGenerationTime = 2;</code>
   * @return Whether the minGenerationTime field is set.
   */
  @java.lang.Override
  public boolean hasMinGenerationTime() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * The earliest generation time of all received values
   * </pre>
   *
   * <code>optional .google.protobuf.Timestamp minGenerationTime = 2;</code>
   * @return The minGenerationTime.
   */
  @java.lang.Override
  public com.google.protobuf.Timestamp getMinGenerationTime() {
    return minGenerationTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : minGenerationTime_;
  }
  /**
   * <pre>
   * The earliest generation time of all received values
   * </pre>
   *
   * <code>optional .google.protobuf.Timestamp minGenerationTime = 2;</code>
   */
  @java.lang.Override
  public com.google.protobuf.TimestampOrBuilder getMinGenerationTimeOrBuilder() {
    return minGenerationTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : minGenerationTime_;
  }

  public static final int MAXGENERATIONTIME_FIELD_NUMBER = 3;
  private com.google.protobuf.Timestamp maxGenerationTime_;
  /**
   * <pre>
   * The latest generation time of all received values
   * </pre>
   *
   * <code>optional .google.protobuf.Timestamp maxGenerationTime = 3;</code>
   * @return Whether the maxGenerationTime field is set.
   */
  @java.lang.Override
  public boolean hasMaxGenerationTime() {
    return ((bitField0_ & 0x00000004) != 0);
  }
  /**
   * <pre>
   * The latest generation time of all received values
   * </pre>
   *
   * <code>optional .google.protobuf.Timestamp maxGenerationTime = 3;</code>
   * @return The maxGenerationTime.
   */
  @java.lang.Override
  public com.google.protobuf.Timestamp getMaxGenerationTime() {
    return maxGenerationTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : maxGenerationTime_;
  }
  /**
   * <pre>
   * The latest generation time of all received values
   * </pre>
   *
   * <code>optional .google.protobuf.Timestamp maxGenerationTime = 3;</code>
   */
  @java.lang.Override
  public com.google.protobuf.TimestampOrBuilder getMaxGenerationTimeOrBuilder() {
    return maxGenerationTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : maxGenerationTime_;
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
      output.writeUInt32(1, valueCount_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeMessage(2, getMinGenerationTime());
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      output.writeMessage(3, getMaxGenerationTime());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(1, valueCount_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getMinGenerationTime());
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getMaxGenerationTime());
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
    if (!(obj instanceof org.yamcs.protobuf.LoadParameterValuesResponse)) {
      return super.equals(obj);
    }
    org.yamcs.protobuf.LoadParameterValuesResponse other = (org.yamcs.protobuf.LoadParameterValuesResponse) obj;

    if (hasValueCount() != other.hasValueCount()) return false;
    if (hasValueCount()) {
      if (getValueCount()
          != other.getValueCount()) return false;
    }
    if (hasMinGenerationTime() != other.hasMinGenerationTime()) return false;
    if (hasMinGenerationTime()) {
      if (!getMinGenerationTime()
          .equals(other.getMinGenerationTime())) return false;
    }
    if (hasMaxGenerationTime() != other.hasMaxGenerationTime()) return false;
    if (hasMaxGenerationTime()) {
      if (!getMaxGenerationTime()
          .equals(other.getMaxGenerationTime())) return false;
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
    if (hasValueCount()) {
      hash = (37 * hash) + VALUECOUNT_FIELD_NUMBER;
      hash = (53 * hash) + getValueCount();
    }
    if (hasMinGenerationTime()) {
      hash = (37 * hash) + MINGENERATIONTIME_FIELD_NUMBER;
      hash = (53 * hash) + getMinGenerationTime().hashCode();
    }
    if (hasMaxGenerationTime()) {
      hash = (37 * hash) + MAXGENERATIONTIME_FIELD_NUMBER;
      hash = (53 * hash) + getMaxGenerationTime().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.yamcs.protobuf.LoadParameterValuesResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.yamcs.protobuf.LoadParameterValuesResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.yamcs.protobuf.LoadParameterValuesResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.yamcs.protobuf.LoadParameterValuesResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.yamcs.protobuf.LoadParameterValuesResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.yamcs.protobuf.LoadParameterValuesResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.yamcs.protobuf.LoadParameterValuesResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.yamcs.protobuf.LoadParameterValuesResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.yamcs.protobuf.LoadParameterValuesResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.yamcs.protobuf.LoadParameterValuesResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.yamcs.protobuf.LoadParameterValuesResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.yamcs.protobuf.LoadParameterValuesResponse parseFrom(
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
  public static Builder newBuilder(org.yamcs.protobuf.LoadParameterValuesResponse prototype) {
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
   * Protobuf type {@code yamcs.protobuf.pvalue.LoadParameterValuesResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:yamcs.protobuf.pvalue.LoadParameterValuesResponse)
      org.yamcs.protobuf.LoadParameterValuesResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.yamcs.protobuf.ParameterValuesServiceProto.internal_static_yamcs_protobuf_pvalue_LoadParameterValuesResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.yamcs.protobuf.ParameterValuesServiceProto.internal_static_yamcs_protobuf_pvalue_LoadParameterValuesResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.yamcs.protobuf.LoadParameterValuesResponse.class, org.yamcs.protobuf.LoadParameterValuesResponse.Builder.class);
    }

    // Construct using org.yamcs.protobuf.LoadParameterValuesResponse.newBuilder()
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
        getMinGenerationTimeFieldBuilder();
        getMaxGenerationTimeFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      valueCount_ = 0;
      bitField0_ = (bitField0_ & ~0x00000001);
      if (minGenerationTimeBuilder_ == null) {
        minGenerationTime_ = null;
      } else {
        minGenerationTimeBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000002);
      if (maxGenerationTimeBuilder_ == null) {
        maxGenerationTime_ = null;
      } else {
        maxGenerationTimeBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000004);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.yamcs.protobuf.ParameterValuesServiceProto.internal_static_yamcs_protobuf_pvalue_LoadParameterValuesResponse_descriptor;
    }

    @java.lang.Override
    public org.yamcs.protobuf.LoadParameterValuesResponse getDefaultInstanceForType() {
      return org.yamcs.protobuf.LoadParameterValuesResponse.getDefaultInstance();
    }

    @java.lang.Override
    public org.yamcs.protobuf.LoadParameterValuesResponse build() {
      org.yamcs.protobuf.LoadParameterValuesResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.yamcs.protobuf.LoadParameterValuesResponse buildPartial() {
      org.yamcs.protobuf.LoadParameterValuesResponse result = new org.yamcs.protobuf.LoadParameterValuesResponse(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.valueCount_ = valueCount_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        if (minGenerationTimeBuilder_ == null) {
          result.minGenerationTime_ = minGenerationTime_;
        } else {
          result.minGenerationTime_ = minGenerationTimeBuilder_.build();
        }
        to_bitField0_ |= 0x00000002;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        if (maxGenerationTimeBuilder_ == null) {
          result.maxGenerationTime_ = maxGenerationTime_;
        } else {
          result.maxGenerationTime_ = maxGenerationTimeBuilder_.build();
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
      if (other instanceof org.yamcs.protobuf.LoadParameterValuesResponse) {
        return mergeFrom((org.yamcs.protobuf.LoadParameterValuesResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.yamcs.protobuf.LoadParameterValuesResponse other) {
      if (other == org.yamcs.protobuf.LoadParameterValuesResponse.getDefaultInstance()) return this;
      if (other.hasValueCount()) {
        setValueCount(other.getValueCount());
      }
      if (other.hasMinGenerationTime()) {
        mergeMinGenerationTime(other.getMinGenerationTime());
      }
      if (other.hasMaxGenerationTime()) {
        mergeMaxGenerationTime(other.getMaxGenerationTime());
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
            case 8: {
              valueCount_ = input.readUInt32();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 18: {
              input.readMessage(
                  getMinGenerationTimeFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              input.readMessage(
                  getMaxGenerationTimeFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000004;
              break;
            } // case 26
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

    private int valueCount_ ;
    /**
     * <pre>
     * The number of values that were loaded
     * </pre>
     *
     * <code>optional uint32 valueCount = 1;</code>
     * @return Whether the valueCount field is set.
     */
    @java.lang.Override
    public boolean hasValueCount() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * The number of values that were loaded
     * </pre>
     *
     * <code>optional uint32 valueCount = 1;</code>
     * @return The valueCount.
     */
    @java.lang.Override
    public int getValueCount() {
      return valueCount_;
    }
    /**
     * <pre>
     * The number of values that were loaded
     * </pre>
     *
     * <code>optional uint32 valueCount = 1;</code>
     * @param value The valueCount to set.
     * @return This builder for chaining.
     */
    public Builder setValueCount(int value) {
      bitField0_ |= 0x00000001;
      valueCount_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The number of values that were loaded
     * </pre>
     *
     * <code>optional uint32 valueCount = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearValueCount() {
      bitField0_ = (bitField0_ & ~0x00000001);
      valueCount_ = 0;
      onChanged();
      return this;
    }

    private com.google.protobuf.Timestamp minGenerationTime_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> minGenerationTimeBuilder_;
    /**
     * <pre>
     * The earliest generation time of all received values
     * </pre>
     *
     * <code>optional .google.protobuf.Timestamp minGenerationTime = 2;</code>
     * @return Whether the minGenerationTime field is set.
     */
    public boolean hasMinGenerationTime() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * The earliest generation time of all received values
     * </pre>
     *
     * <code>optional .google.protobuf.Timestamp minGenerationTime = 2;</code>
     * @return The minGenerationTime.
     */
    public com.google.protobuf.Timestamp getMinGenerationTime() {
      if (minGenerationTimeBuilder_ == null) {
        return minGenerationTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : minGenerationTime_;
      } else {
        return minGenerationTimeBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The earliest generation time of all received values
     * </pre>
     *
     * <code>optional .google.protobuf.Timestamp minGenerationTime = 2;</code>
     */
    public Builder setMinGenerationTime(com.google.protobuf.Timestamp value) {
      if (minGenerationTimeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        minGenerationTime_ = value;
        onChanged();
      } else {
        minGenerationTimeBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      return this;
    }
    /**
     * <pre>
     * The earliest generation time of all received values
     * </pre>
     *
     * <code>optional .google.protobuf.Timestamp minGenerationTime = 2;</code>
     */
    public Builder setMinGenerationTime(
        com.google.protobuf.Timestamp.Builder builderForValue) {
      if (minGenerationTimeBuilder_ == null) {
        minGenerationTime_ = builderForValue.build();
        onChanged();
      } else {
        minGenerationTimeBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      return this;
    }
    /**
     * <pre>
     * The earliest generation time of all received values
     * </pre>
     *
     * <code>optional .google.protobuf.Timestamp minGenerationTime = 2;</code>
     */
    public Builder mergeMinGenerationTime(com.google.protobuf.Timestamp value) {
      if (minGenerationTimeBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
            minGenerationTime_ != null &&
            minGenerationTime_ != com.google.protobuf.Timestamp.getDefaultInstance()) {
          minGenerationTime_ =
            com.google.protobuf.Timestamp.newBuilder(minGenerationTime_).mergeFrom(value).buildPartial();
        } else {
          minGenerationTime_ = value;
        }
        onChanged();
      } else {
        minGenerationTimeBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      return this;
    }
    /**
     * <pre>
     * The earliest generation time of all received values
     * </pre>
     *
     * <code>optional .google.protobuf.Timestamp minGenerationTime = 2;</code>
     */
    public Builder clearMinGenerationTime() {
      if (minGenerationTimeBuilder_ == null) {
        minGenerationTime_ = null;
        onChanged();
      } else {
        minGenerationTimeBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }
    /**
     * <pre>
     * The earliest generation time of all received values
     * </pre>
     *
     * <code>optional .google.protobuf.Timestamp minGenerationTime = 2;</code>
     */
    public com.google.protobuf.Timestamp.Builder getMinGenerationTimeBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getMinGenerationTimeFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The earliest generation time of all received values
     * </pre>
     *
     * <code>optional .google.protobuf.Timestamp minGenerationTime = 2;</code>
     */
    public com.google.protobuf.TimestampOrBuilder getMinGenerationTimeOrBuilder() {
      if (minGenerationTimeBuilder_ != null) {
        return minGenerationTimeBuilder_.getMessageOrBuilder();
      } else {
        return minGenerationTime_ == null ?
            com.google.protobuf.Timestamp.getDefaultInstance() : minGenerationTime_;
      }
    }
    /**
     * <pre>
     * The earliest generation time of all received values
     * </pre>
     *
     * <code>optional .google.protobuf.Timestamp minGenerationTime = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> 
        getMinGenerationTimeFieldBuilder() {
      if (minGenerationTimeBuilder_ == null) {
        minGenerationTimeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder>(
                getMinGenerationTime(),
                getParentForChildren(),
                isClean());
        minGenerationTime_ = null;
      }
      return minGenerationTimeBuilder_;
    }

    private com.google.protobuf.Timestamp maxGenerationTime_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> maxGenerationTimeBuilder_;
    /**
     * <pre>
     * The latest generation time of all received values
     * </pre>
     *
     * <code>optional .google.protobuf.Timestamp maxGenerationTime = 3;</code>
     * @return Whether the maxGenerationTime field is set.
     */
    public boolean hasMaxGenerationTime() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * The latest generation time of all received values
     * </pre>
     *
     * <code>optional .google.protobuf.Timestamp maxGenerationTime = 3;</code>
     * @return The maxGenerationTime.
     */
    public com.google.protobuf.Timestamp getMaxGenerationTime() {
      if (maxGenerationTimeBuilder_ == null) {
        return maxGenerationTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : maxGenerationTime_;
      } else {
        return maxGenerationTimeBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The latest generation time of all received values
     * </pre>
     *
     * <code>optional .google.protobuf.Timestamp maxGenerationTime = 3;</code>
     */
    public Builder setMaxGenerationTime(com.google.protobuf.Timestamp value) {
      if (maxGenerationTimeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        maxGenerationTime_ = value;
        onChanged();
      } else {
        maxGenerationTimeBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      return this;
    }
    /**
     * <pre>
     * The latest generation time of all received values
     * </pre>
     *
     * <code>optional .google.protobuf.Timestamp maxGenerationTime = 3;</code>
     */
    public Builder setMaxGenerationTime(
        com.google.protobuf.Timestamp.Builder builderForValue) {
      if (maxGenerationTimeBuilder_ == null) {
        maxGenerationTime_ = builderForValue.build();
        onChanged();
      } else {
        maxGenerationTimeBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      return this;
    }
    /**
     * <pre>
     * The latest generation time of all received values
     * </pre>
     *
     * <code>optional .google.protobuf.Timestamp maxGenerationTime = 3;</code>
     */
    public Builder mergeMaxGenerationTime(com.google.protobuf.Timestamp value) {
      if (maxGenerationTimeBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0) &&
            maxGenerationTime_ != null &&
            maxGenerationTime_ != com.google.protobuf.Timestamp.getDefaultInstance()) {
          maxGenerationTime_ =
            com.google.protobuf.Timestamp.newBuilder(maxGenerationTime_).mergeFrom(value).buildPartial();
        } else {
          maxGenerationTime_ = value;
        }
        onChanged();
      } else {
        maxGenerationTimeBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000004;
      return this;
    }
    /**
     * <pre>
     * The latest generation time of all received values
     * </pre>
     *
     * <code>optional .google.protobuf.Timestamp maxGenerationTime = 3;</code>
     */
    public Builder clearMaxGenerationTime() {
      if (maxGenerationTimeBuilder_ == null) {
        maxGenerationTime_ = null;
        onChanged();
      } else {
        maxGenerationTimeBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000004);
      return this;
    }
    /**
     * <pre>
     * The latest generation time of all received values
     * </pre>
     *
     * <code>optional .google.protobuf.Timestamp maxGenerationTime = 3;</code>
     */
    public com.google.protobuf.Timestamp.Builder getMaxGenerationTimeBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getMaxGenerationTimeFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The latest generation time of all received values
     * </pre>
     *
     * <code>optional .google.protobuf.Timestamp maxGenerationTime = 3;</code>
     */
    public com.google.protobuf.TimestampOrBuilder getMaxGenerationTimeOrBuilder() {
      if (maxGenerationTimeBuilder_ != null) {
        return maxGenerationTimeBuilder_.getMessageOrBuilder();
      } else {
        return maxGenerationTime_ == null ?
            com.google.protobuf.Timestamp.getDefaultInstance() : maxGenerationTime_;
      }
    }
    /**
     * <pre>
     * The latest generation time of all received values
     * </pre>
     *
     * <code>optional .google.protobuf.Timestamp maxGenerationTime = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> 
        getMaxGenerationTimeFieldBuilder() {
      if (maxGenerationTimeBuilder_ == null) {
        maxGenerationTimeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder>(
                getMaxGenerationTime(),
                getParentForChildren(),
                isClean());
        maxGenerationTime_ = null;
      }
      return maxGenerationTimeBuilder_;
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


    // @@protoc_insertion_point(builder_scope:yamcs.protobuf.pvalue.LoadParameterValuesResponse)
  }

  // @@protoc_insertion_point(class_scope:yamcs.protobuf.pvalue.LoadParameterValuesResponse)
  private static final org.yamcs.protobuf.LoadParameterValuesResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.yamcs.protobuf.LoadParameterValuesResponse();
  }

  public static org.yamcs.protobuf.LoadParameterValuesResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<LoadParameterValuesResponse>
      PARSER = new com.google.protobuf.AbstractParser<LoadParameterValuesResponse>() {
    @java.lang.Override
    public LoadParameterValuesResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<LoadParameterValuesResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LoadParameterValuesResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.yamcs.protobuf.LoadParameterValuesResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

