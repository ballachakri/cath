package pageobjects;

import configurations.BaseUIPageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * <p>
 *     Setup the Home Page
 * </p>
 */
public class HomePage extends BaseUIPageObject<HomePage> {

    @FindBy(css = "button[id='onesignal-popover-cancel-button']")
    private WebElement noThanksButton;

    @FindBy(css ="div[class='cookie_policy_x']" )
    private WebElement xCookies;

    @FindBy(css = "input[id='top_search']")
    private WebElement searchTextField;

    @FindBy(css = "#search > fieldset > div > button")
    private WebElement magnifyingGlassIcon;

    @FindBy(css = "div[id='search_summary'] span")
    private WebElement searchResultsTitle;

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    /**
     * This method clears the cookies and notifications.
     * Then setup the Home Page
     */
    public void openHomePage() {
        disableNotification();
        killCookies();
       }

    private void disableNotification() {
        utils.Waits.waitUntilVisibility(noThanksButton);
        noThanksButton.click();
        }

    private void killCookies() {
       utils.Waits.waitUntilVisibility(xCookies);
       xCookies.click();

    }

    public HomePage searchProduct(final String product) {
        searchTextField.sendKeys(product);
        return this;
    }

    public HomePage clickMagnifyingGlassIcon() {
        new Actions(driver).click(magnifyingGlassIcon).click().build().perform();
        return this;
    }

    public String getSearchResultTitle() {

        return searchResultsTitle.getText();

    }

}
