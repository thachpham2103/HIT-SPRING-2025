package com.springboot.buoi5;

import com.springboot.buoi5.mapper.UserMapper;
import com.springboot.buoi5.domain.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Buoi5Application implements CommandLineRunner {

	@Autowired
	private UserMapper mapper;

	public static void main(String[] args) {
		SpringApplication.run(Buoi5Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

	}
}
