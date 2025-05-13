package com.springboot.buoi5.constant;



public class UrlConstant {

    public static class User{
        public static final String PREFIX="/users";
        public static final String GET_USERS= "/users";
        public static final String GET_USER= PREFIX+"/{id}";
        public static final String CREATE_USER=PREFIX;
    }
}
