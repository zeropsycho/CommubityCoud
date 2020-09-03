package com.zero.hjy.dao;

import com.zero.hjy.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zero.hjy.utils.template.user.UserInfoTemplate;

/**
 * <p>
 * 用户表 Mapper 接口
 * </p>
 *
 * @author ZERO
 * @since 2020-09-03
 */
public interface UserMapper extends BaseMapper<User> {

    /**
     * 获取用户和角色信息
     * @param user
     * @return
     */
    User userAndRole(User user);
}
