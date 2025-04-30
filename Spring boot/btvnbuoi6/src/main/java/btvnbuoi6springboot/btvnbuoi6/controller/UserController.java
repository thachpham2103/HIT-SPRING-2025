package btvnbuoi6springboot.btvnbuoi6.controller;


import btvnbuoi6springboot.btvnbuoi6.dto.usersDTO.UserCreateRequest;
import btvnbuoi6springboot.btvnbuoi6.entity.Users;
import btvnbuoi6springboot.btvnbuoi6.service.UserService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/dtt")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/users")
    Users createUser(@RequestBody UserCreateRequest request){
        return userService.createUser(request);
    }

    @GetMapping("/users")
    List<Users> getUsers(){
        return userService.getUsers();
    }

}
