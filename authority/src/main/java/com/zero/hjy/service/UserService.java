package com.zero.hjy.service;

import com.zero.hjy.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 用户表 服务类
 * </p>
 *
 * @author ZERO
 * @since 2020-09-03
 */
public interface UserService {

    User userAndRole(User user);

    User userLogin(User user);
}
