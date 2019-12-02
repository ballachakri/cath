package stepDefs.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;



public class AddCustomerAPTStepDefs {

    private RequestSpecification requestSpecification;
    private Response response;

    @Given("The customer details End point is Ready")
    public void the_customer_details_End_point_is_Ready() {

        RestAssured.baseURI="http://restapi.demoqa.com/customer";
        requestSpecification=RestAssured.given();

    }

    @When("I enter following customer details")
    public void i_enter_following_customer_details(io.cucumber.datatable.DataTable dataTable) throws IOException {

        List<Map<String, String>> customerData= dataTable.asMaps();

        Customer cust=new Customer();
        cust.setFirstName(customerData.get(0).get("fname"));
        cust.setLastName(customerData.get(0).get("lname"));
        cust.setUserName(customerData.get(0).get("uname"));
        cust.setPassword(customerData.get(0).get("password"));
        cust.setEmail(customerData.get(0).get("email"));

        System.out.println("customer data "+ customerData);
        ObjectMapper mapper=new ObjectMapper();
        mapper.writeValue(new File("C:\\Users\\sball\\Desktop\\customer.txt"),cust);
        String str=mapper.writeValueAsString(cust);
        requestSpecification.header("Content-Type","application/json");
        requestSpecification.body(str);
        System.out.println(" str   : " +str);
        response=requestSpecification.post("/register");
        System.out.println("posted");
        requestSpecification.log().all();
    }

    @Then("I should view success response code with message")
    public void i_should_view_success_response_code_with_message() {

        System.out.println(response.getStatusCode());

    }

}
