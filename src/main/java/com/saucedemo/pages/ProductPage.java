package com.saucedemo.pages;

import com.base.BasePage;
import org.openqa.selenium.By;

public class ProductPage extends BasePage {

    private By productsHeader = By.xpath("//div[text()='Products']");

    public boolean isProductsHeaderDisplayed(){
        //return find(productsHeader).isDisplayed();
        return find(productsHeader).isDisplayed();

    }


}
