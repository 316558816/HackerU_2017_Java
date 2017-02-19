package com.company;

import javax.jws.soap.SOAPBinding;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.System.*;


public class Main {

    public static void main(String[] args) throws IOException {
                int cnt=1;

                out.println("1. to Sign_Up press 1");
                out.println("2. Sign_In press 2");
                out.println("3. Sign_Out press 3");
                out.println("4. exit press 9");

               // ArrayList<User> arrUsers = new ArrayList<>();

                 User [] userarr=new User[10];
                    userarr[0].username="hhh123";

                BufferedReader bufferedReader =
                        new BufferedReader(new InputStreamReader(in));

                out.println("please choose one of the options");
                try {

                    String num = bufferedReader.readLine();


                    switch (num)
                    {
                        case "1":
                     User u=new User();
                     boolean result=u.add(userarr,"sari123");
                            if(!result )
                                out.println("user name not valid please enter again");
                            else

                       out.println("please choose a password");
                            BufferedReader bufferedReader1 =
                                    new BufferedReader(new InputStreamReader(in));
                            String pass=bufferedReader1.readLine();
                            boolean result2=u.checkingPassword("132565");
                            if(!result2) {
                                cnt++;
                                out.println("password  not valid please enter again");
                            }
                            if(cnt>2)
                                remove();
                            //send to main
                    }







                    //   int age = Integer.valueOf(ageAsString);

                } catch (IOException e) {
                    out.println("error reading...");
                }catch (NumberFormatException exception){
                    out.println("must enter an integer");
                }










            }

    private static void remove() {

    }
}



