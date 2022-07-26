package starter.pages;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://lamiapp.netlify.app/list-culture-admin")
public class CultureAdminPage extends PageObject {

    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[2]/p[1]")
    WebElement cultureHead;
    public Boolean cultureAdminHeader(){
        return cultureHead.isDisplayed();
    }

    @FindBy(xpath = "//*[local-name()=\"svg\" and @data-icon=\"plus\"]/*[local-name()=\"path\"]")
    WebElement addButton;
    public void clickaddButton(){
        addButton.click();
    }

    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/button[1]")
    WebElement buttonDetail;
    public void clickButtonDetail(){
        buttonDetail.click();
    }

    @FindBy(xpath = "//p[contains(text(),\"Reports\")]")
    WebElement reportText;
    public Boolean reportTextIsDisplayed(){
        return reportText.isDisplayed();
    }
    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]")
    WebElement reportData;
    public Boolean reportDataIsDisplayed(){
        return reportData.isDisplayed();
    }
}
