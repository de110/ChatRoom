package com.example.chat2.service;

import java.util.List;

import com.example.chat2.model.Message;

public interface IMessageService {
	int insertMessage(Message chatMessage);

	List<Message> getMessagesByChatroomId(long id, long idx);
}
