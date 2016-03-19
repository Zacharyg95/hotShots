/**
 * HotShotsSearchEngine -- a basic search engine.
 * 
 * @author Adam, Zack, Alex, and Nathan
 *
 */

package hotshots.search.component;


import java.awt.Dimension;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;

/**
 * HotShotsSearchEngine -- a basic search engine.
 * 
 * @author Adam M Craig, Zack, Alex, and Alex
 *
 */
public class SearchResultsScrollPane extends JScrollPane {

<<<<<<< HEAD
   private final JTextPane searchResultsTextPane = new JTextPane();

   public SearchResultsScrollPane() {
      init();
   }

   public SearchResultsScrollPane(String text) {
      this();
      this.setText(text);
   }

   private void init() {
      super.setPreferredSize(new Dimension(400, 300));
      super.setViewportView(searchResultsTextPane);
   }

   /**
    * Sets the text content that is displayed inside of this JScrollPane
    * 
    * @param text
    */
   public void setText(String text) {
      searchResultsTextPane.setText(text);
   }
=======
    private final JTextPane searchResultsTextPane = new JTextPane();

    public SearchResultsScrollPane() {
	init();
    }

    public SearchResultsScrollPane(String text) {
	this();
	this.setText(text);
    }

    private void init() {
       
	super.setPreferredSize(new Dimension(400, 300));
	super.setViewportView(searchResultsTextPane);
        
    }

    /**
     * Sets the text content that is displayed inside of this JScrollPane
     * 
     * @param text
     */
    public void setText(String text) {
	searchResultsTextPane.setText(text);
    }
>>>>>>> 2b9447e917e8f02a4b1a31cfc0d0b96ee51e782a

}
