package stepDefs.ui;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.HomePage;
import utils.Menu.MainMenu;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;

public class MenuMenuValidationsStepDefs {

    private HomePage homePage;
    private String menu;
    @Given("I am on the HOME Page")
    public void i_am_on_the_HOME_Page() {
      homePage=new HomePage();
      homePage.openHomePage();
    }

    @When("I click\\/tap on the main menu link {string}")
    public void i_click_tap_on_the_main_menu_link(String menuLink) {
       menu=menuLink;
       new MainMenu().getTopLevelMenu(menuLink);
    }
// this con be done by getting current URL with string manipulation. in progress

    @Then("I should be able to land on the corresponding page")
    public void i_should_be_able_to_land_on_the_corresponding_page() {
        assertThat("Navigated to wrong page, please investigate",
                homePage.getTheCurrentURL(), containsString(menu));
    }

}
