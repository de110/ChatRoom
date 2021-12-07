package com.example.chat2.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.example.chat2.model.User;

@Mapper
public interface UserMapper {

	int createUser(User newUser);

	int signin(User user);
}
