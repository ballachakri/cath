package configurations;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import utils.FailedTestCaseScenarios;

import java.io.File;
import java.io.IOException;

public class Hooks extends BaseUIPageObject<Hooks> {

    private String TEST_ENVIRONMENT="https://www.cathkidston.com/";

    @Before
    public void setUpHomePage() {
        setUpBrowser(TEST_ENVIRONMENT);
        maximizeBrowser();
    }


    @After
    public void tearDown(Scenario scenario) {
        String name=scenario.getName();
        if(scenario.isFailed()) {
            FailedTestCaseScenarios.getScreenShot(name);
         }
        driver.close();
    }

}
