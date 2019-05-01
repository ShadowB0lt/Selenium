package com.sparta.siq;

import static org.junit.Assert.assertTrue;

import com.sparta.siq.bbcwebsite.Bbcwebsite;
import com.sparta.siq.bbcwebsite.seleniumconfig.SeleniumConfig;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class LoginPageTest
{

    private static Bbcwebsite bbcwebsite;
    @BeforeClass
    public static void setup()
    {
        bbcwebsite = new Bbcwebsite(new SeleniumConfig("chrome").getDriver());
    }

    @Test
    public void ErrorMessageDoubleAtEmailTest()
    {
        bbcwebsite.homePage().goToHomePage().clickSignInLink();
        bbcwebsite.loginpage().inputUserName("fkejbfkje@@fsadfda.com").clickSignIn();
//      System.out.println(bbcwebsite.loginpage().getErrorMessage());
        Assert.assertEquals(bbcwebsite.loginpage().getErrorMessage(),"Sorry, that email doesn’t look right. Please check it's a proper email.");
    }

    @AfterClass
    public static void teardown()
    {
        bbcwebsite.quitDriver();
    }
}
