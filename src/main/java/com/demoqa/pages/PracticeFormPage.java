package com.demoqa.pages;

import com.base.BasePage;
import org.openqa.selenium.By;

import static utilities.JavaScriptUtility.scrollToElementJS;

public class PracticeFormPage extends BasePage {

    private By femaleRadioButton = By.xpath("//label[text()='Female']");
    private By sportsCheckbox = By.xpath("//label[text()='Sports']");
    private By readingCheckbox = By.xpath("//label[text()='Reading']");
    private By musicCheckbox = By.xpath("//label[text()='Music']");
    public void clickFemaleRadioButton(){
        scrollToElementJS(femaleRadioButton);
        click(femaleRadioButton);

    }

    public void clickSportsCheckbox() {
        //! means not
        if (!find(sportsCheckbox).isSelected()) { //so if the sportscheckbox is not selected
            scrollToElementJS(sportsCheckbox); //scroll to the element
            click(sportsCheckbox);//and click th element

        }
    }

        public void clickReadingCheckbox(){
            //! means not
            if(!find(readingCheckbox).isSelected()){ //so if the sportscheckbox is not selected
                scrollToElementJS(readingCheckbox); //scroll to the element
                click(readingCheckbox);//and click th element

            }



    }
    public void unClickSportsCheckbox(){
        find(sportsCheckbox).click();
    }

   /* public void unClickSportsCheckbox(){
        if(find(sportsCheckbox).isSelected()){ //so if the sportscheckbox is selected
            scrollToElementJS(sportsCheckbox); //scroll to the element
            click(sportsCheckbox);//and click the element
 }*/



    /*public boolean isReadingCheckboxSelected(){
        boolean result = find(readingCheckbox).isSelected();
        System.out.println(result);
        return result;
    }*/
    public boolean isSportsCheckboxSelected() {
        return find(sportsCheckbox).isSelected();

    }

    public boolean isReadingCheckboxSelected() {
        return !find(readingCheckbox).isSelected();

        }


}
