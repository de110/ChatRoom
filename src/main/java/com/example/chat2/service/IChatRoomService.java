package com.example.chat2.service;

import java.util.List;

import com.example.chat2.model.ChatRoom;

public interface IChatRoomService {
    long createRoom(ChatRoom newRoom);

    List<ChatRoom> getAllDataList();

    List<ChatRoom> getAllChatRooms();

    String getRoomTitle(long id);
}
