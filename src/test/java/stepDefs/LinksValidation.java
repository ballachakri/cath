package stepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.HomePage;

import java.io.IOException;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.collection.IsMapContaining.hasKey;
import static org.hamcrest.collection.IsMapContaining.hasValue;
import static org.hamcrest.core.CombinableMatcher.both;


public class LinksValidation {

    private HomePage homePage;

    @When("The home page is loaded")
    public void the_home_page_is_loaded() {

    }

    @Then("I should be able view all the links")
    public void i_should_be_able_view_all_the_links() throws IOException {
    assertThat("Link pages are not mapped correctly, please investigate",
            new HomePage().getResponseCode(), hasKey(200));

    }
}
