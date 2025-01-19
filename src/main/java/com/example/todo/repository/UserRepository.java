package com.example.todo.repository;

import com.example.todo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    // Check if email is already registered
    boolean existsByEmail(String email);

    // Optional: Find a user by email
    Optional<User> findByEmail(String email);
}
