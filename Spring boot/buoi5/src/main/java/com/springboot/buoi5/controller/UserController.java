package com.springboot.buoi5.controller;


import com.springboot.buoi5.base.RestApiV1;
import com.springboot.buoi5.base.VsReponseUtil;
import com.springboot.buoi5.constant.UrlConstant;
import com.springboot.buoi5.domain.dto.request.UserRequestDTO;
import com.springboot.buoi5.domain.entity.User;
import com.springboot.buoi5.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@RestApiV1
@RequiredArgsConstructor
@RequestMapping("/api/v1")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping(UrlConstant.User.GET_USERS)
    public ResponseEntity<?> getAll(){
        return VsReponseUtil.success(userService.getAllUser());
    }

    @GetMapping(UrlConstant.User.GET_USER)
    public ResponseEntity<?> getById(@PathVariable String id){
      return VsReponseUtil.success(userService.getUserById(id));
    }

    @PostMapping(UrlConstant.User.CREATE_USER)
   public ResponseEntity<?> createUser( @RequestBody UserRequestDTO userRequestDTO ){
        return VsReponseUtil.success(userService.createUser(userRequestDTO));
   }
}
