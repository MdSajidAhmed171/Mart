package com.mart.gui;

import javax.swing.*;
import java.awt.*;

import com.mart.model.Product;
import com.mart.model.Role;
import com.mart.model.User;
import com.mart.service.CartService;
import com.mart.service.ProductService;
import com.mart.util.IdGenerator;

public class MartGUI {

    private ProductService productService = new ProductService();
    private CartService cartService = new CartService();

    private User admin = new User(1, "Admin", Role.ADMIN);
    private User user = new User(2, "User", Role.USER);

    private DefaultListModel<Product> productListModel = new DefaultListModel<>();
    private JLabel totalLabel = new JLabel("Total: $0");

    public MartGUI() {
        setupData();
        createUI();
    }

    private void setupData() {
        productService.addProduct(admin,
                new Product(IdGenerator.generateId(), "Laptop", 1200, "Electronics"));
        productService.addProduct(admin,
                new Product(IdGenerator.generateId(), "Mouse", 50, "Accessories"));

        for (Product p : productService.getAllProducts()) {
            productListModel.addElement(p);
        }
    }

    private void createUI() {
        JFrame frame = new JFrame("Mart Application");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JList<Product> productList = new JList<>(productListModel);
        JScrollPane scrollPane = new JScrollPane(productList);

        JButton addButton = new JButton("Add to Cart");

        addButton.addActionListener(e -> {
            Product selected = productList.getSelectedValue();
            if (selected != null) {
                cartService.addProduct(user, selected);
                totalLabel.setText("Total: $" + cartService.getTotalPrice());
            }
        });

        JPanel bottomPanel = new JPanel();
        bottomPanel.add(addButton);
        bottomPanel.add(totalLabel);

        frame.add(scrollPane, BorderLayout.CENTER);
        frame.add(bottomPanel, BorderLayout.SOUTH);

        frame.setVisible(true);
    }
}
