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
public class TabEnterprise implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 企业编号
     */
    private String enterpriseNo;

    /**
     * 上级公司
     */
    private Long superior;

    /**
     * 企业完整名称
     */
    private String enterpriseFullname;

    /**
     * 企业简称
     */
    private String enterpriseAbbreviation;

    /**
     * 企业类型
     */
    private String enterpriseType;

    /**
     * 企业电话
     */
    private String enterpriseTelephone;

    /**
     * 企业地址
     */
    private String enterpriseAddress;

    /**
     * 企业网站
     */
    private String enterpriseNode;

    /**
     * 国税号
     */
    private String centralTax;

    /**
     * 开户银行
     */
    private String bankOfDeposit;

    /**
     * 品牌名称
     */
    private String enterpriseBrand;

    /**
     * 邮政编码
     */
    private String postalcode;

    /**
     * 传真号码
     */
    private String faxNumber;

    /**
     * 电子邮箱
     */
    private String emailAddress;

    /**
     * 地方税
     */
    private String localTax;

    /**
     * 银行账号
     */
    private String bankingAccount;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEnterpriseNo() {
        return enterpriseNo;
    }

    public void setEnterpriseNo(String enterpriseNo) {
        this.enterpriseNo = enterpriseNo;
    }

    public Long getSuperior() {
        return superior;
    }

    public void setSuperior(Long superior) {
        this.superior = superior;
    }

    public String getEnterpriseFullname() {
        return enterpriseFullname;
    }

    public void setEnterpriseFullname(String enterpriseFullname) {
        this.enterpriseFullname = enterpriseFullname;
    }

    public String getEnterpriseAbbreviation() {
        return enterpriseAbbreviation;
    }

    public void setEnterpriseAbbreviation(String enterpriseAbbreviation) {
        this.enterpriseAbbreviation = enterpriseAbbreviation;
    }

    public String getEnterpriseType() {
        return enterpriseType;
    }

    public void setEnterpriseType(String enterpriseType) {
        this.enterpriseType = enterpriseType;
    }

    public String getEnterpriseTelephone() {
        return enterpriseTelephone;
    }

    public void setEnterpriseTelephone(String enterpriseTelephone) {
        this.enterpriseTelephone = enterpriseTelephone;
    }

    public String getEnterpriseAddress() {
        return enterpriseAddress;
    }

    public void setEnterpriseAddress(String enterpriseAddress) {
        this.enterpriseAddress = enterpriseAddress;
    }

    public String getEnterpriseNode() {
        return enterpriseNode;
    }

    public void setEnterpriseNode(String enterpriseNode) {
        this.enterpriseNode = enterpriseNode;
    }

    public String getCentralTax() {
        return centralTax;
    }

    public void setCentralTax(String centralTax) {
        this.centralTax = centralTax;
    }

    public String getBankOfDeposit() {
        return bankOfDeposit;
    }

    public void setBankOfDeposit(String bankOfDeposit) {
        this.bankOfDeposit = bankOfDeposit;
    }

    public String getEnterpriseBrand() {
        return enterpriseBrand;
    }

    public void setEnterpriseBrand(String enterpriseBrand) {
        this.enterpriseBrand = enterpriseBrand;
    }

    public String getPostalcode() {
        return postalcode;
    }

    public void setPostalcode(String postalcode) {
        this.postalcode = postalcode;
    }

    public String getFaxNumber() {
        return faxNumber;
    }

    public void setFaxNumber(String faxNumber) {
        this.faxNumber = faxNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getLocalTax() {
        return localTax;
    }

    public void setLocalTax(String localTax) {
        this.localTax = localTax;
    }

    public String getBankingAccount() {
        return bankingAccount;
    }

    public void setBankingAccount(String bankingAccount) {
        this.bankingAccount = bankingAccount;
    }

    @Override
    public String toString() {
        return "TabEnterprise{" +
        "id=" + id +
        ", enterpriseNo=" + enterpriseNo +
        ", superior=" + superior +
        ", enterpriseFullname=" + enterpriseFullname +
        ", enterpriseAbbreviation=" + enterpriseAbbreviation +
        ", enterpriseType=" + enterpriseType +
        ", enterpriseTelephone=" + enterpriseTelephone +
        ", enterpriseAddress=" + enterpriseAddress +
        ", enterpriseNode=" + enterpriseNode +
        ", centralTax=" + centralTax +
        ", bankOfDeposit=" + bankOfDeposit +
        ", enterpriseBrand=" + enterpriseBrand +
        ", postalcode=" + postalcode +
        ", faxNumber=" + faxNumber +
        ", emailAddress=" + emailAddress +
        ", localTax=" + localTax +
        ", bankingAccount=" + bankingAccount +
        "}";
    }
}
