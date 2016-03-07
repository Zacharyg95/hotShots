package hotshots.search.component;

import java.io.File;
import java.io.FileNotFoundException;
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
	public static HashMap<String, List<String>> index = new HashMap<String, List<String>>();

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
		
		
		
	}
}
