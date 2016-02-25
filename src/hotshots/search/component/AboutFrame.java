package hotshots.search.component;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class AboutFrame extends JFrame {
    private final static String newline = "\n";

    public AboutFrame() {
	super("About Window");

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