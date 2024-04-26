package JavaSwing;

import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class CheckBox {
	
	CheckBox() {
		JFrame f = new JFrame("CheckBox Example");
		JCheckBox cb1 = new JCheckBox("C++");
		cb1.setBounds(100, 100, 50, 50);
		JCheckBox cb2 = new JCheckBox("Java", true);
		cb2.setBounds(100, 150, 50, 50);
		f.add(cb1);
		f.add(cb2);
		f.setSize(400, 400);
		f.setVisible(true);
		f.setLayout(null);
	}

	public static void main(String[] args) {
		
		new CheckBox();

	}

}
