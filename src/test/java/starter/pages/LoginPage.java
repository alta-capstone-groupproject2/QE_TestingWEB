package starter.pages;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://lamiapp.netlify.app/login")
public class LoginPage extends PageObject {

    @FindBy(xpath = "//p[contains(text(),\"Login\")]")
    WebElement headerLogin;
    public Boolean headerLoginIsDisplayed(){
        return headerLogin.isDisplayed();
    }

    @FindBy(xpath = "//button[contains(text(),\"OK\")]")
    WebElement alertOk;
    public void clickAlertOK(){
        alertOk.click();
    }

    @FindBy(xpath = "//body/div[@id='root']/div[1]/nav[1]/div[1]")
    WebElement adminHeader;
    public String getAdminHeader(){
        return adminHeader.getText();
    }
}
