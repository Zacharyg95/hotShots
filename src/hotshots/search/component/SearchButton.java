package hotshots.search.component;

import hotshots.search.engine.SearchEngine;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class SearchButton extends JButton {

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

}
