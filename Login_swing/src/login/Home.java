package login;

import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JRadioButton;

public class Home extends JFrame {

	JMenuBar bar;
	JMenu jMenu1, jMenu2;
	JMenuItem item1, item2;

	JButton button;

	public Home() {

		setLayout(null);

		bar = new JMenuBar();
		bar.setBounds(0, 0, 100, 100);

		jMenu1 = new JMenu("Emp");
		jMenu2 = new JMenu("About us");

		item1 = new JMenuItem("details");
		item2 = new JMenuItem("help");

		JRadioButton button1 = new JRadioButton("java");
		JRadioButton button2 = new JRadioButton("java");
		JRadioButton button3 = new JRadioButton("java");

		ButtonGroup buttonGroup = new ButtonGroup();
		buttonGroup.add(button1);
		buttonGroup.add(button2);
		buttonGroup.add(button3);

		button = new JButton("click me");
		button.setBounds(100, 100, 180, 50);

		jMenu1.add(item1);
		jMenu2.add(item2);

		bar.add(jMenu1);
		bar.add(jMenu2);

		// add(bar);

		add(button1);
		add(button2);
		add(button3);

		add(button);

		setVisible(true);
		setSize(400, 400);
	}
	
	public static void main(String[] args) {
		new Home();
	}

}
