package com.sparta.siq.bbcwebsite;

import com.sparta.siq.bbcwebsite.bbcpageobjects.HomePage;
import com.sparta.siq.bbcwebsite.bbcpageobjects.LoginPage;
import org.openqa.selenium.WebDriver;

public class Bbcwebsite {


    private final WebDriver driver;

    public Bbcwebsite(WebDriver webDriver)
    {
        this.driver = webDriver;
    }

   public HomePage homePage()
   {
       return new HomePage(driver);
   }

   public LoginPage loginpage()
   {
       return new LoginPage(driver);
   }

   public void quitDriver()
   {
       driver.quit();
   }

}
