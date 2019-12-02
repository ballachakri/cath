@addCustomer
Feature:  Should be able to add new customer

  Scenario: add new customer
    Given The customer details End point is Ready
    When I enter following customer details
    |fname|lname|uname|password|email|
    |Ram  |Krishna| rkrishna|abc12345|rk@gmail.com|
    Then I should view success response code with message
