package hotshots.search.component;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class AboutFrame extends JFrame {
	public AboutFrame(){
		super("About Window");
		
		init();
		
	}
	private void init(){
		JTextArea textArea = new JTextArea(20,30);
		textArea.setText("Version 1.2.3 " +
	"HotShots Search Engine" +
    "Created by Adam, Zach, & Alex" +
    "HCC Dale Mabry; Tampa, Florida" +
    "Advanced Java Project #3-5");
		super.add(textArea);
		setBounds(50, 50, 200, 100);
		pack();
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setVisible(true);
	}
}