package starter.pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;

public class DetailEventAdminPage extends PageObject {

    @FindBy(xpath = "//*[contains(text(), \"Accept\")]")
    WebElement acceptButton;
    public void clickAcceptButton(){
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        acceptButton.click();
    }

}
