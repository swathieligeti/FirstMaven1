Feature: Customers

  Scenario: Add a new customer
    Given User Launch Chrome browser
    When User opens URL "https://admin-demo.nopcommerce.com/login"
    And User Enters Email as "admin@yourstore.com" and password "admin"
    And Click on Login
    Then User can view Dashboard
    When User click on customer menu
    When click on customer menu items
    And click on Add new button
    Then User can view Add new customer page
    When User enter Customer info
    And click on save button
    Then User can view confirmation message "The new customer has been added successfully."
    And click logout
    And close Browser
