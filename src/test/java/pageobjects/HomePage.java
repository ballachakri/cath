package pageobjects;

import configurations.BaseUIPageObject;
import org.junit.experimental.theories.Theories;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * <p>
 *     Page object > Home Page
 * </p>
 */
public class HomePage extends BaseUIPageObject {

    @FindBy(css = "button[id='onesignal-popover-cancel-button']")
    private WebElement noThanksButton;

    @FindBy(css ="div[class='cookie_policy_x']" )
    private WebElement xCookies;

    @FindBy(css = "input[id='top_search']")
    private WebElement searchTextField;

    @FindBy(css = "#search > fieldset > div > button")
    private WebElement magnifyingGlassIcon;

    @FindBy(css = "p[class='page_summary'] span:nth-child(1)")
    private WebElement searchResultsTitle;



    /**
     * This method clears the cookies and notifications.
     * Then setup the Home Page
     */
    public void openHomePage() {
        disableNotification();
        killCookies();
       }
    /**
     * <p>
     * This method clicks cancel notifications button.
     * </p>
     */
    private void disableNotification() {

        utils.WaitsForUI.waitUntilVisibility(noThanksButton);
        noThanksButton.click();
            }
    /**
     * <p>
     * This method clicks cookies x icon.
     * </p>
     */
    private void killCookies() {

       utils.WaitsForUI.waitUntilVisibility(xCookies);
       xCookies.click();

    }
    /**
     * <p>
     *     This method enters product in search Test field.
     * </p>
     */
    public HomePage searchProduct(final String product) {

        //searchTextField.sendKeys(product);
        searchTextField.sendKeys(product,Keys.ENTER);
        return this;
    }

    /**
     * <p>
     * This method clicks search icon.
     * </p>
     */
    public HomePage clickMagnifyingGlassIcon() {
       // searchTextField.sendKeys(Keys.ENTER);
    //new Actions(driver).click(magnifyingGlassIcon).click().build().perform();
        return this;
    }

    /**
     * <p>
     *     This method returns the search result text.
     * </p>
     * @return
     */
    public String getSearchResultTitle() {
        utils.WaitsForUI.waitUntilVisibility(searchResultsTitle);
        return searchResultsTitle.getText();
    }

}
