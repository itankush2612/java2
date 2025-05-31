package q3;





import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.SwingUtilities;

public class MasterPage extends JFrame {

    public MasterPage() {
        setTitle("Master Page");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Setting layout
        setLayout(new BorderLayout());

        // Menu Bar
        JMenuBar menuBar = new JMenuBar();

        // Home Menu
        JMenu homeMenu = new JMenu("Home");
        menuBar.add(homeMenu);

        // Doctor Menu
        JMenu doctorMenu = new JMenu("Doctor");
        JMenuItem docInfo = new JMenuItem("Doctor Info");
        JMenuItem docReg = new JMenuItem("Doctor Registration");
        JMenuItem docPayment = new JMenuItem("Payment");
        doctorMenu.add(docInfo);
        doctorMenu.add(docReg);
        doctorMenu.add(new JSeparator());
        doctorMenu.add(docPayment);
        menuBar.add(doctorMenu);

        // Patient Menu
        JMenu patientMenu = new JMenu("Patient");
        JMenuItem patDetails = new JMenuItem("Patient Details");
        JMenu billingMenu = new JMenu("Billing");
        JMenuItem gstItem = new JMenuItem("GST");
        JMenuItem ngoAccount = new JMenuItem("NGO Account");
        JMenuItem paymentDetails = new JMenuItem("Payment Details");
        billingMenu.add(gstItem);
        billingMenu.add(ngoAccount);
        billingMenu.add(new JSeparator());
        billingMenu.add(paymentDetails);
        JMenuItem patReg = new JMenuItem("Registration");

        patientMenu.add(patDetails);
        patientMenu.add(billingMenu);
        patientMenu.add(new JSeparator());
        patientMenu.add(patReg);
        menuBar.add(patientMenu);

        // Account Menu
        JMenu accountMenu = new JMenu("Account");
        menuBar.add(accountMenu);

        // Set the menu bar
        setJMenuBar(menuBar);

        // Center panel placeholder
        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(new BorderLayout());
        JLabel welcomeLabel = new JLabel("Welcome to MAster Page", JLabel.CENTER);
        welcomeLabel.setFont(new Font("Arial", Font.BOLD, 16));
        centerPanel.add(welcomeLabel, BorderLayout.CENTER);
        add(centerPanel, BorderLayout.CENTER);

        // Footer (optional)
        JLabel footer = new JLabel("© 2025 MAster PAGE", JLabel.CENTER);
        add(footer, BorderLayout.SOUTH);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(MasterPage::new);
    }
}
