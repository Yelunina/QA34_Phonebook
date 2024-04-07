package com.phonebook.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class HomePageTests extends TestBase {

    @Test
    public void isHomeComponentPresentTest() {
        // driver.findElement(By.cssSelector("div:nth-child(2) div h1"));
        // System.out.println("Home component is " + isHomeComponentPresent());
        Assert.assertTrue(isHomeComponentPresent());

    }

       public boolean isHomeComponentPresent() {
        return driver.findElements(By.cssSelector("div:nth-child(2) div h1")).size() > 0;
    }

}

