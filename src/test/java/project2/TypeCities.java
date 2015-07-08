package project2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TypeCities {
    public static void main(String[] args) {
        // declare variables
        WebDriver driver = new FirefoxDriver();
        String baseUrl = "http://www.goeuro.com";

        // launch Firefox and direct to goeuro.com
        driver.get(baseUrl);

        // Find the element of the departure city by xPath and type a value
        driver.findElement(By.xpath(".//*[@id='from_filter']")).clear();
        driver.findElement(By.xpath(".//*[@id='from_filter']")).sendKeys("Barcelona");

        // Type a value in the arrival city, using xPath
        driver.findElement(By.xpath(".//*[@id='to_filter']")).clear();
        driver.findElement(By.xpath(".//*[@id='to_filter']")).sendKeys("London");

    }
}
