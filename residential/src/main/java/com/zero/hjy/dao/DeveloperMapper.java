package com.zero.hjy.dao;

import com.zero.hjy.entity.Developer;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * @author ZERO
 * @since 2020-09-05
 */
public interface DeveloperMapper {

    Integer newDeveloper(Developer developer);

}
