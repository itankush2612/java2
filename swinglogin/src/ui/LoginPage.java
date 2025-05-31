package ui;
import java.awt.GridLayout;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import connect.DBConnection;

public class LoginPage extends JFrame {
    JTextField usernameField;
    JPasswordField passwordField;
    JButton submitButton, resetButton;

    public LoginPage() {
        setTitle("Login Page");
        setSize(350, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(4, 2, 10, 10));

        add(new JLabel("Username:"));
        usernameField = new JTextField();
        add(usernameField);

        add(new JLabel("Password:"));
        passwordField = new JPasswordField();
        add(passwordField);

        submitButton = new JButton("Submit");
        resetButton = new JButton("Reset");

        add(submitButton);
        add(resetButton);

        // Action Listeners
        submitButton.addActionListener(e -> authenticate());
        resetButton.addActionListener(e -> {
            usernameField.setText("");
            passwordField.setText("");
        });

        setVisible(true);
    }

    private void authenticate() {
        String username = usernameField.getText();
        String password = new String(passwordField.getPassword());

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement("SELECT * FROM users WHERE username=? AND password=?")) {

            if (conn == null) {
                JOptionPane.showMessageDialog(this, "Database not connected.");
                return;
            }

            ps.setString(1, username);
            ps.setString(2, password);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                JOptionPane.showMessageDialog(this, "Login successful!");
                dispose(); // Close login window
                new HomePage(); // Open homepage
            } else {
                JOptionPane.showMessageDialog(this, "Invalid credentials!");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
        }
    }

    public static void main(String[] args) {
        new LoginPage();
    }
}
