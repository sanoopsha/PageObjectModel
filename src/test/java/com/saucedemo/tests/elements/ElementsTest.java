package com.saucedemo.tests.elements;

import com.demoqa.base.BaseTest;
import com.demoqa.pages.ElementsPage;
import com.demoqa.pages.HomePage;
import com.demoqa.pages.WebtablesPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ElementsTest extends BaseTest {
   @Test
    public void webtablesTest(){

       HomePage homePage = new HomePage();
       homePage.clickElementsCard();

       ElementsPage elementsPage = new ElementsPage();
       elementsPage.clickWebtableBtn();

       WebtablesPage webtablesPage = new WebtablesPage();
       webtablesPage.clickEditRecordBtn();
       webtablesPage.setAge("50");
       webtablesPage.clickSubmitBtn();
       String actualAge = webtablesPage.getTableAge();
       String expectedAge = "50";
       Assert.assertEquals(actualAge,expectedAge);


   }


}
