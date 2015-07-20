package project1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

// Created by Stefania Delprete on 07/07/15.

public class TitleTest {

    @Test
    public static void checkSpanishTitle() {
        // declaration and instantiation of objects/variables
        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        String baseUrl = "http://www.goeuro.es";
        String expectedTitle = "Tus billetes baratos de tren, AVE, autobús y avión online | GoEuro";
        String actualTitle = "";

        // launch Firefox and direct to the Base URL
        driver.get(baseUrl);

        // ger the actual value of the title
        actualTitle = driver.getTitle();

        // test the title is correct
        if (actualTitle.contentEquals(expectedTitle)) {
            System.out.println("The title is correct, test passed!");
        } else {
            System.out.println("Test failed, the actual title is: " + actualTitle);
        }

        // close Firefox
        driver.close();

        // exit the program explicitly
        System.exit(0);

    }
}