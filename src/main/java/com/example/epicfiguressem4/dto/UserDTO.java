package com.example.epicfiguressem4.dto;

import com.example.epicfiguressem4.entity.Role;
import com.example.epicfiguressem4.entity.User;
import lombok.*;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String username;
    private String address;
    private String email;
    private String phoneNumber;
    private String dateOfBirth;
    private String gender;
    private String avatar;
    private Set<Role> roles = new HashSet<>();

    public UserDTO(User user) {
    }
}