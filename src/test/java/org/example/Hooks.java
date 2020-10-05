package org.example;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.testng.ITestResult;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class Hooks extends Util
{
    BrowserManager browserManager = new BrowserManager(); //Crate Object Of BrowserManager.

    @Before//Before run All Feature file.
    public void openBrowser() {
        browserManager.setChromeBrowser();//call Method of BrowserManager class
    }

    @After//After run All Feature file.
    public void closeBrowser ()  {

        //call Method of BrowserManager class
        browserManager.closeChromeBrowser();//close browser
    }

}
