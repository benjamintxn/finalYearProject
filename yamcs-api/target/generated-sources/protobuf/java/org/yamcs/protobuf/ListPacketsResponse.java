// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: yamcs/protobuf/packets/packets_service.proto

package org.yamcs.protobuf;

/**
 * Protobuf type {@code yamcs.protobuf.packets.ListPacketsResponse}
 */
public final class ListPacketsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:yamcs.protobuf.packets.ListPacketsResponse)
    ListPacketsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListPacketsResponse.newBuilder() to construct.
  private ListPacketsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListPacketsResponse() {
    packet_ = java.util.Collections.emptyList();
    continuationToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListPacketsResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.yamcs.protobuf.PacketsServiceProto.internal_static_yamcs_protobuf_packets_ListPacketsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.yamcs.protobuf.PacketsServiceProto.internal_static_yamcs_protobuf_packets_ListPacketsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.yamcs.protobuf.ListPacketsResponse.class, org.yamcs.protobuf.ListPacketsResponse.Builder.class);
  }

  private int bitField0_;
  public static final int PACKET_FIELD_NUMBER = 1;
  private java.util.List<org.yamcs.protobuf.TmPacketData> packet_;
  /**
   * <code>repeated .yamcs.protobuf.packets.TmPacketData packet = 1;</code>
   */
  @java.lang.Override
  public java.util.List<org.yamcs.protobuf.TmPacketData> getPacketList() {
    return packet_;
  }
  /**
   * <code>repeated .yamcs.protobuf.packets.TmPacketData packet = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends org.yamcs.protobuf.TmPacketDataOrBuilder> 
      getPacketOrBuilderList() {
    return packet_;
  }
  /**
   * <code>repeated .yamcs.protobuf.packets.TmPacketData packet = 1;</code>
   */
  @java.lang.Override
  public int getPacketCount() {
    return packet_.size();
  }
  /**
   * <code>repeated .yamcs.protobuf.packets.TmPacketData packet = 1;</code>
   */
  @java.lang.Override
  public org.yamcs.protobuf.TmPacketData getPacket(int index) {
    return packet_.get(index);
  }
  /**
   * <code>repeated .yamcs.protobuf.packets.TmPacketData packet = 1;</code>
   */
  @java.lang.Override
  public org.yamcs.protobuf.TmPacketDataOrBuilder getPacketOrBuilder(
      int index) {
    return packet_.get(index);
  }

  public static final int CONTINUATIONTOKEN_FIELD_NUMBER = 2;
  private volatile java.lang.Object continuationToken_;
  /**
   * <pre>
   * Token indicating the response is only partial. More results can then
   * be obtained by performing the same request (including all original
   * query parameters) and setting the ``next`` parameter to this token.
   * </pre>
   *
   * <code>optional string continuationToken = 2;</code>
   * @return Whether the continuationToken field is set.
   */
  @java.lang.Override
  public boolean hasContinuationToken() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * Token indicating the response is only partial. More results can then
   * be obtained by performing the same request (including all original
   * query parameters) and setting the ``next`` parameter to this token.
   * </pre>
   *
   * <code>optional string continuationToken = 2;</code>
   * @return The continuationToken.
   */
  @java.lang.Override
  public java.lang.String getContinuationToken() {
    java.lang.Object ref = continuationToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (bs.isValidUtf8()) {
        continuationToken_ = s;
      }
      return s;
    }
  }
  /**
   * <pre>
   * Token indicating the response is only partial. More results can then
   * be obtained by performing the same request (including all original
   * query parameters) and setting the ``next`` parameter to this token.
   * </pre>
   *
   * <code>optional string continuationToken = 2;</code>
   * @return The bytes for continuationToken.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getContinuationTokenBytes() {
    java.lang.Object ref = continuationToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      continuationToken_ = b;
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

    for (int i = 0; i < getPacketCount(); i++) {
      if (!getPacket(i).isInitialized()) {
        memoizedIsInitialized = 0;
        return false;
      }
    }
    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    for (int i = 0; i < packet_.size(); i++) {
      output.writeMessage(1, packet_.get(i));
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, continuationToken_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < packet_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, packet_.get(i));
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, continuationToken_);
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
    if (!(obj instanceof org.yamcs.protobuf.ListPacketsResponse)) {
      return super.equals(obj);
    }
    org.yamcs.protobuf.ListPacketsResponse other = (org.yamcs.protobuf.ListPacketsResponse) obj;

    if (!getPacketList()
        .equals(other.getPacketList())) return false;
    if (hasContinuationToken() != other.hasContinuationToken()) return false;
    if (hasContinuationToken()) {
      if (!getContinuationToken()
          .equals(other.getContinuationToken())) return false;
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
    if (getPacketCount() > 0) {
      hash = (37 * hash) + PACKET_FIELD_NUMBER;
      hash = (53 * hash) + getPacketList().hashCode();
    }
    if (hasContinuationToken()) {
      hash = (37 * hash) + CONTINUATIONTOKEN_FIELD_NUMBER;
      hash = (53 * hash) + getContinuationToken().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.yamcs.protobuf.ListPacketsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.yamcs.protobuf.ListPacketsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.yamcs.protobuf.ListPacketsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.yamcs.protobuf.ListPacketsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.yamcs.protobuf.ListPacketsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.yamcs.protobuf.ListPacketsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.yamcs.protobuf.ListPacketsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.yamcs.protobuf.ListPacketsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.yamcs.protobuf.ListPacketsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.yamcs.protobuf.ListPacketsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.yamcs.protobuf.ListPacketsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.yamcs.protobuf.ListPacketsResponse parseFrom(
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
  public static Builder newBuilder(org.yamcs.protobuf.ListPacketsResponse prototype) {
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
   * Protobuf type {@code yamcs.protobuf.packets.ListPacketsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:yamcs.protobuf.packets.ListPacketsResponse)
      org.yamcs.protobuf.ListPacketsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.yamcs.protobuf.PacketsServiceProto.internal_static_yamcs_protobuf_packets_ListPacketsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.yamcs.protobuf.PacketsServiceProto.internal_static_yamcs_protobuf_packets_ListPacketsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.yamcs.protobuf.ListPacketsResponse.class, org.yamcs.protobuf.ListPacketsResponse.Builder.class);
    }

    // Construct using org.yamcs.protobuf.ListPacketsResponse.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (packetBuilder_ == null) {
        packet_ = java.util.Collections.emptyList();
      } else {
        packet_ = null;
        packetBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      continuationToken_ = "";
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.yamcs.protobuf.PacketsServiceProto.internal_static_yamcs_protobuf_packets_ListPacketsResponse_descriptor;
    }

    @java.lang.Override
    public org.yamcs.protobuf.ListPacketsResponse getDefaultInstanceForType() {
      return org.yamcs.protobuf.ListPacketsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public org.yamcs.protobuf.ListPacketsResponse build() {
      org.yamcs.protobuf.ListPacketsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.yamcs.protobuf.ListPacketsResponse buildPartial() {
      org.yamcs.protobuf.ListPacketsResponse result = new org.yamcs.protobuf.ListPacketsResponse(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (packetBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          packet_ = java.util.Collections.unmodifiableList(packet_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.packet_ = packet_;
      } else {
        result.packet_ = packetBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        to_bitField0_ |= 0x00000001;
      }
      result.continuationToken_ = continuationToken_;
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
      if (other instanceof org.yamcs.protobuf.ListPacketsResponse) {
        return mergeFrom((org.yamcs.protobuf.ListPacketsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.yamcs.protobuf.ListPacketsResponse other) {
      if (other == org.yamcs.protobuf.ListPacketsResponse.getDefaultInstance()) return this;
      if (packetBuilder_ == null) {
        if (!other.packet_.isEmpty()) {
          if (packet_.isEmpty()) {
            packet_ = other.packet_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensurePacketIsMutable();
            packet_.addAll(other.packet_);
          }
          onChanged();
        }
      } else {
        if (!other.packet_.isEmpty()) {
          if (packetBuilder_.isEmpty()) {
            packetBuilder_.dispose();
            packetBuilder_ = null;
            packet_ = other.packet_;
            bitField0_ = (bitField0_ & ~0x00000001);
            packetBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getPacketFieldBuilder() : null;
          } else {
            packetBuilder_.addAllMessages(other.packet_);
          }
        }
      }
      if (other.hasContinuationToken()) {
        bitField0_ |= 0x00000002;
        continuationToken_ = other.continuationToken_;
        onChanged();
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      for (int i = 0; i < getPacketCount(); i++) {
        if (!getPacket(i).isInitialized()) {
          return false;
        }
      }
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
              org.yamcs.protobuf.TmPacketData m =
                  input.readMessage(
                      org.yamcs.protobuf.TmPacketData.PARSER,
                      extensionRegistry);
              if (packetBuilder_ == null) {
                ensurePacketIsMutable();
                packet_.add(m);
              } else {
                packetBuilder_.addMessage(m);
              }
              break;
            } // case 10
            case 18: {
              continuationToken_ = input.readBytes();
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

    private java.util.List<org.yamcs.protobuf.TmPacketData> packet_ =
      java.util.Collections.emptyList();
    private void ensurePacketIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        packet_ = new java.util.ArrayList<org.yamcs.protobuf.TmPacketData>(packet_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        org.yamcs.protobuf.TmPacketData, org.yamcs.protobuf.TmPacketData.Builder, org.yamcs.protobuf.TmPacketDataOrBuilder> packetBuilder_;

    /**
     * <code>repeated .yamcs.protobuf.packets.TmPacketData packet = 1;</code>
     */
    public java.util.List<org.yamcs.protobuf.TmPacketData> getPacketList() {
      if (packetBuilder_ == null) {
        return java.util.Collections.unmodifiableList(packet_);
      } else {
        return packetBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .yamcs.protobuf.packets.TmPacketData packet = 1;</code>
     */
    public int getPacketCount() {
      if (packetBuilder_ == null) {
        return packet_.size();
      } else {
        return packetBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .yamcs.protobuf.packets.TmPacketData packet = 1;</code>
     */
    public org.yamcs.protobuf.TmPacketData getPacket(int index) {
      if (packetBuilder_ == null) {
        return packet_.get(index);
      } else {
        return packetBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .yamcs.protobuf.packets.TmPacketData packet = 1;</code>
     */
    public Builder setPacket(
        int index, org.yamcs.protobuf.TmPacketData value) {
      if (packetBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePacketIsMutable();
        packet_.set(index, value);
        onChanged();
      } else {
        packetBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .yamcs.protobuf.packets.TmPacketData packet = 1;</code>
     */
    public Builder setPacket(
        int index, org.yamcs.protobuf.TmPacketData.Builder builderForValue) {
      if (packetBuilder_ == null) {
        ensurePacketIsMutable();
        packet_.set(index, builderForValue.build());
        onChanged();
      } else {
        packetBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .yamcs.protobuf.packets.TmPacketData packet = 1;</code>
     */
    public Builder addPacket(org.yamcs.protobuf.TmPacketData value) {
      if (packetBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePacketIsMutable();
        packet_.add(value);
        onChanged();
      } else {
        packetBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .yamcs.protobuf.packets.TmPacketData packet = 1;</code>
     */
    public Builder addPacket(
        int index, org.yamcs.protobuf.TmPacketData value) {
      if (packetBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePacketIsMutable();
        packet_.add(index, value);
        onChanged();
      } else {
        packetBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .yamcs.protobuf.packets.TmPacketData packet = 1;</code>
     */
    public Builder addPacket(
        org.yamcs.protobuf.TmPacketData.Builder builderForValue) {
      if (packetBuilder_ == null) {
        ensurePacketIsMutable();
        packet_.add(builderForValue.build());
        onChanged();
      } else {
        packetBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .yamcs.protobuf.packets.TmPacketData packet = 1;</code>
     */
    public Builder addPacket(
        int index, org.yamcs.protobuf.TmPacketData.Builder builderForValue) {
      if (packetBuilder_ == null) {
        ensurePacketIsMutable();
        packet_.add(index, builderForValue.build());
        onChanged();
      } else {
        packetBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .yamcs.protobuf.packets.TmPacketData packet = 1;</code>
     */
    public Builder addAllPacket(
        java.lang.Iterable<? extends org.yamcs.protobuf.TmPacketData> values) {
      if (packetBuilder_ == null) {
        ensurePacketIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, packet_);
        onChanged();
      } else {
        packetBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .yamcs.protobuf.packets.TmPacketData packet = 1;</code>
     */
    public Builder clearPacket() {
      if (packetBuilder_ == null) {
        packet_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        packetBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .yamcs.protobuf.packets.TmPacketData packet = 1;</code>
     */
    public Builder removePacket(int index) {
      if (packetBuilder_ == null) {
        ensurePacketIsMutable();
        packet_.remove(index);
        onChanged();
      } else {
        packetBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .yamcs.protobuf.packets.TmPacketData packet = 1;</code>
     */
    public org.yamcs.protobuf.TmPacketData.Builder getPacketBuilder(
        int index) {
      return getPacketFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .yamcs.protobuf.packets.TmPacketData packet = 1;</code>
     */
    public org.yamcs.protobuf.TmPacketDataOrBuilder getPacketOrBuilder(
        int index) {
      if (packetBuilder_ == null) {
        return packet_.get(index);  } else {
        return packetBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .yamcs.protobuf.packets.TmPacketData packet = 1;</code>
     */
    public java.util.List<? extends org.yamcs.protobuf.TmPacketDataOrBuilder> 
         getPacketOrBuilderList() {
      if (packetBuilder_ != null) {
        return packetBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(packet_);
      }
    }
    /**
     * <code>repeated .yamcs.protobuf.packets.TmPacketData packet = 1;</code>
     */
    public org.yamcs.protobuf.TmPacketData.Builder addPacketBuilder() {
      return getPacketFieldBuilder().addBuilder(
          org.yamcs.protobuf.TmPacketData.getDefaultInstance());
    }
    /**
     * <code>repeated .yamcs.protobuf.packets.TmPacketData packet = 1;</code>
     */
    public org.yamcs.protobuf.TmPacketData.Builder addPacketBuilder(
        int index) {
      return getPacketFieldBuilder().addBuilder(
          index, org.yamcs.protobuf.TmPacketData.getDefaultInstance());
    }
    /**
     * <code>repeated .yamcs.protobuf.packets.TmPacketData packet = 1;</code>
     */
    public java.util.List<org.yamcs.protobuf.TmPacketData.Builder> 
         getPacketBuilderList() {
      return getPacketFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        org.yamcs.protobuf.TmPacketData, org.yamcs.protobuf.TmPacketData.Builder, org.yamcs.protobuf.TmPacketDataOrBuilder> 
        getPacketFieldBuilder() {
      if (packetBuilder_ == null) {
        packetBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            org.yamcs.protobuf.TmPacketData, org.yamcs.protobuf.TmPacketData.Builder, org.yamcs.protobuf.TmPacketDataOrBuilder>(
                packet_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        packet_ = null;
      }
      return packetBuilder_;
    }

    private java.lang.Object continuationToken_ = "";
    /**
     * <pre>
     * Token indicating the response is only partial. More results can then
     * be obtained by performing the same request (including all original
     * query parameters) and setting the ``next`` parameter to this token.
     * </pre>
     *
     * <code>optional string continuationToken = 2;</code>
     * @return Whether the continuationToken field is set.
     */
    public boolean hasContinuationToken() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Token indicating the response is only partial. More results can then
     * be obtained by performing the same request (including all original
     * query parameters) and setting the ``next`` parameter to this token.
     * </pre>
     *
     * <code>optional string continuationToken = 2;</code>
     * @return The continuationToken.
     */
    public java.lang.String getContinuationToken() {
      java.lang.Object ref = continuationToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          continuationToken_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Token indicating the response is only partial. More results can then
     * be obtained by performing the same request (including all original
     * query parameters) and setting the ``next`` parameter to this token.
     * </pre>
     *
     * <code>optional string continuationToken = 2;</code>
     * @return The bytes for continuationToken.
     */
    public com.google.protobuf.ByteString
        getContinuationTokenBytes() {
      java.lang.Object ref = continuationToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        continuationToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Token indicating the response is only partial. More results can then
     * be obtained by performing the same request (including all original
     * query parameters) and setting the ``next`` parameter to this token.
     * </pre>
     *
     * <code>optional string continuationToken = 2;</code>
     * @param value The continuationToken to set.
     * @return This builder for chaining.
     */
    public Builder setContinuationToken(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
      continuationToken_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Token indicating the response is only partial. More results can then
     * be obtained by performing the same request (including all original
     * query parameters) and setting the ``next`` parameter to this token.
     * </pre>
     *
     * <code>optional string continuationToken = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearContinuationToken() {
      bitField0_ = (bitField0_ & ~0x00000002);
      continuationToken_ = getDefaultInstance().getContinuationToken();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Token indicating the response is only partial. More results can then
     * be obtained by performing the same request (including all original
     * query parameters) and setting the ``next`` parameter to this token.
     * </pre>
     *
     * <code>optional string continuationToken = 2;</code>
     * @param value The bytes for continuationToken to set.
     * @return This builder for chaining.
     */
    public Builder setContinuationTokenBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
      continuationToken_ = value;
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


    // @@protoc_insertion_point(builder_scope:yamcs.protobuf.packets.ListPacketsResponse)
  }

  // @@protoc_insertion_point(class_scope:yamcs.protobuf.packets.ListPacketsResponse)
  private static final org.yamcs.protobuf.ListPacketsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.yamcs.protobuf.ListPacketsResponse();
  }

  public static org.yamcs.protobuf.ListPacketsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<ListPacketsResponse>
      PARSER = new com.google.protobuf.AbstractParser<ListPacketsResponse>() {
    @java.lang.Override
    public ListPacketsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListPacketsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListPacketsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.yamcs.protobuf.ListPacketsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

