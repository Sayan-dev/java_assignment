package com.module2;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileOutputExample extends FileOutputStream{

    public FileOutputExample(String path) throws FileNotFoundException {
        super(path);
    }

    public void writeFile(String s) {
        try{       
            byte b[]=s.getBytes();//converting string into byte array    
            this.write(b);    
            this.close();    
            System.out.println("success...");    
           }catch(Exception e){System.out.println(e);}    
    }
    


}
