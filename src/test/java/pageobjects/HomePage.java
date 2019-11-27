package pageobjects;

import configurationsbase.BaseUIPageObject;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.WaitsForUI;

/**
 * <p>
 * Page object > Home Page
 * </p>
 */
public class HomePage extends BaseUIPageObject {

    @FindBy(css = "button[id='onesignal-popover-cancel-button']")
    private WebElement noThanksButton;

    @FindBy(css = "div[class='cookie_policy_x']")
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
     * This method enters product name into search Test field and clicks Enter.
     * </p>
     */
    public HomePage searchProduct(final String product) {

        searchTextField.sendKeys(product);
        //or
       // searchTextField.sendKeys(product, Keys.ENTER);
        return this;
    }

    /**
     * <p>
     * This method clicks search icon.
     * </p>
     */
    public HomePage clickMagnifyingGlassIcon() {
           searchTextField.sendKeys(Keys.ENTER);
        //new Actions(driver).click(magnifyingGlassIcon).click().build().perform();
            return this;
    }

    /**
     * <p>
     * This method returns the search result text.
     * </p>
     *
     * @return
     */
    public String getSearchResultTitle() {
        utils.WaitsForUI.waitUntilVisibility(searchResultsTitle);
        return searchResultsTitle.getText();
    }

    /**
     * <p>
     *     This method returns current page title
     * </p>
     * @return
     */
    public String getCurrentURL() {
        System.out.println(driver.getCurrentUrl());
        return driver.getCurrentUrl();
    }


}
