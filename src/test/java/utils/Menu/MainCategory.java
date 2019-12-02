package utils.Menu;

import configurationsbase.BaseUIPageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

/**
 * <p>
 * Menu > Main Category
 * </p>
 */
public class MainCategory extends BaseUIPageObject {

    @FindBy(css = "ul[class='level_1 children_13'] a[class='level_1']")
    private List<WebElement> categories;

    public MainCategory() {
        PageFactory.initElements(driver,this);
    }

    public void category(String menuCategory) {

        /**
         * <p>
         *     This method clicks the Category Menu and navigates to the given parameter page.
         * </p>
         */
        for (WebElement element : categories) {

            if (menuCategory.equals(CategoryConstants.NEW_IN.toString())) {
                String newin = menuCategory.replace("_", " ");
                menuCategory = newin;
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            String elementText = element.getText();
            if (elementText.equals(menuCategory)) {
                element.click();

                break;
            }
        }
    }
}
