package com.zero.hjy.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;

import java.time.LocalDate;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author ZERO
 * @since 2020-09-06
 */
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("tab_building")
public class Building implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 楼宇编号
     */
    private String buildingNo;

    /**
     * 楼宇名称
     */
    private String name;

    /**
     * 单元数量
     */
    private Integer unitNumber;

    /**
     * 封顶日期
     */
    private String cappedDate;

    /**
     * 竣工日期
     */
    private String completionDate;

    /**
     * 预售许可证
     */
    private String preSaleLicense;

    /**
     * 建筑许可证
     */
    private String buildingPermits;

    /**
     * 建筑面积
     */
    private String constructionArea;

    /**
     * 使用面积
     */
    private String usageArea;

    /**
     * 备注
     */
    private String remarks;

    /**
     * 楼宇编号
     * @return
     */
    private String residenceNo;

    public String getResidenceNo() {
        return residenceNo;
    }

    public void setResidenceNo(String residenceNo) {
        this.residenceNo = residenceNo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBuildingNo() {
        return buildingNo;
    }

    public void setBuildingNo(String buildingNo) {
        this.buildingNo = buildingNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getUnitNumber() {
        return unitNumber;
    }

    public void setUnitNumber(Integer unitNumber) {
        this.unitNumber = unitNumber;
    }

    public String getCappedDate() {
        return cappedDate;
    }

    public void setCappedDate(String cappedDate) {
        this.cappedDate = cappedDate;
    }

    public String getCompletionDate() {
        return completionDate;
    }

    public void setCompletionDate(String completionDate) {
        this.completionDate = completionDate;
    }

    public String getPreSaleLicense() {
        return preSaleLicense;
    }

    public void setPreSaleLicense(String preSaleLicense) {
        this.preSaleLicense = preSaleLicense;
    }

    public String getBuildingPermits() {
        return buildingPermits;
    }

    public void setBuildingPermits(String buildingPermits) {
        this.buildingPermits = buildingPermits;
    }

    public String getConstructionArea() {
        return constructionArea;
    }

    public void setConstructionArea(String constructionArea) {
        this.constructionArea = constructionArea;
    }

    public String getUsageArea() {
        return usageArea;
    }

    public void setUsageArea(String usageArea) {
        this.usageArea = usageArea;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
}
