package com.company;



import jdk.nashorn.internal.runtime.regexp.RegExp;

import java.io.File;
import java.net.URI;
import java.security.InvalidParameterException;

/**
 * Created by hackeru on 2/28/2017.
 */
public class MyFileText<T> extends File implements FileInterface {

   // File current_file;
    String pathname;

    public MyFileText(String pathname) {
        super(pathname);

    }
    public boolean checkFile() {

        if (!exist())
            return false;

        else
            return true;
    }









    //int size;




    /*public MyFileText(String pathname) {
        super(pathname);
        exist();
        readFile();

    }
    */


    @Override
    public boolean exist() {
        boolean result= exists();
        if(!result)
        {
            System.out.println("is not exist");
            Menu.printMenu();
        }
         return true;
    }



}



