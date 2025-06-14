package com.example.buoi8.buoi8.doman.mapper;


import com.example.buoi8.buoi8.doman.dto.reponse.UserDTO;
import com.example.buoi8.buoi8.doman.dto.request.UserCreateDTO;
import com.example.buoi8.buoi8.doman.entity.User;

import org.mapstruct.*;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserMapper {

        User toUser(UserCreateDTO userCreateDTO);

        UserDTO toUserDto(User user);

        List<UserDTO> toUserDtos(List<User> user);

}
