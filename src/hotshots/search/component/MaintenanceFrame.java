package hotshots.search.component;

import hotshots.search.engine.SearchEngine;

import java.awt.HeadlessException;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * HotShotsSearchEngine -- a basic search engine.
 * 
 * @author Adam M Craig, Zack, Alex, and Alex
 *
 */
public class MaintenanceFrame extends JFrame {

   private final JLabel label = new JLabel("Search Index Admin");
   private final SearchEngine engine;

   public MaintenanceFrame(SearchEngine engine) throws HeadlessException {
      super("Search Index Admin");
      this.engine = engine;
      init();
   }

   private void init() {
      JPanel panel = new JPanel();
      panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));
      panel.add(new JLabel("Search Engine Index Table"));

      SearchIndexTable searchIndexTable = new SearchIndexTable(engine);
      JPanel middle = new JPanel();
      JPanel bottom = new JPanel();

      middle.add(new AddFileButton(searchIndexTable, engine));
      middle.add(new RebuildOutOfDateButton(searchIndexTable, engine));
      middle.add(new RemoveSelectedButton(searchIndexTable, engine));

      bottom.add(new ResetWindowButton());
      bottom.add(new JLabel("Number of Files indexed:")); // need to add the
      // variable to
      // Reference number
      // of indexed files
      // after this
      // string.
      bottom.add(new JLabel("Search Engine Version 1.2.3"));

      panel.add(searchIndexTable);
      panel.add(middle);
      panel.add(bottom);

      super.add(panel);
      super.setBounds(50, 50, 200, 100);

      super.pack();
      super.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
      super.setVisible(true);
   }

}
