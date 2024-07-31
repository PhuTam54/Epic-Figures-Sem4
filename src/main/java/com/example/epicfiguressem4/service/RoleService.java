package com.example.epicfiguressem4.service;

import com.example.epicfiguressem4.entity.Role;
import com.example.epicfiguressem4.statics.enums.ERole;

import java.util.List;
import java.util.Optional;

public interface RoleService {
    List<Role> getAllRoles();
    Optional<Role> getRoleById(long id);
    Optional<Role> getRoleByName(ERole name);
    ERole addRole(ERole role);
    Role updateRole(long id, Role role);
    void deleteRole(long id);
}
