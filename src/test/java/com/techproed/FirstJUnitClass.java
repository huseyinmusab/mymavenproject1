package com.techproed;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class FirstJUnitClass {

    //create a method name:setUp
    //print This is before method
    //this is NOT a test case
    //because we dont have @Test annotation
    @Before
    public void setUp(){

        System.out.println("This is my before method.This will run before each @Test annotation");
    }



    //Create our first method
    //@Test is used to CREATE TEST CASES,WITH THIS WE NO LONGER MAIN METHOD
    @Test
    public void test1(){
        System.out.println("This is my first case");

    }



    //Skipping this test cases by using @Ignore annotation
    //@Ignore
    @Test
    public void test2(){

        System.out.println("This is my second test case");
    }



    //CREATE ANOTHER TEST CASE:TEST3
    @Test
    public void test3(){

        System.out.println("This is my third case");
    }


    @After
    public void tearDown(){

        System.out.println("This is my after method.This runs after each @Test annotation");
    }



}
