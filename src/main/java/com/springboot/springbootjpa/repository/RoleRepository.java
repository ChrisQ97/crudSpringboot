package com.springboot.springbootjpa.repository;

import com.springboot.springbootjpa.models.db.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface RoleRepository extends JpaRepository<Role, Integer> {
}
