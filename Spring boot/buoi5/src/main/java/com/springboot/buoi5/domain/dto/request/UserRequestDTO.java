package com.springboot.buoi5.domain.dto.request;


import lombok.*;
import org.antlr.v4.runtime.misc.NotNull;
import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.processing.Pattern;

//@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UserRequestDTO {
    @NotNull
    private String username;

    @NotNull
//    @Pattern( regex="^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$")
    private String password;
    private String firstName;
    private String lastName;


    public UserRequestDTO(String username, String password, String firstName, String lastName) {
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
    }



}
