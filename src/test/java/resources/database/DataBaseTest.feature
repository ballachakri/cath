@dbb
Feature: Search for the countries
    
Scenario: Search for countries in given continent
    Given I have a database
    When I enter the continent name "Asia"
    Then I should view the countries in the continent



