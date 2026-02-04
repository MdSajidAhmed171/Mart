package com.mart.gui;

import javax.swing.*;
import com.mart.model.User;

public class UserDashboard extends JFrame {

    public UserDashboard(User user) {
        setTitle("User Dashboard");
        setSize(400, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JLabel label = new JLabel("Welcome User: " + user.getName());
        add(label);

        setLocationRelativeTo(null);
        setVisible(true);
    }
}
