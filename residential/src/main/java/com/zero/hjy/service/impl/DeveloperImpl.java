package com.zero.hjy.service.impl;

import com.zero.hjy.entity.Developer;
import com.zero.hjy.dao.DeveloperMapper;
import com.zero.hjy.service.DeveloperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author ZERO
 * @since 2020-09-05
 */
@Service
public class DeveloperImpl implements DeveloperService {

    @Autowired
    private DeveloperMapper developerMapper;

    @Override
    public Long newDeveloper(Developer developer) throws RuntimeException{
        if (null == developer) {
            throw new RuntimeException("参数不能为空！！！");
        }

        Integer integer = developerMapper.newDeveloper(developer);
        if (null == integer) {
            throw new RuntimeException("新增数据为null");
        }
        Long autoId = developer.getId();
        return autoId;
    }

}
