package com.mart.gui;

import javax.swing.*;
import com.mart.model.User;

public class AdminDashboard extends JFrame {

    public AdminDashboard(User admin) {
        setTitle("Admin Dashboard");
        setSize(400, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JLabel label = new JLabel("Welcome Admin: " + admin.getName());
        add(label);

        setLocationRelativeTo(null);
        setVisible(true);
    }
}
