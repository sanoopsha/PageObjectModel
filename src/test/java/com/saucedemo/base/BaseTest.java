package com.saucedemo.base;

import com.base.BasePage;
import com.saucedemo.pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {

    protected WebDriver driver;
    protected BasePage basePage; //BasePage is an object reference
    protected LoginPage loginPage;//Each test-script have access to LoginPage after inheriting the BaseTest
    private String url = "https://www.saucedemo.com/v1/";

    @BeforeClass
    public void setUp(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
        basePage = new BasePage(); //creating base page instance/object
        basePage.setDriver(driver);//we are setting the driver from BasePage
        loginPage = new LoginPage();//creating login page instance/object


    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}
