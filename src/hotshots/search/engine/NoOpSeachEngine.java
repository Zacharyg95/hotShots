package hotshots.search.engine;

import hotshots.search.model.IndexedFile;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class NoOpSeachEngine implements SearchEngine {

   @Override
   public String search(String searchTerm, String... searchOptions) {
      String searchResult = "Search Term: " + searchTerm + "\nSearch Options: "
            + Arrays.toString(searchOptions);
      return searchResult;
   }

   public List<IndexedFile> add(List<File> files) {
      List<IndexedFile> indexedFiles = new ArrayList<IndexedFile>();

      for (File file : files) {
         // when the indexing operation happened for this set of java.io.Files
         Date now = new Date();
         // TODO - check the file type to make sure it's a .txt file
         // TODO - actually index the file
         // TODO - update the search index file
         
         
         
         // finally, wrap the file in an IndexedFile

         IndexedFile indexedFile = new IndexedFile(file, now);
         indexedFiles.add(indexedFile);
      }

      return indexedFiles;
   }

}
