package com.techproed;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BeforeAfterMethods {

    WebDriver driver; //driver instance in the class level,so i can use this instance in all of the method

    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.google.com");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS );//putting implicit wait
        driver.manage().window().maximize();
    }

    @Test
    public void titleTest(){


        String expectedTitle = "Google";
        String actualTitle =driver.getTitle();

        if (expectedTitle.equals(actualTitle)){
            System.out.println("PASS");
        }else {
            System.out.println("FAIL");
            System.out.println("Actual :" +actualTitle);
            System.out.println("Expected: "+expectedTitle);
        }

    }

    @Test
    public void imageTest(){

        WebElement imageElement = driver.findElement(By.id("hplogo"));//we locate by using id
        if (imageElement.isDisplayed()){
            System.out.println("PASS");
        }else {
            System.out.println("FAIL");
        }

    }
    @Test
    public void linkTest(){

        WebElement linkElement = driver.findElement(By.linkText("Gmail"));

        if (linkElement.isDisplayed()){
            System.out.println("PASS");
        }else {
            System.out.println("FAIL");
        }
    }

    @After
    public void tearDown(){
        //I am closing the driver after each test case===>
        // by this we can delete driver.close() under the every test case,because we dont need more
        driver.close();
    }



}
