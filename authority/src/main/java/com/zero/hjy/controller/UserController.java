package com.zero.hjy.controller;


import com.zero.hjy.entity.Role;
import com.zero.hjy.entity.User;
import com.zero.hjy.pojo.Permission;
import com.zero.hjy.service.UserService;
import com.zero.hjy.utils.template.user.UserInfoTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

/**
 * <p>
 * 用户表 前端控制器
 * </p>
 *
 * @author ZERO
 * @since 2020-09-03
 */
@RestController
@RequestMapping("/tabUser")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/user/info")
    public UserInfoTemplate userInfoAndRoles(User user) {
        UserInfoTemplate template = new UserInfoTemplate();
        User user1 = userService.userAndRole(user);

        if (null != user1.getRole()) {
            return new UserInfoTemplate(user1, 500, "查询结构为空");
        }
        user1.getRole().setPermissions(Arrays.asList(new Permission()));
        template.setResult(user1);

        return template;
    }
}

