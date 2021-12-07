// package com.example.chat1.controller;

// import java.util.List;

// // import com.example.chat1.dto.chatroom;
// import com.example.chat1.model.ChatRoom;

// // import com.example.chat1.service.TestService;
// import com.example.chat1.service.IChatRoomService;

// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.RestController;

// import lombok.RequiredArgsConstructor;

// @RequiredArgsConstructor
// @RestController
// public class TestController {
// private final IChatRoomService testService;

// @GetMapping("/hello")
// public String hello() {
// return "Hello World";
// }

// @GetMapping("/test")
// public List<ChatRoom> test() {
// return testService.getAllDataList();
// // return testService.getAllDataList();
// }
// }