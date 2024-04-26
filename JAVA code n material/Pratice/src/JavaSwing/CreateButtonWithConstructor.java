package JavaSwing;

import javax.swing.JButton;
import javax.swing.JFrame;

public class CreateButtonWithConstructor {
	
	JFrame f;
	CreateButtonWithConstructor() {
		f = new JFrame();
		JButton b = new JButton("click here");  //by using constructor
		b.setBounds(350, 250, 200, 200); //x,y,width,height
		f.add(b);
		f.setSize(1000, 1000);
		f.setLayout(null);
		f.setVisible(true);
	}

	public static void main(String[] args) {
		
		new CreateButtonWithConstructor();

	}

}
