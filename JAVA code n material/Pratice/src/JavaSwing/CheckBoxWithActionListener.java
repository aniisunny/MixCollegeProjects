package JavaSwing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class CheckBoxWithActionListener {
	JFrame f;
	final JCheckBox cb;
	JButton b;
	JLabel l;
	CheckBoxWithActionListener() {
		f = new JFrame();
		l = new JLabel();
		l.setHorizontalAlignment(JLabel.CENTER);
		l.setSize(400, 100);
		String languages[]={"C","C++","C#","Java","PHP"};
		cb = new JCheckBox(languages);
		cb.setBounds(50, 100, 100, 30);
		b = new JButton("Show");
		b.setBounds(200, 100, 75, 30);
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String data = "Programming Languages Selected: " + cb.getItemAt(cb.getSelectedIndex());
				l.setText(data);
			}
		});
		f.add(l);
		f.add(cb);
		f.add(b);
		f.setSize(350, 350);
		f.setVisible(true);
		f.setLayout(null);
	}

	public static void main(String[] args) {
		new CheckBoxWithActionListener();
	}

}
