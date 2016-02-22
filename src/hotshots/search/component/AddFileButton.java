package hotshots.search.component;

import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddFileButton extends JButton {
	
	//contructor
	public AddFileButton(){
		super("Add File...");
		init();
	}	
			private void init(){
				super.addActionListener(new ActionListener(){

					//Clicked Stub Method
					public void actionPerformed(ActionEvent e)
					  {//Executes when button is pressed
						throws new Success("It Worked!");
					  }
					
				});
			}
}
