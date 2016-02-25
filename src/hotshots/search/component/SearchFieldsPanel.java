package hotshots.search.component;

import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class SearchFieldsPanel extends JPanel {

    // TODO - once we know what these radio buttons are supposed to be called,
    // rename the variables and the string values
    public static final String AND_SEARCH_BUTTON = "Radio 1";
    public static final String OR_SEARCH_BUTTON = "Radio 2";
    public static final String PHRASE_SEARCH_BUTTON = "Radio 3";

    private final JTextField searchTermTextField = new JTextField("", 25);

    // TODO - once we know what these radio buttons are supposed to be called,
    // rename the variables
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

	JPanel bottom = new JPanel();
	bottom.add(andSearchButton);
	bottom.add(orSearchButton);
	bottom.add(phraseSearchButton);
	super.add(bottom);
    }

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
