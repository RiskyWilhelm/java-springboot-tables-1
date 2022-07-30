package com.example.springtest.Risky.service;

import com.example.springtest.Risky.dto.UserDto;
import com.example.springtest.Risky.models.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

    UserDto createUser(UserDto user);
    List<UserDto> getAllUsers();

    List<User> getAllUsersAdmin();
    UserDto getUserById(Long id);
    UserDto updateUser(Long id, UserDto newuser);
}
