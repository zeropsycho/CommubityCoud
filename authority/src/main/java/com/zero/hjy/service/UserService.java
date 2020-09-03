package com.zero.hjy.service;

import com.zero.hjy.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;
import com.zero.hjy.utils.template.user.UserInfoTemplate;

/**
 * <p>
 * 用户表 服务类
 * </p>
 *
 * @author ZERO
 * @since 2020-09-03
 */
public interface UserService extends IService<User> {

    User userAndRole(User user);
}
