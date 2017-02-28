package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by hackeru on 2/28/2017.
 */
public class Menu  {


    public static void printMenu() {
        System.out.println();
        System.out.println("please choose:");
        System.out.println("1. To Decoding");
        System.out.println("2. To Hiding");
        System.out.println("0. exit");
        System.out.println("your choice: ");
        String inputChoise = readInput();
        System.out.println("please enter your path file: ");
        String pathname = readInput();
        MyFileText file = new MyFileText(pathname);


       /* if(!file.exist())
        {
            System.out.println("the file not exist please try again");
            printMenu();
        }*/
        if (inputChoise.length() != 0) {
            switch (inputChoise) {
                case "1":
                   // getPath(inputChoise);
                    Decryption decryption=new Decryption();
                    decryption.decryption();

                    break;
                case "2":
                    //getPath(inputChoise);
                    Encryption encryption=new Encryption();
                   encryption.encryption();
                    break;
                case "0":
                    System.out.println("bye bye...");
                    //return
                    break;
                default: {
                    System.out.println("Invalid option. please try again.");
                    printMenu();
                }
            }


        }
    }

    public static String readInput() {
        String input = null;
        BufferedReader bufferedReader = new BufferedReader(
                new InputStreamReader(System.in));
        try {
            input = bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return input;
    }
    /*public static void getPath(String inputChoise) {

        System.out.println("please enter your path file: ");
        String pathname = readInput();
        MyFileText file = new MyFileText(pathname);
        if(inputChoise=="1") {
            Decryption decryption = new Decryption();
            decryption.decryption();
        }
        else {

            if(inputChoise=="2") {
                Encryption encryption = new Encryption();
                encryption.encryption();
            }



        }



    }*/

}