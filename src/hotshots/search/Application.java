package hotshots.search;

import hotshots.search.component.SearchFrame;
import hotshots.search.engine.NoOpSeachEngine;
import hotshots.search.engine.SearchEngine;

/**
 * HotShotsSearchEngine -- a basic search engine.
 * 
 * @author Adam Craig, Zack, Alex, and Alex
 *
 */
public class Application {

    public static void main(String[] args) {
	// TODO - instantiate the working search engine here
	SearchEngine engine = new NoOpSeachEngine();
	// one Frame for to rule them all, one frame to bind them...
	new SearchFrame(engine);

    }

    public class Success extends Exception {

	public Success(String message) {
	    super(message);
	}

	public Success(String message, Throwable throwable) {
	    super(message, throwable);
	}
    }
    
    //Method to create search indexes and will store in a file.
    //Method is void at the moment but can return a pathname or value if needed.
    public static void CreateIndex(){
    	static HashMap<String, List<String>> index=new HashMap<String, List<String>>();
    	//I believe this is the right type of object we for the index.
    }
}
