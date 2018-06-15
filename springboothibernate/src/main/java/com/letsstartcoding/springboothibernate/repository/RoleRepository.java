package com.letsstartcoding.springboothibernate.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.letsstartcoding.springboothibernate.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long>{
}
