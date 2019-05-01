package com.sparta.siq.bbcwebsite.seleniumconfig;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class SeleniumConfig {


    private WebDriver driver;

    private SeleniumPropertiesReader seleniumPropertiesReader = new SeleniumPropertiesReader();

    public SeleniumConfig(String browserName)
    {
        if(browserName.equalsIgnoreCase("chrome"))
        {
            System.setProperty("webdriver.chrome.driver",seleniumPropertiesReader.getChromeDriverPath());
            this.driver = new ChromeDriver();
        } else if (browserName.equalsIgnoreCase("firefox"))
        {
            System.setProperty("webdriver.gecko.driver",seleniumPropertiesReader.getFirefoxDriverPath());
            this.driver = new FirefoxDriver();
        }
        this.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        this.driver.manage().window().setSize(new Dimension(400,650));

    }

    public WebDriver getDriver() {
        return driver;
    }
}
