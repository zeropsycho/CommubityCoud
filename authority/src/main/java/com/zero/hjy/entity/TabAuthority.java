package com.zero.hjy.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 权限表
 * </p>
 *
 * @author ZERO
 * @since 2020-09-03
 */
public class TabAuthority implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 权限名
     */
    private String aName;

    /**
     * 权限类型:1：模块权限
     */
    private Integer aType;

    /**
     * 权限模块id
     */
    private Long mId;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getaName() {
        return aName;
    }

    public void setaName(String aName) {
        this.aName = aName;
    }

    public Integer getaType() {
        return aType;
    }

    public void setaType(Integer aType) {
        this.aType = aType;
    }

    public Long getmId() {
        return mId;
    }

    public void setmId(Long mId) {
        this.mId = mId;
    }

    @Override
    public String toString() {
        return "TabAuthority{" +
        "id=" + id +
        ", aName=" + aName +
        ", aType=" + aType +
        ", mId=" + mId +
        "}";
    }
}
