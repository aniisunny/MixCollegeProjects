package JavaSwing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class JTextAreaWithActionListener implements ActionListener {
	JLabel l1, l2;
	JButton b;
	JTextArea ta;
	void sample() {
		JFrame f = new JFrame("Words Count");
		l1 = new JLabel();
		l1.setBounds(30, 30, 50, 30);
		l2 = new JLabel();
		l2.setBounds(100, 30, 100, 30);
		ta = new JTextArea();
		ta.setBounds(10, 100, 250, 250);
		b = new JButton("Count Words");
		b.setBounds(60, 400, 100, 50);
		b.addActionListener(this);
		f.add(l1);
		f.add(l2);
		f.add(ta);
		f.add(b);
		f.setSize(500, 500);
		f.setVisible(true);
		f.setLayout(null);
	}

	public static void main(String[] args) {
		
		new JTextAreaWithActionListener().sample();

	}

	public void actionPerformed(ActionEvent arg0) {
		
		String text = ta.getText();
		String words[] = text.split("\\s");
		l1.setText("Words: " + words.length);
		l2.setText("Characters: " + text.length());
		
	}

}
