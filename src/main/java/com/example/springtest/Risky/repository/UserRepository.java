package com.example.springtest.Risky.repository;

import com.example.springtest.Risky.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
