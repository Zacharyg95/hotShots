package hotshots.search.component;

import javax.swing.JButton;
/**
 * HotShotsSearchEngine -- a basic search engine.
 * 
 * @author Adam M Craig, Zack, Alex, and Alex
 *
 */
public class ResetWindowButton extends JButton {
    private static final String BUTTON_LABEL = "Reset Window";

    public ResetWindowButton() {
	super(BUTTON_LABEL);
	init();
    }

    private void init() {
	super.addActionListener(new DummyButtonActionListener(BUTTON_LABEL));
    }
}
