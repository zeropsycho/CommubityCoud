package com.zero.hjy.service.impl;

import com.zero.hjy.dao.UnitMapper;
import com.zero.hjy.entity.Unit;
import com.zero.hjy.service.UnitService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ZERO
 * @since 2020-09-07
 */
@Service
public class UnitImpl implements UnitService {
    private Logger log = LoggerFactory.getLogger(UnitImpl.class);

    @Autowired
    private UnitMapper unitMapper;

    @Override
    public Integer newUnitInfo(Unit unit) {
        if (null == unit || null == unit.getBuildingNo() || "".equals(unit.getBuildingNo())) {
            throw new RuntimeException("参数不能为null");
        }
        Integer unitResult = unitMapper.newUnitInfo(unit);
        if (null == unitResult || 0 == unitResult) {
            throw new RuntimeException("录入数据异常");
        }

        return unitResult;
    }

    /**
     * @param templates
     * @return
     */
    @Override
    public List<Unit> batchUnitInfoList(Unit[] templates) {
        List<Unit> units = new ArrayList<>();
        // 获取集合中的元素 赋值集合元素
        for (int i = 0; i < templates.length; i++) {
            if (null != templates[i].getUnitNumber() && !"".equals(templates[i].getUnitNumber())) {
                for (int j = 1; j <= templates[i].getUnitNumber(); j++) {
                    Unit unit = new Unit();
                    unit.setUnitName(j + "单元");
                    unit.setUnitNo("A" + j);
                    unit.setBuildingNo(templates[i].getBuildingNo());
                    units.add(unit);
                }
            }
        }
        // 批量插入
        Integer batchUnitResult = unitMapper.batchNewUnitInfos(units);
        if (null == batchUnitResult || 0 == batchUnitResult) {
            throw new RuntimeException("录入数据异常");
        }
        return units;
    }

    @Override
    public Integer updateUnitInfo(Unit unit) {
        // 参数是否null
        if (null == unit || null == unit.getId() || 0L == unit.getId()) {
            throw new RuntimeException("参数不能为null");
        }
        // 更新数据
        Integer unitResult = unitMapper.updateUnitInfo(unit);
        // 是否更新成功
        if (null == unitResult || 0 == unitResult) {
            throw new RuntimeException("更新unit信息失败");
        }
        return unitResult;
    }

    @Override
    public List<Unit> unitNameInfosByBuildingNo(String buildingNo) {
        if (null == buildingNo || "".equals(buildingNo)) {
            throw new RuntimeException("参数不能为null！");
        }

        List<Unit> unitList = unitMapper.unitNameInfosByBuildingNo(buildingNo);
        if (null == unitList) {
            throw new RuntimeException("查询unit name失败");
        }
        if (0 == unitList.size()) log.info("{unitNameInfosByBuildingNo}=>查询结果为" + unitList.size() + "条");
        return unitList;
    }
}
