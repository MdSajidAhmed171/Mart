package com.mart.model;

public class Product {
	
	private final long id; // final key word must be set in the constructor, stays forever.
	private String name; // Can be changed anytime via setters.
	private double price;
	private String category;
	
	public Product(long id, String name, double price, String category) {
		this.id = id;
//		this.name = name;
//		this.price = price;
//		this.category = category;
		setName(name);
	    setPrice(price);
	    setCategory(category);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		
		if (name == null || name.isBlank()) {
			throw new IllegalArgumentException("Product name can't be empty.");
		}
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		if (price < 0) {
            throw new IllegalArgumentException("Price cannot be negative");
        }
		this.price = price;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		if (category == null || category.isBlank()) {
            throw new IllegalArgumentException("Category cannot be empty");
        }
		this.category = category;
	}

	public long getId() {
		return id;
	}
	
	// when we print product object it shows "com.mart.model.Product@7e774085"
	// toString converts it to "Product [id=1, name=Laptop, price=1200.0, category=Electronics]"
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name +
				", price=" + price + ", category=" + category + "]";
	}
	
	
	
	
}
