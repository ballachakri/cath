@city

Feature: Get a weather report of a city from an End Point

  Scenario Outline: weather report

    Given The city weather end point is ready
    When I enter the city name as "<city>"
    Then I should view the city weather report

  Examples:
  |city|
  | Hyderabad|
