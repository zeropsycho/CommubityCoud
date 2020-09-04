package com.zero.hjy.service.impl;

import com.zero.hjy.entity.User;
import com.zero.hjy.dao.UserMapper;
import com.zero.hjy.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
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
public class UserImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User userAndRole(User user) {
        if (isValueNull(user)) {
            return null;
        }
        return userMapper.userAndRole(user);
    }

    @Override
    public User userLogin(User user) {
        if (isValueNull(user)) {
            return null;
        }

        User info = userMapper.userLogin(user);
        if (null == info) {
            return null;
        }
        return info;
    }

    private boolean isValueNull(User user) {
        if (null == user.getUsername() || "".equals(user.getUsername())
                || null == user.getPassword() || "".equals(user.getPassword())) {
            return true;
        }
        return false;
    }
}
