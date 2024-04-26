package JavaSwing;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class TableWithListSelectionListener {
	TableWithListSelectionListener() {
		JFrame f = new JFrame("Table Example");
		String data[][] = {{"3264", "Aniruddha", "8.74"},
				{"3282", "Shiv Kumar", "7.02"},
				{"3267", "Rahul Bansal", "8.26"}
		};
		String column[] = {"UID", "Name", "SGPA"};
		JTable t = new JTable(data, column);
		t.setBounds(30, 40, 200, 300);
		t.setCellSelectionEnabled(true);
		ListSelectionModel select = t.getSelectionModel();
		select.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		select.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent e) {
				String data = null;
				int row[] = t.getSelectedRows();
				int column[] = t.getSelectedColumns();
				for(int i = 0; i < row.length; i++)
					for(int j = 0; j < column.length; j++)
						data = (String)t.getValueAt(row[i], column[j]);
				System.out.println("Table element Selected is: " + data);
			}
		});
		JScrollPane sp = new JScrollPane(t);
		f.add(sp);
		f.setSize(300, 400);
		f.setVisible(true);
		f.setLayout(null);
	}

	public static void main(String[] args) {
		new TableWithListSelectionListener();
	}

}
