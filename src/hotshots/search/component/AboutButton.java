package hotshots.search.component;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
/**
 * HotShotsSearchEngine -- a basic search engine.
 * 
 * @author Adam M Craig, Zack, Alex, and Alex
 *
 */
public class AboutButton extends JButton {

    public AboutButton() {
	super("About");
	init();
    }

    private void init() {
	super.addActionListener(new ActionListener() {

	    @Override
	    public void actionPerformed(ActionEvent event) {
		new AboutFrame();
	    }

	});
    }

}
