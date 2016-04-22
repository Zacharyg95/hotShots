package hotshots.search.component;

import java.io.*;
import java.util.*;

/**
 * HotShotsSearchEngine -- a basic search engine.
 * 
 * @author Adam Craig, Zack, Alex, and Alex
 *
 */
public class CreateIndex {
   // Class-Wide variables
   public static long TimeLastIndexed;
   public static String[] Pathnames;
   public static HashMap<File, List<String>> SearchIndex = new HashMap<File, List<String>>();
   public static HashMap<File, Date> FilesLastModified = new HashMap<File, Date>();
   public static String StringHolder = "";
   public static String WildCards = "[.?!:\\-=+,&()<>@#$%^\\*~` ]+"; // Set of most common wild cards
   // Method will read the main file with the pathnames of the files that wish
   // to be indexed by the user.

   public static void CreatePathNames(String FilesToBeIndexed) 
      { // Method accepts pathname value to file with file to be indexed
      try {
            File PassedFile = new File(FilesToBeIndexed);// Prepare file to be
                                                          // scanned by Scanner
             Scanner MainFile = new Scanner(PassedFile);// New Scanner to read the
                                                          // passed parameter pathname

             int i = 0; // Create array index
             while (MainFile.hasNext())// while the passed parameter has a next
                                       // line this loop will run
               {
                  Pathnames[i] = MainFile.next(); // stores value in pathname array.
                   i++; // Increment arry index for next value
                }
            MainFile.close(); // Clsoe scanner after while loop exits
            } 
            catch (FileNotFoundException e)// catches if it cannot find file for scanner
             {
               System.out.println("No File Was Found.");
             }
      }

   public static void CreateSearchIndex(String[] Pathnames) 
   {
      public static String Words[]; //Method wide variable to hold words from indexing file
      for (String Path : Pathnames)// for loop for each pathname element
      {
         try {
            File PassedFile = new File(Path);// Prepare file to be scanned by Scanner
            FileInputStream fis = new FileInputStream(PassedFile); // read contents of the new file
            BufferedInputStream  bis = new BufferedInputStream(fis);// buffer decrease reading time
            DataInputStream dis = new DataInputStream(bis);// Stream to read data to variable
            
            while (dis.available() != 0) //While loop will read the file line by line
            {
               StringHolder += dis.readLine(); //Reads line and adds to the string, making one very long string.
            }
            Words[] = StringHolder.split(WildCards); // Add words to an array
            List<String> SetHolder = new ArrayList<String>();//create array list for HashMap
          
             for(String word : Words)//for each word in the Words array
             {
             SetHolder.add(word);//Add words to the List for the HashMap
             }
             //Actaully adds the words to the Hashmap with the file being the key 
             //Saved As:(File Name, Words in File)
             SearchIndex.put(PassedFile,  SetHolder);
             
             
             //Gets the last modified time in milliseconds, converts to a readable time in Date format for HashMap
              Date date = new Date(PassedFile.lastModified());
          //Assign the last modfied time along with file name to HashMap
          //Saved as: (File Name, Date Object)
          FilesLastModified.put(PassedFile, date);
          
          fis.close();//Close all input streams before loops ends
          bis.close();//close to reopen at start of next loop
          dis.close();// close after data has been read and saved
         }
         catch (FileNotFoundException e)// catches if it cannot find file for scanner
         {
            System.out.println("No File Was Found.");
         } catch (IOException e)// catches if it cannot find file for scanner
         {
           System.out.println("No File Was Selected.");
         }
      }
   }
}
