// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: yamcs/api/websocket.proto

package org.yamcs.protobuf;

/**
 * Protobuf type {@code yamcs.api.ClientMessage}
 */
public final class ClientMessage extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:yamcs.api.ClientMessage)
    ClientMessageOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ClientMessage.newBuilder() to construct.
  private ClientMessage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ClientMessage() {
    type_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ClientMessage();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.yamcs.protobuf.WebSocketProto.internal_static_yamcs_api_ClientMessage_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.yamcs.protobuf.WebSocketProto.internal_static_yamcs_api_ClientMessage_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.yamcs.protobuf.ClientMessage.class, org.yamcs.protobuf.ClientMessage.Builder.class);
  }

  public static final int TYPE_FIELD_NUMBER = 1;
  private volatile java.lang.Object type_;
  /**
   * <pre>
   * Message type. Typically the name of a topic to subscribe to, or a built-in like "cancel".
   * </pre>
   *
   * <code>string type = 1;</code>
   * @return The type.
   */
  @java.lang.Override
  public java.lang.String getType() {
    java.lang.Object ref = type_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      type_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Message type. Typically the name of a topic to subscribe to, or a built-in like "cancel".
   * </pre>
   *
   * <code>string type = 1;</code>
   * @return The bytes for type.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getTypeBytes() {
    java.lang.Object ref = type_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      type_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int OPTIONS_FIELD_NUMBER = 2;
  private com.google.protobuf.Any options_;
  /**
   * <pre>
   * Options specific to the type
   * </pre>
   *
   * <code>.google.protobuf.Any options = 2;</code>
   * @return Whether the options field is set.
   */
  @java.lang.Override
  public boolean hasOptions() {
    return options_ != null;
  }
  /**
   * <pre>
   * Options specific to the type
   * </pre>
   *
   * <code>.google.protobuf.Any options = 2;</code>
   * @return The options.
   */
  @java.lang.Override
  public com.google.protobuf.Any getOptions() {
    return options_ == null ? com.google.protobuf.Any.getDefaultInstance() : options_;
  }
  /**
   * <pre>
   * Options specific to the type
   * </pre>
   *
   * <code>.google.protobuf.Any options = 2;</code>
   */
  @java.lang.Override
  public com.google.protobuf.AnyOrBuilder getOptionsOrBuilder() {
    return getOptions();
  }

  public static final int ID_FIELD_NUMBER = 3;
  private int id_;
  /**
   * <pre>
   * Optional client-side message identifier, returned in reply messages.
   * </pre>
   *
   * <code>int32 id = 3;</code>
   * @return The id.
   */
  @java.lang.Override
  public int getId() {
    return id_;
  }

  public static final int CALL_FIELD_NUMBER = 4;
  private int call_;
  /**
   * <pre>
   * If applicable, the call associated with this message
   * This should be used when the client is streaming multiple messages
   * handled by the same call.
   * </pre>
   *
   * <code>int32 call = 4;</code>
   * @return The call.
   */
  @java.lang.Override
  public int getCall() {
    return call_;
  }

  public static final int MAXDROPPEDWRITES_FIELD_NUMBER = 5;
  private int maxDroppedWrites_;
  /**
   * <pre>
   * If set, permit the server to keep a WebSocket connection despite frame writes
   * getting dropped (channel not open or not writable). If unset the default is 0,
   * meaning that if the server can't write a frame, it will close the connection
   * (impacting all calls on that connection).
   * This attribute is only applied when it is set on the first message of a call.
   * Since Yamcs 5.7.6 this option is deprecated in favour of lowPriority below.
   * </pre>
   *
   * <code>int32 maxDroppedWrites = 5 [deprecated = true];</code>
   * @deprecated
   * @return The maxDroppedWrites.
   */
  @java.lang.Override
  @java.lang.Deprecated public int getMaxDroppedWrites() {
    return maxDroppedWrites_;
  }

  public static final int LOWPRIORITY_FIELD_NUMBER = 6;
  private boolean lowPriority_;
  /**
   * <pre>
   *If set to true, permit the server to drop messages if writing the message would cause the
   * channel to exceed the highWaterMark
   * (see https://docs.yamcs.org/yamcs-server-manual/services/global/http-server/)
   * This attribute is only applied when it is set on the first message of a call.
   * Note that if a message exceeds the highWaterMark, with this option set it will always be dropped.
   * A warning will be printed in the Yamcs logs in this case.
   * </pre>
   *
   * <code>bool lowPriority = 6;</code>
   * @return The lowPriority.
   */
  @java.lang.Override
  public boolean getLowPriority() {
    return lowPriority_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(type_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, type_);
    }
    if (options_ != null) {
      output.writeMessage(2, getOptions());
    }
    if (id_ != 0) {
      output.writeInt32(3, id_);
    }
    if (call_ != 0) {
      output.writeInt32(4, call_);
    }
    if (maxDroppedWrites_ != 0) {
      output.writeInt32(5, maxDroppedWrites_);
    }
    if (lowPriority_ != false) {
      output.writeBool(6, lowPriority_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(type_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, type_);
    }
    if (options_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getOptions());
    }
    if (id_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, id_);
    }
    if (call_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, call_);
    }
    if (maxDroppedWrites_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(5, maxDroppedWrites_);
    }
    if (lowPriority_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(6, lowPriority_);
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
    if (!(obj instanceof org.yamcs.protobuf.ClientMessage)) {
      return super.equals(obj);
    }
    org.yamcs.protobuf.ClientMessage other = (org.yamcs.protobuf.ClientMessage) obj;

    if (!getType()
        .equals(other.getType())) return false;
    if (hasOptions() != other.hasOptions()) return false;
    if (hasOptions()) {
      if (!getOptions()
          .equals(other.getOptions())) return false;
    }
    if (getId()
        != other.getId()) return false;
    if (getCall()
        != other.getCall()) return false;
    if (getMaxDroppedWrites()
        != other.getMaxDroppedWrites()) return false;
    if (getLowPriority()
        != other.getLowPriority()) return false;
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
    hash = (37 * hash) + TYPE_FIELD_NUMBER;
    hash = (53 * hash) + getType().hashCode();
    if (hasOptions()) {
      hash = (37 * hash) + OPTIONS_FIELD_NUMBER;
      hash = (53 * hash) + getOptions().hashCode();
    }
    hash = (37 * hash) + ID_FIELD_NUMBER;
    hash = (53 * hash) + getId();
    hash = (37 * hash) + CALL_FIELD_NUMBER;
    hash = (53 * hash) + getCall();
    hash = (37 * hash) + MAXDROPPEDWRITES_FIELD_NUMBER;
    hash = (53 * hash) + getMaxDroppedWrites();
    hash = (37 * hash) + LOWPRIORITY_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getLowPriority());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.yamcs.protobuf.ClientMessage parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.yamcs.protobuf.ClientMessage parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.yamcs.protobuf.ClientMessage parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.yamcs.protobuf.ClientMessage parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.yamcs.protobuf.ClientMessage parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.yamcs.protobuf.ClientMessage parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.yamcs.protobuf.ClientMessage parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.yamcs.protobuf.ClientMessage parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.yamcs.protobuf.ClientMessage parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.yamcs.protobuf.ClientMessage parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.yamcs.protobuf.ClientMessage parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.yamcs.protobuf.ClientMessage parseFrom(
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
  public static Builder newBuilder(org.yamcs.protobuf.ClientMessage prototype) {
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
   * Protobuf type {@code yamcs.api.ClientMessage}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:yamcs.api.ClientMessage)
      org.yamcs.protobuf.ClientMessageOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.yamcs.protobuf.WebSocketProto.internal_static_yamcs_api_ClientMessage_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.yamcs.protobuf.WebSocketProto.internal_static_yamcs_api_ClientMessage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.yamcs.protobuf.ClientMessage.class, org.yamcs.protobuf.ClientMessage.Builder.class);
    }

    // Construct using org.yamcs.protobuf.ClientMessage.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      type_ = "";

      if (optionsBuilder_ == null) {
        options_ = null;
      } else {
        options_ = null;
        optionsBuilder_ = null;
      }
      id_ = 0;

      call_ = 0;

      maxDroppedWrites_ = 0;

      lowPriority_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.yamcs.protobuf.WebSocketProto.internal_static_yamcs_api_ClientMessage_descriptor;
    }

    @java.lang.Override
    public org.yamcs.protobuf.ClientMessage getDefaultInstanceForType() {
      return org.yamcs.protobuf.ClientMessage.getDefaultInstance();
    }

    @java.lang.Override
    public org.yamcs.protobuf.ClientMessage build() {
      org.yamcs.protobuf.ClientMessage result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.yamcs.protobuf.ClientMessage buildPartial() {
      org.yamcs.protobuf.ClientMessage result = new org.yamcs.protobuf.ClientMessage(this);
      result.type_ = type_;
      if (optionsBuilder_ == null) {
        result.options_ = options_;
      } else {
        result.options_ = optionsBuilder_.build();
      }
      result.id_ = id_;
      result.call_ = call_;
      result.maxDroppedWrites_ = maxDroppedWrites_;
      result.lowPriority_ = lowPriority_;
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
      if (other instanceof org.yamcs.protobuf.ClientMessage) {
        return mergeFrom((org.yamcs.protobuf.ClientMessage)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.yamcs.protobuf.ClientMessage other) {
      if (other == org.yamcs.protobuf.ClientMessage.getDefaultInstance()) return this;
      if (!other.getType().isEmpty()) {
        type_ = other.type_;
        onChanged();
      }
      if (other.hasOptions()) {
        mergeOptions(other.getOptions());
      }
      if (other.getId() != 0) {
        setId(other.getId());
      }
      if (other.getCall() != 0) {
        setCall(other.getCall());
      }
      if (other.getMaxDroppedWrites() != 0) {
        setMaxDroppedWrites(other.getMaxDroppedWrites());
      }
      if (other.getLowPriority() != false) {
        setLowPriority(other.getLowPriority());
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
              type_ = input.readStringRequireUtf8();

              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getOptionsFieldBuilder().getBuilder(),
                  extensionRegistry);

              break;
            } // case 18
            case 24: {
              id_ = input.readInt32();

              break;
            } // case 24
            case 32: {
              call_ = input.readInt32();

              break;
            } // case 32
            case 40: {
              maxDroppedWrites_ = input.readInt32();

              break;
            } // case 40
            case 48: {
              lowPriority_ = input.readBool();

              break;
            } // case 48
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

    private java.lang.Object type_ = "";
    /**
     * <pre>
     * Message type. Typically the name of a topic to subscribe to, or a built-in like "cancel".
     * </pre>
     *
     * <code>string type = 1;</code>
     * @return The type.
     */
    public java.lang.String getType() {
      java.lang.Object ref = type_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        type_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Message type. Typically the name of a topic to subscribe to, or a built-in like "cancel".
     * </pre>
     *
     * <code>string type = 1;</code>
     * @return The bytes for type.
     */
    public com.google.protobuf.ByteString
        getTypeBytes() {
      java.lang.Object ref = type_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        type_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Message type. Typically the name of a topic to subscribe to, or a built-in like "cancel".
     * </pre>
     *
     * <code>string type = 1;</code>
     * @param value The type to set.
     * @return This builder for chaining.
     */
    public Builder setType(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      type_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Message type. Typically the name of a topic to subscribe to, or a built-in like "cancel".
     * </pre>
     *
     * <code>string type = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearType() {
      
      type_ = getDefaultInstance().getType();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Message type. Typically the name of a topic to subscribe to, or a built-in like "cancel".
     * </pre>
     *
     * <code>string type = 1;</code>
     * @param value The bytes for type to set.
     * @return This builder for chaining.
     */
    public Builder setTypeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      type_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.Any options_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Any, com.google.protobuf.Any.Builder, com.google.protobuf.AnyOrBuilder> optionsBuilder_;
    /**
     * <pre>
     * Options specific to the type
     * </pre>
     *
     * <code>.google.protobuf.Any options = 2;</code>
     * @return Whether the options field is set.
     */
    public boolean hasOptions() {
      return optionsBuilder_ != null || options_ != null;
    }
    /**
     * <pre>
     * Options specific to the type
     * </pre>
     *
     * <code>.google.protobuf.Any options = 2;</code>
     * @return The options.
     */
    public com.google.protobuf.Any getOptions() {
      if (optionsBuilder_ == null) {
        return options_ == null ? com.google.protobuf.Any.getDefaultInstance() : options_;
      } else {
        return optionsBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Options specific to the type
     * </pre>
     *
     * <code>.google.protobuf.Any options = 2;</code>
     */
    public Builder setOptions(com.google.protobuf.Any value) {
      if (optionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        options_ = value;
        onChanged();
      } else {
        optionsBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Options specific to the type
     * </pre>
     *
     * <code>.google.protobuf.Any options = 2;</code>
     */
    public Builder setOptions(
        com.google.protobuf.Any.Builder builderForValue) {
      if (optionsBuilder_ == null) {
        options_ = builderForValue.build();
        onChanged();
      } else {
        optionsBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Options specific to the type
     * </pre>
     *
     * <code>.google.protobuf.Any options = 2;</code>
     */
    public Builder mergeOptions(com.google.protobuf.Any value) {
      if (optionsBuilder_ == null) {
        if (options_ != null) {
          options_ =
            com.google.protobuf.Any.newBuilder(options_).mergeFrom(value).buildPartial();
        } else {
          options_ = value;
        }
        onChanged();
      } else {
        optionsBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Options specific to the type
     * </pre>
     *
     * <code>.google.protobuf.Any options = 2;</code>
     */
    public Builder clearOptions() {
      if (optionsBuilder_ == null) {
        options_ = null;
        onChanged();
      } else {
        options_ = null;
        optionsBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Options specific to the type
     * </pre>
     *
     * <code>.google.protobuf.Any options = 2;</code>
     */
    public com.google.protobuf.Any.Builder getOptionsBuilder() {
      
      onChanged();
      return getOptionsFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Options specific to the type
     * </pre>
     *
     * <code>.google.protobuf.Any options = 2;</code>
     */
    public com.google.protobuf.AnyOrBuilder getOptionsOrBuilder() {
      if (optionsBuilder_ != null) {
        return optionsBuilder_.getMessageOrBuilder();
      } else {
        return options_ == null ?
            com.google.protobuf.Any.getDefaultInstance() : options_;
      }
    }
    /**
     * <pre>
     * Options specific to the type
     * </pre>
     *
     * <code>.google.protobuf.Any options = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Any, com.google.protobuf.Any.Builder, com.google.protobuf.AnyOrBuilder> 
        getOptionsFieldBuilder() {
      if (optionsBuilder_ == null) {
        optionsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Any, com.google.protobuf.Any.Builder, com.google.protobuf.AnyOrBuilder>(
                getOptions(),
                getParentForChildren(),
                isClean());
        options_ = null;
      }
      return optionsBuilder_;
    }

    private int id_ ;
    /**
     * <pre>
     * Optional client-side message identifier, returned in reply messages.
     * </pre>
     *
     * <code>int32 id = 3;</code>
     * @return The id.
     */
    @java.lang.Override
    public int getId() {
      return id_;
    }
    /**
     * <pre>
     * Optional client-side message identifier, returned in reply messages.
     * </pre>
     *
     * <code>int32 id = 3;</code>
     * @param value The id to set.
     * @return This builder for chaining.
     */
    public Builder setId(int value) {
      
      id_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional client-side message identifier, returned in reply messages.
     * </pre>
     *
     * <code>int32 id = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearId() {
      
      id_ = 0;
      onChanged();
      return this;
    }

    private int call_ ;
    /**
     * <pre>
     * If applicable, the call associated with this message
     * This should be used when the client is streaming multiple messages
     * handled by the same call.
     * </pre>
     *
     * <code>int32 call = 4;</code>
     * @return The call.
     */
    @java.lang.Override
    public int getCall() {
      return call_;
    }
    /**
     * <pre>
     * If applicable, the call associated with this message
     * This should be used when the client is streaming multiple messages
     * handled by the same call.
     * </pre>
     *
     * <code>int32 call = 4;</code>
     * @param value The call to set.
     * @return This builder for chaining.
     */
    public Builder setCall(int value) {
      
      call_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * If applicable, the call associated with this message
     * This should be used when the client is streaming multiple messages
     * handled by the same call.
     * </pre>
     *
     * <code>int32 call = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearCall() {
      
      call_ = 0;
      onChanged();
      return this;
    }

    private int maxDroppedWrites_ ;
    /**
     * <pre>
     * If set, permit the server to keep a WebSocket connection despite frame writes
     * getting dropped (channel not open or not writable). If unset the default is 0,
     * meaning that if the server can't write a frame, it will close the connection
     * (impacting all calls on that connection).
     * This attribute is only applied when it is set on the first message of a call.
     * Since Yamcs 5.7.6 this option is deprecated in favour of lowPriority below.
     * </pre>
     *
     * <code>int32 maxDroppedWrites = 5 [deprecated = true];</code>
     * @deprecated
     * @return The maxDroppedWrites.
     */
    @java.lang.Override
    @java.lang.Deprecated public int getMaxDroppedWrites() {
      return maxDroppedWrites_;
    }
    /**
     * <pre>
     * If set, permit the server to keep a WebSocket connection despite frame writes
     * getting dropped (channel not open or not writable). If unset the default is 0,
     * meaning that if the server can't write a frame, it will close the connection
     * (impacting all calls on that connection).
     * This attribute is only applied when it is set on the first message of a call.
     * Since Yamcs 5.7.6 this option is deprecated in favour of lowPriority below.
     * </pre>
     *
     * <code>int32 maxDroppedWrites = 5 [deprecated = true];</code>
     * @deprecated
     * @param value The maxDroppedWrites to set.
     * @return This builder for chaining.
     */
    @java.lang.Deprecated public Builder setMaxDroppedWrites(int value) {
      
      maxDroppedWrites_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * If set, permit the server to keep a WebSocket connection despite frame writes
     * getting dropped (channel not open or not writable). If unset the default is 0,
     * meaning that if the server can't write a frame, it will close the connection
     * (impacting all calls on that connection).
     * This attribute is only applied when it is set on the first message of a call.
     * Since Yamcs 5.7.6 this option is deprecated in favour of lowPriority below.
     * </pre>
     *
     * <code>int32 maxDroppedWrites = 5 [deprecated = true];</code>
     * @deprecated
     * @return This builder for chaining.
     */
    @java.lang.Deprecated public Builder clearMaxDroppedWrites() {
      
      maxDroppedWrites_ = 0;
      onChanged();
      return this;
    }

    private boolean lowPriority_ ;
    /**
     * <pre>
     *If set to true, permit the server to drop messages if writing the message would cause the
     * channel to exceed the highWaterMark
     * (see https://docs.yamcs.org/yamcs-server-manual/services/global/http-server/)
     * This attribute is only applied when it is set on the first message of a call.
     * Note that if a message exceeds the highWaterMark, with this option set it will always be dropped.
     * A warning will be printed in the Yamcs logs in this case.
     * </pre>
     *
     * <code>bool lowPriority = 6;</code>
     * @return The lowPriority.
     */
    @java.lang.Override
    public boolean getLowPriority() {
      return lowPriority_;
    }
    /**
     * <pre>
     *If set to true, permit the server to drop messages if writing the message would cause the
     * channel to exceed the highWaterMark
     * (see https://docs.yamcs.org/yamcs-server-manual/services/global/http-server/)
     * This attribute is only applied when it is set on the first message of a call.
     * Note that if a message exceeds the highWaterMark, with this option set it will always be dropped.
     * A warning will be printed in the Yamcs logs in this case.
     * </pre>
     *
     * <code>bool lowPriority = 6;</code>
     * @param value The lowPriority to set.
     * @return This builder for chaining.
     */
    public Builder setLowPriority(boolean value) {
      
      lowPriority_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *If set to true, permit the server to drop messages if writing the message would cause the
     * channel to exceed the highWaterMark
     * (see https://docs.yamcs.org/yamcs-server-manual/services/global/http-server/)
     * This attribute is only applied when it is set on the first message of a call.
     * Note that if a message exceeds the highWaterMark, with this option set it will always be dropped.
     * A warning will be printed in the Yamcs logs in this case.
     * </pre>
     *
     * <code>bool lowPriority = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearLowPriority() {
      
      lowPriority_ = false;
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


    // @@protoc_insertion_point(builder_scope:yamcs.api.ClientMessage)
  }

  // @@protoc_insertion_point(class_scope:yamcs.api.ClientMessage)
  private static final org.yamcs.protobuf.ClientMessage DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.yamcs.protobuf.ClientMessage();
  }

  public static org.yamcs.protobuf.ClientMessage getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ClientMessage>
      PARSER = new com.google.protobuf.AbstractParser<ClientMessage>() {
    @java.lang.Override
    public ClientMessage parsePartialFrom(
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

  public static com.google.protobuf.Parser<ClientMessage> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ClientMessage> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.yamcs.protobuf.ClientMessage getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

