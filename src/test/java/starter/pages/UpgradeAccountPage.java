package starter.pages;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://lamiapp.netlify.app/dashboard")
public class UpgradeAccountPage extends PageObject {

    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[2]/div[1]/button[1]")
    WebElement buttonUpgradeAccount;
    public void clickButtonUpgradeAccount(){
        buttonUpgradeAccount.click();
    }

    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[2]/p[1]")
    WebElement upgradeAccountHeader;
    public Boolean upgradeAccountHead(){
        return upgradeAccountHeader.isDisplayed();
    }

    @FindBy(id = "input-doc")
    WebElement fieldUploadDoc;
    public void uploadFileDoc(String path){
        fieldUploadDoc.sendKeys(path);
    }

    @FindBy(id = "input-name")
    WebElement inputFieldStoreName;
    public void inputFieldStore(String data){
        inputFieldStoreName.sendKeys(data);
    }

    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/input[1]")
    WebElement inputFieldOwnerName;
    public void inputFieldOwner(String data){
        inputFieldOwnerName.sendKeys(data);
    }

    @FindBy(id = "input-phone")
    WebElement inputFieldPhone;
    public void inputPhoneField(String data){
        inputFieldPhone.sendKeys(data);
    }

    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[5]/div[1]/input[1]")
    WebElement inputFieldCityName;
    public void inputFieldCity(String data){
        inputFieldCityName.sendKeys(data);
    }

    @FindBy(id = "input-detail")
    WebElement inputFieldAddressDetail;
    public void inputFieldAddress(String data){
        inputFieldAddressDetail.sendKeys(data);
    }
}
