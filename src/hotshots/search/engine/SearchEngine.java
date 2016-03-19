package hotshots.search.engine;

import hotshots.search.model.IndexedFile;

import java.io.File;
import java.util.List;

public interface SearchEngine {

   public String search(String searchTerm, String... searchOptions);

   public List<IndexedFile> add(List<File> files);
   
   public List<IndexedFile> getIndexedFiles();

}
