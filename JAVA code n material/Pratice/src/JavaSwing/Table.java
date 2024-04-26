package JavaSwing;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Table {
	JFrame f;
	Table() {
		f = new JFrame();
		String data[][] = {{"3264", "Aniruddha", "8.74"},
				{"3282", "Shiv Kumar", "7.02"},
				{"3267", "Rahul Bansal", "8.26"}
		};
		String column[] = {"UID", "Name", "SGPA"};
		JTable t = new JTable(data, column);
		t.setBounds(30, 40, 200, 300);
		JScrollPane sp = new JScrollPane(t);
		f.add(sp);
		f.setSize(300, 400);
		f.setVisible(true);
		f.setLayout(null);
	}

	public static void main(String[] args) {
		new Table();
	}

}
