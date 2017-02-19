package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by MyUser on 19/02/2017.
 */
public class User
{

    private static final int ASCII_0 = 48;
    public static final int ASCII_9=57;
    public static final int ASCII_a=97;
    public static final int ASCII_z=122;

   // int size;

    public String username;
    public String password;


    public boolean checkingUsername (String user) {
                byte[] currentByte = user.getBytes();
                boolean flagNumbers = false;
                for (int i = 0; i < currentByte.length; i++) {
                    if ((currentByte[i] >= ASCII_0) && (currentByte[i] <= ASCII_9) && (flagNumbers == false)) {
                        return false;
                    } else if ((currentByte[i] >= ASCII_a) && currentByte[i] <= ASCII_z) {
                        flagNumbers = true;
                    }
                }

                return true;
            }

    public boolean add(User[] arr, String userName) {
        int size=10;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i].username.equals(userName))
                return false;
        }
       // makeRoom();
        arr[size++].username = userName;

        return  true;
    }

    public boolean checkingPassword (String password) {
        byte[] currentByte = password.getBytes();
        boolean flagpass= false;
        for (int i = 0; i < currentByte.length; i++) {
            if ((currentByte[i] >= 48) && (currentByte[i] <=128) && (currentByte.length<4||currentByte.length>12)) {
                return false;
                 return true;
    }







}