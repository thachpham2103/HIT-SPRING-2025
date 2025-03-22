package org.example.btvnbuoi2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
public class Btvnbuoi2Application {

    public static void main(String[] args) {
        SpringApplication.run(Btvnbuoi2Application.class, args);
        }
        @RequestMapping(value = {"/" ,""})
        public String home(){
            System.out.println("dmasdf");
            return "redirect:/employees/select" ;
        }
    }
