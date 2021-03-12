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

public class CheckBox {
// Create a class : CheckBox
// Create main method and complete the following task.
// Go to https://the-internet.herokuapp.com/checkboxes
// Locate the elements of checkboxes
// Then click on checkbox1 if box is not selected
// Then click on checkbox2 if box is not selected

    WebDriver driver;

    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/checkboxes");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS );//putting implicit wait
        driver.manage().window().maximize();

    }

    @Test
    public void checkBoxText() throws InterruptedException {
        WebElement checkbox1 = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
        WebElement checkbox2 = driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));
        // Then click on checkbox1 if box is not selected

        //How do you know if a checkbox is selected or not?
        //Answer is selected(); method====> it is similar to display() method

        Thread.sleep(5000);

        //Assert.assertTrue(checkbox1.isSelected());//fail because it is not saying selected or not,we dont use this,we use selected()
        //Assert.assertTrue(checkbox2.isSelected());
        if (!checkbox1.isSelected()){  //means==> if it is not selected
            checkbox1.click();
        }
        Thread.sleep(5000);
        // Then click on checkbox2 if box is not selected
        if (!checkbox2.isSelected()){
            checkbox2.click();
        }



    }
        @After
        public void tearDown(){
            driver.close();
        }


}
