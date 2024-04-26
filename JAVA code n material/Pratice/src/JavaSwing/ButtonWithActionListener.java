package JavaSwing;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class ButtonWithActionListener {
	
	void sample() {
		JFrame f = new JFrame("Button Example");
		final JTextField tf = new JTextField("Hello");
		tf.setBounds(100, 100, 150, 50);
//		tf.setVisible(true);
		JButton b = new JButton("click here");
		b.setBounds(150, 250, 100, 40);
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tf.setText("Welcome to JavaSwing");
			}
		});
		f.add(b);
		f.add(tf);
		f.setSize(600, 600);
		f.setVisible(true);
		f.setLayout(new FlowLayout());
	}

	public static void main(String[] args) {
		
		new ButtonWithActionListener().sample();

	}

}
