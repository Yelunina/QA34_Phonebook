package com.phonebook.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DeleteContactTests extends TestBase {
    @BeforeMethod
    public void ensurePrecondition() {
        clickOnLoginLink();
        fillLoginRegisterForm(new User().setEmail("yelunina@ukr.net").setPassword("Yelunina1234$"));
        clickOnLoginButton();

        clickOnAddLink();
        fillAddContactForm(new Contact()
                .setName("Iryna")
                .setLastName("Yelunina")
                .setPhone("1234567890")
                .setEmail("yelunina@ukr.net")
                .setAddress("Kyiv")
                .setDescription("student"));
        clickOnSaveButton();
    }
    @Test
    public void deleteContactPositiveTest(){
        int sizeBefore = sizeOfContacts();
        removeContact();

        pause(500);
        int sizeAfter = sizeOfContacts();
        Assert.assertEquals(sizeAfter,sizeBefore-1);

    }

}
