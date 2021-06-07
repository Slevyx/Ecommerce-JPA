package it.objectmethod.ecommerce.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "articolo")
public class Article {

	@Id
	@Column(name = "id_articolo")
	private Long id;

	@Column(name = "nome_articolo")
	private String name;

	@Column(name = "codice_articolo")
	private String code;

	@Column(name = "disponibilita")
	private Integer availability;

	@Column(name = "prezzo_unitario")
	private Double price;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Integer getAvailability() {
		return availability;
	}

	public void setAvailability(Integer availability) {
		this.availability = availability;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
}
