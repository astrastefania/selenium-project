package project2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class TypeCities {
    public static void main(String[] args) {
        // declare variables
        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        String baseUrl = "http://www.goeuro.com";
        String fromCity = "Barcelona";
        String toCity = "London";

        // launch Firefox and direct to goeuro.com
        driver.get(baseUrl);

        // find the element of the departure city by xPath and type a value
        driver.findElement(By.xpath(".//*[@id='from_filter']")).clear();
        driver.findElement(By.xpath(".//*[@id='from_filter']")).sendKeys(fromCity);
        driver.findElement(By.xpath(String.format(".//*[contains(text(), '%s')]", fromCity))).click();

        // type a value in the arrival city, using xPath
        driver.findElement(By.xpath(".//*[@id='to_filter']")).clear();
        driver.findElement(By.xpath(".//*[@id='to_filter']")).sendKeys(toCity);
        driver.findElement(By.xpath(String.format(".//*[contains(text(), '%s')]", toCity))).click();

        // close Firefox
        driver.close();

    }
}
