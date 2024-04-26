package JavaSwing;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;

public class List {
	List() {
		JFrame f = new JFrame();
		DefaultListModel<String> l = new DefaultListModel<String>();
		l.addElement("Item 1");
		l.addElement("Item 2");
		l.addElement("Item 3");
		l.addElement("Item 4");
		JList<String> list = new JList<>(l);
		list.setBounds(100, 100, 75, 75);
		f.add(list);
		f.setSize(400, 400);
		f.setVisible(true);
		f.setLayout(null);
	}

	public static void main(String[] args) {
		new List();
	}

}
