package JavaSwing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class PasswordFieldWithActionListener implements ActionListener {
	
	JFrame f;
	JLabel l1, l2, l3;
	JTextField tf;
	JButton b;
	JPasswordField pf;
	
	void example() {
		f = new JFrame("Password Set");
		l1 = new JLabel("Username:");
		l1.setBounds(40, 30, 80, 30);
		tf = new JTextField();
		tf.setBounds(150, 30, 150, 30);
		l2 = new JLabel("Password:");
		l2.setBounds(40, 100, 80, 30);
		pf = new JPasswordField();
		pf.setBounds(150, 100, 150, 30);
		b = new JButton("Login");
		b.setBounds(150, 150, 100, 40);
		l3 = new JLabel();
		l3.setBounds(20, 200, 150, 30);
		f.add(l1);
		f.add(tf);
		f.add(l2);
		f.add(pf);
		f.add(b);
		f.add(l3);
		f.setSize(400, 400);
		f.setVisible(true);
		f.setLayout(null);
	}

	public static void main(String[] args) {
		
		new PasswordFieldWithActionListener().example();

	}

	public void actionPerformed(ActionEvent e) {
		
		String username = tf.getText();
		String password = new String(pf.getPassword());
		l3.setText("Username: " + username + ", Passowrd: " + password);
		
	}

}
