package com.springboot.buoi5;

import com.springboot.buoi5.domain.dto.request.UserRequestDTO;
import com.springboot.buoi5.domain.mapper.UserMapper;
import com.springboot.buoi5.entity.User;
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
		UserRequestDTO req = new UserRequestDTO("username", "abckyt", "First", "Last");

		User user = mapper.toEntity(req);
		System.out.println(user.getId());
		System.out.println(user.getPassword());
		System.out.println(user.getFirstName());
		System.out.println(user.getLastName());
		System.out.println(user.getUsername());
	}
}
