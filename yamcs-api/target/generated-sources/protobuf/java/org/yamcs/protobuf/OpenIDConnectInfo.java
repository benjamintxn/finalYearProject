// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: yamcs/protobuf/auth/auth.proto

package org.yamcs.protobuf;

/**
 * Protobuf type {@code yamcs.protobuf.auth.OpenIDConnectInfo}
 */
public final class OpenIDConnectInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:yamcs.protobuf.auth.OpenIDConnectInfo)
    OpenIDConnectInfoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use OpenIDConnectInfo.newBuilder() to construct.
  private OpenIDConnectInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private OpenIDConnectInfo() {
    clientId_ = "";
    authorizationEndpoint_ = "";
    scope_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new OpenIDConnectInfo();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.yamcs.protobuf.AuthProto.internal_static_yamcs_protobuf_auth_OpenIDConnectInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.yamcs.protobuf.AuthProto.internal_static_yamcs_protobuf_auth_OpenIDConnectInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.yamcs.protobuf.OpenIDConnectInfo.class, org.yamcs.protobuf.OpenIDConnectInfo.Builder.class);
  }

  private int bitField0_;
  public static final int CLIENTID_FIELD_NUMBER = 1;
  private volatile java.lang.Object clientId_;
  /**
   * <pre>
   * The value provided when registering Yamcs against an OpenID server
   * </pre>
   *
   * <code>optional string clientId = 1;</code>
   * @return Whether the clientId field is set.
   */
  @java.lang.Override
  public boolean hasClientId() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * The value provided when registering Yamcs against an OpenID server
   * </pre>
   *
   * <code>optional string clientId = 1;</code>
   * @return The clientId.
   */
  @java.lang.Override
  public java.lang.String getClientId() {
    java.lang.Object ref = clientId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (bs.isValidUtf8()) {
        clientId_ = s;
      }
      return s;
    }
  }
  /**
   * <pre>
   * The value provided when registering Yamcs against an OpenID server
   * </pre>
   *
   * <code>optional string clientId = 1;</code>
   * @return The bytes for clientId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getClientIdBytes() {
    java.lang.Object ref = clientId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      clientId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int AUTHORIZATIONENDPOINT_FIELD_NUMBER = 2;
  private volatile java.lang.Object authorizationEndpoint_;
  /**
   * <pre>
   * Endpoint for for authentication or consent
   * </pre>
   *
   * <code>optional string authorizationEndpoint = 2;</code>
   * @return Whether the authorizationEndpoint field is set.
   */
  @java.lang.Override
  public boolean hasAuthorizationEndpoint() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * Endpoint for for authentication or consent
   * </pre>
   *
   * <code>optional string authorizationEndpoint = 2;</code>
   * @return The authorizationEndpoint.
   */
  @java.lang.Override
  public java.lang.String getAuthorizationEndpoint() {
    java.lang.Object ref = authorizationEndpoint_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (bs.isValidUtf8()) {
        authorizationEndpoint_ = s;
      }
      return s;
    }
  }
  /**
   * <pre>
   * Endpoint for for authentication or consent
   * </pre>
   *
   * <code>optional string authorizationEndpoint = 2;</code>
   * @return The bytes for authorizationEndpoint.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getAuthorizationEndpointBytes() {
    java.lang.Object ref = authorizationEndpoint_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      authorizationEndpoint_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SCOPE_FIELD_NUMBER = 3;
  private volatile java.lang.Object scope_;
  /**
   * <pre>
   * Scope for authorization requests (value to be interpreted by client-side web application) 
   * </pre>
   *
   * <code>optional string scope = 3;</code>
   * @return Whether the scope field is set.
   */
  @java.lang.Override
  public boolean hasScope() {
    return ((bitField0_ & 0x00000004) != 0);
  }
  /**
   * <pre>
   * Scope for authorization requests (value to be interpreted by client-side web application) 
   * </pre>
   *
   * <code>optional string scope = 3;</code>
   * @return The scope.
   */
  @java.lang.Override
  public java.lang.String getScope() {
    java.lang.Object ref = scope_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (bs.isValidUtf8()) {
        scope_ = s;
      }
      return s;
    }
  }
  /**
   * <pre>
   * Scope for authorization requests (value to be interpreted by client-side web application) 
   * </pre>
   *
   * <code>optional string scope = 3;</code>
   * @return The bytes for scope.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getScopeBytes() {
    java.lang.Object ref = scope_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      scope_ = b;
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
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, clientId_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, authorizationEndpoint_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, scope_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, clientId_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, authorizationEndpoint_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, scope_);
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
    if (!(obj instanceof org.yamcs.protobuf.OpenIDConnectInfo)) {
      return super.equals(obj);
    }
    org.yamcs.protobuf.OpenIDConnectInfo other = (org.yamcs.protobuf.OpenIDConnectInfo) obj;

    if (hasClientId() != other.hasClientId()) return false;
    if (hasClientId()) {
      if (!getClientId()
          .equals(other.getClientId())) return false;
    }
    if (hasAuthorizationEndpoint() != other.hasAuthorizationEndpoint()) return false;
    if (hasAuthorizationEndpoint()) {
      if (!getAuthorizationEndpoint()
          .equals(other.getAuthorizationEndpoint())) return false;
    }
    if (hasScope() != other.hasScope()) return false;
    if (hasScope()) {
      if (!getScope()
          .equals(other.getScope())) return false;
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
    if (hasClientId()) {
      hash = (37 * hash) + CLIENTID_FIELD_NUMBER;
      hash = (53 * hash) + getClientId().hashCode();
    }
    if (hasAuthorizationEndpoint()) {
      hash = (37 * hash) + AUTHORIZATIONENDPOINT_FIELD_NUMBER;
      hash = (53 * hash) + getAuthorizationEndpoint().hashCode();
    }
    if (hasScope()) {
      hash = (37 * hash) + SCOPE_FIELD_NUMBER;
      hash = (53 * hash) + getScope().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.yamcs.protobuf.OpenIDConnectInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.yamcs.protobuf.OpenIDConnectInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.yamcs.protobuf.OpenIDConnectInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.yamcs.protobuf.OpenIDConnectInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.yamcs.protobuf.OpenIDConnectInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.yamcs.protobuf.OpenIDConnectInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.yamcs.protobuf.OpenIDConnectInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.yamcs.protobuf.OpenIDConnectInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.yamcs.protobuf.OpenIDConnectInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.yamcs.protobuf.OpenIDConnectInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.yamcs.protobuf.OpenIDConnectInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.yamcs.protobuf.OpenIDConnectInfo parseFrom(
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
  public static Builder newBuilder(org.yamcs.protobuf.OpenIDConnectInfo prototype) {
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
   * Protobuf type {@code yamcs.protobuf.auth.OpenIDConnectInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:yamcs.protobuf.auth.OpenIDConnectInfo)
      org.yamcs.protobuf.OpenIDConnectInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.yamcs.protobuf.AuthProto.internal_static_yamcs_protobuf_auth_OpenIDConnectInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.yamcs.protobuf.AuthProto.internal_static_yamcs_protobuf_auth_OpenIDConnectInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.yamcs.protobuf.OpenIDConnectInfo.class, org.yamcs.protobuf.OpenIDConnectInfo.Builder.class);
    }

    // Construct using org.yamcs.protobuf.OpenIDConnectInfo.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      clientId_ = "";
      bitField0_ = (bitField0_ & ~0x00000001);
      authorizationEndpoint_ = "";
      bitField0_ = (bitField0_ & ~0x00000002);
      scope_ = "";
      bitField0_ = (bitField0_ & ~0x00000004);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.yamcs.protobuf.AuthProto.internal_static_yamcs_protobuf_auth_OpenIDConnectInfo_descriptor;
    }

    @java.lang.Override
    public org.yamcs.protobuf.OpenIDConnectInfo getDefaultInstanceForType() {
      return org.yamcs.protobuf.OpenIDConnectInfo.getDefaultInstance();
    }

    @java.lang.Override
    public org.yamcs.protobuf.OpenIDConnectInfo build() {
      org.yamcs.protobuf.OpenIDConnectInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.yamcs.protobuf.OpenIDConnectInfo buildPartial() {
      org.yamcs.protobuf.OpenIDConnectInfo result = new org.yamcs.protobuf.OpenIDConnectInfo(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        to_bitField0_ |= 0x00000001;
      }
      result.clientId_ = clientId_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        to_bitField0_ |= 0x00000002;
      }
      result.authorizationEndpoint_ = authorizationEndpoint_;
      if (((from_bitField0_ & 0x00000004) != 0)) {
        to_bitField0_ |= 0x00000004;
      }
      result.scope_ = scope_;
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
      if (other instanceof org.yamcs.protobuf.OpenIDConnectInfo) {
        return mergeFrom((org.yamcs.protobuf.OpenIDConnectInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.yamcs.protobuf.OpenIDConnectInfo other) {
      if (other == org.yamcs.protobuf.OpenIDConnectInfo.getDefaultInstance()) return this;
      if (other.hasClientId()) {
        bitField0_ |= 0x00000001;
        clientId_ = other.clientId_;
        onChanged();
      }
      if (other.hasAuthorizationEndpoint()) {
        bitField0_ |= 0x00000002;
        authorizationEndpoint_ = other.authorizationEndpoint_;
        onChanged();
      }
      if (other.hasScope()) {
        bitField0_ |= 0x00000004;
        scope_ = other.scope_;
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
              clientId_ = input.readBytes();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              authorizationEndpoint_ = input.readBytes();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              scope_ = input.readBytes();
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

    private java.lang.Object clientId_ = "";
    /**
     * <pre>
     * The value provided when registering Yamcs against an OpenID server
     * </pre>
     *
     * <code>optional string clientId = 1;</code>
     * @return Whether the clientId field is set.
     */
    public boolean hasClientId() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * The value provided when registering Yamcs against an OpenID server
     * </pre>
     *
     * <code>optional string clientId = 1;</code>
     * @return The clientId.
     */
    public java.lang.String getClientId() {
      java.lang.Object ref = clientId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          clientId_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The value provided when registering Yamcs against an OpenID server
     * </pre>
     *
     * <code>optional string clientId = 1;</code>
     * @return The bytes for clientId.
     */
    public com.google.protobuf.ByteString
        getClientIdBytes() {
      java.lang.Object ref = clientId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        clientId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The value provided when registering Yamcs against an OpenID server
     * </pre>
     *
     * <code>optional string clientId = 1;</code>
     * @param value The clientId to set.
     * @return This builder for chaining.
     */
    public Builder setClientId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
      clientId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The value provided when registering Yamcs against an OpenID server
     * </pre>
     *
     * <code>optional string clientId = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearClientId() {
      bitField0_ = (bitField0_ & ~0x00000001);
      clientId_ = getDefaultInstance().getClientId();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The value provided when registering Yamcs against an OpenID server
     * </pre>
     *
     * <code>optional string clientId = 1;</code>
     * @param value The bytes for clientId to set.
     * @return This builder for chaining.
     */
    public Builder setClientIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
      clientId_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object authorizationEndpoint_ = "";
    /**
     * <pre>
     * Endpoint for for authentication or consent
     * </pre>
     *
     * <code>optional string authorizationEndpoint = 2;</code>
     * @return Whether the authorizationEndpoint field is set.
     */
    public boolean hasAuthorizationEndpoint() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Endpoint for for authentication or consent
     * </pre>
     *
     * <code>optional string authorizationEndpoint = 2;</code>
     * @return The authorizationEndpoint.
     */
    public java.lang.String getAuthorizationEndpoint() {
      java.lang.Object ref = authorizationEndpoint_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          authorizationEndpoint_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Endpoint for for authentication or consent
     * </pre>
     *
     * <code>optional string authorizationEndpoint = 2;</code>
     * @return The bytes for authorizationEndpoint.
     */
    public com.google.protobuf.ByteString
        getAuthorizationEndpointBytes() {
      java.lang.Object ref = authorizationEndpoint_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        authorizationEndpoint_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Endpoint for for authentication or consent
     * </pre>
     *
     * <code>optional string authorizationEndpoint = 2;</code>
     * @param value The authorizationEndpoint to set.
     * @return This builder for chaining.
     */
    public Builder setAuthorizationEndpoint(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
      authorizationEndpoint_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Endpoint for for authentication or consent
     * </pre>
     *
     * <code>optional string authorizationEndpoint = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearAuthorizationEndpoint() {
      bitField0_ = (bitField0_ & ~0x00000002);
      authorizationEndpoint_ = getDefaultInstance().getAuthorizationEndpoint();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Endpoint for for authentication or consent
     * </pre>
     *
     * <code>optional string authorizationEndpoint = 2;</code>
     * @param value The bytes for authorizationEndpoint to set.
     * @return This builder for chaining.
     */
    public Builder setAuthorizationEndpointBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
      authorizationEndpoint_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object scope_ = "";
    /**
     * <pre>
     * Scope for authorization requests (value to be interpreted by client-side web application) 
     * </pre>
     *
     * <code>optional string scope = 3;</code>
     * @return Whether the scope field is set.
     */
    public boolean hasScope() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * Scope for authorization requests (value to be interpreted by client-side web application) 
     * </pre>
     *
     * <code>optional string scope = 3;</code>
     * @return The scope.
     */
    public java.lang.String getScope() {
      java.lang.Object ref = scope_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          scope_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Scope for authorization requests (value to be interpreted by client-side web application) 
     * </pre>
     *
     * <code>optional string scope = 3;</code>
     * @return The bytes for scope.
     */
    public com.google.protobuf.ByteString
        getScopeBytes() {
      java.lang.Object ref = scope_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        scope_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Scope for authorization requests (value to be interpreted by client-side web application) 
     * </pre>
     *
     * <code>optional string scope = 3;</code>
     * @param value The scope to set.
     * @return This builder for chaining.
     */
    public Builder setScope(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
      scope_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Scope for authorization requests (value to be interpreted by client-side web application) 
     * </pre>
     *
     * <code>optional string scope = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearScope() {
      bitField0_ = (bitField0_ & ~0x00000004);
      scope_ = getDefaultInstance().getScope();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Scope for authorization requests (value to be interpreted by client-side web application) 
     * </pre>
     *
     * <code>optional string scope = 3;</code>
     * @param value The bytes for scope to set.
     * @return This builder for chaining.
     */
    public Builder setScopeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
      scope_ = value;
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


    // @@protoc_insertion_point(builder_scope:yamcs.protobuf.auth.OpenIDConnectInfo)
  }

  // @@protoc_insertion_point(class_scope:yamcs.protobuf.auth.OpenIDConnectInfo)
  private static final org.yamcs.protobuf.OpenIDConnectInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.yamcs.protobuf.OpenIDConnectInfo();
  }

  public static org.yamcs.protobuf.OpenIDConnectInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<OpenIDConnectInfo>
      PARSER = new com.google.protobuf.AbstractParser<OpenIDConnectInfo>() {
    @java.lang.Override
    public OpenIDConnectInfo parsePartialFrom(
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

  public static com.google.protobuf.Parser<OpenIDConnectInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<OpenIDConnectInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.yamcs.protobuf.OpenIDConnectInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

