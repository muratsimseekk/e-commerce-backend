package com.ecommercebackend.javaspring.repository;

import com.ecommercebackend.javaspring.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CategoryRepository extends JpaRepository<Category,Long> {

}
