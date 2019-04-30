package com.sparta.siq.bbcwebsite.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.sql.Driver;

public class LoginPage {

    private WebDriver driver;

    private String loginPageURL = "https://account.bbc.com/signin";
    private By userField = By.id("user-identifier-input");
    private By passField = By.id("password-input");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    private WebElement findElement(By element) {
        return driver.findElement(element);
    }

    public void goToSignInPage() {
        driver.navigate().to(loginPageURL);
    }

    public LoginPage inputUserName(String userName) {
        findElement(userField).sendKeys(userName);
        return this;
    }

    public LoginPage inputPassword(String password) {
        findElement(passField).sendKeys(password);
        return this;
    }
}
