package utils;

import configurations.BaseUIPageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.*;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;


public class Waits extends BaseUIPageObject {

    public static void waitUntilVisibility(WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, 3000);
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public static void waitUntilClickable(WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, 3000);
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }
    public static void waitUntilDisappeared(WebElement element) {
        WebDriverWait wait=new WebDriverWait(driver,3000);
        wait.until(ExpectedConditions.invisibilityOf(element));
    }



}

