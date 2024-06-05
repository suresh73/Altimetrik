package com.payment.gateway.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.payment.gateway.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsername(String username);
}
