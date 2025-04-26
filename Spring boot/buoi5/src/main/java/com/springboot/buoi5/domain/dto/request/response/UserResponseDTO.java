package com.springboot.buoi5.domain.dto.request.response;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserResponseDTO {


    private String username;
    private String firstName;
    private String lastName;

}
