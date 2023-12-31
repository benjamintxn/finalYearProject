// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: yamcs/protobuf/filetransfer/filetransfer.proto

package org.yamcs.protobuf;

public interface CreateTransferRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:yamcs.protobuf.filetransfer.CreateTransferRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional string instance = 1;</code>
   * @return Whether the instance field is set.
   */
  boolean hasInstance();
  /**
   * <code>optional string instance = 1;</code>
   * @return The instance.
   */
  java.lang.String getInstance();
  /**
   * <code>optional string instance = 1;</code>
   * @return The bytes for instance.
   */
  com.google.protobuf.ByteString
      getInstanceBytes();

  /**
   * <pre>
   *service name
   * </pre>
   *
   * <code>optional string serviceName = 8;</code>
   * @return Whether the serviceName field is set.
   */
  boolean hasServiceName();
  /**
   * <pre>
   *service name
   * </pre>
   *
   * <code>optional string serviceName = 8;</code>
   * @return The serviceName.
   */
  java.lang.String getServiceName();
  /**
   * <pre>
   *service name
   * </pre>
   *
   * <code>optional string serviceName = 8;</code>
   * @return The bytes for serviceName.
   */
  com.google.protobuf.ByteString
      getServiceNameBytes();

  /**
   * <pre>
   * **Required** One of ``UPLOAD`` or ``DOWNLOAD``.
   * </pre>
   *
   * <code>optional .yamcs.protobuf.filetransfer.TransferDirection direction = 2;</code>
   * @return Whether the direction field is set.
   */
  boolean hasDirection();
  /**
   * <pre>
   * **Required** One of ``UPLOAD`` or ``DOWNLOAD``.
   * </pre>
   *
   * <code>optional .yamcs.protobuf.filetransfer.TransferDirection direction = 2;</code>
   * @return The direction.
   */
  org.yamcs.protobuf.TransferDirection getDirection();

  /**
   * <pre>
   * **Required** The bucket containing the local Yamcs object.
   * </pre>
   *
   * <code>optional string bucket = 3;</code>
   * @return Whether the bucket field is set.
   */
  boolean hasBucket();
  /**
   * <pre>
   * **Required** The bucket containing the local Yamcs object.
   * </pre>
   *
   * <code>optional string bucket = 3;</code>
   * @return The bucket.
   */
  java.lang.String getBucket();
  /**
   * <pre>
   * **Required** The bucket containing the local Yamcs object.
   * </pre>
   *
   * <code>optional string bucket = 3;</code>
   * @return The bytes for bucket.
   */
  com.google.protobuf.ByteString
      getBucketBytes();

  /**
   * <pre>
   * **Required** The object name in Yamcs bucket storage. For UPLOAD transfers,
   * this object must exist and is what Yamcs will transfer to the remote
   * entity. For DOWNLOAD transfers, it refers to the object that
   * Yamcs will write to when downloading from a remote entity.
   * </pre>
   *
   * <code>optional string objectName = 4;</code>
   * @return Whether the objectName field is set.
   */
  boolean hasObjectName();
  /**
   * <pre>
   * **Required** The object name in Yamcs bucket storage. For UPLOAD transfers,
   * this object must exist and is what Yamcs will transfer to the remote
   * entity. For DOWNLOAD transfers, it refers to the object that
   * Yamcs will write to when downloading from a remote entity.
   * </pre>
   *
   * <code>optional string objectName = 4;</code>
   * @return The objectName.
   */
  java.lang.String getObjectName();
  /**
   * <pre>
   * **Required** The object name in Yamcs bucket storage. For UPLOAD transfers,
   * this object must exist and is what Yamcs will transfer to the remote
   * entity. For DOWNLOAD transfers, it refers to the object that
   * Yamcs will write to when downloading from a remote entity.
   * </pre>
   *
   * <code>optional string objectName = 4;</code>
   * @return The bytes for objectName.
   */
  com.google.protobuf.ByteString
      getObjectNameBytes();

  /**
   * <pre>
   * **Required** The path at the remote entity. Example: ``a/local/path/some_filename``.
   * </pre>
   *
   * <code>optional string remotePath = 5;</code>
   * @return Whether the remotePath field is set.
   */
  boolean hasRemotePath();
  /**
   * <pre>
   * **Required** The path at the remote entity. Example: ``a/local/path/some_filename``.
   * </pre>
   *
   * <code>optional string remotePath = 5;</code>
   * @return The remotePath.
   */
  java.lang.String getRemotePath();
  /**
   * <pre>
   * **Required** The path at the remote entity. Example: ``a/local/path/some_filename``.
   * </pre>
   *
   * <code>optional string remotePath = 5;</code>
   * @return The bytes for remotePath.
   */
  com.google.protobuf.ByteString
      getRemotePathBytes();

  /**
   * <pre>
   * Deprecated: use 'options' instead
   * Configuration options specific to ``DOWNLOAD`` transfers.
   * </pre>
   *
   * <code>optional .yamcs.protobuf.filetransfer.CreateTransferRequest.DownloadOptions downloadOptions = 6 [deprecated = true];</code>
   * @deprecated
   * @return Whether the downloadOptions field is set.
   */
  @java.lang.Deprecated boolean hasDownloadOptions();
  /**
   * <pre>
   * Deprecated: use 'options' instead
   * Configuration options specific to ``DOWNLOAD`` transfers.
   * </pre>
   *
   * <code>optional .yamcs.protobuf.filetransfer.CreateTransferRequest.DownloadOptions downloadOptions = 6 [deprecated = true];</code>
   * @deprecated
   * @return The downloadOptions.
   */
  @java.lang.Deprecated org.yamcs.protobuf.CreateTransferRequest.DownloadOptions getDownloadOptions();
  /**
   * <pre>
   * Deprecated: use 'options' instead
   * Configuration options specific to ``DOWNLOAD`` transfers.
   * </pre>
   *
   * <code>optional .yamcs.protobuf.filetransfer.CreateTransferRequest.DownloadOptions downloadOptions = 6 [deprecated = true];</code>
   */
  @java.lang.Deprecated org.yamcs.protobuf.CreateTransferRequest.DownloadOptionsOrBuilder getDownloadOptionsOrBuilder();

  /**
   * <pre>
   * Deprecated: use 'options' instead
   * Configuration options specific to ``UPLOAD`` transfers.
   * </pre>
   *
   * <code>optional .yamcs.protobuf.filetransfer.CreateTransferRequest.UploadOptions uploadOptions = 7 [deprecated = true];</code>
   * @deprecated
   * @return Whether the uploadOptions field is set.
   */
  @java.lang.Deprecated boolean hasUploadOptions();
  /**
   * <pre>
   * Deprecated: use 'options' instead
   * Configuration options specific to ``UPLOAD`` transfers.
   * </pre>
   *
   * <code>optional .yamcs.protobuf.filetransfer.CreateTransferRequest.UploadOptions uploadOptions = 7 [deprecated = true];</code>
   * @deprecated
   * @return The uploadOptions.
   */
  @java.lang.Deprecated org.yamcs.protobuf.CreateTransferRequest.UploadOptions getUploadOptions();
  /**
   * <pre>
   * Deprecated: use 'options' instead
   * Configuration options specific to ``UPLOAD`` transfers.
   * </pre>
   *
   * <code>optional .yamcs.protobuf.filetransfer.CreateTransferRequest.UploadOptions uploadOptions = 7 [deprecated = true];</code>
   */
  @java.lang.Deprecated org.yamcs.protobuf.CreateTransferRequest.UploadOptionsOrBuilder getUploadOptionsOrBuilder();

  /**
   * <pre>
   *used to derive the source entity id
   * </pre>
   *
   * <code>optional string source = 9;</code>
   * @return Whether the source field is set.
   */
  boolean hasSource();
  /**
   * <pre>
   *used to derive the source entity id
   * </pre>
   *
   * <code>optional string source = 9;</code>
   * @return The source.
   */
  java.lang.String getSource();
  /**
   * <pre>
   *used to derive the source entity id
   * </pre>
   *
   * <code>optional string source = 9;</code>
   * @return The bytes for source.
   */
  com.google.protobuf.ByteString
      getSourceBytes();

  /**
   * <pre>
   *used to derive the destination entity id
   * </pre>
   *
   * <code>optional string destination = 10;</code>
   * @return Whether the destination field is set.
   */
  boolean hasDestination();
  /**
   * <pre>
   *used to derive the destination entity id
   * </pre>
   *
   * <code>optional string destination = 10;</code>
   * @return The destination.
   */
  java.lang.String getDestination();
  /**
   * <pre>
   *used to derive the destination entity id
   * </pre>
   *
   * <code>optional string destination = 10;</code>
   * @return The bytes for destination.
   */
  com.google.protobuf.ByteString
      getDestinationBytes();

  /**
   * <pre>
   * Options for the transfer
   * </pre>
   *
   * <code>optional .google.protobuf.Struct options = 11;</code>
   * @return Whether the options field is set.
   */
  boolean hasOptions();
  /**
   * <pre>
   * Options for the transfer
   * </pre>
   *
   * <code>optional .google.protobuf.Struct options = 11;</code>
   * @return The options.
   */
  com.google.protobuf.Struct getOptions();
  /**
   * <pre>
   * Options for the transfer
   * </pre>
   *
   * <code>optional .google.protobuf.Struct options = 11;</code>
   */
  com.google.protobuf.StructOrBuilder getOptionsOrBuilder();
}
