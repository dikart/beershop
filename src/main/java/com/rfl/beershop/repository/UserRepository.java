package com.rfl.beershop.repository;

import com.rfl.beershop.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}