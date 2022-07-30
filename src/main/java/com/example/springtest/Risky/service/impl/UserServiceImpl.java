package com.example.springtest.Risky.service.impl;

import com.example.springtest.Risky.dto.UserDto;
import com.example.springtest.Risky.models.User;
import com.example.springtest.Risky.repository.UserRepository;
import com.example.springtest.Risky.service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final ModelMapper modelMapper;

    public UserServiceImpl(UserRepository userRepository, ModelMapper modelMapper) {
        this.userRepository = userRepository;
        this.modelMapper = modelMapper;
    }
    @Override
    public UserDto createUser(UserDto userDto) {
        User user = modelMapper.map(userDto, User.class);
        user.setCreatedDate(new Date());
        user.setCreatedBy("Test");
        return modelMapper.map(userRepository.save(user), UserDto.class);
    }

    @Override
    public List<UserDto> getAllUsers() {
        List<User> allUsers = userRepository.findAll();
        return allUsers.stream().map(user -> modelMapper.map(user, UserDto.class)).toList();
    }

    @Override
    public List<User> getAllUsersAdmin() {
        return userRepository.findAll();
    }

    @Override
    public UserDto getUserById(Long id) {
        Optional<User> foundUser = userRepository.findById(id);
//        IDE onerisi olmadan yazdigimiz kod parcacigi
        /*if(foundUser.isPresent()){
            return modelMapper.map(foundUser, UserDto.class);
        }*/
        return foundUser.map(user -> modelMapper.map(user, UserDto.class)).orElse(null);
    }

    @Override
    public UserDto updateUser(Long id, UserDto newuser) {
        Optional<User> foundUser = userRepository.findById(id);

        if (foundUser.isPresent()){
            foundUser.get().setFirstName(newuser.getFirstName());
            foundUser.get().setLastName(newuser.getLastName());

            foundUser.get().setModifiedDate(new Date());
            foundUser.get().setModifiedBy("Admin");

//            return userRepository.save(foundUser.get());
            return modelMapper.map(userRepository.save(foundUser.get()), UserDto.class);
        }

        return null;
    }
}
