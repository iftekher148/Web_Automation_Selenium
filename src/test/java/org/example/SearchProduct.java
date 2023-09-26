package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchProduct extends DriverSetUp{
    @Test
    public void TestSearchProduct() throws InterruptedException {

        //Search Product
        WebElement  searchBar = driver.findElement(By.cssSelector("form > input"));
        searchBar.sendKeys("Apple MacBook Pro 13-inch");
        Thread.sleep(2000);

        WebElement search_btn = driver.findElement(By.xpath("//button[@type='submit' and @class='button-1 search-box-button']"));
        System.out.println(search_btn.getText());

        WebElement click_btn = driver.findElement(By.cssSelector("button[type='submit'][class='button-1 search-box-button']"));
        click_btn.click();

        WebElement linkClick = driver.findElement(By.xpath("//a[@href='/apple-macbook-pro-13-inch']"));
        linkClick.click();
        Thread.sleep(5000);

        // Second cart button
        WebElement addSecond_btn = driver.findElement(By.xpath("//div/button[starts-with(@class,'button-1 add-to-cart-')]"));
        addSecond_btn.click();

        Thread.sleep(500);

        WebElement shoppingCart = driver.findElement(By.linkText("shopping cart"));
        shoppingCart.click();
        Thread.sleep(500);


        String totalUnitPrice = driver.findElement(By.xpath("//tr/td[5]/preceding-sibling::td[1]")).getText();
        String totalActualPrice = driver.findElement(By.xpath("//tr/td[5]/following-sibling::td[1]")).getText();

        //Test Case
        Assert.assertEquals(totalUnitPrice, "$1,800.00");
        Assert.assertEquals(totalActualPrice,"$3,600.00");
    }
}
