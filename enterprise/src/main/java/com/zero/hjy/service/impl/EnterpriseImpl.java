package com.zero.hjy.service.impl;

import com.zero.hjy.dao.EnterpriseMappe;
import com.zero.hjy.entity.Enterprise;
import com.zero.hjy.service.EnterpriseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author ZERO
 * @since 2020-09-05
 */
@Service
public class EnterpriseImpl implements EnterpriseService {

    @Autowired
    private EnterpriseMappe enterpriseMappe;

    @Override
    public List<Enterprise> companyNameList(int type) {

        if (0 == type) {
            throw new RuntimeException("参数不能为空");
        }
        List<Enterprise> enterprise = enterpriseMappe.companyNameList(type);
        if (null == enterprise || 0 == enterprise.size()) {
            throw new RuntimeException("enterpriseMappe.companyNameList：查询数据：" + enterprise);
        }

        return enterprise;
    }
}
