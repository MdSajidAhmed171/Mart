package com.mart.util;

import javax.swing.*;

public class ErrorHandler {

    private ErrorHandler() {}

    public static void showError(Exception e) {
        JOptionPane.showMessageDialog(null,e.getMessage(),
            "Error", JOptionPane.ERROR_MESSAGE
        );
    }
}
