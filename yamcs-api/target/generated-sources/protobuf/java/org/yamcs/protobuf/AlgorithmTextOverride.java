// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: yamcs/protobuf/processing/mdb_override_service.proto

package org.yamcs.protobuf;

/**
 * Protobuf type {@code yamcs.protobuf.processing.AlgorithmTextOverride}
 */
public final class AlgorithmTextOverride extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:yamcs.protobuf.processing.AlgorithmTextOverride)
    AlgorithmTextOverrideOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AlgorithmTextOverride.newBuilder() to construct.
  private AlgorithmTextOverride(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AlgorithmTextOverride() {
    algorithm_ = "";
    text_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AlgorithmTextOverride();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.yamcs.protobuf.MdbOverrideServiceProto.internal_static_yamcs_protobuf_processing_AlgorithmTextOverride_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.yamcs.protobuf.MdbOverrideServiceProto.internal_static_yamcs_protobuf_processing_AlgorithmTextOverride_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.yamcs.protobuf.AlgorithmTextOverride.class, org.yamcs.protobuf.AlgorithmTextOverride.Builder.class);
  }

  private int bitField0_;
  public static final int ALGORITHM_FIELD_NUMBER = 1;
  private volatile java.lang.Object algorithm_;
  /**
   * <pre>
   * Algorithm name
   * </pre>
   *
   * <code>optional string algorithm = 1;</code>
   * @return Whether the algorithm field is set.
   */
  @java.lang.Override
  public boolean hasAlgorithm() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * Algorithm name
   * </pre>
   *
   * <code>optional string algorithm = 1;</code>
   * @return The algorithm.
   */
  @java.lang.Override
  public java.lang.String getAlgorithm() {
    java.lang.Object ref = algorithm_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (bs.isValidUtf8()) {
        algorithm_ = s;
      }
      return s;
    }
  }
  /**
   * <pre>
   * Algorithm name
   * </pre>
   *
   * <code>optional string algorithm = 1;</code>
   * @return The bytes for algorithm.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getAlgorithmBytes() {
    java.lang.Object ref = algorithm_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      algorithm_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TEXT_FIELD_NUMBER = 2;
  private volatile java.lang.Object text_;
  /**
   * <pre>
   * Algorithm text
   * </pre>
   *
   * <code>optional string text = 2;</code>
   * @return Whether the text field is set.
   */
  @java.lang.Override
  public boolean hasText() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * Algorithm text
   * </pre>
   *
   * <code>optional string text = 2;</code>
   * @return The text.
   */
  @java.lang.Override
  public java.lang.String getText() {
    java.lang.Object ref = text_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (bs.isValidUtf8()) {
        text_ = s;
      }
      return s;
    }
  }
  /**
   * <pre>
   * Algorithm text
   * </pre>
   *
   * <code>optional string text = 2;</code>
   * @return The bytes for text.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getTextBytes() {
    java.lang.Object ref = text_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      text_ = b;
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
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, algorithm_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, text_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, algorithm_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, text_);
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
    if (!(obj instanceof org.yamcs.protobuf.AlgorithmTextOverride)) {
      return super.equals(obj);
    }
    org.yamcs.protobuf.AlgorithmTextOverride other = (org.yamcs.protobuf.AlgorithmTextOverride) obj;

    if (hasAlgorithm() != other.hasAlgorithm()) return false;
    if (hasAlgorithm()) {
      if (!getAlgorithm()
          .equals(other.getAlgorithm())) return false;
    }
    if (hasText() != other.hasText()) return false;
    if (hasText()) {
      if (!getText()
          .equals(other.getText())) return false;
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
    if (hasAlgorithm()) {
      hash = (37 * hash) + ALGORITHM_FIELD_NUMBER;
      hash = (53 * hash) + getAlgorithm().hashCode();
    }
    if (hasText()) {
      hash = (37 * hash) + TEXT_FIELD_NUMBER;
      hash = (53 * hash) + getText().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.yamcs.protobuf.AlgorithmTextOverride parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.yamcs.protobuf.AlgorithmTextOverride parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.yamcs.protobuf.AlgorithmTextOverride parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.yamcs.protobuf.AlgorithmTextOverride parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.yamcs.protobuf.AlgorithmTextOverride parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.yamcs.protobuf.AlgorithmTextOverride parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.yamcs.protobuf.AlgorithmTextOverride parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.yamcs.protobuf.AlgorithmTextOverride parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.yamcs.protobuf.AlgorithmTextOverride parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.yamcs.protobuf.AlgorithmTextOverride parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.yamcs.protobuf.AlgorithmTextOverride parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.yamcs.protobuf.AlgorithmTextOverride parseFrom(
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
  public static Builder newBuilder(org.yamcs.protobuf.AlgorithmTextOverride prototype) {
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
   * Protobuf type {@code yamcs.protobuf.processing.AlgorithmTextOverride}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:yamcs.protobuf.processing.AlgorithmTextOverride)
      org.yamcs.protobuf.AlgorithmTextOverrideOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.yamcs.protobuf.MdbOverrideServiceProto.internal_static_yamcs_protobuf_processing_AlgorithmTextOverride_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.yamcs.protobuf.MdbOverrideServiceProto.internal_static_yamcs_protobuf_processing_AlgorithmTextOverride_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.yamcs.protobuf.AlgorithmTextOverride.class, org.yamcs.protobuf.AlgorithmTextOverride.Builder.class);
    }

    // Construct using org.yamcs.protobuf.AlgorithmTextOverride.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      algorithm_ = "";
      bitField0_ = (bitField0_ & ~0x00000001);
      text_ = "";
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.yamcs.protobuf.MdbOverrideServiceProto.internal_static_yamcs_protobuf_processing_AlgorithmTextOverride_descriptor;
    }

    @java.lang.Override
    public org.yamcs.protobuf.AlgorithmTextOverride getDefaultInstanceForType() {
      return org.yamcs.protobuf.AlgorithmTextOverride.getDefaultInstance();
    }

    @java.lang.Override
    public org.yamcs.protobuf.AlgorithmTextOverride build() {
      org.yamcs.protobuf.AlgorithmTextOverride result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.yamcs.protobuf.AlgorithmTextOverride buildPartial() {
      org.yamcs.protobuf.AlgorithmTextOverride result = new org.yamcs.protobuf.AlgorithmTextOverride(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        to_bitField0_ |= 0x00000001;
      }
      result.algorithm_ = algorithm_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        to_bitField0_ |= 0x00000002;
      }
      result.text_ = text_;
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
      if (other instanceof org.yamcs.protobuf.AlgorithmTextOverride) {
        return mergeFrom((org.yamcs.protobuf.AlgorithmTextOverride)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.yamcs.protobuf.AlgorithmTextOverride other) {
      if (other == org.yamcs.protobuf.AlgorithmTextOverride.getDefaultInstance()) return this;
      if (other.hasAlgorithm()) {
        bitField0_ |= 0x00000001;
        algorithm_ = other.algorithm_;
        onChanged();
      }
      if (other.hasText()) {
        bitField0_ |= 0x00000002;
        text_ = other.text_;
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
              algorithm_ = input.readBytes();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              text_ = input.readBytes();
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

    private java.lang.Object algorithm_ = "";
    /**
     * <pre>
     * Algorithm name
     * </pre>
     *
     * <code>optional string algorithm = 1;</code>
     * @return Whether the algorithm field is set.
     */
    public boolean hasAlgorithm() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Algorithm name
     * </pre>
     *
     * <code>optional string algorithm = 1;</code>
     * @return The algorithm.
     */
    public java.lang.String getAlgorithm() {
      java.lang.Object ref = algorithm_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          algorithm_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Algorithm name
     * </pre>
     *
     * <code>optional string algorithm = 1;</code>
     * @return The bytes for algorithm.
     */
    public com.google.protobuf.ByteString
        getAlgorithmBytes() {
      java.lang.Object ref = algorithm_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        algorithm_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Algorithm name
     * </pre>
     *
     * <code>optional string algorithm = 1;</code>
     * @param value The algorithm to set.
     * @return This builder for chaining.
     */
    public Builder setAlgorithm(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
      algorithm_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Algorithm name
     * </pre>
     *
     * <code>optional string algorithm = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearAlgorithm() {
      bitField0_ = (bitField0_ & ~0x00000001);
      algorithm_ = getDefaultInstance().getAlgorithm();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Algorithm name
     * </pre>
     *
     * <code>optional string algorithm = 1;</code>
     * @param value The bytes for algorithm to set.
     * @return This builder for chaining.
     */
    public Builder setAlgorithmBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
      algorithm_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object text_ = "";
    /**
     * <pre>
     * Algorithm text
     * </pre>
     *
     * <code>optional string text = 2;</code>
     * @return Whether the text field is set.
     */
    public boolean hasText() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Algorithm text
     * </pre>
     *
     * <code>optional string text = 2;</code>
     * @return The text.
     */
    public java.lang.String getText() {
      java.lang.Object ref = text_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          text_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Algorithm text
     * </pre>
     *
     * <code>optional string text = 2;</code>
     * @return The bytes for text.
     */
    public com.google.protobuf.ByteString
        getTextBytes() {
      java.lang.Object ref = text_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        text_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Algorithm text
     * </pre>
     *
     * <code>optional string text = 2;</code>
     * @param value The text to set.
     * @return This builder for chaining.
     */
    public Builder setText(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
      text_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Algorithm text
     * </pre>
     *
     * <code>optional string text = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearText() {
      bitField0_ = (bitField0_ & ~0x00000002);
      text_ = getDefaultInstance().getText();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Algorithm text
     * </pre>
     *
     * <code>optional string text = 2;</code>
     * @param value The bytes for text to set.
     * @return This builder for chaining.
     */
    public Builder setTextBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
      text_ = value;
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


    // @@protoc_insertion_point(builder_scope:yamcs.protobuf.processing.AlgorithmTextOverride)
  }

  // @@protoc_insertion_point(class_scope:yamcs.protobuf.processing.AlgorithmTextOverride)
  private static final org.yamcs.protobuf.AlgorithmTextOverride DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.yamcs.protobuf.AlgorithmTextOverride();
  }

  public static org.yamcs.protobuf.AlgorithmTextOverride getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<AlgorithmTextOverride>
      PARSER = new com.google.protobuf.AbstractParser<AlgorithmTextOverride>() {
    @java.lang.Override
    public AlgorithmTextOverride parsePartialFrom(
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

  public static com.google.protobuf.Parser<AlgorithmTextOverride> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AlgorithmTextOverride> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.yamcs.protobuf.AlgorithmTextOverride getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

