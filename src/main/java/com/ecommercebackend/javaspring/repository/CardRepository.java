package com.ecommercebackend.javaspring.repository;

import com.ecommercebackend.javaspring.entity.Card;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CardRepository extends JpaRepository<Card , Long> {
//    @Query("SELECT c FROM Card as c WHERE c.user.id=:id")
//    List<Card> findAllByUserId(@Param("id") Long id);

}
