package com.zero.hjy.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

/**
 * <p>
 * 角色表
 * </p>
 *
 * @author ZERO
 * @since 2020-09-03
 */
public class Role<T> implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 名称
     */
    private String name;

    /**
     * 权限状态
     */
    private Integer status;

    /**
     * 创建时间
     */
    private Timestamp createTime;

    /**
     * 更新时间
     */
    private Timestamp upTimestamp;
    /**
     * 模块权限
     */
    private String mMake;

    private List<T> permissions;

    public String getmMake() {
        return mMake;
    }

    public void setmMake(String mMake) {
        this.mMake = mMake;
    }

    public List<T> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<T> permissions) {
        this.permissions = permissions;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public Timestamp getUpTimestamp() {
        return upTimestamp;
    }

    public void setUpTimestamp(Timestamp upTimestamp) {
        this.upTimestamp = upTimestamp;
    }

    @Override
    public String toString() {
        return "Role{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", status=" + status +
                ", createTime=" + createTime +
                ", upTimestamp=" + upTimestamp +
                ", mMake='" + mMake + '\'' +
                ", permissions=" + permissions +
                '}';
    }
}
