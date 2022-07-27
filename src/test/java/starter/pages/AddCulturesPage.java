package starter.pages;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://lamiapp.netlify.app/add-culture")
public class AddCulturesPage extends PageObject {


    public void clickAddButtonCultureAdmin(){
        WebElement addButtonCultureAdmin = getDriver().switchTo().activeElement().findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/a[1]/div[1]"));
        addButtonCultureAdmin.click();
    }

    @FindBy(id = "input-title")
    WebElement fieldTitle;
    public void inputFieldTitle(String title){
        fieldTitle.sendKeys(title);
    }

    @FindBy(id = "input-photo")
    WebElement uploadPhoto;
    public void inputUploadPhoto(String path){
        uploadPhoto.sendKeys(path);
    }

    @FindBy(id = "input-detail")
    WebElement fieldDetail;
    public void inputFieldDetail(String detail){
        fieldDetail.sendKeys(detail);
    }

    @FindBy(id = "input-city")
    WebElement fieldCity;
    public void inputFieldCity(String city){
        fieldCity.sendKeys(city);
    }
}
