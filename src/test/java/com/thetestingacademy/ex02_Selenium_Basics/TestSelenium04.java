package com.thetestingacademy.ex02_Selenium_Basics;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TestSelenium04 {

    // Webdriver hierarchy

    // SearchContext(I) -> (2) -> WebDriver(I)( 10) -> RemoteWebDriver(C) (15)
    //        //// -> ChromiumDriver(C) 25 -> EdgeDriver(C) (45)


    // SearchContext - Interface - findElement, and findElements - GGF
    // WebDriver - Interface - some incomplete functions - GF
    // RemoteWebDriver - Class- It also has some functions - F
    // ChromeDriver, FirefoxDriver, EdgeDriver, SafariDriver, InternetExplorerDriver  Class - S

    public static void main(String[] args) {
//        SearchContext driver = new EdgeDriver();
//        SearchContext driver1 = new ChromeDriver();
//        SearchContext driver2 = new FirefoxDriver();
//        SearchContext driver3 = new InternetExplorerDriver();
//
//        WebDriver drive4 = new ChromeDriver();
//        RemoteWebDriver driver5 = new ChromeDriver();
//        ChromeDriver driver6 = new ChromeDriver();


        // Scenarios
        // 1. Do want to run on  Chrome or Edge?
        // ChromeDriver driver7 = new ChromeDriver();

        // 2  Do you want to run on Chrome then change to Edge ?
        WebDriver driver8 = new ChromeDriver();
        driver8 = new EdgeDriver();            // 97%
        driver8 = new FirefoxDriver();         // 97%

        // 3. do you want to run on multiple browsers, aws machine, ? 2%
        // RemoteWebDriver driver (with GRID) - Advance (Last 2 Sessions)



    }
}
