/**
 * HotShotsSearchEngine -- a basic search engine.
 * 
 * @author Adam, Zack, Alex, and Nathan
 *
 */

package hotshots.search.component;

import hotshots.search.engine.SearchEngine;
import hotshots.search.model.IndexedFile;

import java.awt.Color;
import java.awt.Dimension;
import java.util.List;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class SearchIndexTable extends JPanel {

   private JTable table;
   private DefaultTableModel model;
   private JScrollPane scrollPane;
   private Object rowData[][];
   private Object columnNames[];
   private SearchEngine engine;

   public SearchIndexTable(SearchEngine engine) {
      this.engine = engine;
      init();
   }

   private void init() {
      rowData = new Object[][] {};
      columnNames = new Object[] { "File Name", "Last Indexed" };

      model = new DefaultTableModel(rowData, columnNames);

      List<IndexedFile> indexedFiles = engine.getIndexedFiles();
      add(indexedFiles);

      table = new JTable(model);
      scrollPane = new JScrollPane(table);
      scrollPane.setPreferredSize(new Dimension(1100, 350));

      super.add(scrollPane);
      super.setBackground(Color.lightGray);
   }

   public void add(List<IndexedFile> indexedFiles) {
      for (IndexedFile indexedFile : indexedFiles) {
         model.addRow(getRow(indexedFile));
      }
   }

   private Object[] getRow(IndexedFile indexedFile) {
      return new Object[] { indexedFile.getFileName(),
            indexedFile.getLastIndexedAsDate() };
   }

}
