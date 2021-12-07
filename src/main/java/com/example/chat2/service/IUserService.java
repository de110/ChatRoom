package com.example.chat2.service;

import com.example.chat2.model.User;

public interface IUserService {

	long createUser(User newUser);

	boolean signin(User user);

}
