package JavaSwing;

import java.awt.Component;
import java.awt.FlowLayout;

import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;

public class ComboBox {
	ComboBox() {
		JFrame f = new JFrame("CheckBox");
		String[] country = {"Australia, Canada, England, India, New Zealand, USA" };
		JCheckBox cb = new JCheckBox(country[0]);
		JComboBox cb1 = new JComboBox<>(country);
		cb.setBounds(100, 50, 100, 50);
		f.add(cb);
		f.add(cb1);
		f.setSize(300, 300);
		f.setVisible(true);
		f.setLayout(new FlowLayout());
	}

	public static void main(String[] args) {
		new ComboBox();
	}
}
