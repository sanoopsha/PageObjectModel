package com.saucedemo.tests.widgets;

import com.demoqa.base.BaseTest;
import com.demoqa.pages.HomePage;
import com.demoqa.pages.SelectMenuPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class SelectDropDownTest extends BaseTest {
    @Test
    public void testMultiSelectDropDown() throws InterruptedException {
        HomePage homePage = new HomePage();
        homePage.clickWidgetsCard();

        SelectMenuPage selectMenuPage = new SelectMenuPage();
        selectMenuPage.clickSelectMenuBtn();
        selectMenuPage.selectStandardMulti("Volvo");
        Thread.sleep(1000);
        selectMenuPage.selectStandardMulti(1);
        Thread.sleep(1000);
        selectMenuPage.selectStandardMulti("Audi");
        Thread.sleep(1000);
        selectMenuPage.selectStandardMulti(2);
        Thread.sleep(1000);
        selectMenuPage.deselectStandardMulti("saab");
        Thread.sleep(1000);
        List<String> actualSelectedOptions = selectMenuPage.getAllselectedStandardMulti();
        Assert.assertTrue(actualSelectedOptions.contains("Volvo"));
        Assert.assertFalse(actualSelectedOptions.contains("Saab"));
        Assert.assertTrue(actualSelectedOptions.contains("Opel"));
        Assert.assertTrue(actualSelectedOptions.contains("Audi"));




    }
}
