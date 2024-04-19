package com.polieduca.br.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.polieduca.br.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<User> findAll() {
		User u = new User(0001L, "Maria Pink", "mariapink@gmail.com", "(11) 98765-4321", "12345");
		return ResponseEntity.ok().body(u);
	}
	
}
