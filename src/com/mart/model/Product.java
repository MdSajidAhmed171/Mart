package com.mart.model;

import java.util.ArrayList;
import java.util.List;

import com.mart.exception.InvalidProductException;

public class Product {
	
	private final long id; // final key word must be set in the constructor, stays forever.
	private String name; // Can be changed anytime via setters.
	private double price;
	private String category;
	
	public Product(long id, String name, double price, String category) {
		this.id = id;
		validate(name, price, category);
		this.name = name;
		this.price = price;
		this.category = category;
	}
	
    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() { 
        return price;
    }

    public String getCategory() {
        return category;
    }

	private void validate(String name, double price, String category) {
        List<String> errors = new ArrayList<>();

        if (name == null || name.isBlank()) {
            errors.add("Product name can't be empty");
        }

        if (price < 0) {
            errors.add("Price cannot be negative");
        }

        if (category == null || category.isBlank()) {
            errors.add("Category can't be empty");
        }

        if (!errors.isEmpty()) {
            throw new InvalidProductException(errors);
        }
    }
	
	// when we print product object it shows "com.mart.model.Product@7e774085"
	// toString converts it to "Product [id=1, name=Laptop, price=1200.0, category=Electronics]"
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name +
				", price=" + price + ", category=" + category + "]";
	}
	
}
