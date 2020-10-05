@Eagle
Feature: Seat Booking

  Scenario: User Should Able To Book The Seat With Eagle Express Travels

    Given User Is On HomePage.
    When User Enter All Required Data Like Source and Destination and Select Journey Date.
    And User Click On Search Buses Button.
    And User Landed on Listing Page.
    And User Select the Eagle Express Falcon in Operators.
    And User Click on View Seats Button.
    And User Select the Seat and Bording Point and Dropping point.
    Then User Click on Proceed Button.
