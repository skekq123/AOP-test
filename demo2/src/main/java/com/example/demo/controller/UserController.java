package com.example.demo.controller;

import com.example.demo.domain.User;
import com.example.demo.domain.UserDto;
import com.example.demo.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping("/make/user")
    public void makeUser(@RequestBody UserDto userDto) {
        userService.save(userDto);
    }

    @GetMapping("/get/user")
    public List<User> getUser() {
        return userService.getUsers();
    }
}
