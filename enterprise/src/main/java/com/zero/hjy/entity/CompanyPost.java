package com.zero.hjy.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 公司工作岗位职责
 * </p>
 *
 * @author ZERO
 * @since 2020-09-05
 */
@TableName("tab_company_post")
public class CompanyPost implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 岗位id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 岗位名称
     */
    private String name;

    /**
     * 岗位描述
     */
    private String description;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "CompanyPost{" +
        "id=" + id +
        ", name=" + name +
        ", description=" + description +
        "}";
    }
}
