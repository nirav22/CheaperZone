
@Dashboard
Feature: Check The DashBoard Items



  Scenario: User Should Able To See The Pending Orders Tab By Clicking on it.
    Given User Is On Login Page
    And User Enter The MobileNumber.
    And User Click on Login Button.
    And User Enter The OTP ( Received on Mobile By Sms ).
    And User Click On Verify Button.
    And User Login SuccessFully.
    And User Is on Dashboard Page.
    When User Click On Pending Order Tab.
    Then User See The Pending Order Tab And User Close The Tab.


  Scenario: User Should Able To See The Delivered Order Tab By Clicking on it.
    Given User Is On Login Page
    And User Enter The MobileNumber.
    And User Click on Login Button.
    And User Enter The OTP ( Received on Mobile By Sms ).
    And User Click On Verify Button.
    And User Login SuccessFully.
    And User Is on Dashboard Page.
    When User Click On Delivered Order Tab.
    Then User See The Delivered Order Tab And User Close The Tab.


  Scenario: User Should Able To See The Revenue Tab By Clicking on it.
    Given User Is On Login Page
    And User Enter The MobileNumber.
    And User Click on Login Button.
    And User Enter The OTP ( Received on Mobile By Sms ).
    And User Click On Verify Button.
    And User Login SuccessFully.
    And User Is on Dashboard Page.
    When User Click On Revenue Order Tab.
    Then User See The Revenue Order Tab And User Close The Tab.


  Scenario: User Should Able To See The Low Stock Item Tab By Clicking on it.
    Given User Is On Login Page
    And User Enter The MobileNumber.
    And User Click on Login Button.
    And User Enter The OTP ( Received on Mobile By Sms ).
    And User Click On Verify Button.
    And User Login SuccessFully.
    And User Is on Dashboard Page.
    When User Click On Low Stock Item Order Tab.
    Then User See The On Low Stock Item Order Tab And User Close The Tab.


  Scenario: User Should Able To See The New Customers Tab By Clicking on it.
    Given User Is On Login Page
    And User Enter The MobileNumber.
    And User Click on Login Button.
    And User Enter The OTP ( Received on Mobile By Sms ).
    And User Click On Verify Button.
    And User Login SuccessFully.
    And User Is on Dashboard Page.
    When User Click On New Customers Order Tab.
    Then User See The On New Customers Order Tab And User Close The Tab.

  Scenario: User Should Able To See The Top Customers Tab
    Given User Is On Login Page
    And User Enter The MobileNumber.
    And User Click on Login Button.
    And User Enter The OTP ( Received on Mobile By Sms ).
    And User Click On Verify Button.
    And User Login SuccessFully.
    When User Is on Dashboard Page.
    Then User See The On Top CustomersTab.

  Scenario: User Should Able To See The Top Customers Tab
    Given User Is On Login Page
    And User Enter The MobileNumber.
    And User Click on Login Button.
    And User Enter The OTP ( Received on Mobile By Sms ).
    And User Click On Verify Button.
    And User Login SuccessFully.
    When User Is on Dashboard Page.
    Then User See The Best Selling Products.

  Scenario: User Should Able To See The Latest Orders
    Given User Is On Login Page
    And User Enter The MobileNumber.
    And User Click on Login Button.
    And User Enter The OTP ( Received on Mobile By Sms ).
    And User Click On Verify Button.
    And User Login SuccessFully.
    When User Is on Dashboard Page.
    Then User See The Latest Orders.