package com.sparta.siq;

import com.sparta.siq.bbcwebsite.Bbcwebsite;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.sql.SQLOutput;


public class App 
{
    public static void main( String[] args )
    {
//        chromeDriverTesting();
//        firefoxDriverTesting();
        System.setProperty("webdriver.chrome.driver","C:\\Users\\SIqbal\\Documents\\chromedriver_win32\\chromedriver.exe");
        Bbcwebsite bbcwebsite = new Bbcwebsite(new ChromeDriver());
        bbcwebsite.homePage().goToHomePage().clickSignInLink();
        bbcwebsite.loginpage().inputUserName("fdfds").inputPassword("fdfsdf");
        bbcwebsite.quitDriver();
    }

    public static void chromeDriverTesting()
    {

        WebDriver chromeDriver = new ChromeDriver();
        chromeDriver.navigate().to("https://www.bbc.co.uk/news");
        chromeDriver.findElement(By.id("idcta-username")).click();
        System.out.println(chromeDriver.getCurrentUrl());
        System.out.println(chromeDriver.findElement(By.id("user-identifier-input")).isDisplayed());
        chromeDriver.findElement(By.id("user-identifier-input")).sendKeys("ndsafjea@2@gmail.com");
        chromeDriver.findElement(By.id("password-input")).sendKeys("fasfginegoi");
        chromeDriver.findElement(By.id("submit-button")).click();
        System.out.println(chromeDriver.findElement(By.id("form-message-username")).getText());
        System.out.println(chromeDriver.findElement(By.id("form-message-password")).getText());
        chromeDriver.quit();
    }

    public static void firefoxDriverTesting()
    {
        System.setProperty("webdriver.gecko.driver","C:\\Users\\SIqbal\\Documents\\geckodriver-v0.24.0-win64\\geckodriver.exe");
        //System.setProperty(FirefoxDriver.SystemProperty.DRIVER_USE_MARIONETTE,"true");
        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE,"/dev/null");
//        DesiredCapabilities capabilities = DesiredCapabilities.firefox();
//        capabilities.setCapability("marionette",true);
        WebDriver fireFoxDriver = new FirefoxDriver();
        fireFoxDriver.navigate().to("https://www.bbc.co.uk/news");
        fireFoxDriver.findElement(By.id("idcta-username")).click();
        System.out.println(fireFoxDriver.getCurrentUrl());
        fireFoxDriver.quit();
    }
}
