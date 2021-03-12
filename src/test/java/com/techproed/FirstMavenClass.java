package com.techproed;

import com.github.javafaker.Faker;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import sun.security.krb5.KdcComm;

public class FirstMavenClass {
    public static void main(String[] args) {
        //STEP 1:Create WebDriverManager
        WebDriverManager.chromedriver().setup();

        //STEP 2:Create ChromeDriver
        WebDriver driver= new ChromeDriver();

        //STEP 3:Go to the web page that you want
        driver.get("https://www.google.com");

        //Search for a random name
        Faker faker = new Faker();
        WebElement searchBox=driver.findElement(By.name("q")); //<input class="gLFyf gsfi" maxlength="2048" name="q" type="text" jsaction="paste:puy29d" aria-autocomplete="both" aria-haspopup="false" autocapitalize="off" autocomplete="off" autocorrect="off" autofocus="" role="combobox" spellcheck="false" title="Suche" value="" aria-label="Suche" data-ved="0ahUKEwik88CQrdzrAhXxuXEKHSd1Ao4Q39UDCAY">
        //searchBox.sendKeys(faker.name().fullName()+ Keys.ENTER);

        searchBox.sendKeys(faker.name().fullName()+ Keys.ENTER);



        //and check how many results are there?



        //How can we get fake data with maven?---> we have java faker to get some fake data



    }
}
