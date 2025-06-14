package org.example.btvnbuoi1.bai1.bai2;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Main {

    ApplicationContext context = new AnnotationConfigApplicationContext("org.example.btvnbuoi1.bai1.bai2");

   Customer customer= context.getBean(Customer.class);

}
