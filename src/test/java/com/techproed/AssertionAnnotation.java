package com.techproed;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class AssertionAnnotation {

    WebDriver driver;

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
        Assert.assertEquals(expectedTitle,actualTitle); //we used it instead of if else

    }

    @Test
    public void imageTest(){

        WebElement imageElement = driver.findElement(By.id("hplogo"));
        Assert.assertTrue(imageElement.isDisplayed());// we used instead of if  else it gives boolean

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
        //I am closing the driver after each test case===> by this we can delete driver.close() under the every test case,because we dont need more
        driver.close();
    }




}
