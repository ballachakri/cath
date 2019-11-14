package utils;

import configurations.BaseUIPageObject;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;

public class FailedTestCaseScenarios extends BaseUIPageObject {

    public static void getScreenShot(String TestScenarioName) {

        TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
        File imgage = takesScreenshot.getScreenshotAs(OutputType.FILE);

        try {
            FileHandler.copy(imgage, new File("src/test/reports/ScreenShots/"+TestScenarioName+".png"));
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
