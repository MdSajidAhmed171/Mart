package com.mart.main;

import com.mart.model.Product;
import com.mart.model.Role;
import com.mart.model.User;

public class Main {

	public static void main(String[] args) {
		// Application Start here
		
		System.out.println("Mart Application");
		
		Product p1 = new Product(1,"Laptop", 1200, "Electronics");
		Product p2 = new Product(1,"Iphone", 3, "Electronics");
		
		// printing object
		System.out.println(p1);
		System.out.println(p2);
		
		User admin = new User(1, "AdminUser", Role.ADMIN);
        User customer = new User(2, "John", Role.USER);

        System.out.println("Admin is admin? " + admin.isAdmin());
        System.out.println("Customer is admin? " + customer.isAdmin());

	}

}
