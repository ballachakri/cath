$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/resources/DataBaseTest.feature");
formatter.feature({
  "name": "Search for the continent",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@country"
    }
  ]
});
formatter.scenario({
  "name": "Search for continent of a given country",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@country"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I have a database",
  "keyword": "Given "
});
formatter.match({
  "location": "CountryDataBaseTest.i_have_a_database()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter the continent name \"Asia\"",
  "keyword": "When "
});
formatter.match({
  "location": "CountryDataBaseTest.i_enter_the_continent_name(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should view the countries in the continent",
  "keyword": "Then "
});
formatter.match({
  "location": "CountryDataBaseTest.i_should_view_the_countries_in_the_continent()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});