package com.demoqa.tests.part3.javascript;

import com.demoqa.base.BaseTest;
import com.demoqa.pages.HomePage;
import org.testng.annotations.Test;

public class JavaScriptTest extends BaseTest {

    @Test
    public void testScrollingToElement(){
        HomePage homePage = new HomePage();
        homePage.goToForms().clickPracticeForm();
    }
}
