package configurationsbase;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.PropertyConfigurator;
import org.slf4j.Logger;
import utils.FailedTestCases;

import static org.slf4j.LoggerFactory.getLogger;

public class Hooks extends BaseUIPageObject {

    private String TEST_ENVIRONMENT="https://www.cathkidston.com/";

    /**
     *    initialize Log4j Logger --
     */

    final static Logger log= getLogger(Hooks.class);

    @Before
    public void setUpHomePage()  {

        /** Configure Basic configuration for logging  */
        BasicConfigurator.configure();

        /**
         * configure the log4j property file to append the reporting files
         */
        PropertyConfigurator.configure("log4j.properties");
        setUpBrowser(TEST_ENVIRONMENT);
        //setUpGrid(TEST_ENVIRONMENT);
        maximizeBrowser();
        System.out.println("need to change and implement data base testing.......................................@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@!");
        log.info("Browser Launched........................................!");
        log.info("checking the feature branches in git ....................................................");
    }


    @After
    public void tearDown(Scenario scenario) {
        String name=scenario.getName();
        if(scenario.isFailed()) {
            FailedTestCases.getScreenShot(name);
         }
        log.info("Browser Tear Down........................................!");
        driver.close();
    }

}
