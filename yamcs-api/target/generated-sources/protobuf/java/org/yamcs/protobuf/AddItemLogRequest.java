// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: yamcs/protobuf/timeline/timeline.proto

package org.yamcs.protobuf;

/**
 * Protobuf type {@code yamcs.protobuf.timeline.AddItemLogRequest}
 */
public final class AddItemLogRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:yamcs.protobuf.timeline.AddItemLogRequest)
    AddItemLogRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AddItemLogRequest.newBuilder() to construct.
  private AddItemLogRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AddItemLogRequest() {
    instance_ = "";
    source_ = "";
    id_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AddItemLogRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.yamcs.protobuf.TimelineProto.internal_static_yamcs_protobuf_timeline_AddItemLogRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.yamcs.protobuf.TimelineProto.internal_static_yamcs_protobuf_timeline_AddItemLogRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.yamcs.protobuf.AddItemLogRequest.class, org.yamcs.protobuf.AddItemLogRequest.Builder.class);
  }

  private int bitField0_;
  public static final int INSTANCE_FIELD_NUMBER = 1;
  private volatile java.lang.Object instance_;
  /**
   * <pre>
   * Yamcs instance name
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
   * Yamcs instance name
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
   * Yamcs instance name
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

  public static final int SOURCE_FIELD_NUMBER = 2;
  private volatile java.lang.Object source_;
  /**
   * <pre>
   * Item source
   * </pre>
   *
   * <code>optional string source = 2;</code>
   * @return Whether the source field is set.
   */
  @java.lang.Override
  public boolean hasSource() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * Item source
   * </pre>
   *
   * <code>optional string source = 2;</code>
   * @return The source.
   */
  @java.lang.Override
  public java.lang.String getSource() {
    java.lang.Object ref = source_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (bs.isValidUtf8()) {
        source_ = s;
      }
      return s;
    }
  }
  /**
   * <pre>
   * Item source
   * </pre>
   *
   * <code>optional string source = 2;</code>
   * @return The bytes for source.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getSourceBytes() {
    java.lang.Object ref = source_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      source_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ID_FIELD_NUMBER = 3;
  private volatile java.lang.Object id_;
  /**
   * <pre>
   * Item identifier
   * </pre>
   *
   * <code>optional string id = 3;</code>
   * @return Whether the id field is set.
   */
  @java.lang.Override
  public boolean hasId() {
    return ((bitField0_ & 0x00000004) != 0);
  }
  /**
   * <pre>
   * Item identifier
   * </pre>
   *
   * <code>optional string id = 3;</code>
   * @return The id.
   */
  @java.lang.Override
  public java.lang.String getId() {
    java.lang.Object ref = id_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (bs.isValidUtf8()) {
        id_ = s;
      }
      return s;
    }
  }
  /**
   * <pre>
   * Item identifier
   * </pre>
   *
   * <code>optional string id = 3;</code>
   * @return The bytes for id.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getIdBytes() {
    java.lang.Object ref = id_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      id_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ENTRY_FIELD_NUMBER = 4;
  private org.yamcs.protobuf.LogEntry entry_;
  /**
   * <code>optional .yamcs.protobuf.timeline.LogEntry entry = 4;</code>
   * @return Whether the entry field is set.
   */
  @java.lang.Override
  public boolean hasEntry() {
    return ((bitField0_ & 0x00000008) != 0);
  }
  /**
   * <code>optional .yamcs.protobuf.timeline.LogEntry entry = 4;</code>
   * @return The entry.
   */
  @java.lang.Override
  public org.yamcs.protobuf.LogEntry getEntry() {
    return entry_ == null ? org.yamcs.protobuf.LogEntry.getDefaultInstance() : entry_;
  }
  /**
   * <code>optional .yamcs.protobuf.timeline.LogEntry entry = 4;</code>
   */
  @java.lang.Override
  public org.yamcs.protobuf.LogEntryOrBuilder getEntryOrBuilder() {
    return entry_ == null ? org.yamcs.protobuf.LogEntry.getDefaultInstance() : entry_;
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
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, source_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, id_);
    }
    if (((bitField0_ & 0x00000008) != 0)) {
      output.writeMessage(4, getEntry());
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
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, source_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, id_);
    }
    if (((bitField0_ & 0x00000008) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, getEntry());
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
    if (!(obj instanceof org.yamcs.protobuf.AddItemLogRequest)) {
      return super.equals(obj);
    }
    org.yamcs.protobuf.AddItemLogRequest other = (org.yamcs.protobuf.AddItemLogRequest) obj;

    if (hasInstance() != other.hasInstance()) return false;
    if (hasInstance()) {
      if (!getInstance()
          .equals(other.getInstance())) return false;
    }
    if (hasSource() != other.hasSource()) return false;
    if (hasSource()) {
      if (!getSource()
          .equals(other.getSource())) return false;
    }
    if (hasId() != other.hasId()) return false;
    if (hasId()) {
      if (!getId()
          .equals(other.getId())) return false;
    }
    if (hasEntry() != other.hasEntry()) return false;
    if (hasEntry()) {
      if (!getEntry()
          .equals(other.getEntry())) return false;
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
    if (hasSource()) {
      hash = (37 * hash) + SOURCE_FIELD_NUMBER;
      hash = (53 * hash) + getSource().hashCode();
    }
    if (hasId()) {
      hash = (37 * hash) + ID_FIELD_NUMBER;
      hash = (53 * hash) + getId().hashCode();
    }
    if (hasEntry()) {
      hash = (37 * hash) + ENTRY_FIELD_NUMBER;
      hash = (53 * hash) + getEntry().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.yamcs.protobuf.AddItemLogRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.yamcs.protobuf.AddItemLogRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.yamcs.protobuf.AddItemLogRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.yamcs.protobuf.AddItemLogRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.yamcs.protobuf.AddItemLogRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.yamcs.protobuf.AddItemLogRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.yamcs.protobuf.AddItemLogRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.yamcs.protobuf.AddItemLogRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.yamcs.protobuf.AddItemLogRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.yamcs.protobuf.AddItemLogRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.yamcs.protobuf.AddItemLogRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.yamcs.protobuf.AddItemLogRequest parseFrom(
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
  public static Builder newBuilder(org.yamcs.protobuf.AddItemLogRequest prototype) {
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
   * Protobuf type {@code yamcs.protobuf.timeline.AddItemLogRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:yamcs.protobuf.timeline.AddItemLogRequest)
      org.yamcs.protobuf.AddItemLogRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.yamcs.protobuf.TimelineProto.internal_static_yamcs_protobuf_timeline_AddItemLogRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.yamcs.protobuf.TimelineProto.internal_static_yamcs_protobuf_timeline_AddItemLogRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.yamcs.protobuf.AddItemLogRequest.class, org.yamcs.protobuf.AddItemLogRequest.Builder.class);
    }

    // Construct using org.yamcs.protobuf.AddItemLogRequest.newBuilder()
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
        getEntryFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      instance_ = "";
      bitField0_ = (bitField0_ & ~0x00000001);
      source_ = "";
      bitField0_ = (bitField0_ & ~0x00000002);
      id_ = "";
      bitField0_ = (bitField0_ & ~0x00000004);
      if (entryBuilder_ == null) {
        entry_ = null;
      } else {
        entryBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000008);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.yamcs.protobuf.TimelineProto.internal_static_yamcs_protobuf_timeline_AddItemLogRequest_descriptor;
    }

    @java.lang.Override
    public org.yamcs.protobuf.AddItemLogRequest getDefaultInstanceForType() {
      return org.yamcs.protobuf.AddItemLogRequest.getDefaultInstance();
    }

    @java.lang.Override
    public org.yamcs.protobuf.AddItemLogRequest build() {
      org.yamcs.protobuf.AddItemLogRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.yamcs.protobuf.AddItemLogRequest buildPartial() {
      org.yamcs.protobuf.AddItemLogRequest result = new org.yamcs.protobuf.AddItemLogRequest(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        to_bitField0_ |= 0x00000001;
      }
      result.instance_ = instance_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        to_bitField0_ |= 0x00000002;
      }
      result.source_ = source_;
      if (((from_bitField0_ & 0x00000004) != 0)) {
        to_bitField0_ |= 0x00000004;
      }
      result.id_ = id_;
      if (((from_bitField0_ & 0x00000008) != 0)) {
        if (entryBuilder_ == null) {
          result.entry_ = entry_;
        } else {
          result.entry_ = entryBuilder_.build();
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
      if (other instanceof org.yamcs.protobuf.AddItemLogRequest) {
        return mergeFrom((org.yamcs.protobuf.AddItemLogRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.yamcs.protobuf.AddItemLogRequest other) {
      if (other == org.yamcs.protobuf.AddItemLogRequest.getDefaultInstance()) return this;
      if (other.hasInstance()) {
        bitField0_ |= 0x00000001;
        instance_ = other.instance_;
        onChanged();
      }
      if (other.hasSource()) {
        bitField0_ |= 0x00000002;
        source_ = other.source_;
        onChanged();
      }
      if (other.hasId()) {
        bitField0_ |= 0x00000004;
        id_ = other.id_;
        onChanged();
      }
      if (other.hasEntry()) {
        mergeEntry(other.getEntry());
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
              source_ = input.readBytes();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              id_ = input.readBytes();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 34: {
              input.readMessage(
                  getEntryFieldBuilder().getBuilder(),
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
     * Yamcs instance name
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
     * Yamcs instance name
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
     * Yamcs instance name
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
     * Yamcs instance name
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
     * Yamcs instance name
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
     * Yamcs instance name
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

    private java.lang.Object source_ = "";
    /**
     * <pre>
     * Item source
     * </pre>
     *
     * <code>optional string source = 2;</code>
     * @return Whether the source field is set.
     */
    public boolean hasSource() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Item source
     * </pre>
     *
     * <code>optional string source = 2;</code>
     * @return The source.
     */
    public java.lang.String getSource() {
      java.lang.Object ref = source_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          source_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Item source
     * </pre>
     *
     * <code>optional string source = 2;</code>
     * @return The bytes for source.
     */
    public com.google.protobuf.ByteString
        getSourceBytes() {
      java.lang.Object ref = source_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        source_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Item source
     * </pre>
     *
     * <code>optional string source = 2;</code>
     * @param value The source to set.
     * @return This builder for chaining.
     */
    public Builder setSource(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
      source_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Item source
     * </pre>
     *
     * <code>optional string source = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearSource() {
      bitField0_ = (bitField0_ & ~0x00000002);
      source_ = getDefaultInstance().getSource();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Item source
     * </pre>
     *
     * <code>optional string source = 2;</code>
     * @param value The bytes for source to set.
     * @return This builder for chaining.
     */
    public Builder setSourceBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
      source_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object id_ = "";
    /**
     * <pre>
     * Item identifier
     * </pre>
     *
     * <code>optional string id = 3;</code>
     * @return Whether the id field is set.
     */
    public boolean hasId() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * Item identifier
     * </pre>
     *
     * <code>optional string id = 3;</code>
     * @return The id.
     */
    public java.lang.String getId() {
      java.lang.Object ref = id_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          id_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Item identifier
     * </pre>
     *
     * <code>optional string id = 3;</code>
     * @return The bytes for id.
     */
    public com.google.protobuf.ByteString
        getIdBytes() {
      java.lang.Object ref = id_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        id_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Item identifier
     * </pre>
     *
     * <code>optional string id = 3;</code>
     * @param value The id to set.
     * @return This builder for chaining.
     */
    public Builder setId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
      id_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Item identifier
     * </pre>
     *
     * <code>optional string id = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearId() {
      bitField0_ = (bitField0_ & ~0x00000004);
      id_ = getDefaultInstance().getId();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Item identifier
     * </pre>
     *
     * <code>optional string id = 3;</code>
     * @param value The bytes for id to set.
     * @return This builder for chaining.
     */
    public Builder setIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
      id_ = value;
      onChanged();
      return this;
    }

    private org.yamcs.protobuf.LogEntry entry_;
    private com.google.protobuf.SingleFieldBuilderV3<
        org.yamcs.protobuf.LogEntry, org.yamcs.protobuf.LogEntry.Builder, org.yamcs.protobuf.LogEntryOrBuilder> entryBuilder_;
    /**
     * <code>optional .yamcs.protobuf.timeline.LogEntry entry = 4;</code>
     * @return Whether the entry field is set.
     */
    public boolean hasEntry() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <code>optional .yamcs.protobuf.timeline.LogEntry entry = 4;</code>
     * @return The entry.
     */
    public org.yamcs.protobuf.LogEntry getEntry() {
      if (entryBuilder_ == null) {
        return entry_ == null ? org.yamcs.protobuf.LogEntry.getDefaultInstance() : entry_;
      } else {
        return entryBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .yamcs.protobuf.timeline.LogEntry entry = 4;</code>
     */
    public Builder setEntry(org.yamcs.protobuf.LogEntry value) {
      if (entryBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        entry_ = value;
        onChanged();
      } else {
        entryBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000008;
      return this;
    }
    /**
     * <code>optional .yamcs.protobuf.timeline.LogEntry entry = 4;</code>
     */
    public Builder setEntry(
        org.yamcs.protobuf.LogEntry.Builder builderForValue) {
      if (entryBuilder_ == null) {
        entry_ = builderForValue.build();
        onChanged();
      } else {
        entryBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000008;
      return this;
    }
    /**
     * <code>optional .yamcs.protobuf.timeline.LogEntry entry = 4;</code>
     */
    public Builder mergeEntry(org.yamcs.protobuf.LogEntry value) {
      if (entryBuilder_ == null) {
        if (((bitField0_ & 0x00000008) != 0) &&
            entry_ != null &&
            entry_ != org.yamcs.protobuf.LogEntry.getDefaultInstance()) {
          entry_ =
            org.yamcs.protobuf.LogEntry.newBuilder(entry_).mergeFrom(value).buildPartial();
        } else {
          entry_ = value;
        }
        onChanged();
      } else {
        entryBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000008;
      return this;
    }
    /**
     * <code>optional .yamcs.protobuf.timeline.LogEntry entry = 4;</code>
     */
    public Builder clearEntry() {
      if (entryBuilder_ == null) {
        entry_ = null;
        onChanged();
      } else {
        entryBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000008);
      return this;
    }
    /**
     * <code>optional .yamcs.protobuf.timeline.LogEntry entry = 4;</code>
     */
    public org.yamcs.protobuf.LogEntry.Builder getEntryBuilder() {
      bitField0_ |= 0x00000008;
      onChanged();
      return getEntryFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .yamcs.protobuf.timeline.LogEntry entry = 4;</code>
     */
    public org.yamcs.protobuf.LogEntryOrBuilder getEntryOrBuilder() {
      if (entryBuilder_ != null) {
        return entryBuilder_.getMessageOrBuilder();
      } else {
        return entry_ == null ?
            org.yamcs.protobuf.LogEntry.getDefaultInstance() : entry_;
      }
    }
    /**
     * <code>optional .yamcs.protobuf.timeline.LogEntry entry = 4;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        org.yamcs.protobuf.LogEntry, org.yamcs.protobuf.LogEntry.Builder, org.yamcs.protobuf.LogEntryOrBuilder> 
        getEntryFieldBuilder() {
      if (entryBuilder_ == null) {
        entryBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            org.yamcs.protobuf.LogEntry, org.yamcs.protobuf.LogEntry.Builder, org.yamcs.protobuf.LogEntryOrBuilder>(
                getEntry(),
                getParentForChildren(),
                isClean());
        entry_ = null;
      }
      return entryBuilder_;
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


    // @@protoc_insertion_point(builder_scope:yamcs.protobuf.timeline.AddItemLogRequest)
  }

  // @@protoc_insertion_point(class_scope:yamcs.protobuf.timeline.AddItemLogRequest)
  private static final org.yamcs.protobuf.AddItemLogRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.yamcs.protobuf.AddItemLogRequest();
  }

  public static org.yamcs.protobuf.AddItemLogRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<AddItemLogRequest>
      PARSER = new com.google.protobuf.AbstractParser<AddItemLogRequest>() {
    @java.lang.Override
    public AddItemLogRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<AddItemLogRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AddItemLogRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.yamcs.protobuf.AddItemLogRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

