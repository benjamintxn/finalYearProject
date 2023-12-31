// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: yamcs/protobuf/packets/packets_service.proto

package org.yamcs.protobuf;

/**
 * Protobuf type {@code yamcs.protobuf.packets.ExportPacketRequest}
 */
public final class ExportPacketRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:yamcs.protobuf.packets.ExportPacketRequest)
    ExportPacketRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ExportPacketRequest.newBuilder() to construct.
  private ExportPacketRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ExportPacketRequest() {
    instance_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ExportPacketRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.yamcs.protobuf.PacketsServiceProto.internal_static_yamcs_protobuf_packets_ExportPacketRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.yamcs.protobuf.PacketsServiceProto.internal_static_yamcs_protobuf_packets_ExportPacketRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.yamcs.protobuf.ExportPacketRequest.class, org.yamcs.protobuf.ExportPacketRequest.Builder.class);
  }

  private int bitField0_;
  public static final int INSTANCE_FIELD_NUMBER = 1;
  private volatile java.lang.Object instance_;
  /**
   * <pre>
   * Yamcs instance name.
   * </pre>
   *
   * <code>optional string instance = 1;</code>
   * @return Whether the instance field is set.
   */
  @java.lang.Override
  public boolean hasInstance() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * Yamcs instance name.
   * </pre>
   *
   * <code>optional string instance = 1;</code>
   * @return The instance.
   */
  @java.lang.Override
  public java.lang.String getInstance() {
    java.lang.Object ref = instance_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (bs.isValidUtf8()) {
        instance_ = s;
      }
      return s;
    }
  }
  /**
   * <pre>
   * Yamcs instance name.
   * </pre>
   *
   * <code>optional string instance = 1;</code>
   * @return The bytes for instance.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getInstanceBytes() {
    java.lang.Object ref = instance_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      instance_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int GENTIME_FIELD_NUMBER = 2;
  private com.google.protobuf.Timestamp gentime_;
  /**
   * <pre>
   * An exact match of the packet's generation time in
   * ISO 8601 format.
   * </pre>
   *
   * <code>optional .google.protobuf.Timestamp gentime = 2;</code>
   * @return Whether the gentime field is set.
   */
  @java.lang.Override
  public boolean hasGentime() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * An exact match of the packet's generation time in
   * ISO 8601 format.
   * </pre>
   *
   * <code>optional .google.protobuf.Timestamp gentime = 2;</code>
   * @return The gentime.
   */
  @java.lang.Override
  public com.google.protobuf.Timestamp getGentime() {
    return gentime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : gentime_;
  }
  /**
   * <pre>
   * An exact match of the packet's generation time in
   * ISO 8601 format.
   * </pre>
   *
   * <code>optional .google.protobuf.Timestamp gentime = 2;</code>
   */
  @java.lang.Override
  public com.google.protobuf.TimestampOrBuilder getGentimeOrBuilder() {
    return gentime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : gentime_;
  }

  public static final int SEQNUM_FIELD_NUMBER = 3;
  private int seqnum_;
  /**
   * <pre>
   * Yamcs-specific archive distinguisher
   * </pre>
   *
   * <code>optional int32 seqnum = 3;</code>
   * @return Whether the seqnum field is set.
   */
  @java.lang.Override
  public boolean hasSeqnum() {
    return ((bitField0_ & 0x00000004) != 0);
  }
  /**
   * <pre>
   * Yamcs-specific archive distinguisher
   * </pre>
   *
   * <code>optional int32 seqnum = 3;</code>
   * @return The seqnum.
   */
  @java.lang.Override
  public int getSeqnum() {
    return seqnum_;
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
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, instance_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeMessage(2, getGentime());
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      output.writeInt32(3, seqnum_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, instance_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getGentime());
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, seqnum_);
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
    if (!(obj instanceof org.yamcs.protobuf.ExportPacketRequest)) {
      return super.equals(obj);
    }
    org.yamcs.protobuf.ExportPacketRequest other = (org.yamcs.protobuf.ExportPacketRequest) obj;

    if (hasInstance() != other.hasInstance()) return false;
    if (hasInstance()) {
      if (!getInstance()
          .equals(other.getInstance())) return false;
    }
    if (hasGentime() != other.hasGentime()) return false;
    if (hasGentime()) {
      if (!getGentime()
          .equals(other.getGentime())) return false;
    }
    if (hasSeqnum() != other.hasSeqnum()) return false;
    if (hasSeqnum()) {
      if (getSeqnum()
          != other.getSeqnum()) return false;
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
    if (hasInstance()) {
      hash = (37 * hash) + INSTANCE_FIELD_NUMBER;
      hash = (53 * hash) + getInstance().hashCode();
    }
    if (hasGentime()) {
      hash = (37 * hash) + GENTIME_FIELD_NUMBER;
      hash = (53 * hash) + getGentime().hashCode();
    }
    if (hasSeqnum()) {
      hash = (37 * hash) + SEQNUM_FIELD_NUMBER;
      hash = (53 * hash) + getSeqnum();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.yamcs.protobuf.ExportPacketRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.yamcs.protobuf.ExportPacketRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.yamcs.protobuf.ExportPacketRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.yamcs.protobuf.ExportPacketRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.yamcs.protobuf.ExportPacketRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.yamcs.protobuf.ExportPacketRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.yamcs.protobuf.ExportPacketRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.yamcs.protobuf.ExportPacketRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.yamcs.protobuf.ExportPacketRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.yamcs.protobuf.ExportPacketRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.yamcs.protobuf.ExportPacketRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.yamcs.protobuf.ExportPacketRequest parseFrom(
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
  public static Builder newBuilder(org.yamcs.protobuf.ExportPacketRequest prototype) {
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
   * Protobuf type {@code yamcs.protobuf.packets.ExportPacketRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:yamcs.protobuf.packets.ExportPacketRequest)
      org.yamcs.protobuf.ExportPacketRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.yamcs.protobuf.PacketsServiceProto.internal_static_yamcs_protobuf_packets_ExportPacketRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.yamcs.protobuf.PacketsServiceProto.internal_static_yamcs_protobuf_packets_ExportPacketRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.yamcs.protobuf.ExportPacketRequest.class, org.yamcs.protobuf.ExportPacketRequest.Builder.class);
    }

    // Construct using org.yamcs.protobuf.ExportPacketRequest.newBuilder()
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
        getGentimeFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      instance_ = "";
      bitField0_ = (bitField0_ & ~0x00000001);
      if (gentimeBuilder_ == null) {
        gentime_ = null;
      } else {
        gentimeBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000002);
      seqnum_ = 0;
      bitField0_ = (bitField0_ & ~0x00000004);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.yamcs.protobuf.PacketsServiceProto.internal_static_yamcs_protobuf_packets_ExportPacketRequest_descriptor;
    }

    @java.lang.Override
    public org.yamcs.protobuf.ExportPacketRequest getDefaultInstanceForType() {
      return org.yamcs.protobuf.ExportPacketRequest.getDefaultInstance();
    }

    @java.lang.Override
    public org.yamcs.protobuf.ExportPacketRequest build() {
      org.yamcs.protobuf.ExportPacketRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.yamcs.protobuf.ExportPacketRequest buildPartial() {
      org.yamcs.protobuf.ExportPacketRequest result = new org.yamcs.protobuf.ExportPacketRequest(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        to_bitField0_ |= 0x00000001;
      }
      result.instance_ = instance_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        if (gentimeBuilder_ == null) {
          result.gentime_ = gentime_;
        } else {
          result.gentime_ = gentimeBuilder_.build();
        }
        to_bitField0_ |= 0x00000002;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.seqnum_ = seqnum_;
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
      if (other instanceof org.yamcs.protobuf.ExportPacketRequest) {
        return mergeFrom((org.yamcs.protobuf.ExportPacketRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.yamcs.protobuf.ExportPacketRequest other) {
      if (other == org.yamcs.protobuf.ExportPacketRequest.getDefaultInstance()) return this;
      if (other.hasInstance()) {
        bitField0_ |= 0x00000001;
        instance_ = other.instance_;
        onChanged();
      }
      if (other.hasGentime()) {
        mergeGentime(other.getGentime());
      }
      if (other.hasSeqnum()) {
        setSeqnum(other.getSeqnum());
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
              instance_ = input.readBytes();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getGentimeFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 24: {
              seqnum_ = input.readInt32();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
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

    private java.lang.Object instance_ = "";
    /**
     * <pre>
     * Yamcs instance name.
     * </pre>
     *
     * <code>optional string instance = 1;</code>
     * @return Whether the instance field is set.
     */
    public boolean hasInstance() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Yamcs instance name.
     * </pre>
     *
     * <code>optional string instance = 1;</code>
     * @return The instance.
     */
    public java.lang.String getInstance() {
      java.lang.Object ref = instance_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          instance_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Yamcs instance name.
     * </pre>
     *
     * <code>optional string instance = 1;</code>
     * @return The bytes for instance.
     */
    public com.google.protobuf.ByteString
        getInstanceBytes() {
      java.lang.Object ref = instance_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        instance_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Yamcs instance name.
     * </pre>
     *
     * <code>optional string instance = 1;</code>
     * @param value The instance to set.
     * @return This builder for chaining.
     */
    public Builder setInstance(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
      instance_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Yamcs instance name.
     * </pre>
     *
     * <code>optional string instance = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearInstance() {
      bitField0_ = (bitField0_ & ~0x00000001);
      instance_ = getDefaultInstance().getInstance();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Yamcs instance name.
     * </pre>
     *
     * <code>optional string instance = 1;</code>
     * @param value The bytes for instance to set.
     * @return This builder for chaining.
     */
    public Builder setInstanceBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
      instance_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.Timestamp gentime_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> gentimeBuilder_;
    /**
     * <pre>
     * An exact match of the packet's generation time in
     * ISO 8601 format.
     * </pre>
     *
     * <code>optional .google.protobuf.Timestamp gentime = 2;</code>
     * @return Whether the gentime field is set.
     */
    public boolean hasGentime() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * An exact match of the packet's generation time in
     * ISO 8601 format.
     * </pre>
     *
     * <code>optional .google.protobuf.Timestamp gentime = 2;</code>
     * @return The gentime.
     */
    public com.google.protobuf.Timestamp getGentime() {
      if (gentimeBuilder_ == null) {
        return gentime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : gentime_;
      } else {
        return gentimeBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * An exact match of the packet's generation time in
     * ISO 8601 format.
     * </pre>
     *
     * <code>optional .google.protobuf.Timestamp gentime = 2;</code>
     */
    public Builder setGentime(com.google.protobuf.Timestamp value) {
      if (gentimeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        gentime_ = value;
        onChanged();
      } else {
        gentimeBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      return this;
    }
    /**
     * <pre>
     * An exact match of the packet's generation time in
     * ISO 8601 format.
     * </pre>
     *
     * <code>optional .google.protobuf.Timestamp gentime = 2;</code>
     */
    public Builder setGentime(
        com.google.protobuf.Timestamp.Builder builderForValue) {
      if (gentimeBuilder_ == null) {
        gentime_ = builderForValue.build();
        onChanged();
      } else {
        gentimeBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      return this;
    }
    /**
     * <pre>
     * An exact match of the packet's generation time in
     * ISO 8601 format.
     * </pre>
     *
     * <code>optional .google.protobuf.Timestamp gentime = 2;</code>
     */
    public Builder mergeGentime(com.google.protobuf.Timestamp value) {
      if (gentimeBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
            gentime_ != null &&
            gentime_ != com.google.protobuf.Timestamp.getDefaultInstance()) {
          gentime_ =
            com.google.protobuf.Timestamp.newBuilder(gentime_).mergeFrom(value).buildPartial();
        } else {
          gentime_ = value;
        }
        onChanged();
      } else {
        gentimeBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      return this;
    }
    /**
     * <pre>
     * An exact match of the packet's generation time in
     * ISO 8601 format.
     * </pre>
     *
     * <code>optional .google.protobuf.Timestamp gentime = 2;</code>
     */
    public Builder clearGentime() {
      if (gentimeBuilder_ == null) {
        gentime_ = null;
        onChanged();
      } else {
        gentimeBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }
    /**
     * <pre>
     * An exact match of the packet's generation time in
     * ISO 8601 format.
     * </pre>
     *
     * <code>optional .google.protobuf.Timestamp gentime = 2;</code>
     */
    public com.google.protobuf.Timestamp.Builder getGentimeBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getGentimeFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * An exact match of the packet's generation time in
     * ISO 8601 format.
     * </pre>
     *
     * <code>optional .google.protobuf.Timestamp gentime = 2;</code>
     */
    public com.google.protobuf.TimestampOrBuilder getGentimeOrBuilder() {
      if (gentimeBuilder_ != null) {
        return gentimeBuilder_.getMessageOrBuilder();
      } else {
        return gentime_ == null ?
            com.google.protobuf.Timestamp.getDefaultInstance() : gentime_;
      }
    }
    /**
     * <pre>
     * An exact match of the packet's generation time in
     * ISO 8601 format.
     * </pre>
     *
     * <code>optional .google.protobuf.Timestamp gentime = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> 
        getGentimeFieldBuilder() {
      if (gentimeBuilder_ == null) {
        gentimeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder>(
                getGentime(),
                getParentForChildren(),
                isClean());
        gentime_ = null;
      }
      return gentimeBuilder_;
    }

    private int seqnum_ ;
    /**
     * <pre>
     * Yamcs-specific archive distinguisher
     * </pre>
     *
     * <code>optional int32 seqnum = 3;</code>
     * @return Whether the seqnum field is set.
     */
    @java.lang.Override
    public boolean hasSeqnum() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * Yamcs-specific archive distinguisher
     * </pre>
     *
     * <code>optional int32 seqnum = 3;</code>
     * @return The seqnum.
     */
    @java.lang.Override
    public int getSeqnum() {
      return seqnum_;
    }
    /**
     * <pre>
     * Yamcs-specific archive distinguisher
     * </pre>
     *
     * <code>optional int32 seqnum = 3;</code>
     * @param value The seqnum to set.
     * @return This builder for chaining.
     */
    public Builder setSeqnum(int value) {
      bitField0_ |= 0x00000004;
      seqnum_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Yamcs-specific archive distinguisher
     * </pre>
     *
     * <code>optional int32 seqnum = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearSeqnum() {
      bitField0_ = (bitField0_ & ~0x00000004);
      seqnum_ = 0;
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


    // @@protoc_insertion_point(builder_scope:yamcs.protobuf.packets.ExportPacketRequest)
  }

  // @@protoc_insertion_point(class_scope:yamcs.protobuf.packets.ExportPacketRequest)
  private static final org.yamcs.protobuf.ExportPacketRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.yamcs.protobuf.ExportPacketRequest();
  }

  public static org.yamcs.protobuf.ExportPacketRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<ExportPacketRequest>
      PARSER = new com.google.protobuf.AbstractParser<ExportPacketRequest>() {
    @java.lang.Override
    public ExportPacketRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<ExportPacketRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ExportPacketRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.yamcs.protobuf.ExportPacketRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

