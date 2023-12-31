// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: security.proto

package org.yamcs.security.protobuf;

public interface UserAccountRecordDetailOrBuilder extends
    // @@protoc_insertion_point(interface_extends:UserAccountRecordDetail)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional string email = 1;</code>
   * @return Whether the email field is set.
   */
  boolean hasEmail();
  /**
   * <code>optional string email = 1;</code>
   * @return The email.
   */
  java.lang.String getEmail();
  /**
   * <code>optional string email = 1;</code>
   * @return The bytes for email.
   */
  com.google.protobuf.ByteString
      getEmailBytes();

  /**
   * <code>optional string hash = 2;</code>
   * @return Whether the hash field is set.
   */
  boolean hasHash();
  /**
   * <code>optional string hash = 2;</code>
   * @return The hash.
   */
  java.lang.String getHash();
  /**
   * <code>optional string hash = 2;</code>
   * @return The bytes for hash.
   */
  com.google.protobuf.ByteString
      getHashBytes();

  /**
   * <code>optional bool superuser = 3;</code>
   * @return Whether the superuser field is set.
   */
  boolean hasSuperuser();
  /**
   * <code>optional bool superuser = 3;</code>
   * @return The superuser.
   */
  boolean getSuperuser();

  /**
   * <code>repeated string roles = 5;</code>
   * @return A list containing the roles.
   */
  java.util.List<java.lang.String>
      getRolesList();
  /**
   * <code>repeated string roles = 5;</code>
   * @return The count of roles.
   */
  int getRolesCount();
  /**
   * <code>repeated string roles = 5;</code>
   * @param index The index of the element to return.
   * @return The roles at the given index.
   */
  java.lang.String getRoles(int index);
  /**
   * <code>repeated string roles = 5;</code>
   * @param index The index of the value to return.
   * @return The bytes of the roles at the given index.
   */
  com.google.protobuf.ByteString
      getRolesBytes(int index);

  /**
   * <code>repeated .ExternalIdentity identities = 4;</code>
   */
  java.util.List<org.yamcs.security.protobuf.ExternalIdentity> 
      getIdentitiesList();
  /**
   * <code>repeated .ExternalIdentity identities = 4;</code>
   */
  org.yamcs.security.protobuf.ExternalIdentity getIdentities(int index);
  /**
   * <code>repeated .ExternalIdentity identities = 4;</code>
   */
  int getIdentitiesCount();
  /**
   * <code>repeated .ExternalIdentity identities = 4;</code>
   */
  java.util.List<? extends org.yamcs.security.protobuf.ExternalIdentityOrBuilder> 
      getIdentitiesOrBuilderList();
  /**
   * <code>repeated .ExternalIdentity identities = 4;</code>
   */
  org.yamcs.security.protobuf.ExternalIdentityOrBuilder getIdentitiesOrBuilder(
      int index);

  /**
   * <code>optional .Clearance clearance = 6;</code>
   * @return Whether the clearance field is set.
   */
  boolean hasClearance();
  /**
   * <code>optional .Clearance clearance = 6;</code>
   * @return The clearance.
   */
  org.yamcs.security.protobuf.Clearance getClearance();
  /**
   * <code>optional .Clearance clearance = 6;</code>
   */
  org.yamcs.security.protobuf.ClearanceOrBuilder getClearanceOrBuilder();
}
