package javaswing;
import javax.swing.*;
import java.awt.event.*;
public class ButtonWithActionListener {
    
    void sample() {
        JFrame f = new JFrame("Button Example");
        JTextField tf = new JTextField();
        tf.setBounds(50,100,150,50);
        JButton b = new JButton("click here");
        b.setBounds(50,250,80,20);
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                tf.setText("Welcome to JavaSwing");
            }
        });
        f.add(b);
        f.add(tf);
        f.setSize(600,600);
        f.setLayout(null);
        f.setVisible(true);
    }
    
    public static void main(String []args) {
        new ButtonWithActionListener().sample();
    }
}
