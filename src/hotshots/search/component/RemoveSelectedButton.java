package hotshots.search.component;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class RemoveSelectedButton extends JButton {
    public RemoveSelectedButton() {
	super("Remove Selected");
	init();
    }

    private void init() {
	super.addActionListener(new ActionListener() {
	    public void actionPerformed(ActionEvent e) {
		System.out.println("Remove Selected Button was clicked");
	    }

	});
    }
}
