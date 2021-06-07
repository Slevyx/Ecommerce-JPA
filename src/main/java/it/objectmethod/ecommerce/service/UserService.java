package it.objectmethod.ecommerce.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import it.objectmethod.ecommerce.models.User;
import it.objectmethod.ecommerce.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepo;

	public ResponseEntity<User> findByUsernameAndPassword(String username, String password) {
		User user = null;
		ResponseEntity<User> userResponse;
		if (username == null || password == null || username.trim().isEmpty() || password.trim().isEmpty()) {
			userResponse = new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		} else {
			Optional<User> userOptional = userRepo.findByUsernameAndPassword(username, password);
			if (userOptional.isPresent()) {
				user = userOptional.get();
				userResponse = new ResponseEntity<>(user, HttpStatus.OK);
			} else {
				userResponse = new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
		}
		return userResponse;
	}
}
