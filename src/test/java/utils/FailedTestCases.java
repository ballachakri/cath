package utils;

import configurations.BaseUIPageObject;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;

public class FailedTestCases extends BaseUIPageObject {

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
