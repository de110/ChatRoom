package com.example.chat2.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.chat2.model.ChatRoom;

@Mapper
public interface ChatRoomMapper {

    int createRoom(ChatRoom newRoom);

    List<ChatRoom> getAllDataList();

    List<ChatRoom> getAllChatRooms();

    String getRoomTitle(long id);

}
