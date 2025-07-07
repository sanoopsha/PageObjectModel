package com.saucedemo.pages;

import com.base.BasePage;
import org.openqa.selenium.By;

public class LoginPage extends BasePage {

    private By usernameField = By.xpath("//input[@id='user-name']");
    private By passwordField = By.xpath("//input[@id='password']");
    private By loginButton = By.xpath("//input[@id='login-button']");
    private By errorMessage = By.xpath("//h3[normalize-space(text() ='Epic sadface:')]");

    public void typeUsername(String username){// because of these public methods is the reason that
        //we are able to access the usernameField (which is a private member) from the testscript
        typeText(usernameField, username);
    }

    public void typePassword(String password){

        typeText(passwordField, password);
    }

    public ProductPage clickLoginButton(){
        click(loginButton);
        return new ProductPage();
    }

    public ProductPage logIntoApplication(String username, String password){
        typeUsername(username);
        typePassword(password);
        return clickLoginButton();
    }

    public String getErrorMessage(){

        return find(errorMessage).getText();
    }



}
