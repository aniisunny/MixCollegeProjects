package JavaSwing;

import javax.swing.JButton;
import javax.swing.JFrame;

public class CreateButtonUsingInheritance extends JFrame {
	
	private static final long serialVersionUID = 1L;

	void sample() {
		JButton b = new JButton("click here");  //by using inheritance
		b.setBounds(350, 250, 200, 200); //x,y,width,height
		add(b);
		setSize(1000, 1000);
		setLayout(null);
		setVisible(true);
	}

	public static void main(String[] args) {
		
		new CreateButtonUsingInheritance().sample();

	}

}
