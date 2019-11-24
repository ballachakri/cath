package Important_Java_Topics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.List;

public class DatePicker {

    private static WebDriver driver1;

    public static void main(String[] args) throws InterruptedException {

        // launch the browser
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\sball\\Downloads\\BrowserDrivers\\chromedriver.exe");
        driver1 = new ChromeDriver();
        driver1.manage().window().maximize();
        driver1.get("https://en-en.mytrip.com/");
        selectDate("2020", "November", "21");
        close();
    }

    private  static void selectDate(String year, String month, String date) throws InterruptedException {

        // Clicking on the departure calender
        WebElement departureDate = driver1.findElement(By.cssSelector("input[id='visualDepartureDate']"));
        new Actions(driver1).moveToElement(departureDate).click().build().perform();

        // Getting the current current month and year
        List<WebElement> months = driver1.findElements(By.cssSelector("div[class='DayPicker-Months'] div[class='DayPicker-Caption']"));

        // Getting the Next Arrow on the Calender
        WebElement nextArrow = driver1.findElement(By.cssSelector("span[aria-label~='Next']"));

        // Checking the current Month and Year with user choice Month and Year
        if (!months.get(0).getText().equals(month + " " + year)) {

            // Iterating the Desired Month and Year by clicking next arrow button
            do {
                nextArrow.click();
            } while (!months.get(0).getText().equals(month + " " + year));

        }

        // Selecting the date
        List<WebElement> dates = driver1.findElements(By.cssSelector("div[class='DayPicker-Day'] "));
        for (int i = 0; i < dates.size(); i++) {
            if (dates.get(i).getText().equals(date)) {
                dates.get(i).click();
            }
        }
        System.out.println("selected departure date as   : " +month +"  "+ year + "   " +date );
    }

    private static void close()
    {
        driver1.quit();
    }

}



