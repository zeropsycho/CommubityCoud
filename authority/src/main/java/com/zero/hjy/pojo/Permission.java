package com.zero.hjy.pojo;

/**
 * 模块模板
 */
public class Permission {

    // 角色名
    private String roleId;
    // 模块
    private String permissionId;

    private String permissionName;

    public Permission(String roleId, String permissionId, String permissionName) {
        this.roleId = roleId;
        this.permissionId = permissionId;
        this.permissionName = permissionName;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public String getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(String permissionId) {
        this.permissionId = permissionId;
    }

    public String getPermissionName() {
        return permissionName;
    }

    public void setPermissionName(String permissionName) {
        this.permissionName = permissionName;
    }

    @Override
    public String toString() {
        return "Permission{" +
                "roleId='" + roleId + '\'' +
                ", permissionId='" + permissionId + '\'' +
                ", permissionName='" + permissionName + '\'' +
                '}';
    }
}
