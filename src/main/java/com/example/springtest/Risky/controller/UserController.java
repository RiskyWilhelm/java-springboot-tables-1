package com.example.springtest.Risky.controller;

import com.example.springtest.Risky.dto.UserDto;
import com.example.springtest.Risky.models.User;
import com.example.springtest.Risky.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/create")
    public ResponseEntity<UserDto> createUser(@RequestBody UserDto user){
        UserDto resultUser = userService.createUser(user);
        return ResponseEntity.ok(resultUser);
    }

    @GetMapping("/getAllUsers")
    public ResponseEntity<List<UserDto>> getUsers(){
        List<UserDto> allUsers = userService.getAllUsers();
        return ResponseEntity.ok(allUsers);
    }

    @GetMapping("/getAllUsersAdmin")
    public ResponseEntity<List<User>> getAllUsersAdmin(){
        return ResponseEntity.ok(userService.getAllUsersAdmin());
    }

    @GetMapping("/getUserById/{id}")
    public ResponseEntity<UserDto> getUserById(@PathVariable("id") Long id){
        UserDto foundUser = userService.getUserById(id);
        return ResponseEntity.ok(foundUser);
    }

    @PutMapping("/editUser/{id}")
    public ResponseEntity<UserDto> updateUser(@PathVariable("id") Long id,@RequestBody UserDto newuser){
        UserDto updatedUser = userService.updateUser(id, newuser);
        return ResponseEntity.ok(updatedUser);
    }
}
