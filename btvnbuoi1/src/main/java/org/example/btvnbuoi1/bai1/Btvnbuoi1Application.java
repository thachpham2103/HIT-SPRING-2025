package org.example.btvnbuoi1.bai1;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Btvnbuoi1Application {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("org.example");

        // Lấy Person từ IoC Container
        Person person = context.getBean(Person.class);
        person.book();
    }
}
