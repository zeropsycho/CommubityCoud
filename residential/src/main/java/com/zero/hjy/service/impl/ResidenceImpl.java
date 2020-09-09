package com.zero.hjy.service.impl;

import com.zero.hjy.entity.Developer;
import com.zero.hjy.entity.Residence;
import com.zero.hjy.dao.ResidenceMapper;
import com.zero.hjy.service.DeveloperService;
import com.zero.hjy.service.ResidenceService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * <p>
 * 住宅表 服务实现类
 * </p>
 *
 * @author ZERO
 * @since 2020-09-05
 */
@Service
public class ResidenceImpl implements ResidenceService {
private Logger log = LoggerFactory.getLogger(ResidenceImpl.class);

    @Autowired
    private ResidenceMapper residenceMapper;
    @Autowired
    private DeveloperService developerService;

    @Override
    public Integer checkCompanyNo(String companyNo) {
        if (isEntity(companyNo)) {
            throw new RuntimeException("参数是空值");
        }
        Integer companyNoCount = residenceMapper.checkCompanyNo(companyNo);
        if (null == companyNoCount) {
            throw new RuntimeException("查询数据库异常：");
        }
        /*if (companyNoCount > 0) {
            log.info("名字已存在");
        }*/
        return companyNoCount;
    }

    private boolean isEntity(String parament) {
        if (null == parament || 0 == parament.length()) {
            return true;
        }
        return false;
    }

    @Transactional
    @Override
    public Integer newResidence(Residence residence, Developer developer) throws RuntimeException {

        Long autoId = null;
        // 插入法人代表，成功则插入residence。 失败则回滚数据
        if(null != developer && null != developer.getDeveloperName() && !"".equals(developer.getDeveloperName())) {
            autoId = developerService.newDeveloper(developer);
        }

        // 新增住宅信息
        if (null == residence) {
            throw new RuntimeException("residence参数不能为空！！");
        }

        residence.setDeveloperId(autoId);
        Integer residenceIsSuccess = null;
        residenceIsSuccess = residenceMapper.newResidence(residence);
        if (null == residenceIsSuccess || 0 == residenceIsSuccess) {
            throw new RuntimeException("新增住宅失败！");
        }

        return residenceIsSuccess;
    }
}
