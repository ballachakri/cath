package utils;

import configurations.BaseUIPageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.*;

/**
 * Utils > Waits -pre-defined waits
 */
public class WaitsForUI extends BaseUIPageObject {

    public WaitsForUI()
    {
        PageFactory.initElements(driver,this);
    }

    /**
     * <p>
     *    This method waits for the element to be visible.
     *    Passing element as argument.
     * </p>
     * @param element
     */
    public static void waitUntilVisibility(final WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, 3000);
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    /**
     * <p>
     *    This method waits for the element to be clickable.
     *    Passing element as argument.
     * </p>
     * @param element
     */

    public static void waitUntilClickable(final WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, 3000);
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    /**
     * <p>
     *    This method waits for the element to be invisible.
     *    Passing element as argument.
     * </p>
     * @param element
     */

    public static void waitUntilDisappeared(final WebElement element) {
        WebDriverWait wait=new WebDriverWait(driver,3000);
        wait.until(ExpectedConditions.invisibilityOf(element));
    }

    public static void waitFluentlyUntilVisibility(WebElement element)
    {
//        FluentWait<WebDriver> fluentWait=new FluentWait<>(driver);
//        fluentWait.withTimeout(2000,TimeUnit.MILLISECONDS).pollingEvery(2000,element)
//                            .withTimeout()
    }

}

