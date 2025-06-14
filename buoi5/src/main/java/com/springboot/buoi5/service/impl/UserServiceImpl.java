package com.springboot.buoi5.service.impl;
import com.springboot.buoi5.constant.ErrorMessage;
import com.springboot.buoi5.domain.entity.User;

import com.springboot.buoi5.domain.dto.request.UserRequestDTO;
import com.springboot.buoi5.domain.dto.response.UserResponseDTO;
import com.springboot.buoi5.exception.NotFounException;
import com.springboot.buoi5.mapper.UserMapper;
import com.springboot.buoi5.repository.UserRepository;
import com.springboot.buoi5.service.UserService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.fasterxml.jackson.databind.cfg.CoercionInputShape.String;

@Service
@RequiredArgsConstructor
//@NoArgsConstructor
//@AllArgsConstructor
public class UserServiceImpl implements UserService {

    @Autowired
    private final UserRepository userRepository;
    @Autowired
    private final UserMapper userMapper;

    public UserServiceImpl(UserRepository userRepository, UserMapper userMapper) {
        this.userRepository = userRepository;
        this.userMapper = userMapper;
    }

    @Override
    public List<UserResponseDTO> getAllUser() {
        return userMapper.toUseReponseDTOList(userRepository.findAll());
    }

    @Override
    public UserResponseDTO getUserById(String id) {
        User user = userRepository.findById(id).orElseThrow(()-> new NotFounException(ErrorMessage.ERR_NOT_FOUND_ID, new String[]{id}));
        return userMapper.toUserReponseDTO(user);
    }

    @Override
    public UserResponseDTO createUser(UserRequestDTO requestDTO) {
        User user=userMapper.toUser(requestDTO);
        User savedUser = userRepository.save(user);
        return userMapper.toUserReponseDTO(savedUser);
    }
}
