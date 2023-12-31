// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: yamcs/protobuf/audit/audit.proto

package org.yamcs.protobuf.audit;

public interface ListAuditRecordsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:yamcs.protobuf.audit.ListAuditRecordsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .yamcs.protobuf.audit.AuditRecord records = 1;</code>
   */
  java.util.List<org.yamcs.protobuf.audit.AuditRecord> 
      getRecordsList();
  /**
   * <code>repeated .yamcs.protobuf.audit.AuditRecord records = 1;</code>
   */
  org.yamcs.protobuf.audit.AuditRecord getRecords(int index);
  /**
   * <code>repeated .yamcs.protobuf.audit.AuditRecord records = 1;</code>
   */
  int getRecordsCount();
  /**
   * <code>repeated .yamcs.protobuf.audit.AuditRecord records = 1;</code>
   */
  java.util.List<? extends org.yamcs.protobuf.audit.AuditRecordOrBuilder> 
      getRecordsOrBuilderList();
  /**
   * <code>repeated .yamcs.protobuf.audit.AuditRecord records = 1;</code>
   */
  org.yamcs.protobuf.audit.AuditRecordOrBuilder getRecordsOrBuilder(
      int index);

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
  boolean hasContinuationToken();
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
  java.lang.String getContinuationToken();
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
  com.google.protobuf.ByteString
      getContinuationTokenBytes();
}
