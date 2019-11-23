@country
Feature: Search for the continent
    
Scenario: Search for continent of a given country
    Given I have a database
    When I enter the continent name "Asia"
    Then I should view the countries in the continent
