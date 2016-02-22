package hotshots.search.component;

import javax.swing.JButton;

public class ResetWindowButton extends JButton {
	public ResetWindowButton(){
		super("Reset Window");
		init();
	}

	private void init(){
		super.addActionListener(new ActionListener(){

			//Clicked Stub Method
			public void actionPerformed(ActionEvent e)
			  {//Executes when button is pressed
				throw new Success("It Worked!");
			  }
			
		});
	}
}
