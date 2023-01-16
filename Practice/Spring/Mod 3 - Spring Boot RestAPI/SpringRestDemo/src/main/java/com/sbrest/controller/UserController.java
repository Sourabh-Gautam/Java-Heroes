package com.sbrest.controller;

import java.lang.reflect.Method;
import java.util.List;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.sbrest.exception.UserNotFoundException;
import com.sbrest.model.User;
import com.sbrest.service.UserService;

import jakarta.validation.Valid;

@RestController
public class UserController {

	private UserService userService;
	
	public UserController(UserService userService) {
		this.userService = userService;
	}
	
	@GetMapping("/users")
	public List<User> retrieveAllUsers() {
		return userService.findAll();
	}
	
	@GetMapping("/users/{id}")
	public EntityModel<User> retrieveUser(@PathVariable long id) {
		User dbUser = userService.findById(id);
		if(dbUser == null)
		{
			throw new UserNotFoundException(String.format("No User linked with the id %d", id));
		}
		
		EntityModel<User> entityModel = EntityModel.of(dbUser);
		WebMvcLinkBuilder linkBuilder = WebMvcLinkBuilder
				.linkTo(WebMvcLinkBuilder.methodOn(this.getClass()).retrieveAllUsers());
		entityModel.add(linkBuilder.withRel("all-users"));
		return entityModel;
	}
	
	@PostMapping("/users")
	public ResponseEntity<User> addUser(@Valid @RequestBody User user) {
		
		User dbUser = userService.save(user);
		
		return ResponseEntity.created(
					ServletUriComponentsBuilder
					.fromCurrentRequest()
					.path("/{id}")
					.buildAndExpand(dbUser.getId())
					.toUri()
				).build();
	}
	
	@DeleteMapping("/users/{id}")
	public ResponseEntity<Object> deleteUser(@PathVariable long id)
	{
		userService.deleteById(id);
		return ResponseEntity.accepted().build();
	}
	
}
