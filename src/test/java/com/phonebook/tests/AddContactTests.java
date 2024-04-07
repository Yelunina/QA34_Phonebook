package com.phonebook.tests;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddContactTests extends TestBase{

    @BeforeMethod
    public void ensurePrecondition() {
        click(By.cssSelector("[href='/login']"));
        type(By.name("email"), "manuel@gm.com");
        type(By.name("password"), "Manuel1234$");
        click(By.cssSelector("[name='login']"));
    }

    @Test
    public void addContactPositiveTest() {
        //click on Add link
        click(By.cssSelector("[href='/add']"));
        //enter name
        type(By.cssSelector("input:nth-child(1)"),"Karl");
        //enter surname
        type(By.cssSelector("input:nth-child(2)"),"Adam");
        //enter phone
        type(By.cssSelector("input:nth-child(3)"),"1234567890");
        //enter email
        type(By.cssSelector("input:nth-child(4)"),"adam@gm.com");
        //enter address
        type(By.cssSelector("input:nth-child(5)"),"Berlin");
        //enter description
        type(By.cssSelector("input:nth-child(6)"),"goalkeeper");
        //click on Save button
        //assert Contact is added by text
    }
}
