package JavaSwing;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class TextField {

	public static void main(String[] args) {
		
		JFrame f = new JFrame("JTextField Example");
		JTextField tf1 = new JTextField("Welcome to Chandigarh University"); 
		tf1.setBounds(60, 50, 200, 50);
		JTextField tf2 = new JTextField("Hello Swing");
		tf2.setBounds(60, 150, 100, 50);
		f.add(tf1);
		f.add(tf2);
		f.setVisible(true);
		f.setLayout(null);
		f.setSize(400, 400);

	}

}
