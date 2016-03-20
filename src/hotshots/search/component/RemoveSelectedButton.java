/**
 * HotShotsSearchEngine -- a basic search engine.
 * 
 * @author Adam, Zack, Alex, and Nathan
 *
 */

package hotshots.search.component;

import hotshots.search.engine.SearchEngine;
import hotshots.search.model.IndexedFile;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;

/**
 * HotShotsSearchEngine -- a basic search engine.
 * 
 * @author Adam M Craig, Zack, Alex, and Alex
 *
 */
public class RemoveSelectedButton extends JButton {

   private static final String BUTTON_LABEL = "Remove Selected";
   private final SearchEngine engine;
   private final SearchIndexTable searchIndexTable;

   public RemoveSelectedButton(SearchIndexTable searchIndexTable,
         SearchEngine engine) {
      super(BUTTON_LABEL);
      this.engine = engine;
      this.searchIndexTable = searchIndexTable;
      init();
   }

   private void init() {
      super.addActionListener(new ActionListener() {

         @Override
         public void actionPerformed(ActionEvent e) {
            IndexedFile indexedFile = searchIndexTable.removeSelectedRow();
            engine.remove(indexedFile);
         }
      });
   }

}
