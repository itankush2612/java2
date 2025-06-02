package login;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class LoginPage extends JFrame {
	JLabel jLabel, jLabel2;
	JTextField field1, field2;
	JButton button1, button2;

	public LoginPage() {
		setLayout(new FlowLayout());

		jLabel = new JLabel("Username");
		jLabel2 = new JLabel("Password");
		field1 = new JTextField(20);
		field2 = new JTextField(20);
		button1 = new JButton("Submit");

		button1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					ResultSet resultSet = GetConnection.getconnection().prepareStatement("select * from users")
							.executeQuery();
					while (resultSet.next()) {
						String username = resultSet.getString("username");
						String pass = resultSet.getString("pass");
						if (field1.getText().equals(username) && field2.getText().equals(pass)) {
							System.out.println("logged in...");
					
						}
					}

				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();

				}

			}
		});

		button2 = new JButton("Reset");
		button2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("reset");

			}
		});

		add(jLabel);
		add(field1);
		add(jLabel2);
		add(field2);
		add(button1);
		add(button2);

		setVisible(true);
		setSize(400, 400);

	}

	public static void main(String[] args) {
		new LoginPage();
	}
}
