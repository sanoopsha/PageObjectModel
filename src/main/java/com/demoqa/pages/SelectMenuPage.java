package com.demoqa.pages;

import com.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import static utilities.DropDownUtility.*;
import static utilities.JavaScriptUtility.scrollToElementJS;

public class SelectMenuPage extends BasePage {

    private By selectMenuBtn = By.xpath("//span[text()='Select Menu']");
    private By standardMultiSelect = By.id("cars");

    public void clickSelectMenuBtn(){
        scrollToElementJS(selectMenuBtn);
        click(selectMenuBtn);
    }

    public void selectStandardMulti(String text){
        scrollToElementJS(standardMultiSelect);
        /*Select select = new Select(find(standardMultiSelect));
        select.selectByVisibleText(text);*/
        selectByVisibleText(standardMultiSelect, text);
    }

    public void selectStandardMulti(int index){
        scrollToElementJS(standardMultiSelect);
        selectByIndex(standardMultiSelect, index);
    }
    public void deselectStandardMulti(String value){
        scrollToElementJS(standardMultiSelect);
        deselectByValue(standardMultiSelect, value);
    }

    public List<String> getAllselectedStandardMulti(){
        scrollToElementJS(standardMultiSelect);
        return getAllSelectedOptions(standardMultiSelect);
    }

}
