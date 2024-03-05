package com.ecommercebackend.javaspring.service;

import com.ecommercebackend.javaspring.dto.UserResponseDto;
import com.ecommercebackend.javaspring.entity.User;

import java.util.List;

public interface UserService {
    List<UserResponseDto> getUserList();
    UserResponseDto getUserByID(Long id);
    UserResponseDto addUser(User user , Long roleID);
    UserResponseDto deleteUser(Long id);

    User getUser(Long id);
}
