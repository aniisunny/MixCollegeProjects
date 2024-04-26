package JavaSwing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;

public class ListWithActionListener {
	ListWithActionListener() {
		JFrame f = new JFrame();
		JLabel l = new JLabel();
		l.setSize(500, 100);
		JButton b = new JButton("Show");
		b.setBounds(200, 150, 80, 30);
		DefaultListModel<String> l1 = new DefaultListModel<String>();
		l1.addElement("C++");
		l1.addElement("Java");
		l1.addElement("Python");
		l1.addElement("Php");
		JList<String> list1 = new JList<>(l1);
		list1.setBounds(100, 100, 75, 75);
		DefaultListModel<String> l2 = new DefaultListModel<String>();
		l2.addElement("Code Blocks");
		l2.addElement("Struts");
		l2.addElement("Spring");
		l2.addElement("Idle");
		l2.addElement("YII");
		JList<String> list2 = new JList<>(l2);
		list2.setBounds(100, 200, 75, 75);
		f.add(l);
		f.add(b);
		f.add(list1);
		f.add(list2);
		f.setSize(500, 500);
		f.setVisible(true);
		f.setLayout(null);
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String data = "";
				if(list1.getSelectedIndex() != -1) {
					data = "Programming Language Selected: " + list1.getSelectedValue();
				}
				if(list2.getSelectedIndex() != -1) {
					data += ", FrameWork Selected: " + list2.getSelectedValue();
				}
				l.setText(data);
			}
		});
	}

	public static void main(String[] args) {
		new ListWithActionListener();
	}

}
