package com.demoqa.base;

import com.base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import static com.base.BasePage.delay;
import static utilities.Utility.setUtilityDriver;

public class BaseTest {

    private WebDriver driver; //declaration of webdriver
    protected BasePage basePage;
    private String DemoQa_Url = "https://demoqa.com/";

    @BeforeClass
    public void setUp(){
        driver = new ChromeDriver(); //initilization/object creation of webdriver
        driver.manage().window().maximize();
    }

    @BeforeMethod
    public void loadApplication(){
        driver.get(DemoQa_Url);
        basePage = new BasePage();
        basePage.setDriver(driver);// giving the driver from this class to basepage class
        setUtilityDriver();
    }

    @AfterClass
    public void tearDown(){
        delay(3000);
        driver.quit();
    }

}
