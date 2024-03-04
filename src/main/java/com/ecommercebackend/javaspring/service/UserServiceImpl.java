package com.ecommercebackend.javaspring.service;

import com.ecommercebackend.javaspring.entity.Role;
import com.ecommercebackend.javaspring.entity.User;
import com.ecommercebackend.javaspring.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService{

    private UserRepository userRepository;
    private RoleService roleService;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> getUserList() {
        return userRepository.findAll();
    }

    @Override
    public User getUserByID(Long id) {
        Optional<User> optional = userRepository.findById(id);
        if (optional.isPresent()){
            return optional.get();
        }
        //TODO Id bulamazsa Exception firlat
        throw new RuntimeException("Eslesen id li User bulunamadi. ");
    }

    @Override
    public User addUser(User user) {
        Role role = user.getRole();

        return userRepository.save(user);
    }

    @Override
    public User deleteUser(Long id) {
        User foundUser = getUserByID(id);
         userRepository.delete(foundUser);
         return foundUser;
    }
}
