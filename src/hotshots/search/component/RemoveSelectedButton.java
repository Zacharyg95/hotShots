/**
 * HotShotsSearchEngine -- a basic search engine.
 * 
 * @author Adam, Zack, Alex, and Nathan
 *
 */

package hotshots.search.component;

import javax.swing.JButton;
/**
 * HotShotsSearchEngine -- a basic search engine.
 * 
 * @author Adam M Craig, Zack, Alex, and Alex
 *
 */
public class RemoveSelectedButton extends JButton {
    private static final String BUTTON_LABEL = "Remove Selected";

    public RemoveSelectedButton() {
	super(BUTTON_LABEL);
	init();
    }

    private void init() {
	super.addActionListener(new DummyButtonActionListener(BUTTON_LABEL));
    }
}
