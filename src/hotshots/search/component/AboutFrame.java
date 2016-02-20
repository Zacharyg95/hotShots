package hotshots.search.component;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class AboutFrame extends JFrame {
	public AboutFrame(){
		super("About");
		
		init();
		
	}
	private void init(){
		JTextArea textArea = new JTextArea(20,30);
		textArea.setText("go blow joe...");
		super.add(textArea);
		setBounds(50, 50, 200, 100);
		pack();
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setVisible(true);
	}
}
