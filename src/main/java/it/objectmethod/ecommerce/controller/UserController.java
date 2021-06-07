package it.objectmethod.ecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import it.objectmethod.ecommerce.models.User;
import it.objectmethod.ecommerce.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;

	@PostMapping("/login")
	public ResponseEntity<User> findByUsernameAndPassword(@RequestParam("username") String username,
			@RequestParam("password") String password) {
		ResponseEntity<User> userResponse = userService.findByUsernameAndPassword(username, password);
		return userResponse;
	}
}
