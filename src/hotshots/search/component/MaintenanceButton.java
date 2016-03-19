/**
 * HotShotsSearchEngine -- a basic search engine.
 * 
 * @author Adam, Zack, Alex, and Nathan
 *
 */

package hotshots.search.component;

import hotshots.search.engine.SearchEngine;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

/**
 * HotShotsSearchEngine -- a basic search engine.
 * 
 * @author Adam M Craig, Zack, Alex, and Alex
 *
 */
public class MaintenanceButton extends JButton {

   private final SearchEngine engine;

   public MaintenanceButton(SearchEngine engine) {
      super("Maintenance");
      this.engine = engine;
      init();
   }

   private void init() {
      super.addActionListener(new ActionListener() {

         @Override
         public void actionPerformed(ActionEvent event) {
            // when the maintenance button is clicked, show an AdminFrame
            new MaintenanceFrame(engine);
         }

      });
   }
}
