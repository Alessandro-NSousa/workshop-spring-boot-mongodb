package com.workshop.mongodb.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.workshop.mongodb.domain.User;
import com.workshop.mongodb.repository.UserRepository;

@Configuration
public class instantiation implements CommandLineRunner{
	
	@Autowired
	private UserRepository userRepositor;

	@Override
	public void run(String... args) throws Exception {
		
		userRepositor.deleteAll();
		
		User maria = new User(null, "Maria Brown", "maria@gmail.com");
		User alex = new User(null, "Alex Green", "alex@gmail.com");
		User bob = new User(null, "Bob Grey", "bob@gmail.com");
		
		userRepositor.saveAll(Arrays.asList(maria, alex, bob));
	}

}
