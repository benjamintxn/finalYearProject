// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: security.proto

package org.yamcs.security.protobuf;

/**
 * Protobuf type {@code ServiceAccountRecordDetail}
 */
public final class ServiceAccountRecordDetail extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ServiceAccountRecordDetail)
    ServiceAccountRecordDetailOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ServiceAccountRecordDetail.newBuilder() to construct.
  private ServiceAccountRecordDetail(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ServiceAccountRecordDetail() {
    applicationId_ = "";
    applicationHash_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ServiceAccountRecordDetail();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.yamcs.security.protobuf.SecurityProto.internal_static_ServiceAccountRecordDetail_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.yamcs.security.protobuf.SecurityProto.internal_static_ServiceAccountRecordDetail_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.yamcs.security.protobuf.ServiceAccountRecordDetail.class, org.yamcs.security.protobuf.ServiceAccountRecordDetail.Builder.class);
  }

  private int bitField0_;
  public static final int APPLICATIONID_FIELD_NUMBER = 1;
  private volatile java.lang.Object applicationId_;
  /**
   * <code>optional string applicationId = 1;</code>
   * @return Whether the applicationId field is set.
   */
  @java.lang.Override
  public boolean hasApplicationId() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>optional string applicationId = 1;</code>
   * @return The applicationId.
   */
  @java.lang.Override
  public java.lang.String getApplicationId() {
    java.lang.Object ref = applicationId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (bs.isValidUtf8()) {
        applicationId_ = s;
      }
      return s;
    }
  }
  /**
   * <code>optional string applicationId = 1;</code>
   * @return The bytes for applicationId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getApplicationIdBytes() {
    java.lang.Object ref = applicationId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      applicationId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int APPLICATIONHASH_FIELD_NUMBER = 2;
  private volatile java.lang.Object applicationHash_;
  /**
   * <code>optional string applicationHash = 2;</code>
   * @return Whether the applicationHash field is set.
   */
  @java.lang.Override
  public boolean hasApplicationHash() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <code>optional string applicationHash = 2;</code>
   * @return The applicationHash.
   */
  @java.lang.Override
  public java.lang.String getApplicationHash() {
    java.lang.Object ref = applicationHash_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (bs.isValidUtf8()) {
        applicationHash_ = s;
      }
      return s;
    }
  }
  /**
   * <code>optional string applicationHash = 2;</code>
   * @return The bytes for applicationHash.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getApplicationHashBytes() {
    java.lang.Object ref = applicationHash_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      applicationHash_ = b;
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
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, applicationId_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, applicationHash_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, applicationId_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, applicationHash_);
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
    if (!(obj instanceof org.yamcs.security.protobuf.ServiceAccountRecordDetail)) {
      return super.equals(obj);
    }
    org.yamcs.security.protobuf.ServiceAccountRecordDetail other = (org.yamcs.security.protobuf.ServiceAccountRecordDetail) obj;

    if (hasApplicationId() != other.hasApplicationId()) return false;
    if (hasApplicationId()) {
      if (!getApplicationId()
          .equals(other.getApplicationId())) return false;
    }
    if (hasApplicationHash() != other.hasApplicationHash()) return false;
    if (hasApplicationHash()) {
      if (!getApplicationHash()
          .equals(other.getApplicationHash())) return false;
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
    if (hasApplicationId()) {
      hash = (37 * hash) + APPLICATIONID_FIELD_NUMBER;
      hash = (53 * hash) + getApplicationId().hashCode();
    }
    if (hasApplicationHash()) {
      hash = (37 * hash) + APPLICATIONHASH_FIELD_NUMBER;
      hash = (53 * hash) + getApplicationHash().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.yamcs.security.protobuf.ServiceAccountRecordDetail parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.yamcs.security.protobuf.ServiceAccountRecordDetail parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.yamcs.security.protobuf.ServiceAccountRecordDetail parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.yamcs.security.protobuf.ServiceAccountRecordDetail parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.yamcs.security.protobuf.ServiceAccountRecordDetail parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.yamcs.security.protobuf.ServiceAccountRecordDetail parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.yamcs.security.protobuf.ServiceAccountRecordDetail parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.yamcs.security.protobuf.ServiceAccountRecordDetail parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.yamcs.security.protobuf.ServiceAccountRecordDetail parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.yamcs.security.protobuf.ServiceAccountRecordDetail parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.yamcs.security.protobuf.ServiceAccountRecordDetail parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.yamcs.security.protobuf.ServiceAccountRecordDetail parseFrom(
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
  public static Builder newBuilder(org.yamcs.security.protobuf.ServiceAccountRecordDetail prototype) {
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
   * Protobuf type {@code ServiceAccountRecordDetail}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ServiceAccountRecordDetail)
      org.yamcs.security.protobuf.ServiceAccountRecordDetailOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.yamcs.security.protobuf.SecurityProto.internal_static_ServiceAccountRecordDetail_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.yamcs.security.protobuf.SecurityProto.internal_static_ServiceAccountRecordDetail_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.yamcs.security.protobuf.ServiceAccountRecordDetail.class, org.yamcs.security.protobuf.ServiceAccountRecordDetail.Builder.class);
    }

    // Construct using org.yamcs.security.protobuf.ServiceAccountRecordDetail.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      applicationId_ = "";
      bitField0_ = (bitField0_ & ~0x00000001);
      applicationHash_ = "";
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.yamcs.security.protobuf.SecurityProto.internal_static_ServiceAccountRecordDetail_descriptor;
    }

    @java.lang.Override
    public org.yamcs.security.protobuf.ServiceAccountRecordDetail getDefaultInstanceForType() {
      return org.yamcs.security.protobuf.ServiceAccountRecordDetail.getDefaultInstance();
    }

    @java.lang.Override
    public org.yamcs.security.protobuf.ServiceAccountRecordDetail build() {
      org.yamcs.security.protobuf.ServiceAccountRecordDetail result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.yamcs.security.protobuf.ServiceAccountRecordDetail buildPartial() {
      org.yamcs.security.protobuf.ServiceAccountRecordDetail result = new org.yamcs.security.protobuf.ServiceAccountRecordDetail(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        to_bitField0_ |= 0x00000001;
      }
      result.applicationId_ = applicationId_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        to_bitField0_ |= 0x00000002;
      }
      result.applicationHash_ = applicationHash_;
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
      if (other instanceof org.yamcs.security.protobuf.ServiceAccountRecordDetail) {
        return mergeFrom((org.yamcs.security.protobuf.ServiceAccountRecordDetail)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.yamcs.security.protobuf.ServiceAccountRecordDetail other) {
      if (other == org.yamcs.security.protobuf.ServiceAccountRecordDetail.getDefaultInstance()) return this;
      if (other.hasApplicationId()) {
        bitField0_ |= 0x00000001;
        applicationId_ = other.applicationId_;
        onChanged();
      }
      if (other.hasApplicationHash()) {
        bitField0_ |= 0x00000002;
        applicationHash_ = other.applicationHash_;
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
              applicationId_ = input.readBytes();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              applicationHash_ = input.readBytes();
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

    private java.lang.Object applicationId_ = "";
    /**
     * <code>optional string applicationId = 1;</code>
     * @return Whether the applicationId field is set.
     */
    public boolean hasApplicationId() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional string applicationId = 1;</code>
     * @return The applicationId.
     */
    public java.lang.String getApplicationId() {
      java.lang.Object ref = applicationId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          applicationId_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string applicationId = 1;</code>
     * @return The bytes for applicationId.
     */
    public com.google.protobuf.ByteString
        getApplicationIdBytes() {
      java.lang.Object ref = applicationId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        applicationId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string applicationId = 1;</code>
     * @param value The applicationId to set.
     * @return This builder for chaining.
     */
    public Builder setApplicationId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
      applicationId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string applicationId = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearApplicationId() {
      bitField0_ = (bitField0_ & ~0x00000001);
      applicationId_ = getDefaultInstance().getApplicationId();
      onChanged();
      return this;
    }
    /**
     * <code>optional string applicationId = 1;</code>
     * @param value The bytes for applicationId to set.
     * @return This builder for chaining.
     */
    public Builder setApplicationIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
      applicationId_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object applicationHash_ = "";
    /**
     * <code>optional string applicationHash = 2;</code>
     * @return Whether the applicationHash field is set.
     */
    public boolean hasApplicationHash() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>optional string applicationHash = 2;</code>
     * @return The applicationHash.
     */
    public java.lang.String getApplicationHash() {
      java.lang.Object ref = applicationHash_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          applicationHash_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string applicationHash = 2;</code>
     * @return The bytes for applicationHash.
     */
    public com.google.protobuf.ByteString
        getApplicationHashBytes() {
      java.lang.Object ref = applicationHash_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        applicationHash_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string applicationHash = 2;</code>
     * @param value The applicationHash to set.
     * @return This builder for chaining.
     */
    public Builder setApplicationHash(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
      applicationHash_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string applicationHash = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearApplicationHash() {
      bitField0_ = (bitField0_ & ~0x00000002);
      applicationHash_ = getDefaultInstance().getApplicationHash();
      onChanged();
      return this;
    }
    /**
     * <code>optional string applicationHash = 2;</code>
     * @param value The bytes for applicationHash to set.
     * @return This builder for chaining.
     */
    public Builder setApplicationHashBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
      applicationHash_ = value;
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


    // @@protoc_insertion_point(builder_scope:ServiceAccountRecordDetail)
  }

  // @@protoc_insertion_point(class_scope:ServiceAccountRecordDetail)
  private static final org.yamcs.security.protobuf.ServiceAccountRecordDetail DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.yamcs.security.protobuf.ServiceAccountRecordDetail();
  }

  public static org.yamcs.security.protobuf.ServiceAccountRecordDetail getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<ServiceAccountRecordDetail>
      PARSER = new com.google.protobuf.AbstractParser<ServiceAccountRecordDetail>() {
    @java.lang.Override
    public ServiceAccountRecordDetail parsePartialFrom(
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

  public static com.google.protobuf.Parser<ServiceAccountRecordDetail> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ServiceAccountRecordDetail> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.yamcs.security.protobuf.ServiceAccountRecordDetail getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

