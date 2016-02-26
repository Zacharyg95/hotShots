/**
 * HotShotsSearchEngine -- a basic search engine.
 * 
 * @author Adam, Zack, Alex, and Nathan
 *
 */

package hotshots.search.component;

import javax.swing.JButton;

public class RebuildOutOfDateButton extends JButton {
    private static final String BUTTON_LABEL = "Rebuild Out-of-Date";

    public RebuildOutOfDateButton() {
	super(BUTTON_LABEL);
	init();
    }

    private void init() {
	super.addActionListener(new DummyButtonActionListener(BUTTON_LABEL));
    }
}
