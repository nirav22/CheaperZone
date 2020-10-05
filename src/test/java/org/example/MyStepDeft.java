package org.example;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyStepDeft extends Util
{
    LoginPage loginPage = new LoginPage();
    DashboardPage dashboardPage = new DashboardPage();




    @Given("^User Is On Login Page$")
    public void user_Is_On_Login_Page()
    {
        loginPage.verifyThatUserIsonLoginPage();
    }

    @When("^User Enter The MobileNumber\\.$")
    public void user_Enter_The_MobileNumber()
    {
        loginPage.userEnterTheMobileNumber();
    }

    @When("^User Click on Login Button\\.$")
    public void user_Click_on_Login_Button()
    {
        loginPage.userClickOnLoginButton();
    }

    @When("^User Enter The OTP \\( Received on Mobile By Sms \\)\\.$")
    public void user_Enter_The_OTP_Received_on_Mobile_By_Sms()
    {
        loginPage.userEnterTheOtp();
    }

    @When("^User Click On Verify Button\\.$")
    public void user_Click_On_Verify_Button()
    {
        loginPage.userClickOnVerifyButton();
    }

    @Then("^User Login SuccessFully\\.$")
    public void user_Login_SuccessFully()
    {
        loginPage.userLoginSuccessfully();
    }

    @Then("^User Is on Dashboard Page\\.$")
    public void user_Is_on_Dashboard_Page()
    {
        dashboardPage.verifyThatUserIsOnDashboardPage();
    }


    @When("^User Enter Invalid \"([^\"]*)\"\\.$")
    public void user_Enter_Invalid(String MobileNumber)
    {
        loginPage.UserEnterTheMobileNumber(MobileNumber);
    }



    @Then("^User should see error message \"([^\"]*)\"\\.$")
    public void user_should_see_error_message(String ErrorMessage)
    {
        loginPage.UserSeeTheErrorMessage(ErrorMessage);
    }

    @When("^User Enter The \"([^\"]*)\"\\. \\( Received on Mobile By Sms \\)\\.$")
    public void user_Enter_The_Received_on_Mobile_By_Sms(String OTP)
    { loginPage.UserEnterTheOTP(OTP); }

    @Then("^User should see OTP error message \"([^\"]*)\" And \"([^\"]*)\"\\.$")
    public void user_should_see_OTP_error_message_And(String ErrorMessage, String ErrorMessage1)
    {
        loginPage.UserSeeTheOTPErrorMessage(ErrorMessage,ErrorMessage1);

    }


    @When("^User Click On Pending Order Tab\\.$")
    public void user_Click_On_Pending_Order_Tab()
    {
        dashboardPage.verifyThatUserSeeThePendindOrderTabByClickingOnIt();
    }

    @Then("^User See The Pending Order Tab And User Close The Tab\\.$")
    public void user_See_The_Pending_Order_Tab_And_User_Close_The_Tab()
    {
        dashboardPage.verifyThatUserClosePendindOrderTab();
    }

    @When("^User Click On Delivered Order Tab\\.$")
    public void user_Click_On_Delivered_Order_Tab()
    {
        dashboardPage.verifyThatUserSeeTheDeleveredOrderTabByClickingOnIt();
    }

    @Then("^User See The Delivered Order Tab And User Close The Tab\\.$")
    public void user_See_The_Delivered_Order_Tab_And_User_Close_The_Tab()
    {
        dashboardPage.verifyThatUserCloseDeleveredOrderTab();
    }

    @When("^User Click On Revenue Order Tab\\.$")
    public void user_Click_On_Revenue_Order_Tab()
    {
        dashboardPage.verifyThatUserSeeTheRevenueOrderTabByClickingOnIt();
    }

    @Then("^User See The Revenue Order Tab And User Close The Tab\\.$")
    public void user_See_The_Revenue_Order_Tab_And_User_Close_The_Tab()
    {
        dashboardPage.verifyThatUserCloseRevenueOrderTab();
    }

    @When("^User Click On Low Stock Item Order Tab\\.$")
    public void user_Click_On_Low_Stock_Item_Order_Tab()
    {
        dashboardPage.verifyThatUserSeeTheLowStockItemsOrderTabByClickingOnIt();
    }

    @Then("^User See The On Low Stock Item Order Tab And User Close The Tab\\.$")
    public void user_See_The_On_Low_Stock_Item_Order_Tab_And_User_Close_The_Tab()
    {
        dashboardPage.verifyThatUserCloseLowStockItemsOrderTab();
    }

    @When("^User Click On New Customers Order Tab\\.$")
    public void user_Click_On_New_Customers_Order_Tab()
    {
        dashboardPage.verifyThatUserSeeTheNewCustomersOrderTabByClickingOnIt();
    }

    @Then("^User See The On New Customers Order Tab And User Close The Tab\\.$")
    public void user_See_The_On_New_Customers_Order_Tab_And_User_Close_The_Tab()
    {
        dashboardPage.verifyThatUserCloseNewCustomersOrderTab();
    }


    @Then("^User See The On Top CustomersTab\\.$")
    public void userSeeTheOnTopCustomersTab()
    {
        dashboardPage.userSeetheTopCustomerTab();
    }


    @Then("^User See The Best Selling Products\\.$")
    public void userSeeTheBestSellingProducts()
    {
        dashboardPage.userSeetheBestSellingProductsTab();
    }

    @Then("^User See The Latest Orders\\.$")
    public void userSeeTheLatestOrders()
    {
        dashboardPage.userSeetheLatestOrdersTab();
    }
}
