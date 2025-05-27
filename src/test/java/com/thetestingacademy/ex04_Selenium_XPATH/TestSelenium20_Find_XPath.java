package com.thetestingacademy.ex04_Selenium_XPATH;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class TestSelenium20_Find_XPath {

    @Test
    public void test_Katalon() {

        WebDriver driver = new EdgeDriver();
        driver.get("https://katalon-demo-cura.herokuapp.com/");
        driver.manage().window().maximize();

        WebElement make_appointment_btn_xpath  = driver.findElement(By.xpath("//a[@id='btn-make-appointment']"));
        make_appointment_btn_xpath.click();

        WebElement username_input_box = driver.findElement(By.xpath("//input[@id=\"txt-username\"]"));
        username_input_box.sendKeys("John Doe");

        WebElement password_input_box = driver.findElement(By.xpath("//input[@id=\"txt-password\"]"));
        password_input_box.sendKeys("ThisIsNotAPassword");

        WebElement login_input_box = driver.findElement(By.xpath("//button[@id=\"btn-login\"]"));
        login_input_box.click();





    }
}
