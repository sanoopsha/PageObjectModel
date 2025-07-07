package com.saucedemo.tests.elements;

import com.demoqa.base.BaseTest;
import com.demoqa.pages.ElementsPage;
import com.demoqa.pages.HomePage;
import com.demoqa.pages.LinksPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LinksTest extends BaseTest {
    @Test
    public void testLinks(){

        HomePage homePage = new HomePage();
        homePage.clickElementsCard();

        ElementsPage elementsPage = new ElementsPage();
        elementsPage.clickLinkBtn();

        LinksPage linksPage = new LinksPage();
        linksPage.clickBadRequestLink();
        String actualResponse = linksPage.getResponse();
        Assert.assertTrue(actualResponse.contains("400")
                && actualResponse.contains("Bad Request"),
                "\n Actual Response ("+actualResponse+
                ")\n Does Not Contains '400' and 'Bad Request'");




    }
}
