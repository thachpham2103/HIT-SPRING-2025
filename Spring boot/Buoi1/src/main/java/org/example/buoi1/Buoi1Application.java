package org.example.buoi1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Buoi1Application {

    public static void main(String[] args) {
        // Khởi tạo ApplicationContext (IoC Container)
        ApplicationContext context = new AnnotationConfigApplicationContext("org.example");

        // Lấy đối tượng User từ Container (Spring sẽ tự inject dependency)
        User user = context.getBean(User.class);
        user.makeCall();
    }

}

