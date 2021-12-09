package com.example.chat2.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.chat2.mapper.ChatRoomMapper;
import com.example.chat2.model.ChatRoom;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class ChatRoomService implements IChatRoomService {
    private final ChatRoomMapper chatroomMapper;

    @Override
    public List<ChatRoom> getAllDataList() {
        return chatroomMapper.getAllDataList();
    }

    @Override
    public long createRoom(ChatRoom newRoom) {
        int result = chatroomMapper.createRoom(newRoom);
        return result == 1 ? newRoom.getId() : -1;
    }

    @Override
    public List<ChatRoom> getAllChatRooms() {
        return chatroomMapper.getAllChatRooms();
    }

    @Override
    public String getRoomTitle(long id) {
        return chatroomMapper.getRoomTitle(id);
    }

}
