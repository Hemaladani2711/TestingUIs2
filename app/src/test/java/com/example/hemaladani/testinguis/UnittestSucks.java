package com.example.hemaladani.testinguis;

import org.junit.Test;

import static org.junit.Assert.*;

public class UnittestSucks {

    @Test
    public void testFunction(){
        assertEquals(2, MainActivity.getTotal(1,1));
        assertEquals(3, MainActivity.getTotal(1,1));
    }

}