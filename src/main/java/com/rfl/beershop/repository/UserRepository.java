package com.rfl.beershop.repository;

import com.rfl.beershop.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {
    @Query("SELECT u FROM User u WHERE u.email = LOWER(:email) ")
    Optional<User> findByEmailIgnoreCase(String email);
}
