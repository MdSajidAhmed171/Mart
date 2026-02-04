package com.mart.service;

import java.util.ArrayList;
import java.util.List;

import com.mart.exception.AccessDeniedException;
import com.mart.model.Product;
import com.mart.model.Role;
import com.mart.model.User;

public class CartService {

	private List<Product> cartItems = new ArrayList<>();
	
	public void addProduct(User user, Product product) {
		if (user == null || product == null) {
	        throw new IllegalArgumentException("User or product cannot be null");
	    }
		if (user.getRole() != Role.USER) {
            throw new AccessDeniedException("Only User can purchase products");
        }
		cartItems.add(product);
	}
//	public void removeProduct(Product product) {
//		cartItems.remove(product);
//	}
	public void removeProductById(long productId) {
	    cartItems.removeIf(p -> p.getId() == productId);
	}

	
	public List<Product> getCartItems(){
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
