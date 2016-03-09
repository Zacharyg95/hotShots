/**
 * HotShotsSearchEngine -- a basic search engine.
 * 
 * @author Adam, Zack, Alex, and Nathan
 *
 */

package hotshots.search.engine;

import java.util.Arrays;

public class NoOpSeachEngine implements SearchEngine {

    @Override
    public String search(String searchTerm, String... searchOptions) {
	String searchResult = "Search Term: " + searchTerm
		+ "\nSearch Options: " + Arrays.toString(searchOptions);
	return searchResult;
    }

}
