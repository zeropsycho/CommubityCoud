package com.zero.hjy.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 住宅表
 * </p>
 *
 * @author ZERO
 * @since 2020-09-05
 */
public class Residence implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 住宅编号
     */
    private String residenceNo;

    /**
     * 住宅名称
     */
    private String residenceName;

    /**
     * 占地面积
     */
    private Integer floorArea;

    /**
     * 建筑面积
     */
    private Integer floorage;

    /**
     * 绿地面积
     */
    private Integer greeneryArea;

    /**
     * 道路面积
     */
    private String roadArea;

    /**
     * 楼宇数量
     */
    private Integer buildingNumber;

    /**
     * 负责人
     */
    private String director;

    /**
     * 住宅地址
     */
    private String residenceAddress;

    /**
     * 开发商id
     */
    private Long developerId;

    /**
     * 公司no
     * @return
     */
    private String corporationNo;

    public String getCorporationNo() {
        return corporationNo;
    }

    public void setCorporationNo(String corporationNo) {
        this.corporationNo = corporationNo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getResidenceNo() {
        return residenceNo;
    }

    public void setResidenceNo(String residenceNo) {
        this.residenceNo = residenceNo;
    }

    public String getResidenceName() {
        return residenceName;
    }

    public void setResidenceName(String residenceName) {
        this.residenceName = residenceName;
    }

    public Integer getFloorArea() {
        return floorArea;
    }

    public void setFloorArea(Integer floorArea) {
        this.floorArea = floorArea;
    }

    public Integer getFloorage() {
        return floorage;
    }

    public void setFloorage(Integer floorage) {
        this.floorage = floorage;
    }

    public Integer getGreeneryArea() {
        return greeneryArea;
    }

    public void setGreeneryArea(Integer greeneryArea) {
        this.greeneryArea = greeneryArea;
    }

    public String getRoadArea() {
        return roadArea;
    }

    public void setRoadArea(String roadArea) {
        this.roadArea = roadArea;
    }

    public Integer getBuildingNumber() {
        return buildingNumber;
    }

    public void setBuildingNumber(Integer buildingNumber) {
        this.buildingNumber = buildingNumber;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getResidenceAddress() {
        return residenceAddress;
    }

    public void setResidenceAddress(String residenceAddress) {
        this.residenceAddress = residenceAddress;
    }

    public Long getDeveloperId() {
        return developerId;
    }

    public void setDeveloperId(Long developerId) {
        this.developerId = developerId;
    }
}
