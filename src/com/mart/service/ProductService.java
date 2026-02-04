package com.mart.service;

import java.util.ArrayList;
import java.util.List;

import com.mart.exception.AccessDeniedException;
import com.mart.model.Product;
import com.mart.model.Role;
import com.mart.model.User;

public class ProductService {

    private List<Product> products = new ArrayList<>();

    public void addProduct(User user, Product product) {
    	validateAdmin(user);
        products.add(product);
    }
    
    public void removeProduct(User user, long productId) {
        validateAdmin(user);
        products.removeIf(p -> p.getId() == productId);
    }

    public List<Product> getAllProducts() {
        return products;
    }
    
    private void validateAdmin(User user) {
        if (user.getRole() != Role.ADMIN) {
            throw new AccessDeniedException("Only admin can manage products");
        }
    }
}
