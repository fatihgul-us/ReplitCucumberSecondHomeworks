Feature: Checking functionality of order page
  Scenario: Login to page with credentials
    Given Navigate to the given web page "http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx?ReturnUrl=%2fsamples%2fTestComplete12%2fWebOrders%2fDefault.aspx"
    Then Enter user name: "Tester" and Password: "test"
    And Click on the login button

  Scenario: Filling the order form
  Given Click on Order menu button
  a[href='Process.aspx']








#Fill the order form (button is on the left side)
#
#Verify your order is created in the the view all orders page(Verify Name , Product , Street , City , State , Zip , Card , Card number , Exp )
#
#Verify items count are increased in the view all orders page
#
#Create an orders with 3 different product type in the dropdown.