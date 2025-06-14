package com.devrivia.hello_spring_boot.service;


import com.devrivia.hello_spring_boot.dto.UserCreateRequest;
import com.devrivia.hello_spring_boot.dto.UserUpdateRequest;
import com.devrivia.hello_spring_boot.entity.User;
import com.devrivia.hello_spring_boot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User createUser( UserCreateRequest request){
        User user= new User();

        if(userRepository.existsByUserName(request.getUserName())){
            throw new RuntimeException("user existed");
        }

        user.setUserName(request.getUserName());
        user.setPassword(request.getPassword());
        user.setLasTName(request.getLastName());
        user.setFirstName(request.getFirstName());
        user.setDate(request.getDate());
        return userRepository.save(user);
    }

   public List<User> getUsers(){
       return userRepository.findAll();
   }

   public User getUser(String id){
       return userRepository.findById(id).orElseThrow(()-> new RuntimeException(" User not found"));

   }

   public User updateUser(String userId, UserUpdateRequest request){

        User user= getUser(userId);

       user.setPassword(request.getPassword());
       user.setLasTName(request.getLastName());
       user.setFirstName(request.getFirstName());
       user.setDate(request.getDate());

      return userRepository.save(user);
   }

   public void deleteUser(String userId){
        userRepository.deleteById(userId);
   }

}
