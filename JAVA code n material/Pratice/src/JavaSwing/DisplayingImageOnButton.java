package JavaSwing;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class DisplayingImageOnButton {
	
	void image() {
		JFrame f = new JFrame("Button Example");
		JButton b = new JButton(new ImageIcon("E:\\JAVA code n material\\Pratice\\src\\JavaSwing\\Cute-Ball-Help-icon.png"));
		b.setBounds(100, 100, 300, 300);
		f.add(b);
		f.setVisible(true);
		f.setSize(600, 600);
		f.setLayout(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		
		new DisplayingImageOnButton().image();

	}

}
