package com.zero.hjy.service.impl;

import com.zero.hjy.entity.User;
import com.zero.hjy.dao.UserMapper;
import com.zero.hjy.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zero.hjy.utils.template.user.UserInfoTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author ZERO
 * @since 2020-09-03
 */
@Service
public class UserImpl extends ServiceImpl<UserMapper, User> implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User userAndRole(User user) {

        return userMapper.userAndRole(user);
    }
}
