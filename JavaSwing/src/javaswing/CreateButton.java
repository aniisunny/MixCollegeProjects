package javaswing;
import javax.swing.*;
public class CreateButton {
    public static void main(String []args) {
        JFrame f = new JFrame();
        JButton b = new JButton("click here");
        b.setBounds(100, 100, 800, 800);
        f.add(b);
        f.setSize(1000, 1000);
        f.setVisible(true);
        f.setLayout(null);
    }
}
