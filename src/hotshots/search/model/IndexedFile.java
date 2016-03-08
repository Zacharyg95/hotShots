package hotshots.search.model;

import java.io.File;

/**
 * represents a single, indexed file
 * @author Adam
 *
 */
public class IndexedFile {

    private File file;
    private long fileLastIndexedInMillis;
    private InvertertedIndex invertedIndex;
    
    public IndexedFile(File file){
	this.file = file;
    }
    
    public IndexedFile(String fileName){
	this.file = new File(fileName);
    }
    
    public String getFileName() {
        return this.file.getAbsolutePath();
    }

    public long getFileLastModifiedInMillis() {
        return this.file.lastModified();
    }

    public InvertertedIndex getInvertedIndex() {
        return invertedIndex;
    }
    public void setInvertedIndex(InvertertedIndex invertedIndex) {
        this.invertedIndex = invertedIndex;
    }
    
    public boolean exists(){
	return this.file.exists();
    }
    
    public boolean hasBeenModifiedSinceLastIndexed(){
	return getFileLastModifiedInMillis() >= getFileLastIndexedInMillis();
    }

    public long getFileLastIndexedInMillis() {
        return fileLastIndexedInMillis;
    }

    public void setFileLastIndexedInMillis(long fileLastIndexedInMillis) {
        this.fileLastIndexedInMillis = fileLastIndexedInMillis;
    }
    
}
