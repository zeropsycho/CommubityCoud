package com.zero.hjy.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 单元表
 * </p>
 *
 * @author ZERO
 * @since 2020-09-07
 */
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("tab_unit")
public class Unit implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 单元编号
     */
    private String unitNo;

    /**
     * 单元名称
     */
    private String unitName;

    /**
     * 开始楼层
     */
    private String startFloor;

    /**
     * 结束楼层
     */
    private String endFloor;

    /**
     * 开始房号
     */
    private String startRoomNo;

    /**
     * 结束房号
     */
    private String endRoomNo;

    /**
     * 备注
     */
    private String remarks;

    /**
     * 楼宇id
     */
    private Long buildingId;

    /**
     * 楼宇编号
     */
    private String buildingNo;

    /**
     * 数量
     * @return
     */
    private Integer unitNumber;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUnitNo() {
        return unitNo;
    }

    public void setUnitNo(String unitNo) {
        this.unitNo = unitNo;
    }

    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    public String getStartFloor() {
        return startFloor;
    }

    public void setStartFloor(String startFloor) {
        this.startFloor = startFloor;
    }

    public String getEndFloor() {
        return endFloor;
    }

    public void setEndFloor(String endFloor) {
        this.endFloor = endFloor;
    }

    public String getStartRoomNo() {
        return startRoomNo;
    }

    public void setStartRoomNo(String startRoomNo) {
        this.startRoomNo = startRoomNo;
    }

    public String getEndRoomNo() {
        return endRoomNo;
    }

    public void setEndRoomNo(String endRoomNo) {
        this.endRoomNo = endRoomNo;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public Long getBuildingId() {
        return buildingId;
    }

    public void setBuildingId(Long buildingId) {
        this.buildingId = buildingId;
    }

    public String getBuildingNo() {
        return buildingNo;
    }

    public void setBuildingNo(String buildingNo) {
        this.buildingNo = buildingNo;
    }

    public Integer getUnitNumber() {
        return unitNumber;
    }

    public void setUnitNumber(Integer unitNumber) {
        this.unitNumber = unitNumber;
    }
}
