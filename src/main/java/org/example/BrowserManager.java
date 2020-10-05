package org.example;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.concurrent.TimeUnit;

public class BrowserManager extends BasePage
{

    //BrowserManager is sub class of BasePage class


    public void setChromeBrowser(){
        System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\BrowserDriver\\chromedriver.exe");//chrome driver path setup
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("excludeSwitches", "disable-popup-blocking");
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(ChromeOptions.CAPABILITY, options);
        driver = new ChromeDriver();//object of chrome driver or chrome driver open
        driver.manage().window().maximize();//run time windows size maximize
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);//wait for 10 second before all test case
        driver.get("https://manage.cheaperzone.anant.io/#/login");//type URL

    }
    public void closeChromeBrowser() {
        driver.close();//close Browser
    }

}
