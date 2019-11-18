package Menu;

import Menu.GlobalContants.Menus_Constants;
import configurations.BaseUIPageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class MainMenu extends BaseUIPageObject<MainMenu> {

    @FindBy(css = "div[id='header_stripe'] ul[class='sub_navigation'] li")
    private List<WebElement> topLevelMenu;

    public MainMenu() {
        PageFactory.initElements(driver, this);
    }

    public void sam(String menu) {

        for (WebElement topMenu : topLevelMenu) {
             String str=topMenu.getText();

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if(menu.equals(Menus_Constants.LOGIN_REGISTER.toString()))
            {
                String str1=menu.replace("_","/");
                menu=str1;
                System.out.println(menu);
            }
            if(str.equals(menu))
             {
                utils.Waits.waitUntilClickable(topMenu);
                topMenu.click();
                System.out.println("clicked button");
                break;

             }

        }
    }
}
