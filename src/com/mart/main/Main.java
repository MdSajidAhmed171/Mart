package com.mart.main;

import com.mart.exception.AccessDeniedException;
import com.mart.exception.InvalidProductException;
import com.mart.model.Product;
import com.mart.model.Role;
import com.mart.model.User;
import com.mart.service.CartService;
import com.mart.util.IdGenerator;

public class Main {

	public static void main(String[] args) {
		// Application Start here
		
		System.out.println("Mart Application");
		
		User admin = new User(1, "Sajid", Role.ADMIN);
		User user = new User(1, "Rahman", Role.USER);
        
//        Product p1 = new Product(IdGenerator.generateId(), "", 1200, "Electronics");
//        Product p2 = new Product(IdGenerator.generateId(), "Iphone", 1200, "Electronics");
//        Product p3 = new Product(IdGenerator.generateId(), "Mouse", 50, "Accessories");
        
        CartService cart = new CartService();
        try {
        	Product p1 = new Product(IdGenerator.generateId(), "", 1200, "Electronics");
            cart.addProduct(user, p1);
        } catch (AccessDeniedException e) {
            System.out.println("Access error: " + e.getMessage());
        }catch (InvalidProductException e) {
            System.out.println(e.getMessage());
        } 
        try {
        	Product p2 = new Product(IdGenerator.generateId(), "ss", 5, "Electronics");
            cart.addProduct(admin, p2);
        } catch (AccessDeniedException e) {
            System.out.println("Access error: " + e.getMessage());
        } catch (InvalidProductException e) {
            System.out.println(e.getMessage());
        }
        

        System.out.println("Cart items:");
        cart.getAllProducts().forEach(System.out::println);

        System.out.println("Total price: $" + cart.getTotalPrice());

	}

}
