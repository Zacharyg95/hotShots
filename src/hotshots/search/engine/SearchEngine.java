/**
 * HotShotsSearchEngine -- a basic search engine.
 * 
 * @author Adam, Zack, Alex, and Nathan
 *
 */

package hotshots.search.engine;

import hotshots.search.model.IndexedFile;

import java.io.File;
import java.util.List;

public interface SearchEngine {

   public String search(String searchTerm, String... searchOptions);

   public List<IndexedFile> add(List<File> files);

   public List<IndexedFile> getIndexedFiles();
   
   public void remove(IndexedFile indexedFile);

   public List<IndexedFile> rebuildOutOfDate();

}
