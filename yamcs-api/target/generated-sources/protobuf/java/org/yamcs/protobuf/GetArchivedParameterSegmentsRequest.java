// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: yamcs/protobuf/archive/parameter_archive_service.proto

package org.yamcs.protobuf;

/**
 * Protobuf type {@code yamcs.protobuf.archive.GetArchivedParameterSegmentsRequest}
 */
public final class GetArchivedParameterSegmentsRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:yamcs.protobuf.archive.GetArchivedParameterSegmentsRequest)
    GetArchivedParameterSegmentsRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetArchivedParameterSegmentsRequest.newBuilder() to construct.
  private GetArchivedParameterSegmentsRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetArchivedParameterSegmentsRequest() {
    instance_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetArchivedParameterSegmentsRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.yamcs.protobuf.ParameterArchiveServiceProto.internal_static_yamcs_protobuf_archive_GetArchivedParameterSegmentsRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.yamcs.protobuf.ParameterArchiveServiceProto.internal_static_yamcs_protobuf_archive_GetArchivedParameterSegmentsRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.yamcs.protobuf.GetArchivedParameterSegmentsRequest.class, org.yamcs.protobuf.GetArchivedParameterSegmentsRequest.Builder.class);
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

  public static final int PID_FIELD_NUMBER = 2;
  private int pid_;
  /**
   * <pre>
   *parameter id
   * </pre>
   *
   * <code>optional uint32 pid = 2;</code>
   * @return Whether the pid field is set.
   */
  @java.lang.Override
  public boolean hasPid() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   *parameter id
   * </pre>
   *
   * <code>optional uint32 pid = 2;</code>
   * @return The pid.
   */
  @java.lang.Override
  public int getPid() {
    return pid_;
  }

  public static final int START_FIELD_NUMBER = 3;
  private com.google.protobuf.Timestamp start_;
  /**
   * <pre>
   *get the segments overlapping with [start, stop) interval
   * </pre>
   *
   * <code>optional .google.protobuf.Timestamp start = 3;</code>
   * @return Whether the start field is set.
   */
  @java.lang.Override
  public boolean hasStart() {
    return ((bitField0_ & 0x00000004) != 0);
  }
  /**
   * <pre>
   *get the segments overlapping with [start, stop) interval
   * </pre>
   *
   * <code>optional .google.protobuf.Timestamp start = 3;</code>
   * @return The start.
   */
  @java.lang.Override
  public com.google.protobuf.Timestamp getStart() {
    return start_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : start_;
  }
  /**
   * <pre>
   *get the segments overlapping with [start, stop) interval
   * </pre>
   *
   * <code>optional .google.protobuf.Timestamp start = 3;</code>
   */
  @java.lang.Override
  public com.google.protobuf.TimestampOrBuilder getStartOrBuilder() {
    return start_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : start_;
  }

  public static final int STOP_FIELD_NUMBER = 4;
  private com.google.protobuf.Timestamp stop_;
  /**
   * <code>optional .google.protobuf.Timestamp stop = 4;</code>
   * @return Whether the stop field is set.
   */
  @java.lang.Override
  public boolean hasStop() {
    return ((bitField0_ & 0x00000008) != 0);
  }
  /**
   * <code>optional .google.protobuf.Timestamp stop = 4;</code>
   * @return The stop.
   */
  @java.lang.Override
  public com.google.protobuf.Timestamp getStop() {
    return stop_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : stop_;
  }
  /**
   * <code>optional .google.protobuf.Timestamp stop = 4;</code>
   */
  @java.lang.Override
  public com.google.protobuf.TimestampOrBuilder getStopOrBuilder() {
    return stop_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : stop_;
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
      output.writeUInt32(2, pid_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      output.writeMessage(3, getStart());
    }
    if (((bitField0_ & 0x00000008) != 0)) {
      output.writeMessage(4, getStop());
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
        .computeUInt32Size(2, pid_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getStart());
    }
    if (((bitField0_ & 0x00000008) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, getStop());
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
    if (!(obj instanceof org.yamcs.protobuf.GetArchivedParameterSegmentsRequest)) {
      return super.equals(obj);
    }
    org.yamcs.protobuf.GetArchivedParameterSegmentsRequest other = (org.yamcs.protobuf.GetArchivedParameterSegmentsRequest) obj;

    if (hasInstance() != other.hasInstance()) return false;
    if (hasInstance()) {
      if (!getInstance()
          .equals(other.getInstance())) return false;
    }
    if (hasPid() != other.hasPid()) return false;
    if (hasPid()) {
      if (getPid()
          != other.getPid()) return false;
    }
    if (hasStart() != other.hasStart()) return false;
    if (hasStart()) {
      if (!getStart()
          .equals(other.getStart())) return false;
    }
    if (hasStop() != other.hasStop()) return false;
    if (hasStop()) {
      if (!getStop()
          .equals(other.getStop())) return false;
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
    if (hasPid()) {
      hash = (37 * hash) + PID_FIELD_NUMBER;
      hash = (53 * hash) + getPid();
    }
    if (hasStart()) {
      hash = (37 * hash) + START_FIELD_NUMBER;
      hash = (53 * hash) + getStart().hashCode();
    }
    if (hasStop()) {
      hash = (37 * hash) + STOP_FIELD_NUMBER;
      hash = (53 * hash) + getStop().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.yamcs.protobuf.GetArchivedParameterSegmentsRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.yamcs.protobuf.GetArchivedParameterSegmentsRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.yamcs.protobuf.GetArchivedParameterSegmentsRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.yamcs.protobuf.GetArchivedParameterSegmentsRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.yamcs.protobuf.GetArchivedParameterSegmentsRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.yamcs.protobuf.GetArchivedParameterSegmentsRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.yamcs.protobuf.GetArchivedParameterSegmentsRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.yamcs.protobuf.GetArchivedParameterSegmentsRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.yamcs.protobuf.GetArchivedParameterSegmentsRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.yamcs.protobuf.GetArchivedParameterSegmentsRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.yamcs.protobuf.GetArchivedParameterSegmentsRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.yamcs.protobuf.GetArchivedParameterSegmentsRequest parseFrom(
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
  public static Builder newBuilder(org.yamcs.protobuf.GetArchivedParameterSegmentsRequest prototype) {
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
   * Protobuf type {@code yamcs.protobuf.archive.GetArchivedParameterSegmentsRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:yamcs.protobuf.archive.GetArchivedParameterSegmentsRequest)
      org.yamcs.protobuf.GetArchivedParameterSegmentsRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.yamcs.protobuf.ParameterArchiveServiceProto.internal_static_yamcs_protobuf_archive_GetArchivedParameterSegmentsRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.yamcs.protobuf.ParameterArchiveServiceProto.internal_static_yamcs_protobuf_archive_GetArchivedParameterSegmentsRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.yamcs.protobuf.GetArchivedParameterSegmentsRequest.class, org.yamcs.protobuf.GetArchivedParameterSegmentsRequest.Builder.class);
    }

    // Construct using org.yamcs.protobuf.GetArchivedParameterSegmentsRequest.newBuilder()
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
        getStartFieldBuilder();
        getStopFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      instance_ = "";
      bitField0_ = (bitField0_ & ~0x00000001);
      pid_ = 0;
      bitField0_ = (bitField0_ & ~0x00000002);
      if (startBuilder_ == null) {
        start_ = null;
      } else {
        startBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000004);
      if (stopBuilder_ == null) {
        stop_ = null;
      } else {
        stopBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000008);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.yamcs.protobuf.ParameterArchiveServiceProto.internal_static_yamcs_protobuf_archive_GetArchivedParameterSegmentsRequest_descriptor;
    }

    @java.lang.Override
    public org.yamcs.protobuf.GetArchivedParameterSegmentsRequest getDefaultInstanceForType() {
      return org.yamcs.protobuf.GetArchivedParameterSegmentsRequest.getDefaultInstance();
    }

    @java.lang.Override
    public org.yamcs.protobuf.GetArchivedParameterSegmentsRequest build() {
      org.yamcs.protobuf.GetArchivedParameterSegmentsRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.yamcs.protobuf.GetArchivedParameterSegmentsRequest buildPartial() {
      org.yamcs.protobuf.GetArchivedParameterSegmentsRequest result = new org.yamcs.protobuf.GetArchivedParameterSegmentsRequest(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        to_bitField0_ |= 0x00000001;
      }
      result.instance_ = instance_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.pid_ = pid_;
        to_bitField0_ |= 0x00000002;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        if (startBuilder_ == null) {
          result.start_ = start_;
        } else {
          result.start_ = startBuilder_.build();
        }
        to_bitField0_ |= 0x00000004;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        if (stopBuilder_ == null) {
          result.stop_ = stop_;
        } else {
          result.stop_ = stopBuilder_.build();
        }
        to_bitField0_ |= 0x00000008;
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
      if (other instanceof org.yamcs.protobuf.GetArchivedParameterSegmentsRequest) {
        return mergeFrom((org.yamcs.protobuf.GetArchivedParameterSegmentsRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.yamcs.protobuf.GetArchivedParameterSegmentsRequest other) {
      if (other == org.yamcs.protobuf.GetArchivedParameterSegmentsRequest.getDefaultInstance()) return this;
      if (other.hasInstance()) {
        bitField0_ |= 0x00000001;
        instance_ = other.instance_;
        onChanged();
      }
      if (other.hasPid()) {
        setPid(other.getPid());
      }
      if (other.hasStart()) {
        mergeStart(other.getStart());
      }
      if (other.hasStop()) {
        mergeStop(other.getStop());
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
            case 16: {
              pid_ = input.readUInt32();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 26: {
              input.readMessage(
                  getStartFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 34: {
              input.readMessage(
                  getStopFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000008;
              break;
            } // case 34
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

    private int pid_ ;
    /**
     * <pre>
     *parameter id
     * </pre>
     *
     * <code>optional uint32 pid = 2;</code>
     * @return Whether the pid field is set.
     */
    @java.lang.Override
    public boolean hasPid() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     *parameter id
     * </pre>
     *
     * <code>optional uint32 pid = 2;</code>
     * @return The pid.
     */
    @java.lang.Override
    public int getPid() {
      return pid_;
    }
    /**
     * <pre>
     *parameter id
     * </pre>
     *
     * <code>optional uint32 pid = 2;</code>
     * @param value The pid to set.
     * @return This builder for chaining.
     */
    public Builder setPid(int value) {
      bitField0_ |= 0x00000002;
      pid_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *parameter id
     * </pre>
     *
     * <code>optional uint32 pid = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearPid() {
      bitField0_ = (bitField0_ & ~0x00000002);
      pid_ = 0;
      onChanged();
      return this;
    }

    private com.google.protobuf.Timestamp start_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> startBuilder_;
    /**
     * <pre>
     *get the segments overlapping with [start, stop) interval
     * </pre>
     *
     * <code>optional .google.protobuf.Timestamp start = 3;</code>
     * @return Whether the start field is set.
     */
    public boolean hasStart() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     *get the segments overlapping with [start, stop) interval
     * </pre>
     *
     * <code>optional .google.protobuf.Timestamp start = 3;</code>
     * @return The start.
     */
    public com.google.protobuf.Timestamp getStart() {
      if (startBuilder_ == null) {
        return start_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : start_;
      } else {
        return startBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     *get the segments overlapping with [start, stop) interval
     * </pre>
     *
     * <code>optional .google.protobuf.Timestamp start = 3;</code>
     */
    public Builder setStart(com.google.protobuf.Timestamp value) {
      if (startBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        start_ = value;
        onChanged();
      } else {
        startBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      return this;
    }
    /**
     * <pre>
     *get the segments overlapping with [start, stop) interval
     * </pre>
     *
     * <code>optional .google.protobuf.Timestamp start = 3;</code>
     */
    public Builder setStart(
        com.google.protobuf.Timestamp.Builder builderForValue) {
      if (startBuilder_ == null) {
        start_ = builderForValue.build();
        onChanged();
      } else {
        startBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      return this;
    }
    /**
     * <pre>
     *get the segments overlapping with [start, stop) interval
     * </pre>
     *
     * <code>optional .google.protobuf.Timestamp start = 3;</code>
     */
    public Builder mergeStart(com.google.protobuf.Timestamp value) {
      if (startBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0) &&
            start_ != null &&
            start_ != com.google.protobuf.Timestamp.getDefaultInstance()) {
          start_ =
            com.google.protobuf.Timestamp.newBuilder(start_).mergeFrom(value).buildPartial();
        } else {
          start_ = value;
        }
        onChanged();
      } else {
        startBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000004;
      return this;
    }
    /**
     * <pre>
     *get the segments overlapping with [start, stop) interval
     * </pre>
     *
     * <code>optional .google.protobuf.Timestamp start = 3;</code>
     */
    public Builder clearStart() {
      if (startBuilder_ == null) {
        start_ = null;
        onChanged();
      } else {
        startBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000004);
      return this;
    }
    /**
     * <pre>
     *get the segments overlapping with [start, stop) interval
     * </pre>
     *
     * <code>optional .google.protobuf.Timestamp start = 3;</code>
     */
    public com.google.protobuf.Timestamp.Builder getStartBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getStartFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     *get the segments overlapping with [start, stop) interval
     * </pre>
     *
     * <code>optional .google.protobuf.Timestamp start = 3;</code>
     */
    public com.google.protobuf.TimestampOrBuilder getStartOrBuilder() {
      if (startBuilder_ != null) {
        return startBuilder_.getMessageOrBuilder();
      } else {
        return start_ == null ?
            com.google.protobuf.Timestamp.getDefaultInstance() : start_;
      }
    }
    /**
     * <pre>
     *get the segments overlapping with [start, stop) interval
     * </pre>
     *
     * <code>optional .google.protobuf.Timestamp start = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> 
        getStartFieldBuilder() {
      if (startBuilder_ == null) {
        startBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder>(
                getStart(),
                getParentForChildren(),
                isClean());
        start_ = null;
      }
      return startBuilder_;
    }

    private com.google.protobuf.Timestamp stop_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> stopBuilder_;
    /**
     * <code>optional .google.protobuf.Timestamp stop = 4;</code>
     * @return Whether the stop field is set.
     */
    public boolean hasStop() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <code>optional .google.protobuf.Timestamp stop = 4;</code>
     * @return The stop.
     */
    public com.google.protobuf.Timestamp getStop() {
      if (stopBuilder_ == null) {
        return stop_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : stop_;
      } else {
        return stopBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .google.protobuf.Timestamp stop = 4;</code>
     */
    public Builder setStop(com.google.protobuf.Timestamp value) {
      if (stopBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        stop_ = value;
        onChanged();
      } else {
        stopBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000008;
      return this;
    }
    /**
     * <code>optional .google.protobuf.Timestamp stop = 4;</code>
     */
    public Builder setStop(
        com.google.protobuf.Timestamp.Builder builderForValue) {
      if (stopBuilder_ == null) {
        stop_ = builderForValue.build();
        onChanged();
      } else {
        stopBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000008;
      return this;
    }
    /**
     * <code>optional .google.protobuf.Timestamp stop = 4;</code>
     */
    public Builder mergeStop(com.google.protobuf.Timestamp value) {
      if (stopBuilder_ == null) {
        if (((bitField0_ & 0x00000008) != 0) &&
            stop_ != null &&
            stop_ != com.google.protobuf.Timestamp.getDefaultInstance()) {
          stop_ =
            com.google.protobuf.Timestamp.newBuilder(stop_).mergeFrom(value).buildPartial();
        } else {
          stop_ = value;
        }
        onChanged();
      } else {
        stopBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000008;
      return this;
    }
    /**
     * <code>optional .google.protobuf.Timestamp stop = 4;</code>
     */
    public Builder clearStop() {
      if (stopBuilder_ == null) {
        stop_ = null;
        onChanged();
      } else {
        stopBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000008);
      return this;
    }
    /**
     * <code>optional .google.protobuf.Timestamp stop = 4;</code>
     */
    public com.google.protobuf.Timestamp.Builder getStopBuilder() {
      bitField0_ |= 0x00000008;
      onChanged();
      return getStopFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .google.protobuf.Timestamp stop = 4;</code>
     */
    public com.google.protobuf.TimestampOrBuilder getStopOrBuilder() {
      if (stopBuilder_ != null) {
        return stopBuilder_.getMessageOrBuilder();
      } else {
        return stop_ == null ?
            com.google.protobuf.Timestamp.getDefaultInstance() : stop_;
      }
    }
    /**
     * <code>optional .google.protobuf.Timestamp stop = 4;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> 
        getStopFieldBuilder() {
      if (stopBuilder_ == null) {
        stopBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder>(
                getStop(),
                getParentForChildren(),
                isClean());
        stop_ = null;
      }
      return stopBuilder_;
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


    // @@protoc_insertion_point(builder_scope:yamcs.protobuf.archive.GetArchivedParameterSegmentsRequest)
  }

  // @@protoc_insertion_point(class_scope:yamcs.protobuf.archive.GetArchivedParameterSegmentsRequest)
  private static final org.yamcs.protobuf.GetArchivedParameterSegmentsRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.yamcs.protobuf.GetArchivedParameterSegmentsRequest();
  }

  public static org.yamcs.protobuf.GetArchivedParameterSegmentsRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<GetArchivedParameterSegmentsRequest>
      PARSER = new com.google.protobuf.AbstractParser<GetArchivedParameterSegmentsRequest>() {
    @java.lang.Override
    public GetArchivedParameterSegmentsRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<GetArchivedParameterSegmentsRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetArchivedParameterSegmentsRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.yamcs.protobuf.GetArchivedParameterSegmentsRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

