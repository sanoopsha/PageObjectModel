package com.demoqa.pages;

import com.base.BasePage;
import org.openqa.selenium.By;

import static utilities.JavaScriptUtility.scrollToElementJS;

public class ElementsPage extends BasePage {

    private By webtableBtn = By.id("item-3");
    private By linkBtn = By.id("item-5");


    public WebtablesPage clickWebtableBtn(){
        scrollToElementJS(webtableBtn);
        click(webtableBtn);
        return new WebtablesPage();
    }

    public LinksPage clickLinkBtn(){
        scrollToElementJS(linkBtn);
        click(linkBtn);
        return new LinksPage();
    }







    }





