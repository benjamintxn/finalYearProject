// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: yamcs/protobuf/buckets/buckets.proto

package org.yamcs.protobuf;

public interface DeleteBucketRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:yamcs.protobuf.buckets.DeleteBucketRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Yamcs instance name. Or _global.
   * </pre>
   *
   * <code>optional string instance = 1;</code>
   * @return Whether the instance field is set.
   */
  boolean hasInstance();
  /**
   * <pre>
   * Yamcs instance name. Or _global.
   * </pre>
   *
   * <code>optional string instance = 1;</code>
   * @return The instance.
   */
  java.lang.String getInstance();
  /**
   * <pre>
   * Yamcs instance name. Or _global.
   * </pre>
   *
   * <code>optional string instance = 1;</code>
   * @return The bytes for instance.
   */
  com.google.protobuf.ByteString
      getInstanceBytes();

  /**
   * <pre>
   * Bucket name.
   * </pre>
   *
   * <code>optional string bucketName = 2;</code>
   * @return Whether the bucketName field is set.
   */
  boolean hasBucketName();
  /**
   * <pre>
   * Bucket name.
   * </pre>
   *
   * <code>optional string bucketName = 2;</code>
   * @return The bucketName.
   */
  java.lang.String getBucketName();
  /**
   * <pre>
   * Bucket name.
   * </pre>
   *
   * <code>optional string bucketName = 2;</code>
   * @return The bytes for bucketName.
   */
  com.google.protobuf.ByteString
      getBucketNameBytes();
}
