package utils;

import configurations.BaseUIPageObject;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

/**
 * <p>
 * Code to check the broken hyper links on the web page.
 * </p>
 */
public class LinkChecks extends BaseUIPageObject<LinkChecks> {

    /**
     * This methods get all the href attributes by tag name "a"
     * And pass each link a parameter check response method.
     *
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.cathkidston.com/");
        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println(links.size());
        for (WebElement ele : links) {
            String linkURL = ele.getAttribute("href");
            checkResponse(linkURL);
        }
    }

    /**
     * This method get connection to the hyper linked page as URL.
     * And opens connection with to links get response code and response message.
     *
     * @param links
     * @throws IOException
     */
    public static void checkResponse(String links) throws IOException {
        URL url = new URL(links);
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setConnectTimeout(3000);
        int respCode = con.getResponseCode();
        if (con.getResponseCode() == 200) {
            System.out.println(links + " response code  :" + respCode + " :  " + con.getResponseMessage());
        }
        if (con.getResponseCode() == HttpURLConnection.HTTP_NOT_FOUND) {
            System.out.println(links + " response code  :" + respCode + " :  " + con.getResponseMessage() +
                    HttpURLConnection.HTTP_NOT_FOUND);
        }
    }
}

