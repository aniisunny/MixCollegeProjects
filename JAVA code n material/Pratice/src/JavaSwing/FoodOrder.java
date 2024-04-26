package JavaSwing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class FoodOrder implements ActionListener {
	JLabel l;
	JCheckBox cb1, cb2, cb3;
	JButton b;
	JFrame f;
	void foodOrder() {
		f = new JFrame();
		l = new JLabel("Food Ordering System");
		l.setBounds(100, 50, 100, 50);
		cb1 = new JCheckBox("Pizza@ 100");
		cb1.setBounds(150, 150, 100, 50);
		cb2 = new JCheckBox("Burger@ 30");
		cb2.setBounds(150, 250, 100, 50);
		cb3 = new JCheckBox("Tea@ 10");
		cb3.setBounds(150, 350, 100, 50);
		b = new JButton("Order");
		b.setBounds(150, 450, 100, 50);
		b.addActionListener(this);
		f.add(l);
		f.add(cb1);
		f.add(cb2);
		f.add(cb3);
		f.add(b);
		f.setSize(500, 500);
		f.setVisible(true);
		f.setLayout(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		
		new FoodOrder().foodOrder();

	}

	public void actionPerformed(ActionEvent e) {
		float amount = 0;
		String msg = "";
		if(cb1.isSelected()) {
			amount += 100;
			msg += "Pizza: 100\n";
		}
		if(cb2.isSelected()) {
			amount += 30;
			msg += "Burger: 30\n";
		}
		if(cb3.isSelected()) {
			amount += 10;
			msg += "Tea: 10\n";
		}
		msg += "---------------\n";
		JOptionPane.showMessageDialog(b, this, msg + "Total: " + amount, 0);
	}

}
