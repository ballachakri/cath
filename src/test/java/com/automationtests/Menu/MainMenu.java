package com.automationtests.Menu;

import configurations.BaseUIPageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

/**
 * Menu > Top level Main Menu
 */
public class MainMenu extends BaseUIPageObject<MainMenu> {

    @FindBy(css = "div[id='header_stripe'] ul[class='sub_navigation'] li")
    private List<WebElement> topLevelMenu;

    public MainMenu() {
        super();// PageFactory.initElements(driver, this);
    }

    /**
     * <p>
     * This method clicks the Top Level Menu and navigates to the given parameter page.
     * </p>
     * @param menu
     */
    public void getTopLevelMenu(String menu) {

        for (WebElement topMenu : topLevelMenu) {
            String elementText = topMenu.getText();

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
                utils.Waits.waitUntilClickable(topMenu);
                topMenu.click();
                break;
            }
        }
    }
}
