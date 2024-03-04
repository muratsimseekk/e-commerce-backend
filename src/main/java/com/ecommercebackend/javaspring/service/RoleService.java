package com.ecommercebackend.javaspring.service;

import com.ecommercebackend.javaspring.dto.RoleResponseDto;
import com.ecommercebackend.javaspring.entity.Role;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface RoleService {


    List<Role> findAll();

    RoleResponseDto addRole(Role role);

    RoleResponseDto deleteRole(Long id);

}
