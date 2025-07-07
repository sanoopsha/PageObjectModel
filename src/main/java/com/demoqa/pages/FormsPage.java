package com.demoqa.pages;
import com.base.BasePage;
import org.openqa.selenium.By;

import static utilities.JavaScriptUtility.scrollToElementJS;

public class FormsPage extends BasePage {

    private By practiceFormMenuItem = By.xpath("//li[@id='item-0']/span[text()='Practice Form']");


    public PracticeFormPage clickPracticeForm(){
        scrollToElementJS(practiceFormMenuItem);
        click(practiceFormMenuItem);
        return new PracticeFormPage();
    }





}
