package com.educandoweb.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educandoweb.course.entities.User;

// this anotation indicates that this class is controlled by a rest controller
@RestController
// name of this recourse
@RequestMapping(value = "/users")
public class UserResource {
	
	// endpoint method to access users
	// indicates that this method answers the get req from the http
	@GetMapping
	public ResponseEntity<User> findall() {
		User u = new User(1L, "Maria", "maria@gmail.com", "9999999", "12345");
		// ok() returns success response
		// body() returns the obj u in the body of the response
		return ResponseEntity.ok().body(u);
	}
}
