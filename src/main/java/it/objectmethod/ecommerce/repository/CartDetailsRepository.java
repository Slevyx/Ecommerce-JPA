package it.objectmethod.ecommerce.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.objectmethod.ecommerce.models.CartDetails;

@Repository
public interface CartDetailsRepository extends JpaRepository<CartDetails, Long> {

	public List<CartDetails> findByCartId(Long cartId);
}
