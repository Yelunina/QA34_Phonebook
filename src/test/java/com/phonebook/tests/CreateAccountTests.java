package com.phonebook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateAccountTests extends TestBase{

    @Test(enabled = false)
    public void createNewAccountPositiveTest() {
//        Random random = new Random();
//        int i = random.nextInt(1000)+1000;
        //click on Login link
        clickOnLoginLink();

        //enter email
//        driver.findElement(By.name("email")).click();
//        driver.findElement(By.name("email")).clear();
//        driver.findElement(By.name("email")).sendKeys("yelunina@ukr.net");
        fillLoginRegisterForm(new User().setEmail("yelunina@ukr.net").setPassword("Yelunina1234$"));
        //type(By.name("password"), "Manuel1234$");

        //click on Registration button
        //driver.findElement(By.cssSelector("[name='registration']")).click();
        clickOnRegistrationButton();
        //assert Sign Out button is present
        Assert.assertTrue(isSignOutButtonPresent());

//        clickOnLoginLink();
//        fillLoginRegisterForm(new User().setEmail("manuel@gm.com")
//                .setPassword("Manuel1234$"));
//        clickOnRegistrationButton();
//        Assert.assertTrue(isSignOutButtonPresent());
    }

    @Test
    public void createNewAccountWithExistedEmailNegativeTest() {
        //click on Login link
        clickOnLoginLink();
        //enter email
        //enter password
        fillLoginRegisterForm(new User().setEmail("yelunina@ukr.net").setPassword("Yelunina1234$"));
        //click on Registration button
        clickOnRegistrationButton();
        //assert Alert is present
        Assert.assertTrue(isAlertPresent());

//        clickOnLoginLink();
//        fillLoginRegisterForm(new User().setEmail("manuel@gm.com")
//                .setPassword("Manuel1234$"));
//        clickOnRegistrationButton();
//        Assert.assertTrue(isAlertPresent());
    }

}

// 1. id
// 1.2 className(css .)
// 2. css
// 3. xPath
