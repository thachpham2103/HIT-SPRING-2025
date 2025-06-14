package com.springboot.buoi5.service;

import java.util.List;

import com.springboot.buoi5.domain.dto.request.UserRequestDTO;
import com.springboot.buoi5.domain.dto.response.UserResponseDTO;

public interface UserService {
    List<UserResponseDTO> getAllUser();
    UserResponseDTO getUserById(String id);
    UserResponseDTO createUser(UserRequestDTO requestDTO);

}
