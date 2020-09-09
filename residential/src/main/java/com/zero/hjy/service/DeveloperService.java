package com.zero.hjy.service;

import com.zero.hjy.entity.Developer;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author ZERO
 * @since 2020-09-05
 */
public interface DeveloperService {

    Long newDeveloper(Developer developer);

}
