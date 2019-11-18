package stepDefs;

import Menu.GlobalContants.Categories_Constants;
import Menu.MainCategory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.HomePage;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;

public class ShouldBeAbleToSearchProduct {
    private HomePage homePage;
    private String searchProduct;

    @Given("I am on the home page")
    public void i_am_on_the_home_page() {
    homePage= new HomePage();
    homePage.openHomePage();
    new MainCategory().category(Categories_Constants.CHRISTMAS.toString());
   }

    @When("I search for a product {string}")
    public void i_search_for_a_product(String product) {
//        searchProduct=product;
//        homePage.searchProduct(product).clickMagnifyingGlassIcon();
    }

    @Then("I should view all the relevant products")
    public void i_should_view_all_the_relevant_products() {
//        assertThat("Wrong search results are displayed, please investigate",
//                homePage.getSearchResultTitle() , containsString(searchProduct));
    }

}
