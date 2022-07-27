package starter.pages;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://lamiapp.netlify.app")
public class LandingPage extends PageObject {

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/nav[1]/div[1]/div[2]/div[1]/a[1]")
    WebElement loginLink;
    public void clickLogin(){
        loginLink.click();
    }

    @FindBy(xpath = "//body/div[@id='root']/div[1]/nav[1]/div[1]/div[2]/div[1]/a[2]")
    WebElement signupLink;
    public void clickSignUp(){
        signupLink.click();
    }

    @FindBy(id = "link-to-Cultures")
    WebElement linkCultures;
    public void clickLinkCultures(){
        linkCultures.click();
    }

    @FindBy(id = "link-to-Event")
    WebElement linkEvent;
    public void clickLinkEvent(){
        linkEvent.click();
    }
}
