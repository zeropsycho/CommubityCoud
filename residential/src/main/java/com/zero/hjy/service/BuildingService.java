package com.zero.hjy.service;

import com.zero.hjy.entity.Building;

import java.util.List;

/**
 *
 * @author ZERO
 * @since 2020-09-06
 */
public interface BuildingService {

    List<Building> newBuildingInfo(Integer buildingNumber, String residenceNo);

    Integer updateBuildingInfo(Building building);

    List<Building> buildingInfosByResidenceNo(String residenceNo);
}
