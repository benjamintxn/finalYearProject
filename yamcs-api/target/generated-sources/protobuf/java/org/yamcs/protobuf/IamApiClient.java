package org.yamcs.protobuf;

import com.google.protobuf.Empty;
import org.yamcs.api.MethodHandler;
import org.yamcs.api.Observer;

/**
 * <pre>
 *  Handles incoming requests related to Identity and Access Management (IAM)
 * </pre>
 */
@javax.annotation.processing.Generated(value = "org.yamcs.protoc.ServiceGenerator", date = "2023-11-18T19:00:35.922570Z")
public class IamApiClient extends AbstractIamApi<Void> {

    private final MethodHandler handler;

    public IamApiClient(MethodHandler handler) {
        this.handler = handler;
    }

    /**
     * <pre>
     *  List privileges
     * </pre>
     */
    @Override
    public final void listPrivileges(Void ctx, Empty request, Observer<ListPrivilegesResponse> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(0),
            request,
            ListPrivilegesResponse.getDefaultInstance(),
            observer);
    }

    /**
     * <pre>
     *  List roles
     * </pre>
     */
    @Override
    public final void listRoles(Void ctx, Empty request, Observer<ListRolesResponse> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(1),
            request,
            ListRolesResponse.getDefaultInstance(),
            observer);
    }

    /**
     * <pre>
     *  Get a role
     * </pre>
     */
    @Override
    public final void getRole(Void ctx, GetRoleRequest request, Observer<RoleInfo> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(2),
            request,
            RoleInfo.getDefaultInstance(),
            observer);
    }

    /**
     * <pre>
     *  Delete a role assignment
     * </pre>
     */
    @Override
    public final void deleteRoleAssignment(Void ctx, DeleteRoleAssignmentRequest request, Observer<Empty> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(3),
            request,
            Empty.getDefaultInstance(),
            observer);
    }

    /**
     * <pre>
     *  List users
     * </pre>
     */
    @Override
    public final void listUsers(Void ctx, Empty request, Observer<ListUsersResponse> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(4),
            request,
            ListUsersResponse.getDefaultInstance(),
            observer);
    }

    /**
     * <pre>
     *  Get a user
     * </pre>
     */
    @Override
    public final void getUser(Void ctx, GetUserRequest request, Observer<UserInfo> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(5),
            request,
            UserInfo.getDefaultInstance(),
            observer);
    }

    /**
     * <pre>
     *  Create a user
     * </pre>
     */
    @Override
    public final void createUser(Void ctx, CreateUserRequest request, Observer<UserInfo> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(6),
            request,
            UserInfo.getDefaultInstance(),
            observer);
    }

    /**
     * <pre>
     *  Update a user
     * </pre>
     */
    @Override
    public final void updateUser(Void ctx, UpdateUserRequest request, Observer<UserInfo> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(7),
            request,
            UserInfo.getDefaultInstance(),
            observer);
    }

    /**
     * <pre>
     *  Get own user
     * </pre>
     */
    @Override
    public final void getOwnUser(Void ctx, Empty request, Observer<UserInfo> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(8),
            request,
            UserInfo.getDefaultInstance(),
            observer);
    }

    /**
     * <pre>
     *  Delete a user
     * </pre>
     */
    @Override
    public final void deleteUser(Void ctx, DeleteUserRequest request, Observer<Empty> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(9),
            request,
            Empty.getDefaultInstance(),
            observer);
    }

    /**
     * <pre>
     *  Delete an external identity
     * </pre>
     */
    @Override
    public final void deleteIdentity(Void ctx, DeleteIdentityRequest request, Observer<Empty> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(10),
            request,
            Empty.getDefaultInstance(),
            observer);
    }

    /**
     * <pre>
     *  List groups
     * </pre>
     */
    @Override
    public final void listGroups(Void ctx, Empty request, Observer<ListGroupsResponse> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(11),
            request,
            ListGroupsResponse.getDefaultInstance(),
            observer);
    }

    /**
     * <pre>
     *  Get a group
     * </pre>
     */
    @Override
    public final void getGroup(Void ctx, GetGroupRequest request, Observer<GroupInfo> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(12),
            request,
            GroupInfo.getDefaultInstance(),
            observer);
    }

    /**
     * <pre>
     *  Create a group
     * </pre>
     */
    @Override
    public final void createGroup(Void ctx, CreateGroupRequest request, Observer<GroupInfo> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(13),
            request,
            GroupInfo.getDefaultInstance(),
            observer);
    }

    /**
     * <pre>
     *  Update a group
     * </pre>
     */
    @Override
    public final void updateGroup(Void ctx, UpdateGroupRequest request, Observer<GroupInfo> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(14),
            request,
            GroupInfo.getDefaultInstance(),
            observer);
    }

    /**
     * <pre>
     *  Delete a group
     * </pre>
     */
    @Override
    public final void deleteGroup(Void ctx, DeleteGroupRequest request, Observer<GroupInfo> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(15),
            request,
            GroupInfo.getDefaultInstance(),
            observer);
    }

    /**
     * <pre>
     *  List service accounts
     * </pre>
     */
    @Override
    public final void listServiceAccounts(Void ctx, Empty request, Observer<ListServiceAccountsResponse> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(16),
            request,
            ListServiceAccountsResponse.getDefaultInstance(),
            observer);
    }

    /**
     * <pre>
     *  Get a service account
     * </pre>
     */
    @Override
    public final void getServiceAccount(Void ctx, GetServiceAccountRequest request, Observer<ServiceAccountInfo> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(17),
            request,
            ServiceAccountInfo.getDefaultInstance(),
            observer);
    }

    /**
     * <pre>
     *  Delete a service account
     * </pre>
     */
    @Override
    public final void deleteServiceAccount(Void ctx, DeleteServiceAccountRequest request, Observer<Empty> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(18),
            request,
            Empty.getDefaultInstance(),
            observer);
    }

    /**
     * <pre>
     *  Create a service account
     * </pre>
     */
    @Override
    public final void createServiceAccount(Void ctx, CreateServiceAccountRequest request, Observer<CreateServiceAccountResponse> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(19),
            request,
            CreateServiceAccountResponse.getDefaultInstance(),
            observer);
    }
}
