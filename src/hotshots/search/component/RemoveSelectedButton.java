package hotshots.search.component;

import javax.swing.JButton;

public class RemoveSelectedButton extends JButton {
	public RemoveSelectedButton(){
		super("Remove Selected");
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
