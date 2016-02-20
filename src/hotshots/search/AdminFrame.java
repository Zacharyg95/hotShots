package hotshots.search;

import java.awt.HeadlessException;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class AdminFrame extends JFrame{
	
	private final JLabel label = new JLabel("Search Index Admin");

	public AdminFrame() throws HeadlessException {
		super("Search Index Admin");
		init();
	}
	
	private void init(){
		setBounds(50, 50, 200, 100);
		pack();
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setVisible(true);
	}

}
