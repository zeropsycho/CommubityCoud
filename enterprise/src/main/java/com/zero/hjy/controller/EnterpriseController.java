package com.zero.hjy.controller;


import com.zero.hjy.service.EnterpriseService;
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
 * @since 2020-09-05
 */
@RestController
@RequestMapping("/enterprise")
public class EnterpriseController {

    @Autowired
    private EnterpriseService enterpriseService;

    @RequestMapping("/query/nameList")
    public ReturnTemplate companyNameList() {
        return new ReturnTemplate(enterpriseService.companyNameList(2), StatusCode.SUCCESS.getCode(), StatusCode.SUCCESS.getMessage());
    }
}

