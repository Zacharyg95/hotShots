package hotshots.search.engine;

import hotshots.search.model.IndexedFile;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class HotShotsSeachEngine implements SearchEngine {

   private final File searchIndexFile = new File(".",
         "hot-shots-search-index.txt");

   private static final String SEARCH_INDEX_FILE_DELIMITER = "\t";
   private static final String NEWLINE = System.getProperty("line.separator");

   @Override
   public String search(String searchTerm, String... searchOptions) {
      String searchResult = "Search Term: " + searchTerm + "\nSearch Options: "
            + Arrays.toString(searchOptions);
      return searchResult;
   }

   public List<IndexedFile> getIndexedFiles() {
      List<IndexedFile> indexedFiles = new ArrayList<IndexedFile>();

      BufferedReader reader = null;
      try {
         reader = new BufferedReader(new FileReader(this.searchIndexFile));
         for (String line = reader.readLine(); line != null; line = reader
               .readLine()) {
            if(line.equals("")){
               continue;
            }
            String[] splitLine = line.split("\t");
            String fileName = splitLine[0];
            long fileLastIndexed = Long.parseLong(splitLine[1]);

            IndexedFile indexedFile = new IndexedFile(fileName, fileLastIndexed);
            indexedFiles.add(indexedFile);
         }
      } catch (FileNotFoundException e) {
         System.err
               .println("Apparently, the search index file does not exist: "
                     + e.getMessage());
      } catch (IOException e) {
         System.err.println("Failed to read lines from our search index file: "
               + e.getMessage());
         e.printStackTrace();
      } finally {
         if (reader != null) {
            try {
               reader.close();
            } catch (IOException e) {
               // swallow the exception because there's nothing we can do about
               // it anyways
            }
         }
      }

      return indexedFiles;
   }

   public List<IndexedFile> add(List<File> files) {
      List<IndexedFile> indexedFiles = new ArrayList<IndexedFile>();

      for (File file : files) {
         IndexedFile indexedFile = addFileToSearchIndex(file);
         if (indexedFile != null) {
            indexedFiles.add(indexedFile);
         }
      }

      return indexedFiles;
   }
   
   private void addFileToSearchIndex(IndexedFile indexedFile) {

      FileWriter writer = null;
      try {
         writer = new FileWriter(this.searchIndexFile, true);
         writer.write(getLineFormattedForIndexFile(indexedFile.getFileName(), indexedFile.getLastIndexed()));
      } catch (IOException e) {
         System.err.println("Failed to add file to our search index: "
               + e.getMessage());
         e.printStackTrace();
      } finally {
         if (writer != null) {
            try {
               writer.close();
            } catch (IOException e) {
               // swallow the exception because there's nothing we can do about
               // it anyways
            }
         }
      }
      
   }

   /**
    * returns an IndexedFile, if the file exists, and the file is a .txt file.
    * Returns null otherwise
    * 
    * @param file
    * @return
    */
   private IndexedFile addFileToSearchIndex(File file) {
      // when the indexing operation occurred for the given file
      Date now = new Date();
      // check the file type to make sure it's a .txt file

      if (file.getPath().endsWith(".txt") != true) {
         return null;
      }

      // TODO - actually index the file
      // update the search index file

      FileWriter writer = null;
      try {
         writer = new FileWriter(this.searchIndexFile, true);
         writer.write(getLineFormattedForIndexFile(file.getAbsolutePath(), now.getTime()));
      } catch (IOException e) {
         System.err.println("Failed to add file to our search index: "
               + e.getMessage());
         e.printStackTrace();
      } finally {
         if (writer != null) {
            try {
               writer.close();
            } catch (IOException e) {
               // swallow the exception because there's nothing we can do about
               // it anyways
            }
         }
      }

      // finally, wrap the file in an IndexedFile

      IndexedFile indexedFile = new IndexedFile(file, now);
      return indexedFile;

   }

   private String getLineFormattedForIndexFile(String filePath, long lastIndexed) {
      return String.format("%s%s%s%d", NEWLINE,
            filePath, SEARCH_INDEX_FILE_DELIMITER,
            lastIndexed);
   }

   @Override
   public void remove(IndexedFile indexedFile) {
      File tempFile = new File(".", "temp-hot-shots-search-index.txt");

      BufferedReader reader = null;
      BufferedWriter writer = null;
      try {
         reader = new BufferedReader(new FileReader(this.searchIndexFile));
         writer = new BufferedWriter(new FileWriter(tempFile));

         String lineToRemove = getLineFormattedForIndexFile(indexedFile.getFileName(), indexedFile.getLastIndexed()).trim();

         for(String currentLine = reader.readLine(); currentLine != null; currentLine = reader.readLine()) {
             if(currentLine.trim().equals(lineToRemove)){
                //don't copy the line we're trying to remove when writing lines to the temp file
                continue;
             }
             
             writer.write(currentLine + NEWLINE);
         }
      } catch (FileNotFoundException e) {
         throw new RuntimeException("Apparently, the " + this.searchIndexFile.getAbsolutePath() + " doesn't exist!");
      } catch (IOException e) {
         System.err.println("An IO error occurred when trying to remove " + indexedFile.getFileName() + " from " + this.searchIndexFile + ": " + e.getMessage());
      }finally{
         if(writer != null){
            try {
               writer.close();
            } catch (IOException e) {
               System.err.println("Failed to close writer: " + e.getMessage());
            }
         }
         if(reader != null){
            try {
               reader.close();
            } catch (IOException e) {
               System.err.println("Failed to close reader: " + e.getMessage());
            }
         }
      }
      
      if(this.searchIndexFile.delete() != true || tempFile.renameTo(this.searchIndexFile) != true){
         throw new RuntimeException("Failed to rename " + tempFile + " to " + this.searchIndexFile);
      }
   }

   @Override
   public List<IndexedFile> rebuildOutOfDate() {
      List<IndexedFile> updatedFiles = new ArrayList<IndexedFile>();
      List<IndexedFile> allFiles = getIndexedFiles();
      
      for(IndexedFile indexedFile : allFiles){
         if(indexedFile.fileModifiedSinceLastIndexed()){
            //TODO - actually update indexes
            this.remove(indexedFile);
            indexedFile.setLastIndexed(new Date());
            this.addFileToSearchIndex(indexedFile);
            updatedFiles.add(indexedFile);
         }
      }
      
      
      return updatedFiles;
   }

   

}
