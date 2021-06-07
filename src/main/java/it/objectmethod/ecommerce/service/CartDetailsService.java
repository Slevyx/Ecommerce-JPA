package it.objectmethod.ecommerce.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import it.objectmethod.ecommerce.models.CartDetails;
import it.objectmethod.ecommerce.repository.CartDetailsRepository;

@Service
public class CartDetailsService {

	@Autowired
	private CartDetailsRepository cartRepository;

	public ResponseEntity<List<CartDetails>> findByCartId(Long cartId) {
		ResponseEntity<List<CartDetails>> cartResponse;
		List<CartDetails> cartDetails = cartRepository.findByCartId(cartId);
		if (cartDetails.isEmpty()) {
			cartResponse = new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} else {
			cartResponse = new ResponseEntity<>(cartDetails, HttpStatus.OK);
		}
		return cartResponse;
	}
}
