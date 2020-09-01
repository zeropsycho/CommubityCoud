package com.zero.hjy.service.impl;

import com.zero.hjy.entity.AuthorityUser;
import com.zero.hjy.dao.AuthorityUserDao;
import com.zero.hjy.service.AuthorityUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author ZERO
 * @since 2020-09-01
 */
@Service
public class AuthorityUserServiceImpl implements AuthorityUserService {

    @Autowired
    private AuthorityUserDao authorityUserDao;

    @Override
    public List<AuthorityUser> authorityUserList(AuthorityUser authorityUser) {
        return authorityUserDao.authorityUserList(authorityUser);
    }
}
