package com.thetestingacademy.ex05_Selenium_Waits;

import io.qameta.allure.Description;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestSelenium22_Waits {
    @Description("Verify Ebay Print the prices (iMac)")
    @Test

    public void test_verify_print_imac_price(){

        EdgeDriver edgeDriver = new EdgeDriver();
        edgeDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        edgeDriver.get("https://app.vwo.com");

    }
}
