package com.zero.hjy.controller;


import com.zero.hjy.entity.Role;
import com.zero.hjy.pojo.Permission;
import com.zero.hjy.utils.template.user.UserInfoTemplate;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

/**
 * <p>
 * 角色表 前端控制器
 * </p>
 *
 * @author ZERO
 * @since 2020-09-03
 */
@RestController
//@RequestMapping("/tabRole")
public class TabRoleController {

    @RequestMapping("/user/info")
    public UserInfoTemplate userInfo() {
        UserInfoTemplate userInfo = new UserInfoTemplate();
        Role role = new Role();
        role.setPermissions(Arrays.asList(new Permission()));
        userInfo.setResult(role);

        return userInfo;
    }
}

