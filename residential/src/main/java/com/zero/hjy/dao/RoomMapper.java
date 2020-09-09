package com.zero.hjy.dao;

import com.zero.hjy.entity.Room;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 * 房间表 Mapper 接口
 * </p>
 *
 * @author ZERO
 * @since 2020-09-08
 */
public interface RoomMapper {

    Integer batchNewRoomInfos(List<Room> room);

    List<Room> roomNameInfoByUnitNo(Room room);

    Integer updateRoomInfo(Room room);
}
