package org.yamcs.protobuf;

import com.google.protobuf.Descriptors.MethodDescriptor;
import com.google.protobuf.Descriptors.ServiceDescriptor;
import com.google.protobuf.Empty;
import com.google.protobuf.Message;
import org.yamcs.api.Api;
import org.yamcs.api.Observer;

/**
 * <pre>
 *  Handles incoming requests related to Identity and Access Management (IAM)
 * </pre>
 */
@javax.annotation.processing.Generated(value = "org.yamcs.protoc.ServiceGenerator", date = "2023-11-18T19:00:35.922297Z")
@SuppressWarnings("unchecked")
public abstract class AbstractIamApi<T> implements Api<T> {

    /**
     * <pre>
     *  List privileges
     * </pre>
     */
    public abstract void listPrivileges(T ctx, Empty request, Observer<ListPrivilegesResponse> observer);

    /**
     * <pre>
     *  List roles
     * </pre>
     */
    public abstract void listRoles(T ctx, Empty request, Observer<ListRolesResponse> observer);

    /**
     * <pre>
     *  Get a role
     * </pre>
     */
    public abstract void getRole(T ctx, GetRoleRequest request, Observer<RoleInfo> observer);

    /**
     * <pre>
     *  Delete a role assignment
     * </pre>
     */
    public abstract void deleteRoleAssignment(T ctx, DeleteRoleAssignmentRequest request, Observer<Empty> observer);

    /**
     * <pre>
     *  List users
     * </pre>
     */
    public abstract void listUsers(T ctx, Empty request, Observer<ListUsersResponse> observer);

    /**
     * <pre>
     *  Get a user
     * </pre>
     */
    public abstract void getUser(T ctx, GetUserRequest request, Observer<UserInfo> observer);

    /**
     * <pre>
     *  Create a user
     * </pre>
     */
    public abstract void createUser(T ctx, CreateUserRequest request, Observer<UserInfo> observer);

    /**
     * <pre>
     *  Update a user
     * </pre>
     */
    public abstract void updateUser(T ctx, UpdateUserRequest request, Observer<UserInfo> observer);

    /**
     * <pre>
     *  Get own user
     * </pre>
     */
    public abstract void getOwnUser(T ctx, Empty request, Observer<UserInfo> observer);

    /**
     * <pre>
     *  Delete a user
     * </pre>
     */
    public abstract void deleteUser(T ctx, DeleteUserRequest request, Observer<Empty> observer);

    /**
     * <pre>
     *  Delete an external identity
     * </pre>
     */
    public abstract void deleteIdentity(T ctx, DeleteIdentityRequest request, Observer<Empty> observer);

    /**
     * <pre>
     *  List groups
     * </pre>
     */
    public abstract void listGroups(T ctx, Empty request, Observer<ListGroupsResponse> observer);

    /**
     * <pre>
     *  Get a group
     * </pre>
     */
    public abstract void getGroup(T ctx, GetGroupRequest request, Observer<GroupInfo> observer);

    /**
     * <pre>
     *  Create a group
     * </pre>
     */
    public abstract void createGroup(T ctx, CreateGroupRequest request, Observer<GroupInfo> observer);

    /**
     * <pre>
     *  Update a group
     * </pre>
     */
    public abstract void updateGroup(T ctx, UpdateGroupRequest request, Observer<GroupInfo> observer);

    /**
     * <pre>
     *  Delete a group
     * </pre>
     */
    public abstract void deleteGroup(T ctx, DeleteGroupRequest request, Observer<GroupInfo> observer);

    /**
     * <pre>
     *  List service accounts
     * </pre>
     */
    public abstract void listServiceAccounts(T ctx, Empty request, Observer<ListServiceAccountsResponse> observer);

    /**
     * <pre>
     *  Get a service account
     * </pre>
     */
    public abstract void getServiceAccount(T ctx, GetServiceAccountRequest request, Observer<ServiceAccountInfo> observer);

    /**
     * <pre>
     *  Delete a service account
     * </pre>
     */
    public abstract void deleteServiceAccount(T ctx, DeleteServiceAccountRequest request, Observer<Empty> observer);

    /**
     * <pre>
     *  Create a service account
     * </pre>
     */
    public abstract void createServiceAccount(T ctx, CreateServiceAccountRequest request, Observer<CreateServiceAccountResponse> observer);

    @Override
    public final ServiceDescriptor getDescriptorForType() {
        return IamProto.getDescriptor().getServices().get(0);
    }

    @Override
    public final Message getRequestPrototype(MethodDescriptor method) {
        if (method.getService() != getDescriptorForType()) {
            throw new IllegalArgumentException("Method not contained by this service.");
        }
        switch (method.getIndex()) {
        case 0:
            return Empty.getDefaultInstance();
        case 1:
            return Empty.getDefaultInstance();
        case 2:
            return GetRoleRequest.getDefaultInstance();
        case 3:
            return DeleteRoleAssignmentRequest.getDefaultInstance();
        case 4:
            return Empty.getDefaultInstance();
        case 5:
            return GetUserRequest.getDefaultInstance();
        case 6:
            return CreateUserRequest.getDefaultInstance();
        case 7:
            return UpdateUserRequest.getDefaultInstance();
        case 8:
            return Empty.getDefaultInstance();
        case 9:
            return DeleteUserRequest.getDefaultInstance();
        case 10:
            return DeleteIdentityRequest.getDefaultInstance();
        case 11:
            return Empty.getDefaultInstance();
        case 12:
            return GetGroupRequest.getDefaultInstance();
        case 13:
            return CreateGroupRequest.getDefaultInstance();
        case 14:
            return UpdateGroupRequest.getDefaultInstance();
        case 15:
            return DeleteGroupRequest.getDefaultInstance();
        case 16:
            return Empty.getDefaultInstance();
        case 17:
            return GetServiceAccountRequest.getDefaultInstance();
        case 18:
            return DeleteServiceAccountRequest.getDefaultInstance();
        case 19:
            return CreateServiceAccountRequest.getDefaultInstance();
        default:
            throw new IllegalStateException();
        }
    }

    @Override
    public final Message getResponsePrototype(MethodDescriptor method) {
        if (method.getService() != getDescriptorForType()) {
            throw new IllegalArgumentException("Method not contained by this service.");
        }
        switch (method.getIndex()) {
        case 0:
            return ListPrivilegesResponse.getDefaultInstance();
        case 1:
            return ListRolesResponse.getDefaultInstance();
        case 2:
            return RoleInfo.getDefaultInstance();
        case 3:
            return Empty.getDefaultInstance();
        case 4:
            return ListUsersResponse.getDefaultInstance();
        case 5:
            return UserInfo.getDefaultInstance();
        case 6:
            return UserInfo.getDefaultInstance();
        case 7:
            return UserInfo.getDefaultInstance();
        case 8:
            return UserInfo.getDefaultInstance();
        case 9:
            return Empty.getDefaultInstance();
        case 10:
            return Empty.getDefaultInstance();
        case 11:
            return ListGroupsResponse.getDefaultInstance();
        case 12:
            return GroupInfo.getDefaultInstance();
        case 13:
            return GroupInfo.getDefaultInstance();
        case 14:
            return GroupInfo.getDefaultInstance();
        case 15:
            return GroupInfo.getDefaultInstance();
        case 16:
            return ListServiceAccountsResponse.getDefaultInstance();
        case 17:
            return ServiceAccountInfo.getDefaultInstance();
        case 18:
            return Empty.getDefaultInstance();
        case 19:
            return CreateServiceAccountResponse.getDefaultInstance();
        default:
            throw new IllegalStateException();
        }
    }

    @Override
    public final void callMethod(MethodDescriptor method, T ctx, Message request, Observer<Message> future) {
        if (method.getService() != getDescriptorForType()) {
            throw new IllegalArgumentException("Method not contained by this service.");
        }
        switch (method.getIndex()) {
        case 0:
            listPrivileges(ctx, (Empty) request, (Observer<ListPrivilegesResponse>)(Object) future);
            return;
        case 1:
            listRoles(ctx, (Empty) request, (Observer<ListRolesResponse>)(Object) future);
            return;
        case 2:
            getRole(ctx, (GetRoleRequest) request, (Observer<RoleInfo>)(Object) future);
            return;
        case 3:
            deleteRoleAssignment(ctx, (DeleteRoleAssignmentRequest) request, (Observer<Empty>)(Object) future);
            return;
        case 4:
            listUsers(ctx, (Empty) request, (Observer<ListUsersResponse>)(Object) future);
            return;
        case 5:
            getUser(ctx, (GetUserRequest) request, (Observer<UserInfo>)(Object) future);
            return;
        case 6:
            createUser(ctx, (CreateUserRequest) request, (Observer<UserInfo>)(Object) future);
            return;
        case 7:
            updateUser(ctx, (UpdateUserRequest) request, (Observer<UserInfo>)(Object) future);
            return;
        case 8:
            getOwnUser(ctx, (Empty) request, (Observer<UserInfo>)(Object) future);
            return;
        case 9:
            deleteUser(ctx, (DeleteUserRequest) request, (Observer<Empty>)(Object) future);
            return;
        case 10:
            deleteIdentity(ctx, (DeleteIdentityRequest) request, (Observer<Empty>)(Object) future);
            return;
        case 11:
            listGroups(ctx, (Empty) request, (Observer<ListGroupsResponse>)(Object) future);
            return;
        case 12:
            getGroup(ctx, (GetGroupRequest) request, (Observer<GroupInfo>)(Object) future);
            return;
        case 13:
            createGroup(ctx, (CreateGroupRequest) request, (Observer<GroupInfo>)(Object) future);
            return;
        case 14:
            updateGroup(ctx, (UpdateGroupRequest) request, (Observer<GroupInfo>)(Object) future);
            return;
        case 15:
            deleteGroup(ctx, (DeleteGroupRequest) request, (Observer<GroupInfo>)(Object) future);
            return;
        case 16:
            listServiceAccounts(ctx, (Empty) request, (Observer<ListServiceAccountsResponse>)(Object) future);
            return;
        case 17:
            getServiceAccount(ctx, (GetServiceAccountRequest) request, (Observer<ServiceAccountInfo>)(Object) future);
            return;
        case 18:
            deleteServiceAccount(ctx, (DeleteServiceAccountRequest) request, (Observer<Empty>)(Object) future);
            return;
        case 19:
            createServiceAccount(ctx, (CreateServiceAccountRequest) request, (Observer<CreateServiceAccountResponse>)(Object) future);
            return;
        default:
            throw new IllegalStateException();
        }
    }

    @Override
    public final Observer<Message> callMethod(MethodDescriptor method, T ctx, Observer<Message> future) {
        if (method.getService() != getDescriptorForType()) {
            throw new IllegalArgumentException("Method not contained by this service.");
        }
        switch (method.getIndex()) {
        default:
            throw new IllegalStateException();
        }
    }
}
