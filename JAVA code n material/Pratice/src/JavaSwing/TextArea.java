package JavaSwing;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class TextArea {
	
	TextArea() {
		JFrame f = new JFrame("JTextArea Example");
		JTextArea area = new JTextArea("Welcome to MY WORLD");
		area.setBounds(10, 30, 200, 200);
		f.add(area);
		f.setVisible(true);
		f.setSize(300, 300);
		f.setLayout(null);
	}

	public static void main(String[] args) {
		
		new TextArea();

	}

}
