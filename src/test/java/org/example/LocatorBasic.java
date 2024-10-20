package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class LocatorBasic extends BrowserSetup{

    @Test
    public void testElement() throws InterruptedException {
        browser.get("https://www.google.com/");
        WebElement search_button;
        search_button = browser.findElement(By.id("APjFqb"));
        search_button.sendKeys("Facebook");
        search_button.submit();
        WebElement facebook_button;
        facebook_button = browser.findElement(By.linkText("Facebook Login"));
        facebook_button.click();
        WebElement email_field;
        email_field = browser.findElement(By.name("email"));
        email_field.sendKeys("mail@gmail.com");
        WebElement password_field;
        password_field = browser.findElement(By.name("pass"));
        password_field.sendKeys("pass12345");
        password_field.submit();
        Thread.sleep(15000);

    }
}