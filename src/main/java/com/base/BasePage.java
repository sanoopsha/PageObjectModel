package com.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

    public static WebDriver driver;


    public void setDriver(WebDriver driver){
        BasePage.driver = driver;
    }



    protected WebElement find(By locator){
        return driver.findElement(locator);//driver.findElement(By.xpath()); in locator we can pass all 8 locator type
    }

    protected void typeText(By locator, String text){
        find(locator).clear();
        find(locator).sendKeys(text);
    }

    protected void click(By locator){
        find(locator).click();
    }
    protected void sendText(By locator, String text) {
        WebElement element = find(locator); // Locate the element
        element.clear(); // Clear any existing content
        element.sendKeys(text); // Input the new text
    }

    public static void delay(int milliseconds){
        try{
            Thread.sleep(milliseconds);
        } catch (InterruptedException exc) {
            exc.printStackTrace();
        }
    }


}
