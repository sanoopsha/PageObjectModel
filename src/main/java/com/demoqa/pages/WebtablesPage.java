package com.demoqa.pages;

import com.base.BasePage;
import org.openqa.selenium.By;

public class WebtablesPage extends BasePage {

    private By editRecordBtn = By.id("edit-record-1");
    private By ageColoum = By.id("age");
    private By submitBtn = By.id("submit");
    private By tableage = By.xpath("(//div[@role='gridcell'])[3]");

    public void clickEditRecordBtn(){
    click(editRecordBtn);

    }

    public void setAge(String age) {
        click(ageColoum);
        sendText(ageColoum, age);
    }
    public void clickSubmitBtn(){
        click(submitBtn);
    }

    public String getTableAge(){
        return find(tableage).getText();

    }


}
