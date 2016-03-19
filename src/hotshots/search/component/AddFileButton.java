/**
 * HotShotsSearchEngine -- a basic search engine.
 * 
 * @author Adam, Zack, Alex, and Nathan
 *
 */

package hotshots.search.component;

import javax.swing.JButton;

/**
 * HotShotsSearchEngine -- a basic search engine.
 * 
 * @author Adam M Craig, Zack, Alex, and Alex
 *
 */

public class AddFileButton extends JButton {

   private static final String BUTTON_LABEL = "Add File...";

   // contructor
   public AddFileButton() {
      super(BUTTON_LABEL);
      init();
   }

   private void init() {
      super.addActionListener(new DummyButtonActionListener(BUTTON_LABEL));
   }
}
