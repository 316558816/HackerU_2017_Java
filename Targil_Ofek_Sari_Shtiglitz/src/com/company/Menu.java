package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.security.InvalidParameterException;

/**
 * Created by hackeru on 2/28/2017.
 */
public class Menu {


    public static void printMenu() {
        Menu m1=new Menu();
        System.out.println();
        System.out.println("please choose:");
        System.out.println("1. To Decoding");
        System.out.println("2. To Hiding");
        System.out.println("0. exit");
        System.out.println("your choice: ");
        String inputChoise = readInput();
        String result= m1.processInput(inputChoise);
        if(result==null){
            System.out.println("Invalid option. please try again.");
            printMenu();
        }

       // if (inputChoise!="exit"&& !=null)
        else{
        if (inputChoise.length() != 0) {
            switch (result) {
                case "1":
                    getPath();
                    Decryption decryption = new Decryption();
                    decryption.decryption();

                    break;
                case "2":
                    getPath();
                    Encryption encryption = new Encryption();
                    encryption.encryption();
                    break;
                case "0":
                    System.out.println("bye bye...");
                    //return
                    break;


                }

            }


        }

        }









    public static String readInput() {
        String input = null;
        BufferedReader bufferedReader = new BufferedReader(
                new InputStreamReader(System.in));
        try {
            return   bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "exit";
    }



    public static MyFileText getPath() {

        System.out.println("please enter your path file: ");
        String pathname = readInput();
        MyFileText file = new MyFileText(pathname);
        try {
            file.checkFile();
        } catch (InvalidParameterException e) {
            System.out.println(e);
            getPath();
        }
        return file;

    }

    public  String processInput(String input) {

        String inputTemp = null;
        switch (input) {
            case "1":
                inputTemp = "1";
                break;
            case "2":
                inputTemp = "2";
                break;
            case "0":
                inputTemp = "0";
                break;
            default:inputTemp=null;
        }

        return inputTemp;
    }
}