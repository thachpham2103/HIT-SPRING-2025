//package com.springboot.buoi5.domain;
//
//
//import lombok.AllArgsConstructor;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//import org.antlr.v4.runtime.misc.NotNull;
//import org.hibernate.annotations.Parent;
//import org.hibernate.annotations.processing.Pattern;
//
//@Getter
//@Setter
//@AllArgsConstructor
//@NoArgsConstructor
//
//public class CreateUserDTO {
//
//    @NotNull
//    private String username;
//
//    @NotNull
//    @Pattern(regex="^(?=.*[A-Za-z])(?=.*\\d)[A-Za-z\\d]{8,}$")
//    private String password;
//    private String fisrtName;
//    private String lastName;
//}
