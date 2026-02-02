package com.mart.service;

import java.util.ArrayList;
import java.util.List;

import com.mart.exception.AccessDeniedException;
import com.mart.model.Product;
import com.mart.model.Role;
import com.mart.model.User;

public class CartService {

	private final List<Product> cartItems = new ArrayList<>();
	
	public void addProduct(User user, Product product) {
		if (user.getRole() != Role.ADMIN) {
            throw new AccessDeniedException("Only ADMIN can add products");
        }
		if(product == null) {
			throw new IllegalArgumentException("Prodcut Can ot be Null");
		}
		cartItems.add(product);
	}
	public void removeProduct(Product product) {
		if(product == null) {
			throw new IllegalArgumentException("Prodcut Can ot be Null");
		}
		cartItems.remove(product);
	}
	
	public List<Product> getAllProducts(){
		return new ArrayList<>(cartItems);
	}
	
	public double getTotalPrice() {
        double total = 0;
        for (Product product : cartItems) {
            total += product.getPrice();
        }
        return total;
	}
}
