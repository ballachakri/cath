$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/resources/MenuValidation.feature");
formatter.feature({
  "name": "TO VERIFY THE MAIN MENU LINKS",
  "description": "    As a end user\n    I will click on the main menu links\n    Then i should view the relevant web page",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@verify"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Should be able to navigate to appropriate page",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I am on the HOME Page",
  "keyword": "Given "
});
formatter.step({
  "name": "I click/tap on the main menu link \"\u003cmainMenu\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "I should be able to land on the corresponding page",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "mainMenu"
      ]
    },
    {
      "cells": [
        "STUDENTS"
      ]
    },
    {
      "cells": [
        "GIFT CARD BALANCE"
      ]
    },
    {
      "cells": [
        "STORE FINDER"
      ]
    },
    {
      "cells": [
        "LOGIN/REGISTER"
      ]
    },
    {
      "cells": [
        "GBP"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Should be able to navigate to appropriate page",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@verify"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am on the HOME Page",
  "keyword": "Given "
});
formatter.match({
  "location": "MenuMenuValidationsStepDefs.i_am_on_the_HOME_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click/tap on the main menu link \"STUDENTS\"",
  "keyword": "When "
});
formatter.match({
  "location": "MenuMenuValidationsStepDefs.i_click_tap_on_the_main_menu_link(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should be able to land on the corresponding page",
  "keyword": "Then "
});
formatter.match({
  "location": "MenuMenuValidationsStepDefs.i_should_be_able_to_land_on_the_corresponding_page()"
});
formatter.result({
  "error_message": "java.lang.AssertionError: Navigated to wrong page, please investigate\nExpected: a string containing \"STUDENTS\"\n     but: was \"https://www.cathkidston.com/students/content/fcp-content\"\r\n\tat org.hamcrest.MatcherAssert.assertThat(MatcherAssert.java:20)\r\n\tat stepDefs.MenuMenuValidationsStepDefs.i_should_be_able_to_land_on_the_corresponding_page(MenuMenuValidationsStepDefs.java:34)\r\n\tat ✽.I should be able to land on the corresponding page(file:src/test/java/resources/MenuValidation.feature:10)\r\n",
  "status": "failed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Should be able to navigate to appropriate page",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@verify"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am on the HOME Page",
  "keyword": "Given "
});
formatter.match({
  "location": "MenuMenuValidationsStepDefs.i_am_on_the_HOME_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click/tap on the main menu link \"GIFT CARD BALANCE\"",
  "keyword": "When "
});
formatter.match({
  "location": "MenuMenuValidationsStepDefs.i_click_tap_on_the_main_menu_link(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should be able to land on the corresponding page",
  "keyword": "Then "
});
formatter.match({
  "location": "MenuMenuValidationsStepDefs.i_should_be_able_to_land_on_the_corresponding_page()"
});
formatter.result({
  "error_message": "java.lang.AssertionError: Navigated to wrong page, please investigate\nExpected: a string containing \"GIFT CARD BALANCE\"\n     but: was \"https://www.cathkidston.com/giftcardbalance/balance/fcp-content\"\r\n\tat org.hamcrest.MatcherAssert.assertThat(MatcherAssert.java:20)\r\n\tat stepDefs.MenuMenuValidationsStepDefs.i_should_be_able_to_land_on_the_corresponding_page(MenuMenuValidationsStepDefs.java:34)\r\n\tat ✽.I should be able to land on the corresponding page(file:src/test/java/resources/MenuValidation.feature:10)\r\n",
  "status": "failed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Should be able to navigate to appropriate page",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@verify"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am on the HOME Page",
  "keyword": "Given "
});
formatter.match({
  "location": "MenuMenuValidationsStepDefs.i_am_on_the_HOME_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click/tap on the main menu link \"STORE FINDER\"",
  "keyword": "When "
});
formatter.match({
  "location": "MenuMenuValidationsStepDefs.i_click_tap_on_the_main_menu_link(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should be able to land on the corresponding page",
  "keyword": "Then "
});
formatter.match({
  "location": "MenuMenuValidationsStepDefs.i_should_be_able_to_land_on_the_corresponding_page()"
});
formatter.result({
  "error_message": "java.lang.AssertionError: Navigated to wrong page, please investigate\nExpected: a string containing \"STORE FINDER\"\n     but: was \"https://www.cathkidston.com/pws/StoreFinder.ice\"\r\n\tat org.hamcrest.MatcherAssert.assertThat(MatcherAssert.java:20)\r\n\tat stepDefs.MenuMenuValidationsStepDefs.i_should_be_able_to_land_on_the_corresponding_page(MenuMenuValidationsStepDefs.java:34)\r\n\tat ✽.I should be able to land on the corresponding page(file:src/test/java/resources/MenuValidation.feature:10)\r\n",
  "status": "failed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Should be able to navigate to appropriate page",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@verify"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am on the HOME Page",
  "keyword": "Given "
});
formatter.match({
  "location": "MenuMenuValidationsStepDefs.i_am_on_the_HOME_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click/tap on the main menu link \"LOGIN/REGISTER\"",
  "keyword": "When "
});
formatter.match({
  "location": "MenuMenuValidationsStepDefs.i_click_tap_on_the_main_menu_link(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should be able to land on the corresponding page",
  "keyword": "Then "
});
formatter.match({
  "location": "MenuMenuValidationsStepDefs.i_should_be_able_to_land_on_the_corresponding_page()"
});
formatter.result({
  "error_message": "java.lang.AssertionError: Navigated to wrong page, please investigate\nExpected: a string containing \"LOGIN/REGISTER\"\n     but: was \"https://www.cathkidston.com/pws/secure/ManageAccount.ice\"\r\n\tat org.hamcrest.MatcherAssert.assertThat(MatcherAssert.java:20)\r\n\tat stepDefs.MenuMenuValidationsStepDefs.i_should_be_able_to_land_on_the_corresponding_page(MenuMenuValidationsStepDefs.java:34)\r\n\tat ✽.I should be able to land on the corresponding page(file:src/test/java/resources/MenuValidation.feature:10)\r\n",
  "status": "failed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Should be able to navigate to appropriate page",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@verify"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am on the HOME Page",
  "keyword": "Given "
});
formatter.match({
  "location": "MenuMenuValidationsStepDefs.i_am_on_the_HOME_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click/tap on the main menu link \"GBP\"",
  "keyword": "When "
});
formatter.match({
  "location": "MenuMenuValidationsStepDefs.i_click_tap_on_the_main_menu_link(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should be able to land on the corresponding page",
  "keyword": "Then "
});
formatter.match({
  "location": "MenuMenuValidationsStepDefs.i_should_be_able_to_land_on_the_corresponding_page()"
});
formatter.result({
  "error_message": "java.lang.AssertionError: Navigated to wrong page, please investigate\nExpected: a string containing \"GBP\"\n     but: was \"https://www.cathkidston.com/\"\r\n\tat org.hamcrest.MatcherAssert.assertThat(MatcherAssert.java:20)\r\n\tat stepDefs.MenuMenuValidationsStepDefs.i_should_be_able_to_land_on_the_corresponding_page(MenuMenuValidationsStepDefs.java:34)\r\n\tat ✽.I should be able to land on the corresponding page(file:src/test/java/resources/MenuValidation.feature:10)\r\n",
  "status": "failed"
});
formatter.after({
  "status": "passed"
});
});