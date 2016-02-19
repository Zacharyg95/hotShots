package hotshots.search;

import javax.swing.JFrame;


/**
 * HotShotsSearchEngine -- a basic search engine.
 * @author Adam, Zack, Alex, and Nathan
 *
 */
public class Application {
	
	
	public static void main(String[] args) {
		//one JFrame for search window
		SearchFrame searchFrame = new SearchFrame();
		searchFrame.setBounds(10, 10, 200, 100);
		searchFrame.pack();
		searchFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		searchFrame.setVisible(true);
		
		//one JFrame for search index admin window
		AdminFrame adminFrame = new AdminFrame();
		searchFrame.setBounds(50, 50, 200, 100);
		adminFrame.pack();
		adminFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		adminFrame.setVisible(true);
	}

}
