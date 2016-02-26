/**
 * HotShotsSearchEngine -- a basic search engine.
 * 
 * @author Adam, Zack, Alex, and Nathan
 *
 */

package hotshots.search.component;

import java.awt.Color;
import javax.swing.*;
import java.awt.HeadlessException;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class AdminFrame extends JFrame {

    private final JLabel label = new JLabel("Search Index Admin");

    public AdminFrame() throws HeadlessException {
	super("Search Index Admin");
	init();
    }

    private void init() {
	JPanel panel = new JPanel();
	panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));
	panel.add(new JLabel("Search Engine Index Table",  SwingConstants.LEFT));
        panel.setBackground(Color.lightGray);
        
        
	SearchIndexTable searchIndexTable = new SearchIndexTable();
	JPanel middle = new JPanel();
	JPanel bottom = new JPanel();
        
        
        

        middle.setBackground(Color.lightGray);
	middle.add(new AddFileButton());
	middle.add(new RebuildOutOfDateButton());
	middle.add(new RemoveSelectedButton());

        bottom.setBackground(Color.lightGray);
	bottom.add(new ResetWindowButton());
	bottom.add(new JLabel("Number of Files indexed:")); // need to add the
							    // variable to
							    // refeerence number
							    // of indexed files
							    // after this
							    // string.
	bottom.add(new JLabel("Search Engine Version 1.2.3"));

	panel.add(searchIndexTable);
	panel.add(middle);
	panel.add(bottom);

        
	super.add(panel);
	super.setBounds(50, 50, 200, 100);
	super.pack();
	super.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	super.setVisible(true);
    }

}
