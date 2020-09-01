package com.zero.hjy.controller;


import com.zero.hjy.entity.AuthorityUser;
import com.zero.hjy.service.AuthorityUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author ZERO
 * @since 2020-09-01
 */
@Controller
//@RequestMapping("/authorityUser")
public class AuthorityUserController {

    @Autowired
    private AuthorityUserService authorityUserService;

    @ResponseBody
    @RequestMapping("/user/query/list")
    private List<AuthorityUser> authorityUserList(AuthorityUser authorityUser) {
        List<AuthorityUser> authorityUsers = authorityUserService.authorityUserList(authorityUser);
        System.out.println(authorityUsers);
        return authorityUsers;
    }
}

