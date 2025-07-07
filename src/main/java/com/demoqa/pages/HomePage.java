package com.demoqa.pages;

import com.base.BasePage;
import org.openqa.selenium.By;

import static utilities.JavaScriptUtility.scrollToElementJS;

public class HomePage extends BasePage {

    private By formsCard = By.xpath("(//h5[normalize-space(text()='Forms')])[2]");
    private By elementsCard = By.xpath("//h5[text()='Elements']");
    private By widgetsCard = By.xpath("//h5[text()='Widgets']");

    public FormsPage goToForms(){
        scrollToElementJS(formsCard);
       click(formsCard);
       return new FormsPage();
    }

    public ElementsPage clickElementsCard(){
        scrollToElementJS(elementsCard);
        find(elementsCard).click();
        return  new ElementsPage();
    }

    public WidgetsPage clickWidgetsCard(){
        scrollToElementJS(widgetsCard);
        find(widgetsCard).click();
        return  new WidgetsPage();
    }
}
