package hotshots.search;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.HeadlessException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class SearchFrame extends JFrame{

	private final JLabel label = new JLabel("Hot Shots Search Engine");


	public SearchFrame() throws HeadlessException {
		super("Hot Shots Search Engine");
		init();
	}
	
	private void init(){
		
		JPanel panel = new JPanel();
		//TODO - use layout manager to lay things out
		BorderLayout LayoutManager = new BorderLayout();
			JTextArea SearchTermTextField = new JTextArea("SearchTermTextField(PAGE_START)");
				panel.add(new SearchTermTextField());
				SearchTermTextField.setPreferredSize(new Dimension(200, 100));
			JButton SearchButton = new JButton("SearchButton(PAGE_START)");
		//TODO - add SearhTermTextField
		//TODO - add search option radio buttons
		panel.add(new SearchButton());
		//TODO - add SearchResultPanel
		panel.add(new MaintenanceButton());
		panel.add(new AboutButton());
		super.add(panel);
		super.setBounds(10, 10, 200, 100);
		super.pack();
		super.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		super.setVisible(true);
	}
	
	
	
}
