package com.zero.hjy.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 公司部门结构，以及部门的联系方式，跟集团公司相关联
 * </p>
 *
 * @author ZERO
 * @since 2020-09-03
 */
public class TabCompanyDepartment implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 部门编号
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 部门名称
     */
    private String name;

    /**
     * 部门类型
     */
    private String type;

    /**
     * 上级部门
     */
    private Integer superior;

    /**
     * 部门负责人
     */
    private String responsiblePerson;

    /**
     * 部门电话
     */
    private String departmentPhone;

    /**
     * 部门传真
     */
    private String departmentFax;


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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getSuperior() {
        return superior;
    }

    public void setSuperior(Integer superior) {
        this.superior = superior;
    }

    public String getResponsiblePerson() {
        return responsiblePerson;
    }

    public void setResponsiblePerson(String responsiblePerson) {
        this.responsiblePerson = responsiblePerson;
    }

    public String getDepartmentPhone() {
        return departmentPhone;
    }

    public void setDepartmentPhone(String departmentPhone) {
        this.departmentPhone = departmentPhone;
    }

    public String getDepartmentFax() {
        return departmentFax;
    }

    public void setDepartmentFax(String departmentFax) {
        this.departmentFax = departmentFax;
    }

    @Override
    public String toString() {
        return "TabCompanyDepartment{" +
        "id=" + id +
        ", name=" + name +
        ", type=" + type +
        ", superior=" + superior +
        ", responsiblePerson=" + responsiblePerson +
        ", departmentPhone=" + departmentPhone +
        ", departmentFax=" + departmentFax +
        "}";
    }
}
