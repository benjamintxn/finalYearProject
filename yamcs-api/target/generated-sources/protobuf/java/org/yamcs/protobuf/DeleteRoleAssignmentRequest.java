// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: yamcs/protobuf/iam/iam.proto

package org.yamcs.protobuf;

/**
 * Protobuf type {@code yamcs.protobuf.iam.DeleteRoleAssignmentRequest}
 */
public final class DeleteRoleAssignmentRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:yamcs.protobuf.iam.DeleteRoleAssignmentRequest)
    DeleteRoleAssignmentRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DeleteRoleAssignmentRequest.newBuilder() to construct.
  private DeleteRoleAssignmentRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DeleteRoleAssignmentRequest() {
    name_ = "";
    role_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DeleteRoleAssignmentRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.yamcs.protobuf.IamProto.internal_static_yamcs_protobuf_iam_DeleteRoleAssignmentRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.yamcs.protobuf.IamProto.internal_static_yamcs_protobuf_iam_DeleteRoleAssignmentRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.yamcs.protobuf.DeleteRoleAssignmentRequest.class, org.yamcs.protobuf.DeleteRoleAssignmentRequest.Builder.class);
  }

  private int bitField0_;
  public static final int NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object name_;
  /**
   * <pre>
   * Username
   * </pre>
   *
   * <code>optional string name = 1;</code>
   * @return Whether the name field is set.
   */
  @java.lang.Override
  public boolean hasName() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * Username
   * </pre>
   *
   * <code>optional string name = 1;</code>
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (bs.isValidUtf8()) {
        name_ = s;
      }
      return s;
    }
  }
  /**
   * <pre>
   * Username
   * </pre>
   *
   * <code>optional string name = 1;</code>
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ROLE_FIELD_NUMBER = 2;
  private volatile java.lang.Object role_;
  /**
   * <pre>
   * Role name
   * </pre>
   *
   * <code>optional string role = 2;</code>
   * @return Whether the role field is set.
   */
  @java.lang.Override
  public boolean hasRole() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * Role name
   * </pre>
   *
   * <code>optional string role = 2;</code>
   * @return The role.
   */
  @java.lang.Override
  public java.lang.String getRole() {
    java.lang.Object ref = role_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (bs.isValidUtf8()) {
        role_ = s;
      }
      return s;
    }
  }
  /**
   * <pre>
   * Role name
   * </pre>
   *
   * <code>optional string role = 2;</code>
   * @return The bytes for role.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getRoleBytes() {
    java.lang.Object ref = role_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      role_ = b;
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
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, role_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, role_);
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
    if (!(obj instanceof org.yamcs.protobuf.DeleteRoleAssignmentRequest)) {
      return super.equals(obj);
    }
    org.yamcs.protobuf.DeleteRoleAssignmentRequest other = (org.yamcs.protobuf.DeleteRoleAssignmentRequest) obj;

    if (hasName() != other.hasName()) return false;
    if (hasName()) {
      if (!getName()
          .equals(other.getName())) return false;
    }
    if (hasRole() != other.hasRole()) return false;
    if (hasRole()) {
      if (!getRole()
          .equals(other.getRole())) return false;
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
    if (hasName()) {
      hash = (37 * hash) + NAME_FIELD_NUMBER;
      hash = (53 * hash) + getName().hashCode();
    }
    if (hasRole()) {
      hash = (37 * hash) + ROLE_FIELD_NUMBER;
      hash = (53 * hash) + getRole().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.yamcs.protobuf.DeleteRoleAssignmentRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.yamcs.protobuf.DeleteRoleAssignmentRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.yamcs.protobuf.DeleteRoleAssignmentRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.yamcs.protobuf.DeleteRoleAssignmentRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.yamcs.protobuf.DeleteRoleAssignmentRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.yamcs.protobuf.DeleteRoleAssignmentRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.yamcs.protobuf.DeleteRoleAssignmentRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.yamcs.protobuf.DeleteRoleAssignmentRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.yamcs.protobuf.DeleteRoleAssignmentRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.yamcs.protobuf.DeleteRoleAssignmentRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.yamcs.protobuf.DeleteRoleAssignmentRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.yamcs.protobuf.DeleteRoleAssignmentRequest parseFrom(
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
  public static Builder newBuilder(org.yamcs.protobuf.DeleteRoleAssignmentRequest prototype) {
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
   * Protobuf type {@code yamcs.protobuf.iam.DeleteRoleAssignmentRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:yamcs.protobuf.iam.DeleteRoleAssignmentRequest)
      org.yamcs.protobuf.DeleteRoleAssignmentRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.yamcs.protobuf.IamProto.internal_static_yamcs_protobuf_iam_DeleteRoleAssignmentRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.yamcs.protobuf.IamProto.internal_static_yamcs_protobuf_iam_DeleteRoleAssignmentRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.yamcs.protobuf.DeleteRoleAssignmentRequest.class, org.yamcs.protobuf.DeleteRoleAssignmentRequest.Builder.class);
    }

    // Construct using org.yamcs.protobuf.DeleteRoleAssignmentRequest.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      name_ = "";
      bitField0_ = (bitField0_ & ~0x00000001);
      role_ = "";
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.yamcs.protobuf.IamProto.internal_static_yamcs_protobuf_iam_DeleteRoleAssignmentRequest_descriptor;
    }

    @java.lang.Override
    public org.yamcs.protobuf.DeleteRoleAssignmentRequest getDefaultInstanceForType() {
      return org.yamcs.protobuf.DeleteRoleAssignmentRequest.getDefaultInstance();
    }

    @java.lang.Override
    public org.yamcs.protobuf.DeleteRoleAssignmentRequest build() {
      org.yamcs.protobuf.DeleteRoleAssignmentRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.yamcs.protobuf.DeleteRoleAssignmentRequest buildPartial() {
      org.yamcs.protobuf.DeleteRoleAssignmentRequest result = new org.yamcs.protobuf.DeleteRoleAssignmentRequest(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        to_bitField0_ |= 0x00000001;
      }
      result.name_ = name_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        to_bitField0_ |= 0x00000002;
      }
      result.role_ = role_;
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
      if (other instanceof org.yamcs.protobuf.DeleteRoleAssignmentRequest) {
        return mergeFrom((org.yamcs.protobuf.DeleteRoleAssignmentRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.yamcs.protobuf.DeleteRoleAssignmentRequest other) {
      if (other == org.yamcs.protobuf.DeleteRoleAssignmentRequest.getDefaultInstance()) return this;
      if (other.hasName()) {
        bitField0_ |= 0x00000001;
        name_ = other.name_;
        onChanged();
      }
      if (other.hasRole()) {
        bitField0_ |= 0x00000002;
        role_ = other.role_;
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
              name_ = input.readBytes();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              role_ = input.readBytes();
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

    private java.lang.Object name_ = "";
    /**
     * <pre>
     * Username
     * </pre>
     *
     * <code>optional string name = 1;</code>
     * @return Whether the name field is set.
     */
    public boolean hasName() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Username
     * </pre>
     *
     * <code>optional string name = 1;</code>
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          name_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Username
     * </pre>
     *
     * <code>optional string name = 1;</code>
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Username
     * </pre>
     *
     * <code>optional string name = 1;</code>
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
      name_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Username
     * </pre>
     *
     * <code>optional string name = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearName() {
      bitField0_ = (bitField0_ & ~0x00000001);
      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Username
     * </pre>
     *
     * <code>optional string name = 1;</code>
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
      name_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object role_ = "";
    /**
     * <pre>
     * Role name
     * </pre>
     *
     * <code>optional string role = 2;</code>
     * @return Whether the role field is set.
     */
    public boolean hasRole() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Role name
     * </pre>
     *
     * <code>optional string role = 2;</code>
     * @return The role.
     */
    public java.lang.String getRole() {
      java.lang.Object ref = role_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          role_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Role name
     * </pre>
     *
     * <code>optional string role = 2;</code>
     * @return The bytes for role.
     */
    public com.google.protobuf.ByteString
        getRoleBytes() {
      java.lang.Object ref = role_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        role_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Role name
     * </pre>
     *
     * <code>optional string role = 2;</code>
     * @param value The role to set.
     * @return This builder for chaining.
     */
    public Builder setRole(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
      role_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Role name
     * </pre>
     *
     * <code>optional string role = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearRole() {
      bitField0_ = (bitField0_ & ~0x00000002);
      role_ = getDefaultInstance().getRole();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Role name
     * </pre>
     *
     * <code>optional string role = 2;</code>
     * @param value The bytes for role to set.
     * @return This builder for chaining.
     */
    public Builder setRoleBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
      role_ = value;
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


    // @@protoc_insertion_point(builder_scope:yamcs.protobuf.iam.DeleteRoleAssignmentRequest)
  }

  // @@protoc_insertion_point(class_scope:yamcs.protobuf.iam.DeleteRoleAssignmentRequest)
  private static final org.yamcs.protobuf.DeleteRoleAssignmentRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.yamcs.protobuf.DeleteRoleAssignmentRequest();
  }

  public static org.yamcs.protobuf.DeleteRoleAssignmentRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<DeleteRoleAssignmentRequest>
      PARSER = new com.google.protobuf.AbstractParser<DeleteRoleAssignmentRequest>() {
    @java.lang.Override
    public DeleteRoleAssignmentRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<DeleteRoleAssignmentRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DeleteRoleAssignmentRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.yamcs.protobuf.DeleteRoleAssignmentRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

