package configurationsbase;

import io.github.bonigarcia.wdm.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.PageFactory;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseUIPageObject {

    public static WebDriver driver;
    private String browser = "chrome";

    public BaseUIPageObject()
    {
        PageFactory.initElements(driver,this);
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
                WebDriverManager.edgedriver().setup();
                driver = new EdgeDriver();
                driver.get(testEnvironment);
                break;
            }
            case "safari": {
                driver = new SafariDriver();
                driver.get(testEnvironment);
                break;
            }
            case "opera": {
                WebDriverManager.operadriver().setup();
                driver=new OperaDriver();
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

    public void setUpGrid(String testEnvironment) throws MalformedURLException {
        DesiredCapabilities cap;

        switch (browser) {
            case "chrome": {
                cap =DesiredCapabilities.chrome();
                driver = new RemoteWebDriver(new URL("http://192.168.56.1:4444/wd/hub"), cap);
                driver.get(testEnvironment);
                break;
            }
            case "ie": {
                cap = DesiredCapabilities.internetExplorer();
                driver = new RemoteWebDriver(new URL("http://192.168.56.1:4444/wd/hub"), cap);

                driver.get(testEnvironment);
                break;
            }
            case "edge": {
                cap = DesiredCapabilities.edge();
                driver = new RemoteWebDriver(new URL("http://192.168.56.1:4444/wd/hub"), cap);
                driver.get(testEnvironment);
                break;
            }
            case "safari": {
                cap = DesiredCapabilities.safari();
                driver = new RemoteWebDriver(new URL("http://192.168.56.1:4444/wd/hub"), cap);
                driver.get(testEnvironment);
                break;
            }
            case "opera": {
                cap = DesiredCapabilities.opera();
                driver = new RemoteWebDriver(new URL(" http://192.168.56.1:4444/wd/hub"), cap);
                driver.get(testEnvironment);
                break;
            }
            default: {
                cap = DesiredCapabilities.firefox();
                driver = new RemoteWebDriver(new URL(" http://192.168.56.1:4444/wd/hub"), cap);
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
