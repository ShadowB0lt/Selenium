package com.sparta.siq.bbcwebsite.seleniumconfig;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class SeleniumPropertiesReader {

    private String chromeDriverPath;
    private String firefoxDriverPath;
    private String seleniumPropertiesFilePath = "resources/selenium.properties";

    public SeleniumPropertiesReader()
    {
        Properties seleniumproperties = new Properties();
        try
        {
            seleniumproperties.load(new FileReader(seleniumPropertiesFilePath));

        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
        chromeDriverPath = seleniumproperties.getProperty("chromedriverpath");
        firefoxDriverPath = seleniumproperties.getProperty("firefixdriverpath");

    }

    public String getChromeDriverPath() {
        return chromeDriverPath;
    }

    public String getFirefoxDriverPath() {
        return firefoxDriverPath;
    }
}
