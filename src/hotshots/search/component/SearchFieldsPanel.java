package hotshots.search.component;

import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class SearchFieldsPanel extends JPanel {

	//TODO - once we know what these radio buttons are supposed to be called, rename the variables and the string values
	public static final String SEARCH_OPTION_ONE = "Radio 1";
	public static final String SEARCH_OPTION_TWO = "Radio 2";
	public static final String SEARCH_OPTION_THREE = "Radio 3";
	
	private final JTextField searchTermTextField = new JTextField("", 25);
	private final ButtonGroup searchOptions = new ButtonGroup();
	
	public SearchFieldsPanel(){
		init();
	}
	
	private void init(){
		super.setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
		super.add(searchTermTextField);
		
		//TODO - once we know what these radio buttons are supposed to be called, rename the variables
		JRadioButton button1 = new JRadioButton(SEARCH_OPTION_ONE);
		JRadioButton button2 = new JRadioButton(SEARCH_OPTION_TWO);
		JRadioButton button3 = new JRadioButton(SEARCH_OPTION_THREE);
		
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
		Object[] selectedObjects = searchOptions.getSelection().getSelectedObjects();
		if(selectedObjects != null && selectedObjects.length == 1){
			if(selectedObjects[0] instanceof JRadioButton != true){
				throw new IllegalStateException("Somehow, something other than a JRadioButton made its way into our ButtonGroup");
			}
			
			JRadioButton selected = (JRadioButton)selectedObjects[0];
			return selected.getText();
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
