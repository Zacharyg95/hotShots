package hotshots.search.component;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class AboutButton extends JButton {
	
	public AboutButton(){
		super("About");
		init();
	}

	private void init(){
		super.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent event) {
				//TODO - implement me
				System.out.println("About button was clicked, but I don't know what to do :(");
			}
			
		});
	}
	
}
