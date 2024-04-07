package com.phonebook.tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateAccountTests extends TestBase{

    @Test(enabled = false)
    public void createNewAccountPositiveTest() {
//        Random random = new Random();
//        int i = random.nextInt(1000)+1000;
        //click on Login link
        click(By.cssSelector("[href='/login']"));
        //enter email
        //type(By.name("email"), "manuel" + i + "@gm.com");
        //enter password
        type(By.name("password"), "Manuel1234$");
        //click on Registration button
        click(By.cssSelector("[name='registration']"));
        //assert Sign Out button is present
        Assert.assertTrue(isElementPresent(By.xpath("//button[.='Sign Out']")));
    }

    @Test
    public void createNewAccountWithExistedEmailNegativeTest() {
        //click on Login link
        click(By.cssSelector("[href='/login']"));
        //enter email
        type(By.name("email"), "manuel@gm.com");
        //enter password
        type(By.name("password"), "Manuel1234$");
        //click on Registration button
        click(By.cssSelector("[name='registration']"));
        //assert Alert is present
        Assert.assertTrue(isAlertPresent());
    }

}

// 1. id
// 1.2 className(css .)
// 2. css
// 3. xPath
