package it.objectmethod.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.objectmethod.ecommerce.models.CartDetails;
import it.objectmethod.ecommerce.service.CartDetailsService;

@RestController
public class CartDetailsController {

	@Autowired
	private CartDetailsService cartService;

	@RequestMapping("/{cartId}/cart")
	public ResponseEntity<List<CartDetails>> findByCartId(@PathVariable("cartId") Long cartId) {
		ResponseEntity<List<CartDetails>> cartResponse = cartService.findByCartId(cartId);
		return cartResponse;
	}
}
