package com.mart.main;

import com.mart.gui.MartGUI;

//import com.mart.exception.AccessDeniedException;
//import com.mart.exception.InvalidProductException;
//import com.mart.model.Product;
//import com.mart.model.Role;
//import com.mart.model.User;
//import com.mart.service.CartService;
//import com.mart.service.ProductService;
//import com.mart.util.IdGenerator;

public class Main {

    public static void main(String[] args) {

//        System.out.println("MART APP");
//
//        User admin = new User(1, "Admin Sajid", Role.ADMIN);
//        User user = new User(2, "User Rahman", Role.USER);
//
//        ProductService productService = new ProductService();
//        CartService cartService = new CartService();
//
//        try {
//            // ADMIN adds products
//            Product p1 = new Product(IdGenerator.generateId(), "Laptop", 1200, "Electronics");
//            Product p2 = new Product(IdGenerator.generateId(), "Mouse", 50, "Accessories");
//
//            productService.addProduct(admin, p1);
//            productService.addProduct(admin, p2);
//
//            System.out.println("\nProducts in store:");
//            productService.getAllProducts().forEach(System.out::println);
//
//            // USER purchases
//            cartService.addProduct(user, p1);
//            cartService.addProduct(user, p2);
//
//            System.out.println("\nCart items:");
//            cartService.getCartItems().forEach(System.out::println);
//
//            System.out.println("Total Price: $" + cartService.getTotalPrice());
//
//        } catch (InvalidProductException e) {
//            System.out.println("PRODUCT ERROR: " + e.getMessage());
//        } catch (AccessDeniedException e) {
//            System.out.println("ACCESS ERROR: " + e.getMessage());
//        }
    	new MartGUI();
    }
}
