package project2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class CityNotFoundTest {

    @Test
    public void checkMessageDisplayed() {

        //initialization
        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        String baseUrl = "http://www.goeuro.com";
        String cityDreamt = "Dreamcity";

        //launch Firefox webdriver and search for the city
        driver.get(baseUrl);
        driver.findElement(By.xpath(".//*[@id='from_filter']")).clear();
        driver.findElement(By.xpath(".//*[@id='from_filter']")).sendKeys(cityDreamt);
        driver.findElement(By.xpath(".//*[@id='from_filter']")).sendKeys(Keys.RETURN);

        //return true is a message has been displays
        if (driver.findElements(By.xpath(".//*[@id='search']/div[2]/div[1]/ul[1]/li") ).size() != 0) {
            System.out.println("True");
        }
        else {System.out.println("False");}

        //close the Firefox webdriver
        driver.close();
    }

}
