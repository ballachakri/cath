package utils.Menu;

import configurationsbase.BaseUIPageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

/**
 * Menu > Top level Main Menu
 */
public class MainMenu extends BaseUIPageObject {

    @FindBy(css = "div[id='header_stripe'] ul[class='sub_navigation'] li")
    private static List<WebElement> topLevelMenu;

//    public MainMenu() {
//       PageFactory.initElements(driver, this);
//    }

    /**
     * <p>
     * This method clicks the Top Level Menu and navigates to the given parameter page.
     * </p>
     * @param menu
     */
    public static void getTopLevelMenu(String menu) {

        for (WebElement topMenu : topLevelMenu) {
            String elementText = topMenu.getText();

            System.out.println(elementText);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (menu.equals(MainMenuConstants.LOGIN_REGISTER.toString())) {
                String loginRegister = menu.replace("_", "/");
                menu = loginRegister;

            }
            if (elementText.equals(menu)) {
                utils.WaitsForUI.waitUntilClickable(topMenu);
                topMenu.click();
                break;
            }
        }
    }
}
