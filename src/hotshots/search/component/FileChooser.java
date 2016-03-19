package hotshots.search.component;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.swing.JFileChooser;

public class FileChooser extends JFileChooser {

   private JFileChooser fc;

   public FileChooser() {
      super("File Chooser");
      init();
   }

   private void init() {
      fc = new JFileChooser();
      fc.setMultiSelectionEnabled(true);
      fc.setCurrentDirectory(new java.io.File("."));
      fc.setDialogTitle("Add File");
      fc.setFileSelectionMode(JFileChooser.OPEN_DIALOG);
   }

   public List<File> promptForFiles() {
      List<File> selectedFiles = new ArrayList<File>();

      int returnValue = fc.showOpenDialog(null);
      if (returnValue == JFileChooser.APPROVE_OPTION) {
         Collections.addAll(selectedFiles, fc.getSelectedFiles());
      }

      return selectedFiles;
   }

}
