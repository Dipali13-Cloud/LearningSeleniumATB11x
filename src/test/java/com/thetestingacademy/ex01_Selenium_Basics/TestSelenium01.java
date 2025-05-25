package com.thetestingacademy.ex01_Selenium_Basics;

//import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestSelenium01 {

    @Test
    public void test_openVWOLoginPage() {
//        EdgeDriver edgeDriver = new EdgeDriver();
//        edgeDriver.get("https://app.vwo.com");
//        System.out.println(edgeDriver.getTitle());

        FirefoxDriver firefoxDriver = new FirefoxDriver();
        firefoxDriver.get("https://app.vwo.com");
        System.out.println(firefoxDriver.getTitle());
        firefoxDriver.quit();

    }
}
