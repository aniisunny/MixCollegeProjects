package JavaSwing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

public class RadioButtonWithActionListener implements ActionListener {
	JFrame f;
	JButton b;
	JRadioButton rb1, rb2;
	ButtonGroup bg;
	RadioButtonWithActionListener() {
		f = new JFrame();
		rb1 = new JRadioButton("A) Male");
		rb1.setBounds(100, 50, 100, 40);
		rb2 = new JRadioButton("B) Female");
		rb2.setBounds(100, 150, 100, 40);
		bg = new ButtonGroup();
		bg.add(rb1);
		bg.add(rb2);
		b = new JButton("Click");
		b.setBounds(100, 200, 100, 40);
		b.addActionListener(this);
		f.add(rb1);
		f.add(rb2);
		f.add(b);
		f.setSize(300, 300);
		f.setVisible(true);
		f.setLayout(null);
	}

	public static void main(String[] args) {
		
		new RadioButtonWithActionListener();

	}

	public void actionPerformed(ActionEvent e) {
		if(rb1.isSelected()) 
			JOptionPane.showMessageDialog(b, this, "You are Male.", 0);
		if(rb2.isSelected())
			JOptionPane.showMessageDialog(b, this, "You are Female", 0);
	}

}