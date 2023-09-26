package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class CommunityVote extends DriverSetUp {
    @Test
    public void TestCommunityPoll() throws InterruptedException {

        //Scroll Down
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,2000)");

        //Vote select
        WebElement voteSelect = driver.findElement(By.id("pollanswers-2"));
        voteSelect.click();
        Thread.sleep(2000);

        //Click Button
        WebElement vote_btn = driver.findElement(By.cssSelector("button[class='button-2 vote-poll-button']"));
        vote_btn.click();

        Thread.sleep(5000);

    }
}
