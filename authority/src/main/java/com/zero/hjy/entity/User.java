package com.zero.hjy.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;

/**
 * <p>
 * 用户表
 * </p>
 *
 * @author ZERO
 * @since 2020-09-03
 */
public class User implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 用户id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 用户名
     */
    private String username;

    /**
     * 用户密码
     */
    private String password;

    /**
     * 用户昵称
     */
    private String uNickname;

    /**
     * 用户性别：1：男，2：女，3：性别不明
     */
    private Integer uGender;

    /**
     * 出生年月日
     */
    private Date uBirthdate;

    /**
     * 备注
     */
    private String uRemarks;

    /**
     * Email
     */
    private String uEmail;

    /**
     * 移动电话
     */
    private Integer uMobilePhone;

    /**
     * 办公电话
     */
    private String uOfficePhone;

    /**
     * 传真电话
     */
    private String uFaxaPhone;

    /**
     * 状态：1：正常，2
     */
    private Integer uStatus;

    /**
     * 有效期开始时间
     */
    private Timestamp uStartEffect;

    /**
     * 有效期结束时间
     */
    private Timestamp uEndEffect;

    /**
     * 创建时间
     */
    private Timestamp uCrateTime;

    /**
     * 更新时间
     */
    private Timestamp uUpTimestamp;

    /**
     * 公司岗位职责id
     */
    private Long cPostId;

    /**
     * 公司部门id
     */
    private Long cDepartmentId;

    /**
     * 角色id
     */
    private Long rId;

    /**
     * 删除状态
     */
    private Integer deleteStatus;

    private Role role;

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getuNickname() {
        return uNickname;
    }

    public void setuNickname(String uNickname) {
        this.uNickname = uNickname;
    }

    public Integer getuGender() {
        return uGender;
    }

    public void setuGender(Integer uGender) {
        this.uGender = uGender;
    }

    public Date getuBirthdate() {
        return uBirthdate;
    }

    public void setuBirthdate(Date uBirthdate) {
        this.uBirthdate = uBirthdate;
    }

    public String getuRemarks() {
        return uRemarks;
    }

    public void setuRemarks(String uRemarks) {
        this.uRemarks = uRemarks;
    }

    public String getuEmail() {
        return uEmail;
    }

    public void setuEmail(String uEmail) {
        this.uEmail = uEmail;
    }

    public Integer getuMobilePhone() {
        return uMobilePhone;
    }

    public void setuMobilePhone(Integer uMobilePhone) {
        this.uMobilePhone = uMobilePhone;
    }

    public String getuOfficePhone() {
        return uOfficePhone;
    }

    public void setuOfficePhone(String uOfficePhone) {
        this.uOfficePhone = uOfficePhone;
    }

    public String getuFaxaPhone() {
        return uFaxaPhone;
    }

    public void setuFaxaPhone(String uFaxaPhone) {
        this.uFaxaPhone = uFaxaPhone;
    }

    public Integer getuStatus() {
        return uStatus;
    }

    public void setuStatus(Integer uStatus) {
        this.uStatus = uStatus;
    }

    public Timestamp getuStartEffect() {
        return uStartEffect;
    }

    public void setuStartEffect(Timestamp uStartEffect) {
        this.uStartEffect = uStartEffect;
    }

    public Timestamp getuEndEffect() {
        return uEndEffect;
    }

    public void setuEndEffect(Timestamp uEndEffect) {
        this.uEndEffect = uEndEffect;
    }

    public Timestamp getuCrateTime() {
        return uCrateTime;
    }

    public void setuCrateTime(Timestamp uCrateTime) {
        this.uCrateTime = uCrateTime;
    }

    public Timestamp getuUpTimestamp() {
        return uUpTimestamp;
    }

    public void setuUpTimestamp(Timestamp uUpTimestamp) {
        this.uUpTimestamp = uUpTimestamp;
    }

    public Long getcPostId() {
        return cPostId;
    }

    public void setcPostId(Long cPostId) {
        this.cPostId = cPostId;
    }

    public Long getcDepartmentId() {
        return cDepartmentId;
    }

    public void setcDepartmentId(Long cDepartmentId) {
        this.cDepartmentId = cDepartmentId;
    }

    public Long getrId() {
        return rId;
    }

    public void setrId(Long rId) {
        this.rId = rId;
    }

    public Integer getDeleteStatus() {
        return deleteStatus;
    }

    public void setDeleteStatus(Integer deleteStatus) {
        this.deleteStatus = deleteStatus;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", uUsername='" + username + '\'' +
                ", uPassword='" + password + '\'' +
                ", uNickname='" + uNickname + '\'' +
                ", uGender=" + uGender +
                ", uBirthdate=" + uBirthdate +
                ", uRemarks='" + uRemarks + '\'' +
                ", uEmail='" + uEmail + '\'' +
                ", uMobilePhone=" + uMobilePhone +
                ", uOfficePhone='" + uOfficePhone + '\'' +
                ", uFaxaPhone='" + uFaxaPhone + '\'' +
                ", uStatus=" + uStatus +
                ", uStartEffect=" + uStartEffect +
                ", uEndEffect=" + uEndEffect +
                ", uCrateTime=" + uCrateTime +
                ", uUpTimestamp=" + uUpTimestamp +
                ", cPostId=" + cPostId +
                ", cDepartmentId=" + cDepartmentId +
                ", rId=" + rId +
                ", deleteStatus=" + deleteStatus +
                ", role=" + role +
                '}';
    }
}
