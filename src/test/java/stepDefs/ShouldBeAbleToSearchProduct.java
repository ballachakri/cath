package stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.HomePage;
import utils.TestData;

import java.io.IOException;

public class ShouldBeAbleToSearchProduct {

    @Given("I am on the home page")
    public void i_am_on_the_home_page() {
    new HomePage().openHomePage();
   }

    @When("I search for a product {string}")
    public void i_search_for_a_product(String string) {

    }

    @Then("I should view all the relevant products")
    public void i_should_view_all_the_relevant_products() {
    }

}
