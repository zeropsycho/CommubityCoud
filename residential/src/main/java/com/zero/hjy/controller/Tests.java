package com.zero.hjy.controller;

import com.zero.hjy.annotation.JwtIgnore;
import com.zero.hjy.entity.Building;
import com.zero.hjy.entity.Room;
import com.zero.hjy.entity.Unit;
import com.zero.hjy.service.BuildingService;
import com.zero.hjy.service.ResidenceService;
import com.zero.hjy.service.RoomService;
import com.zero.hjy.service.UnitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Tests {

    @Autowired
    private ResidenceService residenceService;
    @Autowired
    private BuildingService buildingService;
    @Autowired
    private UnitService unitService;
    @Autowired
    private RoomService roomService;

    @JwtIgnore
    @RequestMapping("/test")
    public List<Building> test() {
        return buildingService.buildingInfosByResidenceNo("1");
    }

    @JwtIgnore
    @RequestMapping("/test/unit")
    public List<Unit> test2() {
        return unitService.unitNameInfosByBuildingNo("A2");
    }

    @JwtIgnore
    @RequestMapping("/test/room")
    public List<Room> test3() {
        Room room = new Room();
        room.setUnitNo("A1");
        room.setConstructionArea("1");
        return roomService.roomNameInfoByUnitNo(room);
    }

    @JwtIgnore
    @RequestMapping("/test/checkName")
    public Integer test4() {
        return residenceService.checkCompanyNo("A2");
    }

    @JwtIgnore
    @RequestMapping("/test/updateRoom")
    public Integer test5() {
        Room room = new Room();
        room.setId(50351L);
        room.setConstructionArea("1");
        room.setFloorNumber(2);
        room.setRoomNo("q");
        room.setRemarks("memarks");
        room.setUsageArea("面积");
        return roomService.updateRoomInfo(room);
    }
}
