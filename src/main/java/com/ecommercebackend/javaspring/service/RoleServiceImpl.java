package com.ecommercebackend.javaspring.service;

import com.ecommercebackend.javaspring.dto.RoleResponseDto;
import com.ecommercebackend.javaspring.entity.Role;
import com.ecommercebackend.javaspring.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RoleServiceImpl implements RoleService{
    private RoleRepository roleRepository;

    @Autowired
    public RoleServiceImpl(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }


    @Override
    public List<Role> findAll() {
        return roleRepository.findAll();
    }

    @Override
    public RoleResponseDto addRole(Role role) {
         Role savedRole = roleRepository.save(role);
         return new RoleResponseDto(savedRole.getId(), savedRole.getName(), savedRole.getCode());
    }

    @Override
    public RoleResponseDto deleteRole(Long id) {
        Optional<Role> deleted = roleRepository.findById(id);
        if (deleted.isPresent()){
            roleRepository.delete(deleted.get());
            return new RoleResponseDto(id , deleted.get().getName() , deleted.get().getCode());
        }
        throw new RuntimeException("Role id bulunamadi");
    }
}
