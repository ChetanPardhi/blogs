package com.cricophile.stats.service.impl;

import com.cricophile.stats.entity.User;
import com.cricophile.stats.payload.UserDto;
import com.cricophile.stats.repository.UserRepo;
import com.cricophile.stats.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepo userRepo;


    @Override
    public UserDto createUser(UserDto userDto) {

        
        return null;
    }

    private User dtoToUser(UserDto userDto){
        User user = new User();
        user.setUserName(userDto.getUserName());
        user.setId(userDto.getId());
        user.setEmail(userDto.getEmail());
        user.setPassword(userDto.getPassword());
        user.setAbout(userDto.getAbout());

        return  user;
    }

    private UserDto userToDto(User user){

        UserDto userDto = new UserDto();

        userDto.setUserName(user.getUserName());
        userDto.setId(user.getId());
        userDto.setEmail(user.getEmail());
        userDto.setPassword(user.getPassword());
        userDto.setAbout(user.getAbout());

        return userDto;
    }
}
