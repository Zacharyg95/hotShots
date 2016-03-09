package hotshots.search.model;

import hotshots.search.component.ScanIndexToTextDoc;
import hotshots.search.engine.NoOpSeachEngine;
import hotshots.search.engine.SearchEngine;
import java.util.Properties;
import java.io.FileWriter;
import java.io.IOException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Akpriest
 */
public class SaveBeforeExit  {
    
    /**
     *
     * @param fileName
     * @throws IOException
     */
    public SaveBeforeExit(String fileName) throws IOException{
        
        // creates properties instance
	Properties properties = new Properties(); 
        
        //create properties needed for values to be stored
        properties.setProperty("index", "Test");
        properties.setProperty("inverted-index", "Test");
        properties.setProperty("path-names", "Test");
        properties.setProperty("file-names", "Test");
       
        
        
       // create file writer to write to file
       FileWriter writer = new FileWriter("conf.properties");
       
       //store data 
       properties.store(writer, "Autoher: JP");
       
       // clsoe write
       writer.close();
    }
 
        

}


      
       
       
    
    