package com.phonebook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends TestBase{

    @Test
    public void loginPositiveTest() {
        //click on Login link
        clickOnLoginLink();
        //enter email
        fillLoginRegisterForm(new User().setEmail("yelunina@ukr.net").setPassword("Yelunina1234$"));
        //click on Login button
        clickOnLoginButton();
        //assert Sign out button is present
        Assert.assertTrue(isSignOutButtonPresent());
    }
    @Test
    public void loginNegativeTestWithoutEmail() {
        clickOnLoginLink();
        fillLoginRegisterForm(new User().setPassword("Yelunina1234$"));
        clickOnLoginButton();
        Assert.assertTrue(isAlertPresent());
    }

}
