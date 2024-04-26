package JavaSwing;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class CheckBoxItemListener {
	
	CheckBoxItemListener() {
		JFrame f = new JFrame();
		JLabel l = new JLabel();
		l.setHorizontalAlignment(JLabel.CENTER);
		l.setSize(400, 100);
		JCheckBox cb1 = new JCheckBox("C++");
		cb1.setBounds(150, 100, 100, 50);
		cb1.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				l.setText("C++ Checkbox: " + (e.getStateChange() == 1 ? "Checked" : "Unchecked"));
			}
		});
		JCheckBox cb2 = new JCheckBox("Java");
		cb2.setBounds(150, 150, 100, 50);
		cb2.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				l.setText("Java CheckBox: " + (e.getStateChange() == 1 ? "Checked" : "Unchecked"));
			}
		});
		f.add(cb1);
		f.add(cb2);
		f.add(l);
		f.setSize(500, 500);
		f.setVisible(true);
		f.setLayout(null);
	}

	public static void main(String[] args) {
		
		new CheckBoxItemListener();

	}

}
