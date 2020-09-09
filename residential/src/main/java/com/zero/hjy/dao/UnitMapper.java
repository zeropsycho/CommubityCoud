package com.zero.hjy.dao;

import com.zero.hjy.entity.Unit;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zero.hjy.pojo.UnitTemplate;

import java.util.List;

/**
 * <p>
 * 单元表 Mapper 接口
 * </p>
 *
 * @author ZERO
 * @since 2020-09-07
 */
public interface UnitMapper {

    Integer newUnitInfo(Unit unit);

    Integer batchNewUnitInfos(List<Unit> unitTemplates);

    Integer updateUnitInfo(Unit unit);

    List<Unit> unitNameInfosByBuildingNo(String buildingNo);
}
