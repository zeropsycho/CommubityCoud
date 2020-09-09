package com.zero.hjy.controller;


import com.zero.hjy.entity.Room;
import com.zero.hjy.service.RoomService;
import com.zero.hjy.statuscode.StatusCode;
import com.zero.hjy.template.ReturnTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 房间表 前端控制器
 * </p>
 *
 * @author ZERO
 * @since 2020-09-08
 */
@RestController
@RequestMapping("/residence/room")
public class RoomController {
    private Logger log = LoggerFactory.getLogger(RoomController.class);

    @Autowired
    private RoomService roomService;

    @RequestMapping("/batch/insert/infos")
    public ReturnTemplate batchNewRoomInfos(@RequestBody Room[] rooms) {
        List<Room> result = null;
        try {
            if (null == rooms || 0 == rooms.length) {
                throw new RuntimeException("参数不能为空！");
            }
            result = roomService.batchNewRoomInfos(rooms);
        } catch (Exception e) {
            log.error(e.getMessage());
            return new ReturnTemplate(result, StatusCode.FAIL.getCode(), e.getMessage());
        }
        return new ReturnTemplate(result, StatusCode.SUCCESS.getCode(), StatusCode.SUCCESS.getMessage());
    }

    @RequestMapping("/query/nameInfos")
    public ReturnTemplate roomNameInfoByUnitNo(Room room) {
        List<Room> result = null;
        try {
            result = roomService.roomNameInfoByUnitNo(room);
        } catch (Exception e) {
            log.error(e.getMessage());
            return new ReturnTemplate(result, StatusCode.FAIL.getCode(), e.getMessage());
        }
        return new ReturnTemplate(result, StatusCode.SUCCESS.getCode(), StatusCode.SUCCESS.getMessage());
    }

    @RequestMapping("/update/info")
    public ReturnTemplate updateRoomInfo(Room room) {
        Integer result = null;
        try {
            result = roomService.updateRoomInfo(room);
        } catch (Exception e) {
            log.error(e.getMessage());
            return new ReturnTemplate(result, StatusCode.FAIL.getCode(), e.getMessage());
        }
        return new ReturnTemplate(result, StatusCode.SUCCESS.getCode(), StatusCode.SUCCESS.getMessage());
    }
}

