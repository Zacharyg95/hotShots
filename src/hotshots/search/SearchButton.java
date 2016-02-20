package hotshots.search;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class SearchButton extends JButton {
	
	private SearchFieldsPanel searchFieldsPanel;
	private SearchResultsScrollPane searchResultsScrollPane;
	
	public SearchButton(SearchFieldsPanel searchFieldsPanel, SearchResultsScrollPane searchResultsScrollPane){
		super("Search");
		this.searchFieldsPanel = searchFieldsPanel;
		this.searchResultsScrollPane = searchResultsScrollPane;
		init();
	}
	
	private void init(){
		super.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent event) {
				//TODO - implement me
				String searchTerm = searchFieldsPanel.getSearchTerm();
				String selectedSearchOption = searchFieldsPanel.getSelectedSearchOption();
				
				String searchResult = "Search Term: " + searchTerm + "\nSelected Search Option: " + selectedSearchOption;
				searchResultsScrollPane.setText(searchResult);
			}
			
		});
	}

}
