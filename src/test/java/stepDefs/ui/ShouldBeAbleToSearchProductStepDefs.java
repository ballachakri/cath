package stepDefs.ui;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.hamcrest.Matchers;
import pageobjects.HomePage;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class ShouldBeAbleToSearchProductStepDefs {
    private HomePage homePage;
    private String searchProduct;

    @Given("I am on the home page")
    public void i_am_on_the_home_page() {
    homePage= new HomePage();
    homePage.openHomePage();
    }

    @When("I search for a product {string}")
    public void i_search_for_a_product(String product) {
        searchProduct=product;
        homePage.searchProduct(product);
    }

    @Then("I should view all the relevant products")
    public void i_should_view_all_the_relevant_products() {

       assertThat("Wrong search results are displayed, please investigate",
               homePage.getSearchResultTitle(), equalToIgnoringCase(searchProduct));
 }

}
