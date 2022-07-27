package starter.pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPage extends PageObject {
    @FindBy(xpath = "//p[contains(text(),\"Profile\")]")
    WebElement profileHead;
    public Boolean profilHeaderIsDisplayed(){
        return profileHead.isDisplayed();
    }

    @FindBy(xpath = "//p[contains(text(),\"My Event\")]")
    WebElement myEventMenu;
    public void clickMyEvent(){
        myEventMenu.click();
    }
}
