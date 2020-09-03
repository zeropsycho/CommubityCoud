package com.zero.hjy.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author ZERO
 * @since 2020-09-03
 */
public class TabDeveloper implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 开发商公司名称
     */
    private String developerName;

    /**
     * 法人代表
     */
    private String legalRepresentative;

    /**
     * 联系人
     */
    private String contact;

    /**
     * 联系人电话号码
     */
    private String contactTelephone;

    /**
     * 联系地址
     */
    private String contactAdress;

    /**
     * 备注
     */
    private String remarks;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDeveloperName() {
        return developerName;
    }

    public void setDeveloperName(String developerName) {
        this.developerName = developerName;
    }

    public String getLegalRepresentative() {
        return legalRepresentative;
    }

    public void setLegalRepresentative(String legalRepresentative) {
        this.legalRepresentative = legalRepresentative;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getContactTelephone() {
        return contactTelephone;
    }

    public void setContactTelephone(String contactTelephone) {
        this.contactTelephone = contactTelephone;
    }

    public String getContactAdress() {
        return contactAdress;
    }

    public void setContactAdress(String contactAdress) {
        this.contactAdress = contactAdress;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    @Override
    public String toString() {
        return "TabDeveloper{" +
        "id=" + id +
        ", developerName=" + developerName +
        ", legalRepresentative=" + legalRepresentative +
        ", contact=" + contact +
        ", contactTelephone=" + contactTelephone +
        ", contactAdress=" + contactAdress +
        ", remarks=" + remarks +
        "}";
    }
}
