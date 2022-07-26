package starter.pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdminPage extends PageObject {
    @FindBy(xpath = "//span[contains(text(),\"Culture\")]")
    WebElement cultureMenu;
    public void clickMenuCulture(){
        cultureMenu.click();
    }
}
