package com.zero.hjy.dao;

import com.zero.hjy.entity.Building;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author ZERO
 * @since 2020-09-06
 */
public interface BuildingMapper {

    Integer newBuildingInfo(Building building);

    Integer batchNewBuildingInfo(@Param("buildings") List<Building> buildings);

    Integer updateBuildingInfo(Building building);

    List<Building> buildingInfosByResidenceNo(String residenceNo);
}
