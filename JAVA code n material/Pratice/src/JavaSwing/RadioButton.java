package JavaSwing;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class RadioButton {
	JFrame f;
	RadioButton() {
		f = new JFrame("RadioButton Example");
		JRadioButton rb1 = new JRadioButton("A) Male");
		rb1.setBounds(75, 50, 100, 30);
		JRadioButton rb2 = new JRadioButton("B) Female");
		rb2.setBounds(75, 100, 100, 30);
		ButtonGroup bg = new ButtonGroup();
		bg.add(rb1);
		bg.add(rb2);
		f.add(rb1);
		f.add(rb2);
		f.setSize(300, 300);
		f.setVisible(true);
		f.setLayout(null);
	}

	public static void main(String[] args) {
		
		new RadioButton();

	}

}
