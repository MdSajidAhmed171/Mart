package com.mart.gui;

import java.awt.*;
import javax.swing.*;

import com.mart.model.Role;
import com.mart.model.User;

public class LoginFrame extends JFrame {

    private JTextField nameField;
    private JComboBox<Role> roleBox;

    public LoginFrame() {
        setTitle("Mart Login");
        setSize(400, 250);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 1));

        nameField = new JTextField();
        roleBox = new JComboBox<>(Role.values());

        JButton loginBtn = new JButton("Login");

        add(new JLabel("Username:"));
        add(nameField);
        add(roleBox);
        add(loginBtn);

        loginBtn.addActionListener(e -> login());

        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void login() {
        String name = nameField.getText();
        Role role = (Role) roleBox.getSelectedItem();

        if (name == null || name.isBlank()) {
            JOptionPane.showMessageDialog(this, "Name required");
            return;
        }

        User user = new User(1, name, role);

        dispose(); // close login window

        if (role == Role.ADMIN) {
            new AdminDashboard(user);
        } else {
            new UserDashboard(user);
        }
    }
}
