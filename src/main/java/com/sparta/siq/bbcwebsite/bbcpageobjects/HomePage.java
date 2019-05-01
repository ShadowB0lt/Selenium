package com.sparta.siq.bbcwebsite.bbcpageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;

    private final String homePageURL = "https://www.bbc.co.uk/";

    //Attributes of the page
    private final By signInLink = By.id("idcta-link");

    //news
    //sport
    //cbbc
    //more
    //more//more

    public HomePage(WebDriver driver)
    {
        this.driver = driver;
    }

    public HomePage goToHomePage()
    {
       driver.navigate().to(homePageURL);
       return this;
    }

    public HomePage clickSignInLink()
    {
        driver.findElement(signInLink).click();
        return this;
    }


}
