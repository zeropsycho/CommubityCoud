package com.zero.hjy.service.impl;

import com.zero.hjy.entity.Module;
import com.zero.hjy.dao.ModuleMapper;
import com.zero.hjy.enums.ModuleEnum;
import com.zero.hjy.pojo.Permission;
import com.zero.hjy.service.ModuleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.constraints.Max;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * module service
 * @author ZERO
 * @since 2020-09-03
 */
@Service
public class ModuleImpl implements ModuleService {

    private Logger log = LoggerFactory.getLogger(ModuleImpl.class);

    @Autowired
    private ModuleMapper moduleMapper;

    @Override
    public List<Module> moduleInMakeNo(String makeNos) {
        if (null == makeNos || "".equals(makeNos)) {
            throw new RuntimeException("参数不能为空");
        }

        // 去除String前后符号
        String[] makeNoSplit = makeNos.split(",");

        if (null == makeNoSplit || "".equals(makeNoSplit)) {
            throw new RuntimeException("makeNoSplit：没有数值");
        }
        if (makeNoSplit.equals(",")) {
            makeNos.replace(",", "");
        }

        // 查询module
        List<Module> moduleList = moduleMapper.moduleInMakeNo(makeNoSplit);
        if (null == moduleList) {
            throw new RuntimeException("数据库查询异常");
        }

        return moduleList;
    }

    /**
     * 参数模版
     * @param roleName
     * @param makeNos
     * @return
     * @throws RuntimeException
     */
    public List<Permission> permission(String roleName, String makeNos) throws RuntimeException {

        List<Module> moduleList = moduleInMakeNo(makeNos);
        List<Permission> permissions = new ArrayList<>();

        moduleList.forEach(module -> {
            permissions.add(new Permission(roleName, ModuleEnum.getName(module.getMakeNo()), module.getName()));
        });

        if (null == permissions || permissions.isEmpty()) {
            throw new RuntimeException("permissions没有值");
        }

        return permissions;
    }
}
