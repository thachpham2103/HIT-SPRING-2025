package com.example.buoi8.buoi8.service.impl;

import com.example.buoi8.buoi8.doman.dto.reponse.UserDTO;
import com.example.buoi8.buoi8.doman.dto.request.UserCreateDTO;
import com.example.buoi8.buoi8.doman.dto.request.UserLoginDTO;
import com.example.buoi8.buoi8.doman.entity.User;
import com.example.buoi8.buoi8.doman.mapper.UserMapper;
import com.example.buoi8.buoi8.repository.UserRepository;
import com.example.buoi8.buoi8.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final UserMapper userMapper;
    private final PasswordEncoder passwordEncoder;

    public UserServiceImpl(UserRepository userRepository, UserMapper userMapper, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.userMapper = userMapper;
        this.passwordEncoder = passwordEncoder;
    }
        @Override
        public UserDTO createUser(UserCreateDTO userCreateDto) {
            if (userRepository.findByUserName(userCreateDto.getUsername()).isPresent()) {
                throw new RuntimeException("Username already exists!");
            }

            User user = userMapper.toUser(userCreateDto);
            user.setPassword(passwordEncoder.encode(user.getPassword()));
            return userMapper.toUserDto(userRepository.save(user));
        }

    @Override
    public List<UserDTO> getAllUser() {
        return userMapper.toUserDtos(userRepository.findAll());
    }

    @Override
    public UserDTO register(UserCreateDTO userCreateDTO) {
        if (userRepository.findByUserName(userCreateDTO.getUsername()).isPresent()) {
            throw new RuntimeException("Username already exists!");
        }
       User user= userMapper.toUser(userCreateDTO);
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        userRepository.save(user);
        return userMapper.toUserDto(userRepository.save(user));
    }

    @Override
    public UserDTO logon(UserLoginDTO userLoginDTO) {
        User user= findUserByUserName(userLoginDTO.getUsername());
        if(!passwordEncoder.matches(userLoginDTO.getPassword(), user.getPassword())){
            throw new RuntimeException("Password is incorrect!");
        }
        return userMapper.toUserDto(user);
    }

    @Override
    public User findUserByUserName(String username) {
        return userRepository.findByUserName(username).orElseThrow(() -> new RuntimeException("Username does not exist!"));

    }
}
