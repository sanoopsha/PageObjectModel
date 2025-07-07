package com.demoqa.pages;

import com.base.BasePage;
import org.openqa.selenium.By;

import static utilities.JavaScriptUtility.scrollToElementJS;

public class WidgetsPage extends BasePage {

    private By datePickerCard = By.xpath("//span[text()='Date Picker']");

    public DatePickerPage clickDatePickerCard(){
        scrollToElementJS(datePickerCard);
        click(datePickerCard);
        return new DatePickerPage();
    }
}
