package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class LoginPage extends Util
{

    //Create a variable for store xpath value.
    private By _welcomeMessage = By.xpath("//h4 [text () = \"Admin\"]");
    //Create a variable for store xpath value.
    private String expectWelcomeMessage = "ADMIN";
    //Create a variable for store xpath value.
    private By _mobileInputBox = By.id("input-8");
    //Create a variable for store xpath value.
    private By _loginButton = By.className("v-btn__content");
    //Create a variable for store xpath value.
    private By _otpInputBox = By.id("input-16");
    //Create a variable for store xpath value.
    private By _verifyButton = By.className("v-btn__content");
    //Create a variable for store xpath value.
    private By _errorMessageMobile = By.xpath("//div [text () = \"Mobile Must be 10 digit\"]");
    //Create a variable for store xpath value.
    private By _errorMessageOTP = By.xpath("//div[@class=\"v-messages__wrapper\"]/div");
    //Create a variable for store xpath value.
    private By _errorMessageOTP1 = By.xpath("// div [@class=\"v-snack__content\"]/span");



        public void verifyThatUserIsonLoginPage ()
        {
            //assert equals for expect results and actual results
            Assert.assertEquals(getTextFromElement(_welcomeMessage), expectWelcomeMessage, "User Is Not On LoginPage");
        }

    public void userEnterTheMobileNumber ()
    {
        // Enter the Mobile Number
        typeText(_mobileInputBox,"8000812280");
    }

    public void userClickOnLoginButton ()
    {
        //Click on Login Button
        clickOnElement(_loginButton);
    }

    public void userEnterTheOtp ()
    {
        //Enter the Otp (Receive on mobile by sms)
        typeText(_otpInputBox,"9898");
    }

    public void userClickOnVerifyButton ()
    {
        //Click on Verify Button
        clickOnElement(_verifyButton);
    }

    public void userLoginSuccessfully ()
    {
        //Login Successfully
        Assert.assertEquals(getTextFromElement(_welcomeMessage), expectWelcomeMessage, "User Is Not On LoginPage");
    }

    public void UserEnterTheMobileNumber(String MobileNumber)
    {
        //type text from feature file
        typeText(_mobileInputBox,MobileNumber);
    }


    public void UserSeeTheErrorMessage(String ErrorMessage)
    {
        //assert equals for expect results and actual results
        Assert.assertEquals(getTextFromElement(_errorMessageMobile), ErrorMessage, "User Not Login With Invalid MOBILE NUMBER !!!");
        //sout print get text value
        //System.out.println(getTextFromElement(_errorMessage));
    }

    public void UserEnterTheOTP(String OTP)
    {
        //type text from feature file
        typeText(_otpInputBox,OTP);
    }

    public void UserSeeTheOTPErrorMessage(String ErrorMessage,String ErrorMessage1)
    {
        waitUntilElementClickable(_verifyButton,5);
        //assert equals for expect results and actual results
       // Assert.assertEquals(getTextFromElement(_errorMessageOTP), ErrorMessage, "User Not Login With Invalid OTP !!!");
        ErrorMessage = getTextFromElement(_errorMessageOTP);

        //assert equals for expect results and actual results
       //waitUntilElementToBeVisible(_errorMessageOTP1,2);
        Assert.assertEquals(getTextFromElement(_errorMessageOTP1), ErrorMessage1, "User Not Login With Invalid OTP !!!");

    }
}
