package com.zero.hjy.controller;


import com.zero.hjy.annotation.JwtIgnore;
import com.zero.hjy.entity.User;
import com.zero.hjy.service.UserService;
import com.zero.hjy.service.impl.ModuleImpl;
import com.zero.hjy.statuscode.StatusCode;
import com.zero.hjy.template.ReturnTemplate;
import com.zero.hjy.utils.jwt.Audience;
import com.zero.hjy.utils.jwt.JwtUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author ZERO
 * @since 2020-09-03
 */
@RestController
//@RequestMapping("/tabUser")
public class UserController {

    @Autowired
    private UserService userService;
    @Autowired
    private Audience audience;
    @Autowired
    private ModuleImpl moduleImpl;

    @RequestMapping("/auth/login")
    @JwtIgnore
    public ReturnTemplate userLogin(User user, HttpServletResponse response) {
        User user1 = userService.userLogin(user);
        // 参数值 null处理a
        String token = JwtUtils.createJWT(user1.getPassword(), user1.getId().toString(), user1.getUsername(), user1.getRole().toString(), audience);
        response.setHeader(JwtUtils.AUTH_HEADER_KEY, JwtUtils.TOKEN_PREFIX + token);
        user1.setToken(JwtUtils.TOKEN_PREFIX + token);

        return new ReturnTemplate(user1, StatusCode.SUCCESS.code, StatusCode.SUCCESS.message);
    }

    @RequestMapping("/user/info")
    public ReturnTemplate userInfoAndRoles(HttpServletRequest request) {

        String token = request.getHeader(JwtUtils.AUTH_HEADER_KEY);
        // token null处理
        String tokens = token.split(" ")[1].trim();

        String username = JwtUtils.getUsername(tokens, audience.getSecret());
        String pw = JwtUtils.getPw(tokens, audience.getSecret());
        User user = new User();
        user.setUsername(username);
        user.setPassword(pw);
        ReturnTemplate template = new ReturnTemplate();
        User user1 = userService.userAndRole(user);

        if (null == user1 || null == user1.getRole()) {
            template.setCode(500);
            template.setResult(user1);
            template.setMessage("查询结果为空");
            return template;
        }

        // 模块权限
        user1.getRole().setPermissions(moduleImpl.permission(user1.getRole().getName(), user1.getRole().getmMake()));
        user1.setToken(token);
        template.setResult(user1);

        return template;
    }

    @RequestMapping("/auth/logout")
    public ReturnTemplate logout(HttpSession session) {

        // 记录退出账号
        return new ReturnTemplate(null, 200, "退出账号");
    }
}

