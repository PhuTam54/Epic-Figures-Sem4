package com.example.epicfiguressem4.repository;

import com.example.epicfiguressem4.entity.Role;
import com.example.epicfiguressem4.statics.enums.ERole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}
