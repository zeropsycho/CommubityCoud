package com.zero.hjy.dao;

import com.zero.hjy.entity.Enterprise;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author ZERO
 * @since 2020-09-05
 */
public interface EnterpriseMappe {

    List<Enterprise> companyNameList(int type);
}
