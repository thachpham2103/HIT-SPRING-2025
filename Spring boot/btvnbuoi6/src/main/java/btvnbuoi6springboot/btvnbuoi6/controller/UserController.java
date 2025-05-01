package btvnbuoi6springboot.btvnbuoi6.controller;


import btvnbuoi6springboot.btvnbuoi6.dto.usersDTO.UserCreateRequest;
import btvnbuoi6springboot.btvnbuoi6.dto.usersDTO.UserUpdateRequest;
import btvnbuoi6springboot.btvnbuoi6.entity.Users;
import btvnbuoi6springboot.btvnbuoi6.service.UserService;
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
    List<Users> getUsers(@RequestParam long userId){
        return userService.getUsers(userId);
    }

    @PutMapping("/{userId}")
    Users updateUser(@PathVariable long userId, @RequestBody UserUpdateRequest request){
        return userService.updateUser(request, userId);
    }

    @DeleteMapping("/{userId}")
    String deleteUser(@PathVariable long userId){
        userService.deleteUser(userId);
        return "thành công!!!";
    }
}
