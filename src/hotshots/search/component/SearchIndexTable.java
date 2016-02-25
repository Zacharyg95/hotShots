package hotshots.search.component;

import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class SearchIndexTable extends JPanel {

    public SearchIndexTable() {
	init();
    }

    private void init() {
	Object rowData[][] = {};
	Object columnNames[] = { "File Name", "SearchIndex" };

	TableModel model = new DefaultTableModel(rowData, columnNames);

	JTable table = new JTable(model);
	JScrollPane scrollPane = new JScrollPane(table);
	super.add(scrollPane);
        super.setBackground(Color.lightGray);
        
    }
}
