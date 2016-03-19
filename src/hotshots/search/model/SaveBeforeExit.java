package hotshots.search.model;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class SaveBeforeExit {

   public static void SaveBeforeExit(String[] filenameArray,
         String[] pathnameArray, String[] invertedIndexArray,
         String[] indexArray) throws IOException {

      String filenames = "";
      String pathnames = "";
      String invertedIndexes = "";
      String indexes = "";

      // loads filenameArray into one long string seperated by commas
      for (int i = 0; i < filenameArray.length; i++) {

         filenames += filenameArray[i];
         filenames += ", ";
      }

      // loads pathnameArray into one long string
      for (int i = 0; i < pathnameArray.length; i++) {

         pathnames += pathnameArray[i];
         pathnames += ", ";
      }

      // loads invertedIndexArray into one long string
      for (int i = 0; i < invertedIndexArray.length; i++) {

         invertedIndexes += invertedIndexArray[i];
         invertedIndexes += ", ";
      }

      // loads indexArray into one long string
      for (int i = 0; i < indexArray.length; i++) {

         indexes += indexArray[i];
         indexes += ", ";
      }

      // creates properties instance
      Properties properties = new Properties();

      // create properties needed for values to be stored
      properties.setProperty("index", indexes);
      properties.setProperty("inverted-index", invertedIndexes);
      properties.setProperty("path-names", pathnames);
      properties.setProperty("file-names", filenames);

      // create file writer to write to file
      FileWriter writer = new FileWriter("conf.properties");

      // store data
      properties.store(writer, "Autoher: Alex, Zack, Adam, and Alex");

      // close write
      writer.close();
   }

}
