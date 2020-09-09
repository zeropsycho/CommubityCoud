package com.zero.hjy.pojo;

import com.zero.hjy.entity.Unit;

import java.io.Serializable;

public class UnitTemplate extends Unit implements Serializable {

    private String buildingNo;
    private Integer unitNumber;
    private String unitNo;
    private String unitName;

    public UnitTemplate() {
    }


    @Override
    public Integer getUnitNumber() {
        return unitNumber;
    }

    public void setUnitNumber(Integer unitNumber) {
        this.unitNumber = unitNumber;
    }
}
