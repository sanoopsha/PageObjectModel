package com.demoqa.pages;

import com.base.BasePage;
import org.openqa.selenium.By;

import static utilities.JavaScriptUtility.scrollToElementJS;
import static utilities.JavaScriptUtility.setDateJS;

public class DatePickerPage extends BasePage {

    private By selectDateField = By.xpath("//input[@id='datePickerMonthYearInput']");
    private By dateAndTimeField = By.xpath("//input[@id='dateAndTimePickerInput']");
    private By datePickerOverlay = By.xpath("//div[text()='Date And Time']");


    public void clickSelectDate(){
        click(selectDateField);
    }

    public String getDate(){
        return find(selectDateField).getDomAttribute("value");
    }

    public String setDate(String date){
        setDateJS(dateAndTimeField,date);
        return date;

    }
    public void closeDatePickerOverlay(){
        scrollToElementJS(datePickerOverlay);
        click(datePickerOverlay);

    }

}
