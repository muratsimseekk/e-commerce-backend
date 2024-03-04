package com.ecommercebackend.javaspring.controller;

import com.ecommercebackend.javaspring.dto.RoleResponseDto;
import com.ecommercebackend.javaspring.entity.Role;
import com.ecommercebackend.javaspring.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/roles")
public class RoleController {
    private RoleService roleService;

    @Autowired
    public RoleController(RoleService roleService) {
        this.roleService = roleService;
    }

    @GetMapping
    public List<Role> findAll() {
        return roleService.findAll();
    }

    @PostMapping("/")
    public RoleResponseDto addRole(@RequestBody Role role){
        return roleService.addRole(role);
    }

    @DeleteMapping("/{id}")
    public RoleResponseDto deleteRole(@PathVariable Long id){
        return roleService.deleteRole(id);
    }



}
