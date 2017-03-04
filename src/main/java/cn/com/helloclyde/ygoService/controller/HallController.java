package cn.com.helloclyde.ygoService.controller;

import cn.com.helloclyde.ygoService.vo.*;
import com.google.gson.Gson;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by HelloClyde on 2017/3/3.
 */
@Controller
@RequestMapping(value = "/hall")
public class HallController {

    @ResponseBody
    @RequestMapping(value = "/lists", method = {RequestMethod.POST, RequestMethod.GET}, produces = "application/json;charset=UTF-8")
    public String lists() {
        try {
            List<RoomInfo> roomInfos = new ArrayList<>();
            List<Room> rooms = Hall.lists();
            for (Room room : rooms) {
                RoomInfo tempRoomInfo = new RoomInfo();
                tempRoomInfo.setPlayerNum(room.getPlayers().size());
                roomInfos.add(tempRoomInfo);
            }
            return new Gson().toJson(new ResponseResult(roomInfos));
        } catch (Exception e) {
            e.printStackTrace();
            return new Gson().toJson(new ResponseResult(e.hashCode(), e.getMessage()));
        }
    }

    @ResponseBody
    @RequestMapping(value = "/join-room", method = {RequestMethod.GET}, produces = "application/json;charset=UTF-8")
    public String joinRoom(int roomIdx, String token) {
        try {
            UserVO userVO = (UserVO) LoginedUser.get(token);
            if (userVO == null) {
                throw new Exception("未登录");
            }
            Hall.joinRoom(userVO, roomIdx);
            return new Gson().toJson(new ResponseResult(roomIdx));
        } catch (Exception e) {
            e.printStackTrace();
            return new Gson().toJson(new ResponseResult(e.hashCode(), e.getMessage()));
        }
    }

    @ResponseBody
    @RequestMapping(value = "/exit-room", method = {RequestMethod.GET}, produces = "application/json;charset=UTF-8")
    public String exitRoom(String token) {
        try {
            UserVO userVO = (UserVO) LoginedUser.get(token);
            if (userVO == null) {
                throw new Exception("未登录");
            }
            int roomIdx = userVO.getRoomIdx();
            if (roomIdx != -1) {
                Hall.exitRoom(userVO);
            }
            return new Gson().toJson(new ResponseResult(roomIdx));
        } catch (Exception e) {
            e.printStackTrace();
            return new Gson().toJson(new ResponseResult(e.hashCode(), e.getMessage()));
        }
    }
}

class RoomInfo {
    private int playerNum;

    public int getPlayerNum() {
        return playerNum;
    }

    public void setPlayerNum(int playerNum) {
        this.playerNum = playerNum;
    }
}