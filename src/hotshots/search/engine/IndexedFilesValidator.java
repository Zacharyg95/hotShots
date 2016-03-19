package hotshots.search.engine;

import hotshots.search.model.IndexedFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class IndexedFilesValidator {

    private final File indexFile;
    
    public IndexedFilesValidator(File indexFile){
	this.indexFile = indexFile;
    }
    
    private List<IndexedFile> getIndexedFiles() {
	List<IndexedFile> indexedFiles = new ArrayList<IndexedFile>();
	
   	try {
   	    FileReader reader = new FileReader(indexFile);
   	    
   	    //TODO - read the index file and get the list of file names from the file 
   	    //and return those
   	} catch (FileNotFoundException e) {
   	   throw new RuntimeException(indexFile + " does not exist");
   	}
   	
   	return indexedFiles;
    }
    
    public List<IndexedFile> getDeletedFiles(){
	List<IndexedFile> deletedFiles = new ArrayList<IndexedFile>();
	
	List<IndexedFile> indexedFiles = getIndexedFiles();
	for(IndexedFile indexedFile : indexedFiles){
	    if(indexedFile.exists() != true){
		deletedFiles.add(indexedFile);
	    }
	}
	
	return deletedFiles;
    }

   
    
    public List<IndexedFile> getModifiedFiles(long lastIndexedInMilliseconds){
	List<IndexedFile> modifiedFiles = new ArrayList<IndexedFile>();
	
	List<IndexedFile> indexedFiles = getIndexedFiles();
	for(IndexedFile indexedFile : indexedFiles){
	    if(indexedFile.exists() && indexedFile.hasBeenModifiedSinceLastIndexed()){
		modifiedFiles.add(indexedFile);
	    }
	}
	
	return modifiedFiles;
    }
    
}
