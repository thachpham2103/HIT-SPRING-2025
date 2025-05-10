package btvnbuoi6springboot.btvnbuoi6.service;


import btvnbuoi6springboot.btvnbuoi6.dto.usersDTO.UserCreateRequest;
import btvnbuoi6springboot.btvnbuoi6.dto.usersDTO.UserUpdateRequest;
import btvnbuoi6springboot.btvnbuoi6.entity.Users;
//import btvnbuoi6springboot.btvnbuoi6.mapper.UserMapper;
import btvnbuoi6springboot.btvnbuoi6.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;
//    private UserMapper userMapper;

public List<Users> getUsers(long userId){
    return userRepository.findAll();
}

public Users createUser(UserCreateRequest request){
    Users users = new Users();

    users.setUsername(request.getUsername());
    users.setEmail(request.getEmail());
    users.setPassword(request.getPassword());
    users.setCreatedAt(request.getCreatedAt());
    return userRepository.save(users);
}

public Users updateUser(UserUpdateRequest request, long userId){

    Users users= (Users) getUsers(userId);

    users.setPassword(request.getPassword());
    users.setEmail(request.getEmail());
    users.setUsername(request.getUsername());

    return userRepository.save(users);

}

    public void deleteUser(long userId) {
        userRepository.deleteById(userId);
    }

}
