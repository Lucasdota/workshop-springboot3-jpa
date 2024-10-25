package com.educandoweb.course.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.educandoweb.course.entities.User;
import com.educandoweb.course.repositories.UserRepository;

// tells to the SpringBoot that this is a configuration class
@Configuration
// tells that this is a test class, exactly like put in the application.properties file 
@Profile("test")
public class TestConfig implements CommandLineRunner {

	// enables Spring to associate an instance of UserRepository in it
	// removing the need to instanciate the obj with new UserRepository()
	/*
	 * When Spring creates the User Repository instance, 
	 * it also manages its lifecycle. This means that Spring 
	 * can handle things like initialization, destruction, 
	 * and scope (e.g., singleton or prototype) for you.
	 */
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		
		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
		User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");
		
		userRepository.saveAll(Arrays.asList(u1, u2));
	}
	
	
}
