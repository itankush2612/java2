package ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class HomePage extends JFrame {
    
    JLabel contentLabel;

    public HomePage() {
        setTitle("Home Page");
        setSize(600, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Center window
        setLayout(new BorderLayout());

        // ====== Navigation Bar Panel ======
        JPanel navbar = new JPanel();
        navbar.setLayout(new FlowLayout(FlowLayout.LEFT));
        navbar.setBackground(Color.LIGHT_GRAY);

        JButton homeBtn = new JButton("Home");
        JButton aboutBtn = new JButton("About Us");
        JButton contactBtn = new JButton("Contact");
        JButton mobileBtn = new JButton("Mobile No");

        navbar.add(homeBtn);
        navbar.add(aboutBtn);
        navbar.add(contactBtn);
        navbar.add(mobileBtn);

        add(navbar, BorderLayout.NORTH);

        // ====== Content Label ======
        contentLabel = new JLabel("Welcome to the Home Page!", JLabel.CENTER);
        contentLabel.setFont(new Font("Arial", Font.PLAIN, 20));
        add(contentLabel, BorderLayout.CENTER);

        // ====== Action Listeners ======
        homeBtn.addActionListener(e -> contentLabel.setText("Welcome to the Home Page!"));
        aboutBtn.addActionListener(e -> contentLabel.setText("About Us: We are a Java Development Company."));
        contactBtn.addActionListener(e -> contentLabel.setText("Contact: contact@example.com"));
        mobileBtn.addActionListener(e -> contentLabel.setText("Mobile No: +91-9876543210"));

        setVisible(true);
    }

    public static void main(String[] args) {
        new HomePage();
    }
}
