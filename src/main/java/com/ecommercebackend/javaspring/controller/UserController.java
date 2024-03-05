package com.ecommercebackend.javaspring.controller;

import com.ecommercebackend.javaspring.dto.UserResponseDto;
import com.ecommercebackend.javaspring.entity.User;
import com.ecommercebackend.javaspring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    private UserService userService;
    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/")
    public List<UserResponseDto> getAllUsers(){
        return userService.getUserList();
    }

    @GetMapping("/{id}")
    public UserResponseDto getUserByID(@PathVariable Long id){
        return userService.getUserByID(id);
    }

    @PostMapping("/{roleID}")
    public UserResponseDto saveUser(@RequestBody User user , @PathVariable Long roleID){
        return userService.addUser(user,roleID);
    }

    @DeleteMapping("/{id}")
    public UserResponseDto deleteUser(Long id){
        return userService.deleteUser(id);
    }
}
