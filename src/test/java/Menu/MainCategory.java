package Menu;

import Menu.GlobalContants.Categories_Constants;
import configurations.BaseUIPageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.swing.plaf.TableHeaderUI;
import java.util.List;
import java.util.Objects;

public class MainCategory extends BaseUIPageObject<MainCategory> {

    @FindBy(css = "ul[class='level_1 children_13'] a[class='level_1']")
    private List<WebElement> categories;

    public MainCategory() {
        PageFactory.initElements(driver,this);
    }
    public void category(String menuCategory)
    {




        for(WebElement element: categories)
        {

            if(menuCategory.equals(Categories_Constants.NEW_IN.toString())) {
                String s=menuCategory.replace("_"," ");
                menuCategory=s;
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            String str=element.getText();
            if(str.equals(menuCategory))
            {
                element.click();
                System.out.println("clicked");
                break;
            }
            System.out.println(str);

        }
    }
}
