package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Product.java
 * This is a model class represents a User entity
 *
 */

@Entity
@Table(name="product")
public class Product {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	protected int id;
	
	@Column(name="name")
	protected String name;
	
	@Column(name="price")
	protected String price;
	
	@Column(name="size")
	protected String size;
	
	
	
	
	public Product() {
	}
	
	public Product(String name, String price, String size) {
		super();
		this.name = name;
		this.price = price;
		this.size = size;
	}

	public Product(int id, String name, String price, String size) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.size = size;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
}
