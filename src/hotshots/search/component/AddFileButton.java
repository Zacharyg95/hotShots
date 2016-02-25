package hotshots.search.component;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class AddFileButton extends JButton {

    // contructor
    public AddFileButton() {
	super("Add File...");
	init();
    }

    private void init() {
	super.addActionListener(new ActionListener() {
	    public void actionPerformed(ActionEvent e) {
		System.out.println("The Add file button was clicked");
	    }
	});
    }
}