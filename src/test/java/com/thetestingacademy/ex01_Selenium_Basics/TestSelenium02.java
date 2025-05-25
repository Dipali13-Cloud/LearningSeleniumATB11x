package com.thetestingacademy.ex01_Selenium_Basics;

import io.qameta.allure.Description;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium02 {

    @Description("Open the app.vwo.com and verify the title!")
    @Test

    public void test_Selenium02(){

        // Open the URL
        EdgeDriver edgeDriver = new EdgeDriver();
        // new EdgeDriver(); -> POST Request(Browser Driver) (localhost:XXXXX),
        // Create New Session Endpoint - 16 digit Unique ID is also created.

        // Navigate the URL -> HTTP GET the URL
        edgeDriver.get("https://app.vwo.com");

        // Assert the URL - Validation - TestNG Assertions
        Assert.assertEquals(edgeDriver.getCurrentUrl(),"https://app.vwo.com/#/login");

        // Close the session!
        edgeDriver.quit();


    }
}
