package q2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RegistrationForm extends JFrame implements ActionListener {
    // Components
    JTextField nameField, contactField, mobileField;
    JTextArea commentArea;
    JComboBox<String> cityBox;
    JRadioButton maleButton, femaleButton, otherButton;
    ButtonGroup genderGroup;
    JButton submitButton, resetButton, discardButton;

    public RegistrationForm() {
        setTitle("Registration Form");
        setSize(400, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(12, 4, 12, 6));

        // Fields
        add(new JLabel("Name:"));
        nameField = new JTextField();
        add(nameField);

        add(new JLabel("Contact:"));
        contactField = new JTextField();
        add(contactField);

        add(new JLabel("Mobile:"));
        mobileField = new JTextField();
        add(mobileField);

        add(new JLabel("Gender:"));
        JPanel genderPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        maleButton = new JRadioButton("Male");
        femaleButton = new JRadioButton("Female");
        otherButton = new JRadioButton("Other");
        genderGroup = new ButtonGroup();
        genderGroup.add(maleButton);
        genderGroup.add(femaleButton);
        genderGroup.add(otherButton);
        genderPanel.add(maleButton);
        genderPanel.add(femaleButton);
        genderPanel.add(otherButton);
        add(genderPanel);

        add(new JLabel("City:"));
        String[] cities = {"Select", "New York", "London", "Tokyo", "Delhi", "Paris"};
        cityBox = new JComboBox<>(cities);
        add(cityBox);

        add(new JLabel("Comment:"));
        commentArea = new JTextArea(3, 20);
        add(new JScrollPane(commentArea));

        // Buttons
        submitButton = new JButton("Submit");
        resetButton = new JButton("Reset");
        discardButton = new JButton("Discard");

        submitButton.addActionListener(this);
        resetButton.addActionListener(this);
        discardButton.addActionListener(this);

        add(submitButton);
        add(resetButton);
        add(discardButton);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submitButton) {
            String name = nameField.getText().trim();
            String contact = contactField.getText().trim();
            String mobile = mobileField.getText().trim();
            String gender = maleButton.isSelected() ? "Male" :
                            femaleButton.isSelected() ? "Female" :
                            otherButton.isSelected() ? "Other" : "";
            String city = (String) cityBox.getSelectedItem();
            String comment = commentArea.getText().trim();

            if (name.isEmpty() || contact.isEmpty() || mobile.isEmpty() || gender.isEmpty() || city.equals("Select") || comment.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please fill all fields", "Warning", JOptionPane.WARNING_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Submitted Successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
            }
        } else if (e.getSource() == resetButton) {
            nameField.setText("");
            contactField.setText("");
            mobileField.setText("");
            genderGroup.clearSelection();
            cityBox.setSelectedIndex(0);
            commentArea.setText("");
        } else if (e.getSource() == discardButton) {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(RegistrationForm::new);
    }
}
