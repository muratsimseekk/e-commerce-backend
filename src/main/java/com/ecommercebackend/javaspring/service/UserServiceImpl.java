package com.ecommercebackend.javaspring.service;

import com.ecommercebackend.javaspring.dto.RoleResponseDto;
import com.ecommercebackend.javaspring.dto.UserResponseDto;
import com.ecommercebackend.javaspring.entity.Role;
import com.ecommercebackend.javaspring.entity.User;
import com.ecommercebackend.javaspring.repository.UserRepository;
import com.ecommercebackend.javaspring.util.UserDtoConvertion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService{

    private UserRepository userRepository;
    private RoleService roleService;

    @Autowired
    public UserServiceImpl(UserRepository userRepository, RoleService roleService) {
        this.userRepository = userRepository;
        this.roleService = roleService;
    }

    @Override
    public List<UserResponseDto> getUserList() {

        List<User> userList = userRepository.findAll();
        return UserDtoConvertion.convertUserList(userList);
    }

    @Override
    public UserResponseDto getUserByID(Long id) {
        Optional<User> optional = userRepository.findById(id);
        if (optional.isPresent()){
            return UserDtoConvertion.convertUser(optional.get());
        }
        //TODO Id bulamazsa Exception firlat
        throw new RuntimeException("Eslesen id li User bulunamadi. ");
    }

    @Override
    public UserResponseDto addUser(User user , Long roleID) {

        Role role = roleService.findRole(roleID);
        role.addUser(user);
        user.setRole(role);
        userRepository.save(user);

        return UserDtoConvertion.convertUser(user);
    }

    @Override
    public UserResponseDto deleteUser(Long id) {
        User foundUser = getUser(id);
         userRepository.delete(foundUser);
         return UserDtoConvertion.convertUser(foundUser);
    }

    @Override
    public User getUser(Long id) {
        return null;
    }
}
