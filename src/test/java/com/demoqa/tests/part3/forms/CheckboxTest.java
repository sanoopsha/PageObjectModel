package com.demoqa.tests.part3.forms;

import com.demoqa.base.BaseTest;
import com.demoqa.pages.FormsPage;
import com.demoqa.pages.HomePage;
import com.demoqa.pages.PracticeFormPage;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;


public class CheckboxTest extends BaseTest {
   @Test
    public void testCheckbox()  {

       HomePage homePage = new HomePage();
       homePage.goToForms();

       FormsPage formsPage = new FormsPage();
       formsPage.clickPracticeForm();

       PracticeFormPage practiceFormPage = new PracticeFormPage();
       practiceFormPage.clickFemaleRadioButton();
       practiceFormPage.clickSportsCheckbox();
       practiceFormPage.clickReadingCheckbox();
       practiceFormPage.unClickSportsCheckbox();
       boolean sportsCheckboxNotSelected = practiceFormPage.isSportsCheckboxSelected();
      System.out.println("sports"+sportsCheckboxNotSelected);
       Assert.assertFalse(sportsCheckboxNotSelected,"Sports Checkbox Is Selected");
       boolean readingCheckboxSelected = practiceFormPage.isReadingCheckboxSelected();
      System.out.println("read"+readingCheckboxSelected);
       Assert.assertTrue(readingCheckboxSelected,"Reading Checkbox Is Not Selected");



   }
}
