package hotshots.search;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class MaintenanceButton extends JButton {
	public MaintenanceButton(){
		super("Maintenance");
		init();
	}

	private void init(){
		super.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent event) {
				//when the maintenance button is clicked, show an AdminFrame
				new AdminFrame();
			}
			
		});
	}
}
