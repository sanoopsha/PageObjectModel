package com.demoqa.tests.part3.forms;

import com.demoqa.base.BaseTest;
import com.demoqa.pages.FormsPage;
import com.demoqa.pages.HomePage;
import com.demoqa.pages.PracticeFormPage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class RadioButtonTest extends BaseTest {

    @Test

    public void testRadioButton() throws InterruptedException {

        HomePage homePage = new HomePage();
        homePage.goToForms();

        FormsPage formsPage = new FormsPage();
        formsPage.clickPracticeForm();

        PracticeFormPage practiceFormPage = new PracticeFormPage();
        practiceFormPage.clickFemaleRadioButton();







    }
}
