/**
 * HotShotsSearchEngine -- a basic search engine.
 * 
 * @author Adam, Zack, Alex, and Nathan
 *
 */

package hotshots.search.component;

import java.awt.Color;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 * HotShotsSearchEngine -- a basic search engine.
 * 
 * @author Adam M Craig, Zack, Alex, and Alex
 *
 */
public class SearchFieldsPanel extends JPanel {

   public static final String AND_SEARCH_BUTTON = "And";
   public static final String OR_SEARCH_BUTTON = "Or";
   public static final String PHRASE_SEARCH_BUTTON = "Phrase";

   private final JTextField searchTermTextField = new JTextField("", 25);

   private final JRadioButton andSearchButton = new JRadioButton(
         AND_SEARCH_BUTTON);
   private final JRadioButton orSearchButton = new JRadioButton(
         OR_SEARCH_BUTTON);
   private final JRadioButton phraseSearchButton = new JRadioButton(
         PHRASE_SEARCH_BUTTON);

   public SearchFieldsPanel() {
      init();
   }

   private void init() {
      super.setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
      super.add(searchTermTextField);

      ButtonGroup searchOptions = new ButtonGroup();
      searchOptions.add(andSearchButton);
      searchOptions.add(orSearchButton);
      searchOptions.add(phraseSearchButton);

<<<<<<< HEAD
      JPanel bottom = new JPanel();
      bottom.add(andSearchButton);
      bottom.add(orSearchButton);
      bottom.add(phraseSearchButton);
      super.add(bottom);
   }
=======
        
        
	JPanel bottom = new JPanel();
	bottom.add(andSearchButton);
	bottom.add(orSearchButton);
	bottom.add(phraseSearchButton);
        
        bottom.setBackground(Color.lightGray);
	super.add(bottom);
    }
>>>>>>> 2b9447e917e8f02a4b1a31cfc0d0b96ee51e782a

   public String getSelectedSearchOption() {
      if (andSearchButton.isSelected()) {
         return andSearchButton.getText();
      } else if (orSearchButton.isSelected()) {
         return orSearchButton.getText();
      } else if (phraseSearchButton.isSelected()) {
         return phraseSearchButton.getText();
      }

      return null;
   }

   /**
    * Returns the user entered value from the search term text field
    * 
    * @return
    */
   public String getSearchTerm() {
      return this.searchTermTextField.getText();
   }

}
