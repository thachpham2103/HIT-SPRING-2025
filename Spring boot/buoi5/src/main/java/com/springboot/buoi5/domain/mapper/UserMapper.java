package com.springboot.buoi5.domain.mapper;


import com.springboot.buoi5.domain.dto.request.UserRequestDTO;
import com.springboot.buoi5.domain.dto.request.response.UserResponseDTO;
import com.springboot.buoi5.entity.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = " spring")
public interface UserMapper {
    User toEntity(UserRequestDTO requestDTO);
    UserResponseDTO toDTO(User user);
}