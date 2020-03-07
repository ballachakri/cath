package pageobjects;

import configurationsbase.BaseUIPageObject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.*;
import java.util.logging.Logger;


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

    @FindBy(css = "input[name='q']")
    private WebElement searchTextField;

    @FindBy(css = "h2[class='b-search_count-title']")
    private WebElement searchResultsTitle;

    @FindBy(css = "a[href]")
    private List<WebElement> allLinks;

    /**
     * This method clears the cookies and notifications.
     * Then setup the Home Page
     */
    public void openHomePage() {
//        disableNotification();
//        killCookies();
    }

    /**
     * This method clicks cancel notifications button.
     */
    private void disableNotification() {

        utils.WaitsForUI.waitUntilVisibility(noThanksButton);
        noThanksButton.click();
    }

    /**
     * This method clicks cookies x icon.
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
    public void searchProduct(final String product) {

        utils.WaitsForUI.waitUntilVisibility(searchTextField);
        searchTextField.sendKeys(product);
//        utils.WaitsForUI.waitForPageLoad();
        utils.WaitsForUI.waitFluentlyUntilVisibilityAndClick(searchTextField);
        searchTextField.sendKeys(Keys.ENTER);

    }

    /**
     * This method returns the search result text.
     */
    public String getSearchResultTitle() {
        utils.WaitsForUI.waitUntilVisibility(searchResultsTitle);
        String[] result = searchResultsTitle.getText().split("'");
        return result[1];
    }

    /**
     * This method returns current page title
     */
    public String getTheCurrentURL() {
        System.out.println(driver.getCurrentUrl());
        return driver.getCurrentUrl();
    }

    /**
     * This methods check for all the links on the home page and return the response dode.
     */
    public Map<Integer, String> getResponseCode() throws IOException {
        Map<Integer, String> responseCode = new HashMap<Integer, String>();

        BufferedWriter bw = new BufferedWriter(new FileWriter("src/test/zfiles/links.txt"));
        for (WebElement list : allLinks) {
            try {
                URL url = new URL(list.getAttribute("href"));
                HttpURLConnection hcon = (HttpURLConnection) url.openConnection();
                hcon.setConnectTimeout(3000);
                hcon.connect();

                if (hcon.getResponseCode() == 200) {
                    System.out.println(list.getAttribute("href") + " :  " + hcon.getResponseCode() + " : " + hcon.getResponseMessage());
                    String str = list.getAttribute("href") + " :  " + hcon.getResponseCode() + " : " + hcon.getResponseMessage();
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
