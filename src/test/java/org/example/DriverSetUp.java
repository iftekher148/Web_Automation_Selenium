package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class DriverSetUp {
public WebDriver driver;
@BeforeSuite
    public WebDriver setupDriver(){
        driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
        return driver;
    }


@AfterSuite
    public void closeDriver(){
        driver.close();
    }
}
