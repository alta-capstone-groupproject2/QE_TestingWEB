package starter.pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EventDetailPage extends PageObject {

    @FindBy(xpath = "//button[@id=\"join-event\"]")
    WebElement buttonJoin;
    public void clickButtonJoin(){
        buttonJoin.click();
    }
}
