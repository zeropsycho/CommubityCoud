package com.zero.hjy.service;

import com.zero.hjy.entity.AuthorityUser;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author ZERO
 * @since 2020-09-01
 */
public interface AuthorityUserService {

    List<AuthorityUser> authorityUserList(AuthorityUser authorityUser);
}
