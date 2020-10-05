package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class DashboardPage extends Util {
    //Create a variable for store xpath value.
    private By _welcomeMessage = By.xpath("//div[@id='app']/div/header/div/div[2]");
    //Create a variable for store xpath value.
    private String expectWelcomeMessage = "Dashboard";
    //Create a variable for store xpath value.
    private By _pendingOrders = By.xpath("//div[@id='dashboard']/div[1]/div[1]/div[1]/div[1]");
    //Create a variable for store xpath value.
    private By _pendingOrdersClose = By.xpath("//div[@class=\"v-card__title py-0 px-0 mb-6\"]/button");
    //Create a variable for store xpath value.
    private By _deliveredOrders = By.xpath("//div[@id='dashboard']/div[1]/div[1]/div[2]/div[1]");
    //Create a variable for store xpath value.
    private By _deliveredOrdersClose = By.xpath("//div[@class=\"v-card__title py-0 px-0 mb-6\"]/button");
    //Create a variable for store xpath value.
    private By _revenue = By.xpath("//div[@id='dashboard']/div[1]/div[1]/div[3]/div[1]");
    //Create a variable for store xpath value.
    private By _revenueClose = By.xpath("//div[@class=\"v-card__title py-0 px-0 mb-6\"]/button");
    //Create a variable for store xpath value.
    private By _lowStockItems = By.xpath("//div[@id='dashboard']/div[1]/div[1]/div[4]/div[1]");
    //Create a variable for store xpath value.
    private By _lowStockItemsClose = By.xpath("//div[@class=\"v-card__title py-0 px-0 mb-6\"]/button");
    //Create a variable for store xpath value.
    private By _newCustomers = By.xpath("//div[@id='dashboard']/div[1]/div[1]/div[5]/div[1]");
    //Create a variable for store xpath value.
    private By _newCustomersClose = By.xpath("//div[@class=\"v-card__title py-0 px-0 mb-6\"]/button");

    //Create a variable for store xpath value.
    private By _welcomeMessageTopCustomers = By.xpath("//h5 [text () = \"Top Customers\"]");
    //Create a variable for store xpath value.
    private String expectTopcustomersWelcomeMessage = "Top Customers";

    //Create a variable for store xpath value.
    private By _welcomeMessageBestSellingProducts = By.xpath("//h5 [text () = \"Best Selling Products\"]");
    //Create a variable for store xpath value.
    private String expectBestSellingProductsWelcomeMessage = "Best Selling Products";

    //Create a variable for store xpath value.
    private By _welcomeMessageLatestOrders = By.xpath("//h5 [text () = \"Latest Orders (Last 24 Hours)\"]");
    //Create a variable for store xpath value.
    private String expectLatestOrdersWelcomeMessage = "Latest Orders (Last 24 Hours)";

    public void verifyThatUserIsOnDashboardPage() {
        // assert equals for expect results and actual results
        Assert.assertEquals(getTextFromElement(_welcomeMessage), expectWelcomeMessage, "User Is Not On DashboardPage");
    }

    public void verifyThatUserSeeTheDeleveredOrderTabByClickingOnIt()
    {
        clickOnElement(_deliveredOrders);

    }

    public void verifyThatUserCloseDeleveredOrderTab()
    {
        clickOnElement(_deliveredOrdersClose);

    }


    public void verifyThatUserSeeTheRevenueOrderTabByClickingOnIt()
    {
        clickOnElement(_revenue);

    }

    public void verifyThatUserCloseRevenueOrderTab()
    {
        clickOnElement(_revenueClose);

    }


    public void verifyThatUserSeeTheLowStockItemsOrderTabByClickingOnIt()
    {
        clickOnElement(_lowStockItems);

    }

    public void verifyThatUserCloseLowStockItemsOrderTab()
    {
        clickOnElement(_lowStockItemsClose);

    }


    public void verifyThatUserSeeTheNewCustomersOrderTabByClickingOnIt()
    {
        clickOnElement(_newCustomers);

    }

    public void verifyThatUserCloseNewCustomersOrderTab()
    {
        clickOnElement(_newCustomersClose);

    }


    public void verifyThatUserSeeThePendindOrderTabByClickingOnIt()
    {
        waitUntilElementClickable(_pendingOrders,10);
        clickOnElement(_pendingOrders);

    }

    public void verifyThatUserClosePendindOrderTab()
    {
        clickOnElement(_pendingOrdersClose);

    }


    public void userSeetheTopCustomerTab()
    {
        //assert equals for expect results and actual results
        Assert.assertEquals(getTextFromElement(_welcomeMessageTopCustomers), expectTopcustomersWelcomeMessage, "User Is Not See The Top Customers Tab on DashboardPage");
    }


    public void userSeetheBestSellingProductsTab()
    {
        //assert equals for expect results and actual results
        Assert.assertEquals(getTextFromElement(_welcomeMessageBestSellingProducts), expectBestSellingProductsWelcomeMessage, "User Is Not See The Best Selling Products Tab on DashboardPage");
    }


    public void userSeetheLatestOrdersTab()
    {
        //assert equals for expect results and actual results
        Assert.assertEquals(getTextFromElement(_welcomeMessageLatestOrders),expectLatestOrdersWelcomeMessage, "User Is Not See Latest Orders Tab on DashboardPage");
    }

}
