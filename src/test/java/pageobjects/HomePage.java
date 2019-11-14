package pageobjects;

import configurations.BaseUIPageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BaseUIPageObject<HomePage> {

    @FindBy(css = "button[id='onesignal-popover-cancel-button']")
    private WebElement noThanksButton;

    @FindBy(css ="div[class='cookie_policy_x']" )
    private WebElement xCookies;

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
}
