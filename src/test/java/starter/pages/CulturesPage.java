package starter.pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CulturesPage extends PageObject {
    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div[1]/div/h1")
    WebElement culturHead;
    public Boolean cultureHeaderIsDisplayed(){
        return culturHead.isDisplayed();
    }

    @FindBy(id = "card-culture")
    WebElement listCulture;
    public Boolean cultureData(){
        return listCulture.isDisplayed();
    }

    @FindBy(id = "culture-city-location")
    WebElement locationCulture;
    public Boolean locationCulture(){
        return locationCulture.isDisplayed();
    }

    @FindBy(id = "description-culture")
    WebElement detailCulture;
    public Boolean detailCulture(){
        return detailCulture.isDisplayed();
    }

    @FindBy(id = "image-culture")
    WebElement imageCulture;
    public Boolean imageCulture(){
        return imageCulture.isDisplayed();
    }

    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/img[1]")
    WebElement clickCulture;
    public void clickCulture(){
        clickCulture.click();
    }

    @FindBy(id = "report-culture")
    WebElement fieldReportCulture;
    public void inputFieldReportCulture(String report){
        fieldReportCulture.sendKeys(report);
    }

    @FindBy(id = "report-submit")
    WebElement buttonSubmitReport;
    public void clickSubmitReport(){
        buttonSubmitReport.click();
    }
}
