package hotshots.search;

import java.awt.HeadlessException;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SearchFrame extends JFrame{

	private final JLabel label = new JLabel("Hot Shots Search Engine");


	public SearchFrame() throws HeadlessException {
		super("Hot Shots Search Engine");
		init();
	}
	
	private void init(){
		JPanel container = new JPanel();
		container.setLayout(new BoxLayout(container, BoxLayout.PAGE_AXIS));
		
		JPanel top = new JPanel();
		JPanel middle = new JPanel();
		JPanel bottom = new JPanel();

		SearchResultsScrollPane searchResultsScrollPane = new SearchResultsScrollPane();
		SearchFieldsPanel searchFieldsPanel = new SearchFieldsPanel();
		
		top.add(searchFieldsPanel);		
		top.add(new SearchButton(searchFieldsPanel, searchResultsScrollPane));

		middle.add(searchResultsScrollPane);

		bottom.add(new MaintenanceButton());
		bottom.add(new AboutButton());
		
		container.add(top);
		container.add(middle);
		container.add(bottom);

		super.add(container);
		super.setBounds(10, 10, 200, 100);
		super.pack();
		super.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		super.setVisible(true);
	}
	
	
	
}
