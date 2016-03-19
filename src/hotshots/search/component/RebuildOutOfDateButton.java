package hotshots.search.component;

import hotshots.search.engine.SearchEngine;

import javax.swing.JButton;

/**
 * HotShotsSearchEngine -- a basic search engine.
 * 
 * @author Adam M Craig, Zack, Alex, and Alex
 *
 */
public class RebuildOutOfDateButton extends JButton {
   
   private static final String BUTTON_LABEL = "Rebuild Out-of-Date";
   private final SearchEngine engine;
   private final SearchIndexTable searchIndexTable;

   public RebuildOutOfDateButton(SearchIndexTable searchIndexTable, SearchEngine engine) {
      super(BUTTON_LABEL);
      this.engine = engine;
      this.searchIndexTable = searchIndexTable;
      init();
   }

   private void init() {
      super.addActionListener(new DummyButtonActionListener(BUTTON_LABEL));
   }
}
