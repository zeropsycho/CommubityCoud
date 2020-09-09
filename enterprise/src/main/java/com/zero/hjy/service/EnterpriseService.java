package com.zero.hjy.service;

import com.zero.hjy.entity.Enterprise;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author ZERO
 * @since 2020-09-05
 */
public interface EnterpriseService {

    List<Enterprise> companyNameList(int type);
}
