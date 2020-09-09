package com.zero.hjy.controller;


import com.zero.hjy.entity.Developer;
import com.zero.hjy.entity.Residence;
import com.zero.hjy.service.ResidenceService;
import com.zero.hjy.statuscode.StatusCode;
import com.zero.hjy.template.ReturnTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 住宅表 前端控制器
 * </p>
 *
 * @author ZERO
 * @since 2020-09-05
 */
@RestController
@RequestMapping("/residence")
public class ResidenceController {
    private Logger log = LoggerFactory.getLogger(ResidenceController.class);

    @Autowired
    private ResidenceService residenceService;

    /**
     * 查询住宅编号
     * @param residenceNo
     * @return
     */
    @RequestMapping("/query/companyNo")
    public ReturnTemplate checkCompanyNo(String residenceNo) {
        Integer integer = null;
        try {
            integer = residenceService.checkCompanyNo(residenceNo);
        } catch (Exception e) {
            log.error(e.getMessage());
            return new ReturnTemplate(integer, StatusCode.FAIL.getCode(), e.getMessage());
        }
        return new ReturnTemplate(integer, StatusCode.SUCCESS.getCode(), StatusCode.SUCCESS.getMessage());
    }

    @RequestMapping("/insert/infos")
    public ReturnTemplate newResidence(Residence residence, Developer developer) {

        Integer isSueecss = null;
        try {
            isSueecss = residenceService.newResidence(residence,developer);
        } catch (Exception e) {
            return new ReturnTemplate(isSueecss, StatusCode.FAIL.getCode(), e.getMessage());
        }
        return new ReturnTemplate(isSueecss, StatusCode.SUCCESS.getCode(), StatusCode.SUCCESS.getMessage());
    }
}

