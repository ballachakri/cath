package utils;

import configurations.BaseUIPageObject;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;

/**
 * Utils > FailedTestCases
 */
public class FailedTestCases extends BaseUIPageObject {
    /**
     * <p>
     *     This method captures the screen shot of the failed test scenarios.
     *     Stores a .png file in ScreenShots folder (given file path).
     * </p>
     * @param TestScenarioName
     */
    public static void getScreenShot(String TestScenarioName) {

        TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
        File image = takesScreenshot.getScreenshotAs(OutputType.FILE);

        try {
            FileHandler.copy(image, new File("src/test/reports/ScreenShots/"+TestScenarioName+".png"));
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
