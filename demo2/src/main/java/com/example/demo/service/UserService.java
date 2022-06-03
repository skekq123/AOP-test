package com.example.demo.service;

import com.example.demo.domain.User;
import com.example.demo.domain.UserDto;
import com.example.demo.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public void save(UserDto userDto) {
        userRepository.save(User.makeUser(userDto));
    }

    public List<User> getUsers() {
        return userRepository.findAll();
    }
}
