package hotshots.search.component;

import java.awt.Dimension;

import javax.swing.JScrollPane;
import javax.swing.JTextPane;
/**
 * HotShotsSearchEngine -- a basic search engine.
 * 
 * @author Adam Craig, Zack, Alex, and Alex
 *
 */
public class SearchResultsScrollPane extends JScrollPane {

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

}
