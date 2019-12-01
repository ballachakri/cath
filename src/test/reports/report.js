$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/resources/DataBaseTest.feature");
formatter.feature({
  "name": "Search for the countries",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Search for countries in given continent",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I have a database",
  "keyword": "Given "
});
formatter.match({
  "location": "CountryDataBaseTestStepDefs.i_have_a_database()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter the continent name \"Asia\"",
  "keyword": "When "
});
formatter.match({
  "location": "CountryDataBaseTestStepDefs.i_enter_the_continent_name(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should view the countries in the continent",
  "keyword": "Then "
});
formatter.match({
  "location": "CountryDataBaseTestStepDefs.i_should_view_the_countries_in_the_continent()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/java/resources/LinkValidations.feature");
formatter.feature({
  "name": "All Home page Links validation",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@links"
    }
  ]
});
formatter.scenario({
  "name": "Links validations",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@links"
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
  "name": "The home page is loaded",
  "keyword": "When "
});
formatter.match({
  "location": "LinksValidation.the_home_page_is_loaded()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should be able view all the links",
  "keyword": "Then "
});
formatter.match({
  "location": "LinksValidation.i_should_be_able_view_all_the_links()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/java/resources/ShouldBeAbleToSearchProduct.feature");
formatter.feature({
  "name": "Search a Product",
  "description": "    As a end user\n    I will search for a product\n    I should be able view all the relevant products",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@smoke"
    },
    {
      "name": "@sanity"
    },
    {
      "name": "@regression"
    }
  ]
});
formatter.scenarioOutline({
  "name": "User should be able to search a Product",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I am on the home page",
  "keyword": "Given "
});
formatter.step({
  "name": "I search for a product \"\u003cproduct\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "I should view all the relevant products",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "product"
      ]
    },
    {
      "cells": [
        "shirt"
      ]
    },
    {
      "cells": [
        "bag"
      ]
    },
    {
      "cells": [
        "shoe"
      ]
    },
    {
      "cells": [
        "skirt"
      ]
    }
  ]
});
formatter.scenario({
  "name": "User should be able to search a Product",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@smoke"
    },
    {
      "name": "@sanity"
    },
    {
      "name": "@regression"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am on the home page",
  "keyword": "Given "
});
formatter.match({
  "location": "ShouldBeAbleToSearchProductStepDefs.i_am_on_the_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I search for a product \"shirt\"",
  "keyword": "When "
});
formatter.match({
  "location": "ShouldBeAbleToSearchProductStepDefs.i_search_for_a_product(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should view all the relevant products",
  "keyword": "Then "
});
formatter.match({
  "location": "ShouldBeAbleToSearchProductStepDefs.i_should_view_all_the_relevant_products()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "User should be able to search a Product",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@smoke"
    },
    {
      "name": "@sanity"
    },
    {
      "name": "@regression"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am on the home page",
  "keyword": "Given "
});
formatter.match({
  "location": "ShouldBeAbleToSearchProductStepDefs.i_am_on_the_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I search for a product \"bag\"",
  "keyword": "When "
});
formatter.match({
  "location": "ShouldBeAbleToSearchProductStepDefs.i_search_for_a_product(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should view all the relevant products",
  "keyword": "Then "
});
formatter.match({
  "location": "ShouldBeAbleToSearchProductStepDefs.i_should_view_all_the_relevant_products()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "User should be able to search a Product",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@smoke"
    },
    {
      "name": "@sanity"
    },
    {
      "name": "@regression"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am on the home page",
  "keyword": "Given "
});
formatter.match({
  "location": "ShouldBeAbleToSearchProductStepDefs.i_am_on_the_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I search for a product \"shoe\"",
  "keyword": "When "
});
formatter.match({
  "location": "ShouldBeAbleToSearchProductStepDefs.i_search_for_a_product(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should view all the relevant products",
  "keyword": "Then "
});
formatter.match({
  "location": "ShouldBeAbleToSearchProductStepDefs.i_should_view_all_the_relevant_products()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "User should be able to search a Product",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@smoke"
    },
    {
      "name": "@sanity"
    },
    {
      "name": "@regression"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am on the home page",
  "keyword": "Given "
});
formatter.match({
  "location": "ShouldBeAbleToSearchProductStepDefs.i_am_on_the_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I search for a product \"skirt\"",
  "keyword": "When "
});
formatter.match({
  "location": "ShouldBeAbleToSearchProductStepDefs.i_search_for_a_product(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should view all the relevant products",
  "keyword": "Then "
});
formatter.match({
  "location": "ShouldBeAbleToSearchProductStepDefs.i_should_view_all_the_relevant_products()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});