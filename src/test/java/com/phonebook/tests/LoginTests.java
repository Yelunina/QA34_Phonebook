package com.phonebook.tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends TestBase{

    @Test
    public void loginPositiveTest() {
        //click on Login link
        click(By.cssSelector("[href='/login']"));
        //enter email
        type(By.name("email"), "manuel@gm.com");
        //enter password
        type(By.name("password"), "Manuel1234$");
        //click on Login button
        click(By.cssSelector("[name='login']"));
        //assert Sign out button is present
        Assert.assertTrue(isElementPresent(By.xpath("//button[.='Sign Out']")));
    }
}
