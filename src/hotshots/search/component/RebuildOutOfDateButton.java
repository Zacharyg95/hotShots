package hotshots.search.component;

import javax.swing.JButton;

public class RebuildOutOfDateButton extends JButton {
	public RebuildOutOfDateButton(){
		super("Rebuild Out-of-Date");
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
