package hotshots.search;

import hotshots.search.component.SearchFrame;
import hotshots.search.engine.HotShotsSeachEngine;
import hotshots.search.engine.SearchEngine;

/**
 * HotShotsSearchEngine -- a basic search engine.
 * 
 * @author Adam M Craig, Zack, Alex, and Alex
 *
 */
public class Application {

   public static void main(String[] args) {
      // TODO - instantiate the working search engine here
      SearchEngine engine = new HotShotsSeachEngine();
      // one Frame for to rule them all, one frame to bind them...
      new SearchFrame(engine);

   }
}
