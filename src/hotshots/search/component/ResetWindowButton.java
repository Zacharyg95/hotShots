/**
 * HotShotsSearchEngine -- a basic search engine.
 * 
 * @author Adam, Zack, Alex, and Nathan
 *
 */

package hotshots.search.component;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;

/**
 * HotShotsSearchEngine -- a basic search engine.
 * 
 * @author Adam M Craig, Zack, Alex, and Alex
 *
 */
public class ResetWindowButton extends JButton {
   private static final String BUTTON_LABEL = "Reset Window";
   //private final RemoveSelectedButton RemoveSelectedButton;
   
   public ResetWindowButton() {
      super(BUTTON_LABEL);
      
     /* super.addActionListener(new ActionListener() {

         @Override
         public void actionPerformed(ActionEvent e) {
            RemoveSelectedButton.deleteTableRow(null);
            try {
               RemoveSelectedButton.clearIndexFile();
               
            } catch (IOException e1) {
               e1.printStackTrace();
            }
         }
      });*/
      init();
   }

   private void init() {
      super.addActionListener(new DummyButtonActionListener(BUTTON_LABEL));
   }
}
