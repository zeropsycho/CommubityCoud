package com.zero.hjy.controller;


import com.zero.hjy.entity.AuthorityUser;
import com.zero.hjy.service.AuthorityUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 用户权限controller
 * @author ZERO
 * @since 2020-09-01
 */
@RestController
//@RequestMapping("/authorityUser")
public class AuthorityUserController {

    @Autowired
    private AuthorityUserService authorityUserService;

    @RequestMapping("/user/query/list")
    private List<AuthorityUser> authorityUserList(AuthorityUser authorityUser) {
        List<AuthorityUser> authorityUsers = authorityUserService.authorityUserList(authorityUser);
        return authorityUsers;
    }

    @RequestMapping("/auth/login")
    public List<AuthorityUser> userLogin(AuthorityUser authorityUser,Object redirect) {
        List<AuthorityUser> authorityUsers = authorityUserService.authorityUserList(authorityUser);
        return authorityUsers;
    }

    @RequestMapping("/auth/2step-code")
    public boolean test() {
        return true;
    }
}

