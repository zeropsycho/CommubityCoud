package com.zero.hjy.dao;


import com.zero.hjy.entity.Module;

import java.util.List;

/**
 * @author ZERO
 * @since 2020-09-03
 */
public interface ModuleMapper {

    /**
     * 根据makeNo获取module autority
     * @param makeNos
     * @return
     */
    List<Module> moduleInMakeNo(String[] makeNos);
}
