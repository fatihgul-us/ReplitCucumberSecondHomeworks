Feature: Checking all negative scenarios of order page

  Background: Login to page
    Given Navigate to the given web page "http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx?ReturnUrl=%2fsamples%2fTestComplete12%2fWebOrders%2fDefault.aspx"
    Then Enter user name: "Tester" and Password: "test"
    And Click on the login button

  Scenario Outline:Check if the Quantity entered zero, you get fault message
    Given Click on Order menu button
    Then Select type of product "<Type of Product>"
    And Enter "<Quantity>"
    Then press Calculate button
    And Verify if Quantity did not entered, you should get "Quantity must be greater than zero." message
    Examples:
      | Type of Product | Quantity |
      | ScreenSaver     | 0        |

  Scenario Outline:Check if the Customer Name did not entered, you get fault message
    Given Click on Order menu button
    Then Select type of product "<Type of Product>"
    And Enter "<Quantity>"
    Then press Calculate button
    Then Fill Address Information "<Customer name>" "<Street>" "<City>" "<State>" "<Zip>"
    Then Press process button
    Then Verify if Customer Name did not entered, you should get "Field 'Customer name' cannot be empty." message
    Examples:
      | Type of Product | Quantity | Customer name | Street | City    | State | Zip   |
      | ScreenSaver     | 5        |               | Sable  | Suwanee | GA    | 30009 |

  Scenario Outline:Check if the Street did not entered, you get fault message
    Given Click on Order menu button
    Then Select type of product "<Type of Product>"
    And Enter "<Quantity>"
    Then press Calculate button
    Then Fill Address Information "<Customer name>" "<Street>" "<City>" "<State>" "<Zip>"
    Then Press process button
    Then Verify if Street did not entered, you should get "Field 'Street' cannot be empty." message
    Examples:
      | Type of Product | Quantity | Customer name | Street | City    | State | Zip   |
      | ScreenSaver     | 10       | Fatih Gul     |        | Suwanee | GA    | 30009 |

  Scenario Outline:Check if the City did not entered, you get fault message
    Given Click on Order menu button
    Then Select type of product "<Type of Product>"
    And Enter "<Quantity>"
    Then press Calculate button
    Then Fill Address Information "<Customer name>" "<Street>" "<City>" "<State>" "<Zip>"
    Then Press process button
    Then Verify if City did not entered, you should get "Field 'City' cannot be empty." message
    Examples:
      | Type of Product | Quantity | Customer name | Street | City | State | Zip   |
      | ScreenSaver     | 15       | Fatih Gul     | Sable  |      | GA    | 30009 |

  Scenario Outline:Check if the Zip did not entered, you get fault message
    Given Click on Order menu button
    Then Select type of product "<Type of Product>"
    And Enter "<Quantity>"
    Then press Calculate button
    Then Fill Address Information "<Customer name>" "<Street>" "<City>" "<State>" "<Zip>"
    Then Press process button
    Then Verify if Zip did not entered, you should get "Field 'Zip' cannot be empty." message
    Examples:
      | Type of Product | Quantity | Customer name | Street | City    | State | Zip |
      | ScreenSaver     | 50       | Fatih Gul     | Sable  | Suwanee | GA    |     |

  Scenario Outline:Check if the Card Type did not entered, you get fault message
    Given Click on Order menu button
    Then Select type of product "<Type of Product>"
    And Enter "<Quantity>"
    Then press Calculate button
    Then Fill Address Information "<Customer name>" "<Street>" "<City>" "<State>" "<Zip>"
    Then Select type of "<Card>"
    And Enter the "<Card Nr>" "<Expire date (mm/yy)>"
    Then Press process button
   And Verify if Card did not entered, you should get "Select a card type." message
    Examples:
      | Type of Product | Quantity | Customer name | Street | City    | State | Zip   | Card | Card Nr      | Expire date (mm/yy) |
      | ScreenSaver     | 45       | Fatih Gul     | Sable  | Suwanee | GA    | 30009 |      | 123456789012 | 03/23               |

  Scenario Outline:Check if the Card Number did not entered, you get fault message
    Given Click on Order menu button
    Then Select type of product "<Type of Product>"
    And Enter "<Quantity>"
    Then press Calculate button
    Then Fill Address Information "<Customer name>" "<Street>" "<City>" "<State>" "<Zip>"
    Then Select type of "<Card>"
    And Enter the "<Card Nr>" "<Expire date (mm/yy)>"
    Then Press process button
    And Verify if Card Nr did not entered, you should get "Field 'Card Nr' cannot be empty." message
    Examples:
      | Type of Product | Quantity | Customer name | Street | City    | State | Zip   | Card       | Card Nr | Expire date (mm/yy) |
      | ScreenSaver     | 45       | Fatih Gul     | Sable  | Suwanee | GA    | 30009 | MasterCard |         | 03/23               |

  Scenario Outline:Check if the Exp Date did not entered, you get fault message
    Given Click on Order menu button
    Then Select type of product "<Type of Product>"
    And Enter "<Quantity>"
    Then press Calculate button
    Then Fill Address Information "<Customer name>" "<Street>" "<City>" "<State>" "<Zip>"
    Then Select type of "<Card>"
    And Enter the "<Card Nr>" "<Expire date (mm/yy)>"
    Then Press process button
    And Verify if Expire Date did not entered, you should get "Field 'Expire date' cannot be empty." message

    Examples:
      | Type of Product | Quantity | Customer name | Street | City    | State | Zip   | Card       | Card Nr      | Expire date (mm/yy) |
      | ScreenSaver     | 45       | Fatih Gul     | Sable  | Suwanee | GA    | 30009 | MasterCard | 123456789012 |                     |



#  http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx?ReturnUrl=%2fsamples%2fTestComplete12%2fWebOrders%2fDefault.aspx
#  username is Tester
#  password is test
#  Fill the order form (button is on the left side)
#  Create a all the negative scenarios. (For example do not enter the customer name )
#  Test all possible options.
#    And verify order is not created.
