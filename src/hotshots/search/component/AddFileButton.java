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
import java.io.File;
import java.util.List;

import javax.swing.JButton;

/**
 * HotShotsSearchEngine -- a basic search engine.
 * 
 * @author Adam M Craig, Zack, Alex, and Alex
 *
 */

public class AddFileButton extends JButton {

   private static final String BUTTON_LABEL = "Add File...";
   private final SearchEngine engine;
   private final SearchIndexTable searchIndexTable;
   private FileChooser fc;

   // contructor
   public AddFileButton(SearchIndexTable searchIndexTable, SearchEngine engine) {
      super(BUTTON_LABEL);
      this.engine = engine;
      this.searchIndexTable = searchIndexTable;
      init();
   }

   private void init() {
      fc = new FileChooser();
      
      super.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            List<File> selectedFiles = fc.promptForFiles();
            if (selectedFiles.isEmpty() != true) {
               //index newly selected files
               List<IndexedFile> indexedFiles = engine.add(selectedFiles);
               //add indexed files to the SearchIndexTable
               searchIndexTable.add(indexedFiles);
            } else {
               // TODO - display dialog telling user that they didn't select any
               // files
            }
         }
      });

   }

}
