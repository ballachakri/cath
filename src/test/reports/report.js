$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/resources/api/ShouldBeAbleToAddNewCustomer.feature");
formatter.feature({
  "name": "Should be able to add new customer",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@addCustomer"
    }
  ]
});
formatter.scenario({
  "name": "add new customer",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@addCustomer"
    }
  ]
});
formatter.step({
  "name": "The customer details End point is Ready",
  "keyword": "Given "
});
formatter.match({
  "location": "AddCustomerAPTStepDefs.the_customer_details_End_point_is_Ready()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter following customer details",
  "rows": [
    {
      "cells": [
        "fname",
        "lname",
        "uname",
        "password",
        "email"
      ]
    },
    {
      "cells": [
        "Ram",
        "Krishna",
        "rkrishna",
        "abc12345",
        "rk@gmail.com"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "AddCustomerAPTStepDefs.i_enter_following_customer_details(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should view success response code with message",
  "keyword": "Then "
});
formatter.match({
  "location": "AddCustomerAPTStepDefs.i_should_view_success_response_code_with_message()"
});
formatter.result({
  "status": "passed"
});
});