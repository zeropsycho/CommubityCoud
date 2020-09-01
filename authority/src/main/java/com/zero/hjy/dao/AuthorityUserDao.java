package com.zero.hjy.dao;

import com.zero.hjy.entity.AuthorityUser;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 *
 * @author ZERO
 * @since 2020-09-01
 */
@Mapper
public interface AuthorityUserDao {

    List<AuthorityUser> authorityUserList(AuthorityUser authorityUser);
}
