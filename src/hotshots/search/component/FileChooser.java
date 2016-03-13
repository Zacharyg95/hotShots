package hotshots.search.component;

import javax.swing.JFileChooser;

public class FileChooser extends JFileChooser {
   public FileChooser() {
      super("File Chooser");
      init();
   }

   private void init() {
      final JFileChooser fc = new JFileChooser();
      fc.setCurrentDirectory(new java.io.File("."));
      fc.setDialogTitle("Add File");
      fc.setFileSelectionMode(JFileChooser.OPEN_DIALOG);
   }

}
