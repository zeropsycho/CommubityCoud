package com.zero.hjy.controller;


import com.zero.hjy.entity.AuthorityUser;
import com.zero.hjy.service.AuthorityUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.springframework.stereotype.Controller;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author ZERO
 * @since 2020-09-01
 */
@RestController
@CrossOrigin(origins = "*")
//@RequestMapping("/authorityUser")
public class AuthorityUserController {

    @Autowired
    private AuthorityUserService authorityUserService;

    @ResponseBody
    @RequestMapping("/user/query/list")
    private List<AuthorityUser> authorityUserList(AuthorityUser authorityUser) {
        List<AuthorityUser> authorityUsers = authorityUserService.authorityUserList(authorityUser);
        return authorityUsers;
    }

//    @ResponseBody
    @RequestMapping("/auth/login")
    public List<AuthorityUser> userLogin(AuthorityUser authorityUser,Object redirect) {
        List<AuthorityUser> authorityUsers = authorityUserService.authorityUserList(authorityUser);
        return authorityUsers;
    }

//    @ResponseBody
    @RequestMapping("/auth/2step-code")
    public boolean test() {
        return true;
    }
}

