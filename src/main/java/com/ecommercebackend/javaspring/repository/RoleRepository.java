package com.ecommercebackend.javaspring.repository;

import com.ecommercebackend.javaspring.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface RoleRepository extends JpaRepository<Role ,Long> {

    @Query("SELECT r FROM Role r WHERE r.code=:code")
    public Role findByCode(String code);
}
