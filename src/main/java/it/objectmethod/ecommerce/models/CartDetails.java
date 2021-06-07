package it.objectmethod.ecommerce.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "carrello_dettaglio")
public class CartDetails {

	@Id
	@Column(name = "id_carrello_dettaglio")
	private Long id;

	@JoinColumn(name = "id_carrello")
	@ManyToOne
	private Cart cart;

	@JoinColumn(name = "id_articolo")
	@ManyToOne
	private Article article;

	@Column(name = "quantita")
	private Integer quantity;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}

	public Article getArticle() {
		return article;
	}

	public void setArticle(Article article) {
		this.article = article;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
}
