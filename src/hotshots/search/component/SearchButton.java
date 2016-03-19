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
public class SearchButton extends JButton {

<<<<<<< HEAD
   private SearchFieldsPanel searchFieldsPanel;
   private SearchResultsScrollPane searchResultsScrollPane;
   private SearchEngine engine;

   public SearchButton(SearchFieldsPanel searchFieldsPanel,
         SearchResultsScrollPane searchResultsScrollPane, SearchEngine engine) {
      super("Search");
      this.searchFieldsPanel = searchFieldsPanel;
      this.searchResultsScrollPane = searchResultsScrollPane;
      this.engine = engine;
      init();
   }

   private void init() {
      super.addActionListener(new ActionListener() {

         @Override
         public void actionPerformed(ActionEvent event) {
            String searchTerm = searchFieldsPanel.getSearchTerm();
            String selectedSearchOption = searchFieldsPanel
                  .getSelectedSearchOption();

            searchResultsScrollPane.setText(engine.search(searchTerm,
                  selectedSearchOption));
         }

      });
   }
=======
    private SearchFieldsPanel searchFieldsPanel;
    private SearchResultsScrollPane searchResultsScrollPane;
    private SearchEngine engine;

    public SearchButton(SearchFieldsPanel searchFieldsPanel,
	    SearchResultsScrollPane searchResultsScrollPane, SearchEngine engine) {
	super("Search");
        
        
	this.searchFieldsPanel = searchFieldsPanel;
	this.searchResultsScrollPane = searchResultsScrollPane;
	this.engine = engine;
	init();
    }

    private void init() {
	super.addActionListener(new ActionListener() {

	    @Override
	    public void actionPerformed(ActionEvent event) {
		String searchTerm = searchFieldsPanel.getSearchTerm();
		String selectedSearchOption = searchFieldsPanel
			.getSelectedSearchOption();

		searchResultsScrollPane.setText(engine.search(searchTerm,
			selectedSearchOption));
	    }

	});
    }
>>>>>>> 2b9447e917e8f02a4b1a31cfc0d0b96ee51e782a

}
