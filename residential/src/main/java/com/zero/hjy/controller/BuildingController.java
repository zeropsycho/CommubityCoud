package com.zero.hjy.controller;


import com.zero.hjy.annotation.JwtIgnore;
import com.zero.hjy.entity.Building;
import com.zero.hjy.service.BuildingService;
import com.zero.hjy.statuscode.StatusCode;
import com.zero.hjy.template.ReturnTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author ZERO
 * @since 2020-09-06
 */
@RestController
@RequestMapping("/residence/building")
public class BuildingController {

    @Autowired
    private BuildingService buildingService;

    @RequestMapping("/insert/infos")
    public ReturnTemplate batchBuildingInfos(Integer buildingNumber, String residenceNo) {
        List<Building> buildingInfo = null;
        try {
            buildingInfo = buildingService.newBuildingInfo(buildingNumber, residenceNo);
        } catch (Exception e) {
            return new ReturnTemplate(buildingInfo, StatusCode.FAIL.getCode(), e.getMessage());
        }
        return new ReturnTemplate(buildingInfo, StatusCode.SUCCESS.getCode(), StatusCode.SUCCESS.getMessage());
    }

    @RequestMapping("/update/info")
    public ReturnTemplate updateBuildingInfo(Building building) {
        Integer result = null;
        try {
            result = buildingService.updateBuildingInfo(building);
        } catch (Exception e) {
            return new ReturnTemplate(result, StatusCode.FAIL.getCode(), e.getMessage());
        }
        return new ReturnTemplate(result, StatusCode.SUCCESS.getCode(), StatusCode.SUCCESS.getMessage());
    }

    @RequestMapping("/query/building/nameInfo")
    public ReturnTemplate buildingNameInfosByResidenceNo(String residenceNo) {
        List<Building> result = null;
        try {
            result = buildingService.buildingInfosByResidenceNo(residenceNo);
        } catch (Exception e) {
            return new ReturnTemplate(result, StatusCode.FAIL.getCode(), e.getMessage());
        }
        return new ReturnTemplate(result, StatusCode.SUCCESS.getCode(), StatusCode.SUCCESS.getMessage());
    }
}

