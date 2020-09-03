package com.zero.hjy.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 权限角色表
 * </p>
 *
 * @author ZERO
 * @since 2020-09-03
 */
public class TabAuthorityRole implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 角色id
     */
    private Long rId;

    /**
     * 权限id
     */
    private Long aId;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getrId() {
        return rId;
    }

    public void setrId(Long rId) {
        this.rId = rId;
    }

    public Long getaId() {
        return aId;
    }

    public void setaId(Long aId) {
        this.aId = aId;
    }

    @Override
    public String toString() {
        return "TabAuthorityRole{" +
        "id=" + id +
        ", rId=" + rId +
        ", aId=" + aId +
        "}";
    }
}
