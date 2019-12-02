package stepDefs.api;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

public class CityWeatherAPIStepDefs {

    //RequestSpecification is an interface the represents every request.
    private RequestSpecification requestSpecification;

    // Response will be stored in response variable.
    private Response response;

    @Given("The city weather end point is ready")
    public void the_city_weather_end_point_is_ready() {

        // RestAssured is a class setup to request URI
        RestAssured.baseURI = "http://restapi.demoqa.com/utilities/weather/city/";

        // creating a request pointing to rge service e
        requestSpecification = RestAssured.given();

    }

    @When("I enter the city name as {string}")
    public void i_enter_the_city_name_as(String city) {

        // RequestSpecification makes a request to a server and response is stored response object
          response = requestSpecification.request(Method.GET, city);

    }

    @Then("I should view the city weather report")
    public void i_should_view_the_city_weather_report() {

        // we will get status code  from server to response object.
        int statusCode = response.statusCode();

        assertThat("The request is not successful, please investigate",
                statusCode, equalTo(200));

//        assertThat("The request body is not successful, please investigate",
//                response.getBody(), containsString("Hyderabad"));

    }


}
