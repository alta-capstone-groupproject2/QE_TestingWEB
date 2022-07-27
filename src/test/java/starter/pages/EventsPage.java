package starter.pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EventsPage extends PageObject {

    @FindBy(xpath = "//h1[contains(text(),\"Event\")]")
    WebElement eventHead;
    public Boolean eventHeadIsDisplayed(){
        return eventHead.isDisplayed();
    }

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]")
    WebElement dataEvents;
    public void clickDataEvents(){
        dataEvents.click();
    }
}
