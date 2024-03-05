package com.ecommercebackend.javaspring.util;

import com.ecommercebackend.javaspring.dto.UserResponseDto;
import com.ecommercebackend.javaspring.entity.User;

import java.util.ArrayList;
import java.util.List;

public class UserDtoConvertion {

    public static List<UserResponseDto> convertUserList(List<User> userList){

        List<UserResponseDto> userResponses = new ArrayList<>();

        userList.stream().forEach(user -> userResponses.add(new UserResponseDto(user.getName(), user.getEmail(), user.getRole().getId())));

        return userResponses;
    }

    public static UserResponseDto convertUser(User user){
        return new UserResponseDto(user.getName(), user.getEmail(), user.getRole().getId());
    }
}
