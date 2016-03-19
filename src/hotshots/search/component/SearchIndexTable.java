package hotshots.search.component;

import hotshots.search.model.IndexedFile;

import java.awt.Color;
import java.util.List;
import java.util.Vector;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class SearchIndexTable extends JPanel {

   private JTable table;
   private DefaultTableModel model;
   private JScrollPane scrollPane;
   private Object rowData[][];
   private Object columnNames[];

   public SearchIndexTable() {
      init();
   }

   private void init() {
      rowData = new Object[][] {};
      columnNames = new Object[] { "File Name", "Last Indexed" };

      model = new DefaultTableModel(rowData, columnNames);
      table = new JTable(model);
      scrollPane = new JScrollPane(table);

      super.add(scrollPane);
      super.setBackground(Color.lightGray);
   }

   public void add(List<IndexedFile> indexedFiles) {
      for(IndexedFile indexedFile : indexedFiles){
         model.addRow(getRow(indexedFile));
      }
   }

   private Object[] getRow(IndexedFile indexedFile) {
     return new Object[]{indexedFile.getFileName(), indexedFile.getLastIndexedAsDate()};
   }

}
