package hotshots.search.component;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
/**
 * HotShotsSearchEngine -- a basic search engine.
 * 
 * @author Adam Craig, Zack, Alex, and Alex
 *
 */
public class AboutFrame extends JFrame {
    private final static String newline = "\n";
    
    public AboutFrame() {
	super("About Window");
	JPanel aboutPanel = new JPanel();
	aboutPanel.setBorder(new EmptyBorder(10,10,10,10));
	init();

    }

    private void init() {

	JTextArea textArea = new JTextArea(8, 40);
	textArea.setText("Version 1.2.3 " + newline + "HotShots Search Engine"
		+ newline + "Created by Adam, Zach, & Alex" + newline
		+ "HCC Dale Mabry; Tampa, Florida" + newline
		+ "Advanced Java Project #3-5");
	textArea.setLineWrap(true);
	textArea.setWrapStyleWord(true);
	super.add(textArea);
	textArea.setBounds(50, 50, 200, 100);
	pack();
	setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	setVisible(true);
    }
}