package project1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

// Created by Stefania Delprete on 07/07/15.

public class GoEuroTest {

    public static void main(String[] args) {
        // declaration and instantiation of objects/variables
        WebDriver driver = new FirefoxDriver();
        String baseUrl = "http://www.goeuro.es";
        String expectedTitle = "Tus billetes baratos de tren, autobús y avión online | GoEuro";
        String actualTitle = "";

        // launch Firefox and direct to the Base URL
        driver.get(baseUrl);

        // ger the actual value of the title
        actualTitle = driver.getTitle();

        // test the title is correct
        if (actualTitle.contentEquals(expectedTitle)) {
            System.out.println("GoEuro test passed!");
        } else {
            System.out.println("GoEuro test failed, the actual title is: " + actualTitle);
        }

        // close Firefox
        driver.close();

        // exit the program explicitly
        System.exit(0);

    }
}