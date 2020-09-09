package com.zero.hjy.controller;


import com.zero.hjy.entity.Developer;
import com.zero.hjy.service.DeveloperService;
import com.zero.hjy.statuscode.StatusCode;
import com.zero.hjy.template.ReturnTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author ZERO
 * @since 2020-09-05
 */
@RestController
@RequestMapping("/developer")
public class DeveloperController {

    @Autowired
    private DeveloperService developerService;

    @RequestMapping("/insert/developerInfo")
    public ReturnTemplate newDevelop(Developer developer) {
        Long integer = null;
        try {
            integer = developerService.newDeveloper(developer);
        } catch (Exception e) {
            return new ReturnTemplate(integer, StatusCode.FAIL.getCode(), e.getMessage());
        }
        return new ReturnTemplate(integer, StatusCode.FAIL.getCode(), StatusCode.FAIL.getMessage());
    }
}

