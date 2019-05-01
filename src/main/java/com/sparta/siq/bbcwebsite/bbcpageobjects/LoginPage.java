package com.sparta.siq.bbcwebsite.bbcpageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

    private WebDriver driver;

    private String loginPageURL = "https://account.bbc.com/signin";
    private By userField = By.id("user-identifier-input");
    private By passField = By.id("password-input");
    private By signInButtonID = By.id("submit-button");
    private By errorMessageClass = By.className("form-message__text");

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

    public LoginPage clickSignIn()
    {
        driver.findElement(signInButtonID).click();
        return this;
    }

    public String getErrorMessage()
    {
        return findElement(errorMessageClass).getText();
    }



}
