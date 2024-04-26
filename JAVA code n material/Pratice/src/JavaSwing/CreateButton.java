package JavaSwing;

import javax.swing.*;

public class CreateButton {

	public static void main(String[] args) {
		
		JFrame f = new JFrame();
		JButton b = new JButton("click here");  //by using main method
		b.setBounds(350, 250, 200, 200); //x,y,width,height
		f.add(b);
		f.setSize(1000, 1000);
		f.setLayout(null);
		f.setVisible(true);
		
	}

}