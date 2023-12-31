// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: yamcs/protobuf/iam/iam.proto

package org.yamcs.protobuf;

public interface GroupInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:yamcs.protobuf.iam.GroupInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Group name
   * </pre>
   *
   * <code>optional string name = 1;</code>
   * @return Whether the name field is set.
   */
  boolean hasName();
  /**
   * <pre>
   * Group name
   * </pre>
   *
   * <code>optional string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Group name
   * </pre>
   *
   * <code>optional string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Group description
   * </pre>
   *
   * <code>optional string description = 2;</code>
   * @return Whether the description field is set.
   */
  boolean hasDescription();
  /**
   * <pre>
   * Group description
   * </pre>
   *
   * <code>optional string description = 2;</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <pre>
   * Group description
   * </pre>
   *
   * <code>optional string description = 2;</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <pre>
   * Users that are member of this group
   * </pre>
   *
   * <code>repeated .yamcs.protobuf.iam.UserInfo users = 3;</code>
   */
  java.util.List<org.yamcs.protobuf.UserInfo> 
      getUsersList();
  /**
   * <pre>
   * Users that are member of this group
   * </pre>
   *
   * <code>repeated .yamcs.protobuf.iam.UserInfo users = 3;</code>
   */
  org.yamcs.protobuf.UserInfo getUsers(int index);
  /**
   * <pre>
   * Users that are member of this group
   * </pre>
   *
   * <code>repeated .yamcs.protobuf.iam.UserInfo users = 3;</code>
   */
  int getUsersCount();
  /**
   * <pre>
   * Users that are member of this group
   * </pre>
   *
   * <code>repeated .yamcs.protobuf.iam.UserInfo users = 3;</code>
   */
  java.util.List<? extends org.yamcs.protobuf.UserInfoOrBuilder> 
      getUsersOrBuilderList();
  /**
   * <pre>
   * Users that are member of this group
   * </pre>
   *
   * <code>repeated .yamcs.protobuf.iam.UserInfo users = 3;</code>
   */
  org.yamcs.protobuf.UserInfoOrBuilder getUsersOrBuilder(
      int index);

  /**
   * <pre>
   * Service accounts that are member of this group
   * </pre>
   *
   * <code>repeated .yamcs.protobuf.iam.ServiceAccountInfo serviceAccounts = 4;</code>
   */
  java.util.List<org.yamcs.protobuf.ServiceAccountInfo> 
      getServiceAccountsList();
  /**
   * <pre>
   * Service accounts that are member of this group
   * </pre>
   *
   * <code>repeated .yamcs.protobuf.iam.ServiceAccountInfo serviceAccounts = 4;</code>
   */
  org.yamcs.protobuf.ServiceAccountInfo getServiceAccounts(int index);
  /**
   * <pre>
   * Service accounts that are member of this group
   * </pre>
   *
   * <code>repeated .yamcs.protobuf.iam.ServiceAccountInfo serviceAccounts = 4;</code>
   */
  int getServiceAccountsCount();
  /**
   * <pre>
   * Service accounts that are member of this group
   * </pre>
   *
   * <code>repeated .yamcs.protobuf.iam.ServiceAccountInfo serviceAccounts = 4;</code>
   */
  java.util.List<? extends org.yamcs.protobuf.ServiceAccountInfoOrBuilder> 
      getServiceAccountsOrBuilderList();
  /**
   * <pre>
   * Service accounts that are member of this group
   * </pre>
   *
   * <code>repeated .yamcs.protobuf.iam.ServiceAccountInfo serviceAccounts = 4;</code>
   */
  org.yamcs.protobuf.ServiceAccountInfoOrBuilder getServiceAccountsOrBuilder(
      int index);
}
