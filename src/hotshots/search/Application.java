package hotshots.search;

import hotshots.search.component.ScanIndexToTextDoc;
import hotshots.search.engine.NoOpSeachEngine;
import hotshots.search.engine.SearchEngine;
import java.util.Properties;
import java.io.FileWriter;
import java.io.IOException;

/**
 * HotShotsSearchEngine -- a basic search engine.
 * 
 * @author Adam M Craig, Zack, Alex, and Alex
 *
 */
public class Application {

    public static void main(String[] args) throws IOException {
	// TODO - instantiate the working search engine here
	SearchEngine engine = new NoOpSeachEngine();
	// one Frame for to rule them all, one frame to bind them...
	new ScanIndexToTextDoc(engine);

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
