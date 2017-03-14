package com.company;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by hackeru on 3/14/2017.
 */
class MyFileTextTest {

    MyFileText m;

    @Test
    void TestExist() {

           MyFileText file = new MyFileText("aaa");
//
//
//=
//            file = new MyFileText("C:\\Documents\\ddddd");
//            if (file.exist())
//                Assertions.fail("Path doesn't exist ");

               file = new MyFileText("C:\\Users\\hackeru\\Documents\\sari_shtiglitz\\IntSari\\SariInt.txt");
                    Assertions.assertEquals(true, file.exist());


    }

    @Test
    void TestNotExist()
    {
        MyFileText file = new MyFileText("aaa");
        Assertions.fail("not path");



    }






}