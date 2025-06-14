package com.devrivia.hello_spring_boot.controller;

import com.devrivia.hello_spring_boot.dto.UserCreateRequest;
import com.devrivia.hello_spring_boot.dto.UserUpdateRequest;
import com.devrivia.hello_spring_boot.entity.User;
import com.devrivia.hello_spring_boot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/nguoidung")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/users")
    User createUser(@RequestBody UserCreateRequest request){
        return userService.createUser(request);
    }

    @GetMapping("/users")
    List<User> getUsers(){
     return userService.getUsers();
    }

    @GetMapping("/{userId}")
    User getUser(@PathVariable("userId") String userId){
        return userService.getUser(userId);
    }
    
    @PutMapping("/{userId}")
    User updateUser(@PathVariable String userId, @RequestBody UserUpdateRequest request){
        return userService.updateUser(userId, request);
    }

    @DeleteMapping("/{userId}")
    String deleteUser(@PathVariable String userId){
         userService.deleteUser(userId);
         return "thành công!!!";
    }
}
