package com.zero.hjy.service;

import com.zero.hjy.entity.Room;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 房间表 服务类
 * </p>
 *
 * @author ZERO
 * @since 2020-09-08
 */
public interface RoomService {

    List<Room> batchNewRoomInfos(Room[] room);

    List<Room> roomNameInfoByUnitNo(Room room);

    Integer updateRoomInfo(Room room);
}
