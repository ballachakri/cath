package pageobjects;

import configurationsbase.BaseUIPageObject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.*;


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

    @FindBy(css = "a[href]")
    private List<WebElement> allLinks;

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
     * This method returns current page title
     * </p>
     *
     * @return
     */
    public String getTheCurrentURL() {
        System.out.println(driver.getCurrentUrl());
        return driver.getCurrentUrl();
    }

    /**
     * <p>
     * This methods check for all the links on the home page and return the response dode.
     * </p>
     */
    public Map<Integer, String> getResponseCode() throws IOException {
        Map<Integer, String> responseCode = new HashMap<Integer, String>();

        BufferedWriter bw= new BufferedWriter(new FileWriter("src/test/zfiles/links.txt"));
        for (WebElement list : allLinks) {
            try {
                URL url = new URL(list.getAttribute("href"));
                HttpURLConnection hcon = (HttpURLConnection) url.openConnection();
                hcon.setConnectTimeout(3000);
                hcon.connect();

                if (hcon.getResponseCode() == 200) {
                    System.out.println(list.getAttribute("href") + " :  " + hcon.getResponseCode() + " : " + hcon.getResponseMessage());
                    String str=list.getAttribute("href") + " :  " + hcon.getResponseCode() + " : " + hcon.getResponseMessage();
                    bw.write(str);
                    bw.newLine();
                    responseCode.put(hcon.getResponseCode(), hcon.getResponseMessage());
                }
                if (hcon.getResponseCode() == hcon.HTTP_NOT_FOUND) {
                    System.out.println(list.getAttribute("href") + " :  " + hcon.getResponseCode() + " : " + hcon.getResponseMessage());
                }
           //  bw.flush();
            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

        return responseCode;
    }

}
