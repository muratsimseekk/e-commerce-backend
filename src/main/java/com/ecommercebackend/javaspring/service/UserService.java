package com.ecommercebackend.javaspring.service;

import com.ecommercebackend.javaspring.entity.User;

import java.util.List;

public interface UserService {
    List<User> getUserList();
    User getUserByID(Long id);
    User addUser(User user);
    User deleteUser(Long id);
}
