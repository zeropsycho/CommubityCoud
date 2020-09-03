package com.zero.hjy.pojo;

public class Permission {

    private long roleId;

    private long permissionId;

    public long getRoleId() {
        return roleId;
    }

    public void setRoleId(long roleId) {
        this.roleId = roleId;
    }

    public long getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(long permissionId) {
        this.permissionId = permissionId;
    }

    @Override
    public String toString() {
        return "Permission{" +
                "roleId=" + roleId +
                ", permissionId=" + permissionId +
                '}';
    }
}
