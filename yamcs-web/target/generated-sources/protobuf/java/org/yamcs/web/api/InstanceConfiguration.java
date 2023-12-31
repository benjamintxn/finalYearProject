// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: yamcs/protobuf/web/web.proto

package org.yamcs.web.api;

/**
 * Protobuf type {@code yamcs.protobuf.web.InstanceConfiguration}
 */
public final class InstanceConfiguration extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:yamcs.protobuf.web.InstanceConfiguration)
    InstanceConfigurationOrBuilder {
private static final long serialVersionUID = 0L;
  // Use InstanceConfiguration.newBuilder() to construct.
  private InstanceConfiguration(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private InstanceConfiguration() {
    displayBucket_ = "";
    stackBucket_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new InstanceConfiguration();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.yamcs.web.api.WebProto.internal_static_yamcs_protobuf_web_InstanceConfiguration_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.yamcs.web.api.WebProto.internal_static_yamcs_protobuf_web_InstanceConfiguration_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.yamcs.web.api.InstanceConfiguration.class, org.yamcs.web.api.InstanceConfiguration.Builder.class);
  }

  private int bitField0_;
  public static final int DISPLAYBUCKET_FIELD_NUMBER = 1;
  private volatile java.lang.Object displayBucket_;
  /**
   * <pre>
   * Bucket where to find display resources
   * </pre>
   *
   * <code>optional string displayBucket = 1;</code>
   * @return Whether the displayBucket field is set.
   */
  @java.lang.Override
  public boolean hasDisplayBucket() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * Bucket where to find display resources
   * </pre>
   *
   * <code>optional string displayBucket = 1;</code>
   * @return The displayBucket.
   */
  @java.lang.Override
  public java.lang.String getDisplayBucket() {
    java.lang.Object ref = displayBucket_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (bs.isValidUtf8()) {
        displayBucket_ = s;
      }
      return s;
    }
  }
  /**
   * <pre>
   * Bucket where to find display resources
   * </pre>
   *
   * <code>optional string displayBucket = 1;</code>
   * @return The bytes for displayBucket.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDisplayBucketBytes() {
    java.lang.Object ref = displayBucket_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      displayBucket_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int STACKBUCKET_FIELD_NUMBER = 2;
  private volatile java.lang.Object stackBucket_;
  /**
   * <pre>
   * Bucket where to find stacks
   * </pre>
   *
   * <code>optional string stackBucket = 2;</code>
   * @return Whether the stackBucket field is set.
   */
  @java.lang.Override
  public boolean hasStackBucket() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * Bucket where to find stacks
   * </pre>
   *
   * <code>optional string stackBucket = 2;</code>
   * @return The stackBucket.
   */
  @java.lang.Override
  public java.lang.String getStackBucket() {
    java.lang.Object ref = stackBucket_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (bs.isValidUtf8()) {
        stackBucket_ = s;
      }
      return s;
    }
  }
  /**
   * <pre>
   * Bucket where to find stacks
   * </pre>
   *
   * <code>optional string stackBucket = 2;</code>
   * @return The bytes for stackBucket.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getStackBucketBytes() {
    java.lang.Object ref = stackBucket_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      stackBucket_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, displayBucket_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, stackBucket_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, displayBucket_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, stackBucket_);
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
    if (!(obj instanceof org.yamcs.web.api.InstanceConfiguration)) {
      return super.equals(obj);
    }
    org.yamcs.web.api.InstanceConfiguration other = (org.yamcs.web.api.InstanceConfiguration) obj;

    if (hasDisplayBucket() != other.hasDisplayBucket()) return false;
    if (hasDisplayBucket()) {
      if (!getDisplayBucket()
          .equals(other.getDisplayBucket())) return false;
    }
    if (hasStackBucket() != other.hasStackBucket()) return false;
    if (hasStackBucket()) {
      if (!getStackBucket()
          .equals(other.getStackBucket())) return false;
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
    if (hasDisplayBucket()) {
      hash = (37 * hash) + DISPLAYBUCKET_FIELD_NUMBER;
      hash = (53 * hash) + getDisplayBucket().hashCode();
    }
    if (hasStackBucket()) {
      hash = (37 * hash) + STACKBUCKET_FIELD_NUMBER;
      hash = (53 * hash) + getStackBucket().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.yamcs.web.api.InstanceConfiguration parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.yamcs.web.api.InstanceConfiguration parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.yamcs.web.api.InstanceConfiguration parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.yamcs.web.api.InstanceConfiguration parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.yamcs.web.api.InstanceConfiguration parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.yamcs.web.api.InstanceConfiguration parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.yamcs.web.api.InstanceConfiguration parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.yamcs.web.api.InstanceConfiguration parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.yamcs.web.api.InstanceConfiguration parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.yamcs.web.api.InstanceConfiguration parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.yamcs.web.api.InstanceConfiguration parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.yamcs.web.api.InstanceConfiguration parseFrom(
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
  public static Builder newBuilder(org.yamcs.web.api.InstanceConfiguration prototype) {
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
   * Protobuf type {@code yamcs.protobuf.web.InstanceConfiguration}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:yamcs.protobuf.web.InstanceConfiguration)
      org.yamcs.web.api.InstanceConfigurationOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.yamcs.web.api.WebProto.internal_static_yamcs_protobuf_web_InstanceConfiguration_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.yamcs.web.api.WebProto.internal_static_yamcs_protobuf_web_InstanceConfiguration_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.yamcs.web.api.InstanceConfiguration.class, org.yamcs.web.api.InstanceConfiguration.Builder.class);
    }

    // Construct using org.yamcs.web.api.InstanceConfiguration.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      displayBucket_ = "";
      bitField0_ = (bitField0_ & ~0x00000001);
      stackBucket_ = "";
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.yamcs.web.api.WebProto.internal_static_yamcs_protobuf_web_InstanceConfiguration_descriptor;
    }

    @java.lang.Override
    public org.yamcs.web.api.InstanceConfiguration getDefaultInstanceForType() {
      return org.yamcs.web.api.InstanceConfiguration.getDefaultInstance();
    }

    @java.lang.Override
    public org.yamcs.web.api.InstanceConfiguration build() {
      org.yamcs.web.api.InstanceConfiguration result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.yamcs.web.api.InstanceConfiguration buildPartial() {
      org.yamcs.web.api.InstanceConfiguration result = new org.yamcs.web.api.InstanceConfiguration(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        to_bitField0_ |= 0x00000001;
      }
      result.displayBucket_ = displayBucket_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        to_bitField0_ |= 0x00000002;
      }
      result.stackBucket_ = stackBucket_;
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
      if (other instanceof org.yamcs.web.api.InstanceConfiguration) {
        return mergeFrom((org.yamcs.web.api.InstanceConfiguration)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.yamcs.web.api.InstanceConfiguration other) {
      if (other == org.yamcs.web.api.InstanceConfiguration.getDefaultInstance()) return this;
      if (other.hasDisplayBucket()) {
        bitField0_ |= 0x00000001;
        displayBucket_ = other.displayBucket_;
        onChanged();
      }
      if (other.hasStackBucket()) {
        bitField0_ |= 0x00000002;
        stackBucket_ = other.stackBucket_;
        onChanged();
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
              displayBucket_ = input.readBytes();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              stackBucket_ = input.readBytes();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
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

    private java.lang.Object displayBucket_ = "";
    /**
     * <pre>
     * Bucket where to find display resources
     * </pre>
     *
     * <code>optional string displayBucket = 1;</code>
     * @return Whether the displayBucket field is set.
     */
    public boolean hasDisplayBucket() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Bucket where to find display resources
     * </pre>
     *
     * <code>optional string displayBucket = 1;</code>
     * @return The displayBucket.
     */
    public java.lang.String getDisplayBucket() {
      java.lang.Object ref = displayBucket_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          displayBucket_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Bucket where to find display resources
     * </pre>
     *
     * <code>optional string displayBucket = 1;</code>
     * @return The bytes for displayBucket.
     */
    public com.google.protobuf.ByteString
        getDisplayBucketBytes() {
      java.lang.Object ref = displayBucket_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        displayBucket_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Bucket where to find display resources
     * </pre>
     *
     * <code>optional string displayBucket = 1;</code>
     * @param value The displayBucket to set.
     * @return This builder for chaining.
     */
    public Builder setDisplayBucket(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
      displayBucket_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Bucket where to find display resources
     * </pre>
     *
     * <code>optional string displayBucket = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearDisplayBucket() {
      bitField0_ = (bitField0_ & ~0x00000001);
      displayBucket_ = getDefaultInstance().getDisplayBucket();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Bucket where to find display resources
     * </pre>
     *
     * <code>optional string displayBucket = 1;</code>
     * @param value The bytes for displayBucket to set.
     * @return This builder for chaining.
     */
    public Builder setDisplayBucketBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
      displayBucket_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object stackBucket_ = "";
    /**
     * <pre>
     * Bucket where to find stacks
     * </pre>
     *
     * <code>optional string stackBucket = 2;</code>
     * @return Whether the stackBucket field is set.
     */
    public boolean hasStackBucket() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Bucket where to find stacks
     * </pre>
     *
     * <code>optional string stackBucket = 2;</code>
     * @return The stackBucket.
     */
    public java.lang.String getStackBucket() {
      java.lang.Object ref = stackBucket_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          stackBucket_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Bucket where to find stacks
     * </pre>
     *
     * <code>optional string stackBucket = 2;</code>
     * @return The bytes for stackBucket.
     */
    public com.google.protobuf.ByteString
        getStackBucketBytes() {
      java.lang.Object ref = stackBucket_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        stackBucket_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Bucket where to find stacks
     * </pre>
     *
     * <code>optional string stackBucket = 2;</code>
     * @param value The stackBucket to set.
     * @return This builder for chaining.
     */
    public Builder setStackBucket(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
      stackBucket_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Bucket where to find stacks
     * </pre>
     *
     * <code>optional string stackBucket = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearStackBucket() {
      bitField0_ = (bitField0_ & ~0x00000002);
      stackBucket_ = getDefaultInstance().getStackBucket();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Bucket where to find stacks
     * </pre>
     *
     * <code>optional string stackBucket = 2;</code>
     * @param value The bytes for stackBucket to set.
     * @return This builder for chaining.
     */
    public Builder setStackBucketBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
      stackBucket_ = value;
      onChanged();
      return this;
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


    // @@protoc_insertion_point(builder_scope:yamcs.protobuf.web.InstanceConfiguration)
  }

  // @@protoc_insertion_point(class_scope:yamcs.protobuf.web.InstanceConfiguration)
  private static final org.yamcs.web.api.InstanceConfiguration DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.yamcs.web.api.InstanceConfiguration();
  }

  public static org.yamcs.web.api.InstanceConfiguration getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<InstanceConfiguration>
      PARSER = new com.google.protobuf.AbstractParser<InstanceConfiguration>() {
    @java.lang.Override
    public InstanceConfiguration parsePartialFrom(
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

  public static com.google.protobuf.Parser<InstanceConfiguration> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<InstanceConfiguration> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.yamcs.web.api.InstanceConfiguration getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

