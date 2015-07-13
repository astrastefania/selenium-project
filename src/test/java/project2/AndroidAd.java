package project2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AndroidAd {

    public static void main(String[] args){

        // declare variables
        WebDriver driver = new FirefoxDriver();
        String baseUrl = "http://www.goeuro.com";

        // open Firefox and direct to goeuro.com
        driver.get(baseUrl);

        // click on the Android ads, using xPath
        driver.findElement(By.xpath(".//a[@data-mobile='android']")).click();

        // close Firefox
        driver.close();
    }
}
