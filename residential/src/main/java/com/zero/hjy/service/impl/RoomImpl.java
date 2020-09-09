package com.zero.hjy.service.impl;

import com.zero.hjy.entity.Room;
import com.zero.hjy.dao.RoomMapper;
import com.zero.hjy.service.RoomService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ZERO
 * @since 2020-09-08
 */
@Service
public class RoomImpl implements RoomService {
    private Logger log = LoggerFactory.getLogger(RoomImpl.class);

    @Autowired
    private RoomMapper roomMapper;

    @Override
    public List<Room> batchNewRoomInfos(Room[] room) throws RuntimeException {

        List<Room> roomList = new ArrayList<>();
        for (int i = 0; i < room.length; i++) {
            if (null == room || null == room[i].getUnitNo() || null == room[i].getStartFloor() || null == room[i].getEndFloor()
                    || null == room[i].getStartRoomNo() || null == room[i].getEndRoomNo()) {
//                throw new RuntimeException("参数不能为空！");
                log.error("参数不能为空（注：没有层数不能录入房间）");
                continue;
            }

            // 格式floor类型
            Integer[] floorType = formatFloorType(room[i]);

            // start floor - end floor
            for (int j = floorType[0]; j <= floorType[1]; j++) {
                // 格式roomNo类型
                Integer[] roomNoType = formatRoomNoType(room[i]);
                // start roomNO - end roomNo
                for (int k = roomNoType[0]; k <= roomNoType[1]; k++) {
                    // 存储数据
                    Room roomInfo = new Room();
                    roomInfo.setRoomName(k + "号房间");
                    roomInfo.setRoomNo("A" + k);
                    roomInfo.setUnitNo(room[i].getUnitNo());
                    roomInfo.setFloorNumber(j);
                    roomList.add(roomInfo);
                }
            }
        }
        // 批量录入
        Integer roomResult = roomMapper.batchNewRoomInfos(roomList);
        if (null == roomResult || 0 == roomResult) {
            throw new RuntimeException("录入数据失败！");
        }
        return roomList;
    }

    private Integer[] formatFloorType(Room room) {
        int startFloor = Integer.valueOf(room.getStartFloor());
        int endFloor = Integer.valueOf(room.getEndFloor());
        return new Integer[]{startFloor, endFloor};
    }

    private Integer[] formatRoomNoType(Room room) {
        int startRoomNo = Integer.valueOf(room.getStartRoomNo());
        int endRoomNo = Integer.valueOf(room.getEndRoomNo());
        return new Integer[]{startRoomNo, endRoomNo};
    }

    @Override
    public List<Room> roomNameInfoByUnitNo(Room room) {
        if (null == room) {
            throw new RuntimeException("参数不能为空");
        }

        List<Room> roomList = roomMapper.roomNameInfoByUnitNo(room);
        if (null == roomList) {
            throw new RuntimeException("{roomNameInfoByUnitNo} => 查询数据库异常@");
        }
        return  roomList;
    }

    @Override
    public Integer updateRoomInfo(Room room) {
        if (null == room || null == room.getId()) {
            throw new RuntimeException("参数不能为null");
        }
        Integer roomResult = roomMapper.updateRoomInfo(room);
        if (null == room || 0 == roomResult) {
            throw new RuntimeException("{updateRoomInfo} => 更新数据异常");
        }

        return roomResult;
    }

}
