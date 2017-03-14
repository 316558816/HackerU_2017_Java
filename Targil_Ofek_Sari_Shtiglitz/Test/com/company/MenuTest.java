package com.company;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Created by hackeru on 3/14/2017.
 */
class MenuTest {
    @BeforeEach
    void setUp() {

    }

    @AfterEach
    void tearDown() {

    }

    @Test
    void printMenuTest() {
        Menu m = new Menu();
        Assertions.assertEquals(m.processInput("1"), "1","not valid");
    }

    @Test
    void readInput() {

    }

    @Test
    void getPath() {

    }

    @Test
    void processInput() {

    }

}