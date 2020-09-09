package com.zero.hjy.controller;


import com.alibaba.fastjson.JSONObject;
import com.zero.hjy.annotation.JwtIgnore;
import com.zero.hjy.entity.Unit;
import com.zero.hjy.pojo.Tempalte;
import com.zero.hjy.pojo.UnitTemplate;
import com.zero.hjy.service.UnitService;
import com.zero.hjy.statuscode.StatusCode;
import com.zero.hjy.template.ReturnTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 *
 * @author ZERO
 * @since 2020-09-07
 */
@RestController
@RequestMapping("/residence/unit")
public class UnitController {

    @Autowired
    private UnitService unitService;

    @RequestMapping("/insert/info")
    public ReturnTemplate newUnitInfo(Unit unit) {
        Integer result = null;
        try {
            result = unitService.newUnitInfo(unit);
        } catch (Exception e) {
            return new ReturnTemplate(result, StatusCode.FAIL.getCode(), e.getMessage());
        }
        return new ReturnTemplate(result, StatusCode.SUCCESS.getCode(), StatusCode.SUCCESS.getMessage());
    }

    @RequestMapping(value = "/batch/insert/infos")
    public ReturnTemplate batchUnitInfoList(@RequestBody Unit[] templateStr) {
        List<Unit> result = null;
        try {
            if (null == templateStr || "".equals(templateStr)) {
                return new ReturnTemplate(result, StatusCode.FAIL.getCode(), "参数不能为null");
            }

            result = unitService.batchUnitInfoList(templateStr);
        } catch (Exception e) {
            return new ReturnTemplate(result, StatusCode.FAIL.getCode(), e.getMessage());
        }
        return new ReturnTemplate(result, StatusCode.SUCCESS.getCode(), StatusCode.SUCCESS.getMessage());
    }

    @RequestMapping(value = "/update/info")
    public ReturnTemplate updateUnitInfo(Unit unit) {
        Integer result = null;
        try {
            result = unitService.updateUnitInfo(unit);
        } catch (Exception e) {
            return new ReturnTemplate(result, StatusCode.FAIL.getCode(), e.getMessage());
        }
        return new ReturnTemplate(result, StatusCode.SUCCESS.getCode(), StatusCode.SUCCESS.getMessage());
    }

    @RequestMapping("/query/nameInfos")
    public ReturnTemplate unitNameInfosByBuildingNo(String buildingNo) {
        List<Unit> result = null;
        try {
            result = unitService.unitNameInfosByBuildingNo(buildingNo);
        } catch (Exception e) {
            return new ReturnTemplate(result, StatusCode.FAIL.getCode(), e.getMessage());
        }
        return new ReturnTemplate(result, StatusCode.SUCCESS.getCode(), StatusCode.SUCCESS.getMessage());
    }
}

