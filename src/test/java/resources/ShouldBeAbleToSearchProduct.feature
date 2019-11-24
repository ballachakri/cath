@smoke @sanity @regression
@issue 152
Feature: Search a Product
    As a end user
    I will search for a product
    I should be able view all the relevant products

Scenario Outline: User should be able to search a Product
    Given I am on the home page
    When I search for a product "<product>"
    Then I should view all the relevant products

    Examples:
    |product|
    | shirt |
    | bag |
    | shoe |
    | skirt |




