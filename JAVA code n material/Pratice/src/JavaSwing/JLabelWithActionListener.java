package JavaSwing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class JLabelWithActionListener extends JFrame implements ActionListener {
	
	private static final long serialVersionUID = 1L;
	JLabel l;
	JTextField tf;
	JButton b;
	void example() {
		tf = new JTextField();
		tf.setBounds(50, 50, 150, 40);
		l = new JLabel();
		l.setBounds(50, 100, 250, 20);
		b = new JButton("Find IP");
		b.setBounds(50, 150, 100, 30);
		b.addActionListener(this);
		add(tf);
		add(l);
		add(b);
		setSize(400, 400);
		setVisible(true);
		setLayout(null);
	}

	public static void main(String[] args) {
		
		new JLabelWithActionListener().example();

	}

	public void actionPerformed(ActionEvent e) {
		
		try {
			String host = tf.getText();
			String ip = java.net.InetAddress.getByName(host).getHostAddress();
			l.setText("IP of " + host + " is: " + ip);
		}
		catch (Exception ex) {
			System.out.println(ex);
		}
		
	}

}
