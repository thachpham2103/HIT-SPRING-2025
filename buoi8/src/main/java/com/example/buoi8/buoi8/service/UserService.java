package com.example.buoi8.buoi8.service;


import com.example.buoi8.buoi8.doman.dto.reponse.UserDTO;
import com.example.buoi8.buoi8.doman.dto.request.UserCreateDTO;
import com.example.buoi8.buoi8.doman.dto.request.UserLoginDTO;
import com.example.buoi8.buoi8.doman.entity.User;

import java.util.List;

public interface UserService {
  UserDTO createUser(UserCreateDTO userCreateDTO);
  List<UserDTO> getAllUser();
  UserDTO register(UserCreateDTO userCreateDTO);
  UserDTO logon(UserLoginDTO userLoginDTO);
  User findUserByUserName (String username);

}
