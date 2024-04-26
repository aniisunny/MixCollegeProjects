package JavaSwing;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class JLavel {

	public static void main(String[] args) {
		
		JFrame f = new JFrame("Label Example");
		JLabel l1, l2;
		l1 = new JLabel("First Label");
		l1.setBounds(100, 100, 100, 50);
		l2 = new JLabel("Second Label");
		l2.setBounds(100, 150, 100, 50);
		f.setVisible(true);
		f.add(l1);
		f.add(l2);
		f.setSize(500, 500);
		f.setLayout(null);

	}

}
