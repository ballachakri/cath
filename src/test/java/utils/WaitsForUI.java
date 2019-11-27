package utils;

import configurationsbase.BaseUIPageObject;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.*;

import java.util.concurrent.TimeUnit;

/**
 * Utils > Waits -pre-defined waits
 */
public class WaitsForUI extends BaseUIPageObject {

    public WaitsForUI() {
        PageFactory.initElements(driver, this);
    }

    /**
     * <p>
     * This method waits for the element to be visible.
     * Passing element as argument.
     * </p>
     *
     * @param element
     */
    public static void waitUntilVisibility(final WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, 3000);
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    /**
     * <p>
     * This method waits for the element to be clickable.
     * Passing element as argument.
     * </p>
     *
     * @param element
     */

    public static void waitUntilClickable(final WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, 3000);
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    /**
     * <p>
     * This method waits for the element to be invisible.
     * Passing element as argument.
     * </p>
     *
     * @param element
     */

    public static void waitUntilDisappeared(final WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, 3000);
        wait.until(ExpectedConditions.invisibilityOf(element));
    }

    /**
     * Fluent wait not implemented but trying use in near future.
     * @param element
     * @return
     */
    public static boolean waitFluentlyUntilVisibility(WebElement element) {
        boolean elementPresence = false;

        Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver)
                .withTimeout(3000, TimeUnit.MILLISECONDS)
                .pollingEvery(500, TimeUnit.MILLISECONDS)
                .ignoring(NoSuchElementException.class);

        fluentWait.until(ExpectedConditions.visibilityOf(element));

        if (element.isDisplayed()) {
            elementPresence = true;
        }
        return elementPresence;


    }

}

