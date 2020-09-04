package com.zero.hjy.service;

import com.zero.hjy.entity.Module;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author ZERO
 * @since 2020-09-03
 */
public interface ModuleService {

    List<Module> moduleInMakeNo(String makeNos);

}
