package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.TopManuPage;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TopManuTest extends BaseTest
{
    TopManuPage topMenu = new TopManuPage();

    @Test
    public void verifyPageNavigation() {
        topMenu.clickOnComputerMenu();
        String actualResult = topMenu.getComputerText();
        String expectedText = "Computers";
        Assert.assertEquals(actualResult, expectedText);
    }
}
