package hotshots.search;

import hotshots.search.component.SearchFrame;
import hotshots.search.engine.NoOpSeachEngine;
import hotshots.search.engine.SearchEngine;

/**
 * HotShotsSearchEngine -- a basic search engine.
 * 
 * @author Adam, Zack, Alex, and Nathan
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
}
