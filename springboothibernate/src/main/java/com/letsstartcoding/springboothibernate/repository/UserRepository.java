package com.letsstartcoding.springboothibernate.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.letsstartcoding.springboothibernate.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
