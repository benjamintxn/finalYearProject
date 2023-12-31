// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: security.proto

package org.yamcs.security.protobuf;

/**
 * Protobuf type {@code GroupCollection}
 */
public final class GroupCollection extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:GroupCollection)
    GroupCollectionOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GroupCollection.newBuilder() to construct.
  private GroupCollection(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GroupCollection() {
    records_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GroupCollection();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.yamcs.security.protobuf.SecurityProto.internal_static_GroupCollection_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.yamcs.security.protobuf.SecurityProto.internal_static_GroupCollection_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.yamcs.security.protobuf.GroupCollection.class, org.yamcs.security.protobuf.GroupCollection.Builder.class);
  }

  private int bitField0_;
  public static final int SEQ_FIELD_NUMBER = 1;
  private int seq_;
  /**
   * <code>optional int32 seq = 1;</code>
   * @return Whether the seq field is set.
   */
  @java.lang.Override
  public boolean hasSeq() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>optional int32 seq = 1;</code>
   * @return The seq.
   */
  @java.lang.Override
  public int getSeq() {
    return seq_;
  }

  public static final int RECORDS_FIELD_NUMBER = 2;
  private java.util.List<org.yamcs.security.protobuf.GroupRecord> records_;
  /**
   * <code>repeated .GroupRecord records = 2;</code>
   */
  @java.lang.Override
  public java.util.List<org.yamcs.security.protobuf.GroupRecord> getRecordsList() {
    return records_;
  }
  /**
   * <code>repeated .GroupRecord records = 2;</code>
   */
  @java.lang.Override
  public java.util.List<? extends org.yamcs.security.protobuf.GroupRecordOrBuilder> 
      getRecordsOrBuilderList() {
    return records_;
  }
  /**
   * <code>repeated .GroupRecord records = 2;</code>
   */
  @java.lang.Override
  public int getRecordsCount() {
    return records_.size();
  }
  /**
   * <code>repeated .GroupRecord records = 2;</code>
   */
  @java.lang.Override
  public org.yamcs.security.protobuf.GroupRecord getRecords(int index) {
    return records_.get(index);
  }
  /**
   * <code>repeated .GroupRecord records = 2;</code>
   */
  @java.lang.Override
  public org.yamcs.security.protobuf.GroupRecordOrBuilder getRecordsOrBuilder(
      int index) {
    return records_.get(index);
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
      output.writeInt32(1, seq_);
    }
    for (int i = 0; i < records_.size(); i++) {
      output.writeMessage(2, records_.get(i));
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
        .computeInt32Size(1, seq_);
    }
    for (int i = 0; i < records_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, records_.get(i));
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
    if (!(obj instanceof org.yamcs.security.protobuf.GroupCollection)) {
      return super.equals(obj);
    }
    org.yamcs.security.protobuf.GroupCollection other = (org.yamcs.security.protobuf.GroupCollection) obj;

    if (hasSeq() != other.hasSeq()) return false;
    if (hasSeq()) {
      if (getSeq()
          != other.getSeq()) return false;
    }
    if (!getRecordsList()
        .equals(other.getRecordsList())) return false;
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
    if (hasSeq()) {
      hash = (37 * hash) + SEQ_FIELD_NUMBER;
      hash = (53 * hash) + getSeq();
    }
    if (getRecordsCount() > 0) {
      hash = (37 * hash) + RECORDS_FIELD_NUMBER;
      hash = (53 * hash) + getRecordsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.yamcs.security.protobuf.GroupCollection parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.yamcs.security.protobuf.GroupCollection parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.yamcs.security.protobuf.GroupCollection parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.yamcs.security.protobuf.GroupCollection parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.yamcs.security.protobuf.GroupCollection parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.yamcs.security.protobuf.GroupCollection parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.yamcs.security.protobuf.GroupCollection parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.yamcs.security.protobuf.GroupCollection parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.yamcs.security.protobuf.GroupCollection parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.yamcs.security.protobuf.GroupCollection parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.yamcs.security.protobuf.GroupCollection parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.yamcs.security.protobuf.GroupCollection parseFrom(
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
  public static Builder newBuilder(org.yamcs.security.protobuf.GroupCollection prototype) {
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
   * Protobuf type {@code GroupCollection}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:GroupCollection)
      org.yamcs.security.protobuf.GroupCollectionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.yamcs.security.protobuf.SecurityProto.internal_static_GroupCollection_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.yamcs.security.protobuf.SecurityProto.internal_static_GroupCollection_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.yamcs.security.protobuf.GroupCollection.class, org.yamcs.security.protobuf.GroupCollection.Builder.class);
    }

    // Construct using org.yamcs.security.protobuf.GroupCollection.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      seq_ = 0;
      bitField0_ = (bitField0_ & ~0x00000001);
      if (recordsBuilder_ == null) {
        records_ = java.util.Collections.emptyList();
      } else {
        records_ = null;
        recordsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.yamcs.security.protobuf.SecurityProto.internal_static_GroupCollection_descriptor;
    }

    @java.lang.Override
    public org.yamcs.security.protobuf.GroupCollection getDefaultInstanceForType() {
      return org.yamcs.security.protobuf.GroupCollection.getDefaultInstance();
    }

    @java.lang.Override
    public org.yamcs.security.protobuf.GroupCollection build() {
      org.yamcs.security.protobuf.GroupCollection result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.yamcs.security.protobuf.GroupCollection buildPartial() {
      org.yamcs.security.protobuf.GroupCollection result = new org.yamcs.security.protobuf.GroupCollection(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.seq_ = seq_;
        to_bitField0_ |= 0x00000001;
      }
      if (recordsBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)) {
          records_ = java.util.Collections.unmodifiableList(records_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.records_ = records_;
      } else {
        result.records_ = recordsBuilder_.build();
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
      if (other instanceof org.yamcs.security.protobuf.GroupCollection) {
        return mergeFrom((org.yamcs.security.protobuf.GroupCollection)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.yamcs.security.protobuf.GroupCollection other) {
      if (other == org.yamcs.security.protobuf.GroupCollection.getDefaultInstance()) return this;
      if (other.hasSeq()) {
        setSeq(other.getSeq());
      }
      if (recordsBuilder_ == null) {
        if (!other.records_.isEmpty()) {
          if (records_.isEmpty()) {
            records_ = other.records_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureRecordsIsMutable();
            records_.addAll(other.records_);
          }
          onChanged();
        }
      } else {
        if (!other.records_.isEmpty()) {
          if (recordsBuilder_.isEmpty()) {
            recordsBuilder_.dispose();
            recordsBuilder_ = null;
            records_ = other.records_;
            bitField0_ = (bitField0_ & ~0x00000002);
            recordsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getRecordsFieldBuilder() : null;
          } else {
            recordsBuilder_.addAllMessages(other.records_);
          }
        }
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
              seq_ = input.readInt32();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 18: {
              org.yamcs.security.protobuf.GroupRecord m =
                  input.readMessage(
                      org.yamcs.security.protobuf.GroupRecord.PARSER,
                      extensionRegistry);
              if (recordsBuilder_ == null) {
                ensureRecordsIsMutable();
                records_.add(m);
              } else {
                recordsBuilder_.addMessage(m);
              }
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

    private int seq_ ;
    /**
     * <code>optional int32 seq = 1;</code>
     * @return Whether the seq field is set.
     */
    @java.lang.Override
    public boolean hasSeq() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional int32 seq = 1;</code>
     * @return The seq.
     */
    @java.lang.Override
    public int getSeq() {
      return seq_;
    }
    /**
     * <code>optional int32 seq = 1;</code>
     * @param value The seq to set.
     * @return This builder for chaining.
     */
    public Builder setSeq(int value) {
      bitField0_ |= 0x00000001;
      seq_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int32 seq = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearSeq() {
      bitField0_ = (bitField0_ & ~0x00000001);
      seq_ = 0;
      onChanged();
      return this;
    }

    private java.util.List<org.yamcs.security.protobuf.GroupRecord> records_ =
      java.util.Collections.emptyList();
    private void ensureRecordsIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        records_ = new java.util.ArrayList<org.yamcs.security.protobuf.GroupRecord>(records_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        org.yamcs.security.protobuf.GroupRecord, org.yamcs.security.protobuf.GroupRecord.Builder, org.yamcs.security.protobuf.GroupRecordOrBuilder> recordsBuilder_;

    /**
     * <code>repeated .GroupRecord records = 2;</code>
     */
    public java.util.List<org.yamcs.security.protobuf.GroupRecord> getRecordsList() {
      if (recordsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(records_);
      } else {
        return recordsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .GroupRecord records = 2;</code>
     */
    public int getRecordsCount() {
      if (recordsBuilder_ == null) {
        return records_.size();
      } else {
        return recordsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .GroupRecord records = 2;</code>
     */
    public org.yamcs.security.protobuf.GroupRecord getRecords(int index) {
      if (recordsBuilder_ == null) {
        return records_.get(index);
      } else {
        return recordsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .GroupRecord records = 2;</code>
     */
    public Builder setRecords(
        int index, org.yamcs.security.protobuf.GroupRecord value) {
      if (recordsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRecordsIsMutable();
        records_.set(index, value);
        onChanged();
      } else {
        recordsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .GroupRecord records = 2;</code>
     */
    public Builder setRecords(
        int index, org.yamcs.security.protobuf.GroupRecord.Builder builderForValue) {
      if (recordsBuilder_ == null) {
        ensureRecordsIsMutable();
        records_.set(index, builderForValue.build());
        onChanged();
      } else {
        recordsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .GroupRecord records = 2;</code>
     */
    public Builder addRecords(org.yamcs.security.protobuf.GroupRecord value) {
      if (recordsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRecordsIsMutable();
        records_.add(value);
        onChanged();
      } else {
        recordsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .GroupRecord records = 2;</code>
     */
    public Builder addRecords(
        int index, org.yamcs.security.protobuf.GroupRecord value) {
      if (recordsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRecordsIsMutable();
        records_.add(index, value);
        onChanged();
      } else {
        recordsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .GroupRecord records = 2;</code>
     */
    public Builder addRecords(
        org.yamcs.security.protobuf.GroupRecord.Builder builderForValue) {
      if (recordsBuilder_ == null) {
        ensureRecordsIsMutable();
        records_.add(builderForValue.build());
        onChanged();
      } else {
        recordsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .GroupRecord records = 2;</code>
     */
    public Builder addRecords(
        int index, org.yamcs.security.protobuf.GroupRecord.Builder builderForValue) {
      if (recordsBuilder_ == null) {
        ensureRecordsIsMutable();
        records_.add(index, builderForValue.build());
        onChanged();
      } else {
        recordsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .GroupRecord records = 2;</code>
     */
    public Builder addAllRecords(
        java.lang.Iterable<? extends org.yamcs.security.protobuf.GroupRecord> values) {
      if (recordsBuilder_ == null) {
        ensureRecordsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, records_);
        onChanged();
      } else {
        recordsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .GroupRecord records = 2;</code>
     */
    public Builder clearRecords() {
      if (recordsBuilder_ == null) {
        records_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        recordsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .GroupRecord records = 2;</code>
     */
    public Builder removeRecords(int index) {
      if (recordsBuilder_ == null) {
        ensureRecordsIsMutable();
        records_.remove(index);
        onChanged();
      } else {
        recordsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .GroupRecord records = 2;</code>
     */
    public org.yamcs.security.protobuf.GroupRecord.Builder getRecordsBuilder(
        int index) {
      return getRecordsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .GroupRecord records = 2;</code>
     */
    public org.yamcs.security.protobuf.GroupRecordOrBuilder getRecordsOrBuilder(
        int index) {
      if (recordsBuilder_ == null) {
        return records_.get(index);  } else {
        return recordsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .GroupRecord records = 2;</code>
     */
    public java.util.List<? extends org.yamcs.security.protobuf.GroupRecordOrBuilder> 
         getRecordsOrBuilderList() {
      if (recordsBuilder_ != null) {
        return recordsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(records_);
      }
    }
    /**
     * <code>repeated .GroupRecord records = 2;</code>
     */
    public org.yamcs.security.protobuf.GroupRecord.Builder addRecordsBuilder() {
      return getRecordsFieldBuilder().addBuilder(
          org.yamcs.security.protobuf.GroupRecord.getDefaultInstance());
    }
    /**
     * <code>repeated .GroupRecord records = 2;</code>
     */
    public org.yamcs.security.protobuf.GroupRecord.Builder addRecordsBuilder(
        int index) {
      return getRecordsFieldBuilder().addBuilder(
          index, org.yamcs.security.protobuf.GroupRecord.getDefaultInstance());
    }
    /**
     * <code>repeated .GroupRecord records = 2;</code>
     */
    public java.util.List<org.yamcs.security.protobuf.GroupRecord.Builder> 
         getRecordsBuilderList() {
      return getRecordsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        org.yamcs.security.protobuf.GroupRecord, org.yamcs.security.protobuf.GroupRecord.Builder, org.yamcs.security.protobuf.GroupRecordOrBuilder> 
        getRecordsFieldBuilder() {
      if (recordsBuilder_ == null) {
        recordsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            org.yamcs.security.protobuf.GroupRecord, org.yamcs.security.protobuf.GroupRecord.Builder, org.yamcs.security.protobuf.GroupRecordOrBuilder>(
                records_,
                ((bitField0_ & 0x00000002) != 0),
                getParentForChildren(),
                isClean());
        records_ = null;
      }
      return recordsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:GroupCollection)
  }

  // @@protoc_insertion_point(class_scope:GroupCollection)
  private static final org.yamcs.security.protobuf.GroupCollection DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.yamcs.security.protobuf.GroupCollection();
  }

  public static org.yamcs.security.protobuf.GroupCollection getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<GroupCollection>
      PARSER = new com.google.protobuf.AbstractParser<GroupCollection>() {
    @java.lang.Override
    public GroupCollection parsePartialFrom(
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

  public static com.google.protobuf.Parser<GroupCollection> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GroupCollection> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.yamcs.security.protobuf.GroupCollection getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

