package com.example.epicfiguressem4.service;

import com.example.epicfiguressem4.dto.UserDTO;
import com.example.epicfiguressem4.model.requests.UserRequest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface UserService {
    Page<UserDTO> getAll(Pageable pageable);
    Page<UserDTO> getInTrash(Pageable pageable);
    UserDTO createUser(UserRequest userRequest);
    UserDTO updateUser(Long id, UserRequest userRequest);
    void deleteById(Long id);
    UserDTO findById(Long id);
    UserDTO findByUsername(String username);
    void moveToTrash(Long id);

}
