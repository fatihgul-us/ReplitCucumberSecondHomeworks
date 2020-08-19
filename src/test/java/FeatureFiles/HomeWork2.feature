Feature: Checking functionality of order page

  Background: Login to page
    Given Navigate to the given web page "http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx?ReturnUrl=%2fsamples%2fTestComplete12%2fWebOrders%2fDefault.aspx"
    Then Enter user name: "Tester" and Password: "test"
    And Click on the login button

  Scenario Outline:Filling the order form
    Given Click on Order menu button
    Then Select type of product "<Type of Product>"
    And Enter "<Quantity>"
    Then press Calculate button
    Then Fill Address Information "<Customer name>" "<Street>" "<City>" "<State>" "<Zip>"
    Then Select type of "<Card>"
    And Enter the "<Card Nr>" "<Expire date (mm/yy)>"
    Then Press process button
    Then Press View All Orders button
    Then Verify your order is created in the the view all orders page "<Customer name>" , "<Type of Product>", "<Street>"
    And Verify "<City>" , "<State>" , "<Zip>" , "<Card>" ,"<Card Nr>" , "<Expire date (mm/yy)>" in the the view all orders page
    Examples:
      | Type of Product | Quantity | Customer name | Street | City       | State | Zip   | Card             | Card Nr     | Expire date (mm/yy) |
      | ScreenSaver     | 10       | Fatih Gul     | Sable  | Suwanee    | GA    | 30009 | MasterCard       | 12345689012 | 03/23               |
      | FamilyAlbum     | 21       | Zeki          | Okul   | Alpharetta | GA    | 30097 | American Express | 12345689012 | 03/23               |
      | MyMoney         | 5        | Dogan         | Duvar  | Duluth     | GA    | 30024 | Visa             | 12345689012 | 03/23               |



