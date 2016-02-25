package hotshots.search.component;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class ResetWindowButton extends JButton {
    public ResetWindowButton() {
	super("Reset Window");
	init();
    }

    private void init() {
	super.addActionListener(new ActionListener() {
	    public void actionPerformed(ActionEvent e) {
		System.out.println("Reset Window Button clicked");
	    }

	});
    }
}
