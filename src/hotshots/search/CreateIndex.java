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
	public static HashMap<String, List<String>> SearchIndex = new HashMap<String, List<String>>();

	// Method will read the main file with the pathnames of the files that wish to be indexed by the user.

	public static void CreatePathNames(String FilesToBeIndexed) { // Method accepts pathname value to file with file to be indexed
		try {
			File PassedFile = new File(FilesToBeIndexed);// Prepare file to be scanned by Scanner
			Scanner MainFile = new Scanner(PassedFile);// New Scanner to read the passed parameter pathname

			int i = 0; // Create array index
			while (MainFile.hasNext())// while the passed parameter has a next
										// line this loop will run
			{
				Pathnames[i] = MainFile.next(); // stores value in pathname array.
				i++; // Increment arry index for next value
			}
			MainFile.close(); //Clsoe scanner after while loop exits
		} 
		catch (FileNotFoundException e)// catches if it cannot find file for scanner
		{
			e.printStackTrace();// Print stacktrace for now.
		}
	}
	
	
	
	
	public static void CreateSearchIndex(String[] Pathnames){
		for(String Path : Pathnames)// for loop for each pathname element
		{
			try {
				File PassedFile = new File(Path);// Prepare file to be scanned by Scanner
				Scanner FileBeingIndexed = new Scanner(PassedFile);// New Scanner to read the passed parameter pathname
		
				while (FileBeingIndexed.hasNext()) //While loop retrieves each word from file and adds the HashMap
				{
					
				}
				FileOutputStream SearchIndexFile = new FileOutputStream("SearchIndexFilePathName");//Prepare fileoutput for object output
				ObjectOutputStream out = new ObjectOutputStream(SearchIndexFile);//New object output passed the output file
				out.writeObject(SearchIndex);// writeObject to file
				out.close();
				SearchIndexFile.close();//Close Output Streams for next loop
				FileBeingIndexed.close();//Close Scanner before loops end, to create new one when loop startover
				}
			
			catch (FileNotFoundException e)// catches if it cannot find file for scanner
			{
				e.printStackTrace();// Print stacktrace for now.
			}
			catch (IOException e)// catches if it cannot find file for scanner
			{
				e.printStackTrace();// Print stacktrace for now.
			}
	}
	}
}
