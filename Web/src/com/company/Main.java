package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {

        System.out.println("1. to Sign_Up press 1");
        System.out.println("2. Sign_In press 2");
        System.out.println("3. Sign_Out press 3");
        System.out.println("4. exit press 9");

        ArrayList<User> arrUsers = new ArrayList<>();



        BufferedReader bufferedReader =
                new BufferedReader(new InputStreamReader(System.in));
        System.out.println("please choose one of the options");
        try {

            String num = bufferedReader.readLine();


            switch (num)
            {
                case "1":






            }






         //   int age = Integer.valueOf(ageAsString);

        } catch (IOException e) {
            System.out.println("error reading...");
        }catch (NumberFormatException exception){
            System.out.println("must enter an integer");
        }










    }







}
