package com.zero.hjy.service.impl;

import com.zero.hjy.entity.Building;
import com.zero.hjy.dao.BuildingMapper;
import com.zero.hjy.service.BuildingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ZERO
 * @since 2020-09-06
 */
@Service
public class BuildingImpl implements BuildingService {

    @Autowired
    private BuildingMapper buildingMapper;

    /**
     * 批量录入信息
     */
    @Override
    public List<Building> newBuildingInfo(Integer buildingNumber, String residenceNo) {
        if (null == residenceNo || "".equals(residenceNo) || "".equals(buildingNumber) || null == buildingNumber || 0 == buildingNumber) {
            throw new RuntimeException("参数不能为空");
        }

        List<Building> buildings = new ArrayList<>();
        Building b;
        for (int i = 1; i <= buildingNumber; i++) {
            b =new Building();
            b.setBuildingNo("A" + i);
            b.setName(i + "栋楼");
            b.setResidenceNo(residenceNo);
            buildings.add(b);
            b = null;
        }
        // 1000:152 10000:3601
        Integer integer = buildingMapper.batchNewBuildingInfo(buildings);
        if (null == integer || 0 == integer) {
            throw new RuntimeException("新增数据失败（录入）！！");
        }
        return buildings;
    }

    @Override
    public Integer updateBuildingInfo(Building building) {

        if (null == building || null == building.getId() || 0L == building.getId()) {
            throw new RuntimeException("参数不能为null");
        }

        Integer buildingResult = buildingMapper.updateBuildingInfo(building);
        return buildingResult;
    }

    @Override
    public List<Building> buildingInfosByResidenceNo(String residenceNo) {
        if (null == residenceNo || "".equals(residenceNo)) {
            throw new RuntimeException("参数不能为null");
        }

        // 查询数据
        List<Building> buildings = buildingMapper.buildingInfosByResidenceNo(residenceNo);
        if (null == buildings || 0 == buildings.size()) {
            throw new RuntimeException("录入数据异常");
        }

        return buildings;
    }
}
