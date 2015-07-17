package project2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class CityNotFoundTest {

    WebDriver driver;

    @Test
    public void checkMessageDisplayed() {

        //initialization
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        String baseUrl = "http://www.goeuro.com";
        String cityDreamt = "Dreamcity";

        //launch Firefox webdriver and search for the city
        driver.get(baseUrl);
        driver.findElement(By.xpath(".//*[@id='from_filter']")).clear();
        driver.findElement(By.xpath(".//*[@id='from_filter']")).sendKeys(cityDreamt);
        driver.findElement(By.xpath(".//*[@id='from_filter']")).sendKeys(Keys.RETURN);

        //check if the message has been displays
        if (isElementPresent(".//*[@id='search']/div[2]/div[1]/ul[1]/li")==true){
            System.out.println("The message for a missing location has been displayed.");}
        else System.out.println("There's no message!");

        //close the Firefox webdriver
        driver.close();
    }

    public boolean isElementPresent(String xpath){
        return driver.findElements(By.xpath(xpath) ).size() !=0;
    }
}