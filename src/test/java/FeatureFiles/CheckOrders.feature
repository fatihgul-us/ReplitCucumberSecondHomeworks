Feature: Checking number of orders and deleting the orders function

  Scenario: Login to page with credentials
    Given Navigate to the given web page "http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx?ReturnUrl=%2fsamples%2fTestComplete12%2fWebOrders%2fDefault.aspx"
    Then Enter user name: "Tester" and Password: "test"
    And Click on the login button

  Scenario: Checking number of orders
    Given Verify that view all orders page page is open
    Then Verify 8 items are displayed in the view all orders page

  Scenario: Deleting all orders
    Given Click on Select All button
    Then Click on Delete Selected button
    And Verify item count is 0