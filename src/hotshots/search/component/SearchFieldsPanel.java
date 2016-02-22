package hotshots.search.component;

import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class SearchFieldsPanel extends JPanel {

	//TODO - once we know what these radio buttons are supposed to be called, rename the variables and the string values
	public static final String AND_SEARCH_BUTTON = "Radio 1";
	public static final String OR_SEARCH_BUTTON = "Radio 2";
	public static final String PHRASE_SEARCH_BUTTON = "Radio 3";
	
	private final JTextField searchTermTextField = new JTextField("", 25);
	
	//TODO - once we know what these radio buttons are supposed to be called, rename the variables
	private final JRadioButton button1 = new JRadioButton(AND_SEARCH_BUTTON);
	private final JRadioButton button2 = new JRadioButton(OR_SEARCH_BUTTON);
	private final JRadioButton button3 = new JRadioButton(PHRASE_SEARCH_BUTTON);
	
	public SearchFieldsPanel(){
		init();
	}
	
	private void init(){
		super.setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
		super.add(searchTermTextField);

		ButtonGroup searchOptions = new ButtonGroup();
		searchOptions.add(button1);
		searchOptions.add(button2);
		searchOptions.add(button3);
		
		JPanel bottom = new JPanel();
		bottom.add(button1);
		bottom.add(button2);
		bottom.add(button3);
		super.add(bottom);
	}
	
	public String getSelectedSearchOption(){
		if(button1.isSelected()){
			return button1.getText();
		}else if(button2.isSelected()){
			return button2.getText();
		}else if(button3.isSelected()){
			return button3.getText();
		}
		
		return null;
	}
	
	/**
	 * Returns the user entered value from the search term text field
	 * @return
	 */
	public String getSearchTerm(){
		return this.searchTermTextField.getText();
	}
	
}
