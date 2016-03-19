/**
 * HotShotsSearchEngine -- a basic search engine.
 * 
 * @author Adam, Zack, Alex, and Nathan
 *
 */

package hotshots.search.component;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * HotShotsSearchEngine -- a basic search engine.
 * 
 * @author Adam M Craig, Zack, Alex, and Alex
 *
 */
public class DummyButtonActionListener implements ActionListener {

   private final String buttonName;

   public DummyButtonActionListener(String buttonName) {
      this.buttonName = buttonName;
   }

   public void actionPerformed(ActionEvent e) {
      System.out.println(buttonName + " button was clicked");
   }

}
