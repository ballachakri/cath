package configurations;

import io.github.bonigarcia.wdm.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.PageFactory;

public class BaseUIPageObject<H extends BaseUIPageObject> {

    public static WebDriver driver;
    private String browser = "chrome";

    public BaseUIPageObject(WebDriver driver) {
        this.driver=driver;
    }

    public BaseUIPageObject() {
        PageFactory.initElements(driver, this);
    }

    public void setUpBrowser(String testEnvironment) {

        switch (browser) {
            case "chrome": {
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                driver.get(testEnvironment);
                break;
            }
            case "ie": {
                WebDriverManager.iedriver().setup();
                driver = new InternetExplorerDriver();
                driver.get(testEnvironment);
                break;
            }
            case "edge": {
                WebDriverManager.edgedriver();
                driver = new EdgeDriver();
                driver.get(testEnvironment);
                break;
            }
            case "safari": {
                driver = new SafariDriver();
                driver.get(testEnvironment);
                break;
            }
            default: {
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                driver.get(testEnvironment);
                break;
            }

        }
    }

    public void maximizeBrowser() {
        driver.manage().window().maximize();
    }

    public void shutDownBrowser() {
        driver.quit();
    }


}
