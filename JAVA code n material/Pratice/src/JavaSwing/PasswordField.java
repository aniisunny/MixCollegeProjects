package JavaSwing;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;

public class PasswordField extends JFrame {
	
	private static final long serialVersionUID = 1L;

	PasswordField() {
		JLabel l = new JLabel("Password: ");
		l.setBounds(20, 100, 80, 30);
		JPasswordField pf = new JPasswordField();
		pf.setBounds(100, 100, 100, 30);
		add(l);
		add(pf);
		setSize(400,400);
		setVisible(true);
		setLayout(null);
	}

	public static void main(String[] args) {
		
		new PasswordField();

	}

}
