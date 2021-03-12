package com.techproed;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class RadioButton {
    //1. Create a class : RadioButton
    //2. Complete the following task.
    //1.Go to https://www.facebook.com/
    //3.Click on Create an Account button
    //4.Locate the elements of radio buttons
    //5.Then click on the radio buttons for your gender if they are not selected

    WebDriver driver;// we create this class instance at the class level
    //because we can use this class c=variable in the other test method

    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS );//putting implicit wait
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com");



    }

    @Test
    public void radioButtonTest(){
        WebElement createAccountButton= driver.findElement(By.linkText("Create New Account"));
        createAccountButton.click();

        WebElement maleButton= driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
        maleButton.click();

    }

}
