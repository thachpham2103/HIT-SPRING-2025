package com.springboot.buoi5.mapper;

import com.springboot.buoi5.domain.dto.request.UserRequestDTO;
import com.springboot.buoi5.domain.dto.response.UserResponseDTO;
import com.springboot.buoi5.domain.entity.User;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel ="spring")
public interface UserMapper {
    //tạo
    User toUser(UserRequestDTO requestDTO);
    //tìm kiếm
    UserResponseDTO toUserReponseDTO(User user);
    //in ra danh sách
    List<UserResponseDTO> toUseReponseDTOList (List<User> userList);
}