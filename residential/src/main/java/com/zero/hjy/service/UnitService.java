package com.zero.hjy.service;

import com.zero.hjy.entity.Unit;
import com.baomidou.mybatisplus.extension.service.IService;
import com.zero.hjy.pojo.UnitTemplate;

import java.util.List;

/**
 * <p>
 * 单元表 服务类
 * </p>
 *
 * @author ZERO
 * @since 2020-09-07
 */
public interface UnitService {

    Integer newUnitInfo(Unit unit);

    List<Unit> batchUnitInfoList(Unit[] templates);

    Integer updateUnitInfo(Unit unit);

    List<Unit> unitNameInfosByBuildingNo(String buildingNo);
}
