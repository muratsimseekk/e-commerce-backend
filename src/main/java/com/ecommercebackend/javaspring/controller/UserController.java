package com.ecommercebackend.javaspring.controller;

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
    public List<User> getAllUsers(){
        return userService.getUserList();
    }

    @GetMapping("/{id}")
    public User getUserByID(@PathVariable Long id){
        return userService.getUserByID(id);
    }

    @PostMapping("/")
    public User saveUser(@RequestBody User user){
        return userService.addUser(user);
    }

    @DeleteMapping("/{id}")
    public User deleteUser(Long id){
        return userService.deleteUser(id);
    }
}
