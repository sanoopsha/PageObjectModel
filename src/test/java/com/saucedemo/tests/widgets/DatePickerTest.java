package com.saucedemo.tests.widgets;

import com.demoqa.base.BaseTest;
import com.demoqa.pages.DatePickerPage;
import com.demoqa.pages.HomePage;
import com.demoqa.pages.WidgetsPage;
import org.testng.annotations.Test;

public class DatePickerTest extends BaseTest {
    @Test
    public void testDatePicker() throws InterruptedException {
        HomePage homePage = new HomePage();
        homePage.clickWidgetsCard();

        WidgetsPage widgetsPage = new WidgetsPage();
        widgetsPage.clickDatePickerCard();

        DatePickerPage datePickerPage = new DatePickerPage();
        datePickerPage.clickSelectDate();
        //datePickerPage.getDate();
        System.out.println(datePickerPage.getDate());
        datePickerPage.setDate("2022-03-15");
        datePickerPage.closeDatePickerOverlay();


        Thread.sleep(6000);


    }
}
