@verify
Feature: TO VERIFY THE MAIN MENU LINKS
    As a end user
    I will click on the main menu links
    Then i should view the relevant web page

Scenario Outline: Should be able to navigate to appropriate page
    Given I am on the HOME Page
    When I click/tap on the main menu link "<mainMenu>"
    Then I should be able to land on the corresponding page

Examples:

| mainMenu|
| STUDENTS |
| GIFT CARD BALANCE |
| STORE FINDER |
| LOGIN/REGISTER |
| GBP |


