package com.auditauthentication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.auditauthentication.entity.User;
import com.auditauthentication.repository.UserRepository;

@SpringBootApplication
public class AuditAuthenticationApplication implements CommandLineRunner {
	
	@Autowired
	UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(AuditAuthenticationApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		User niraj = new User("niraj", "$2y$12$B6I4IDz/WUqRn/9EWJPFFulwmNe6qC.ijNTR6VWSvV.C5yvTzbGXC", "ROLE_ADMIN");
		User test = new User("test", "$2y$12$B6I4IDz/WUqRn/9EWJPFFulwmNe6qC.ijNTR6VWSvV.C5yvTzbGXC", "ROLE_USER");
		userRepository.save(niraj);
		userRepository.save(test);		
	}
}
