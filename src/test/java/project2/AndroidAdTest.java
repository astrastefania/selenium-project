package project2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class AndroidAdTest {

    @Test
    public void checkAndroidAdLink(){

        // declare variables
        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        String baseUrl = "http://www.goeuro.com";

        // open Firefox and direct to goeuro.com
        driver.get(baseUrl);

        // click on the Android ads, using xPath
        driver.findElement(By.xpath(".//a[@data-mobile='android']")).click();

        driver.quit();
    }
}
