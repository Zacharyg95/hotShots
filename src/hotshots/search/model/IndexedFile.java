package hotshots.search.model;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * represents a single, indexed file
 * @author Adam
 *
 */
public class IndexedFile {

   private static final DateFormat DATE_FORMAT = new SimpleDateFormat("MM/dd/yyyy 'at' HH:mm:ss");
   
   /**
    * Absolute path of the indexed file
    */
   private String fileName;

   /**
    * Timestamp in milliseconds when this file was last indexed
    */
   private long lastIndexed;


   public IndexedFile(File file, Date now) {
      this.fileName = file.getAbsolutePath();
      this.lastIndexed = now.getTime();
   }

   public IndexedFile(String fileName, long lastIndexed) {
      this.fileName = fileName;
      this.lastIndexed = lastIndexed;
   }

   public String getFileName() {
      return fileName;
   }

   public void setFileName(String fileName) {
      this.fileName = fileName;
   }

   public long getLastIndexed() {
      return lastIndexed;
   }

   public void setLastIndexed(long lastIndexed) {
      this.lastIndexed = lastIndexed;
   }

   public boolean fileModifiedSinceLastIndexed() {
      File file = new File(fileName);
      if (file.exists() != true) {
         throw new RuntimeException(fileName + " does not exist!");
      }

      return file.lastModified() >= this.lastIndexed;
   }

   public String getLastIndexedAsDate(){
      Date date = new Date(this.lastIndexed);
      
      return DATE_FORMAT.format(date);
   }

   
   public boolean exists(){
      File file = new File(fileName);
      return file.exists();
   }

}
