package com.educandoweb.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educandoweb.course.entities.Order;
import com.educandoweb.course.services.OrderService;

// this anotation indicates that this class is controlled by a rest controller
@RestController
// name of this recourse
@RequestMapping(value = "/orders")
public class OrderResource {
	
	@Autowired
	private OrderService service;
	
	// endpoint method to access users
	// indicates that this method answers the get req from the http
	@GetMapping
	public ResponseEntity<List<Order>> findall() {
		List<Order> list = service.findAll();
		// ok() returns success response
		// body() returns the obj u in the body of the response
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	// the PathVariable annotation tells spring that the id comes from the url
	public ResponseEntity<Order> findById(@PathVariable Long id) {
		Order obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
	
}
