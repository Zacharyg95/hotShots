package hotshots.search.component;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class RebuildOutOfDateButton extends JButton {
    public RebuildOutOfDateButton() {
	super("Rebuild Out-of-Date");
	init();
    }

    private void init() {
	super.addActionListener(new ActionListener() {
	    public void actionPerformed(ActionEvent e) {
		System.out.println("Rebuild out of date button was clicked");
	    }

	});
    }
}
