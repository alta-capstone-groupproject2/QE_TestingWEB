package starter.pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;

public class AddEventUserPage extends PageObject {

    @FindBy(xpath = "//p[contains(text(),\"Apply Event\")]")
    WebElement applyEventHead;
    public Boolean applyEventIsDisplayed(){
        return applyEventHead.isDisplayed();
    }

    @FindBy(id = "input-doc")
    WebElement fieldDoc;
    public void uploadFileDoc(String path){
        fieldDoc.sendKeys(path);
    }

    @FindBy(id = "input-name")
    WebElement fieldName;
    public void inputFieldName(String data){
        fieldName.sendKeys(data);
    }

    @FindBy(id = "input-host")
    WebElement fieldHost;
    public void inputFieldHost(String data){
        fieldHost.sendKeys(data);
    }

    @FindBy(xpath = "//input[@id='input-start-date']")
    WebElement fieldStartDate;
    public void inputFieldStartDate(String data){
        String data1 = data.substring(0, data.indexOf(":"));
        fieldStartDate.sendKeys(data1);
        fieldStartDate.sendKeys(Keys.ARROW_RIGHT);
        fieldStartDate.sendKeys(data.substring(data.indexOf(":")+1));
    }

    @FindBy(xpath = "//input[@id='input-end-date']")
    WebElement fieldEndDate;
    public void inputFieldEndDate(String data){
        String data1 = data.substring(0, data.indexOf(":"));
        fieldEndDate.sendKeys(data1);
        fieldEndDate.sendKeys(Keys.ARROW_RIGHT);
        fieldEndDate.sendKeys(data.substring(data.indexOf(":")+1));
    }

    @FindBy(id = "input-price")
    WebElement fieldPrice;
    public void inputFieldPrice(String data){
        fieldPrice.sendKeys(data);
    }

    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[10]/div[1]/div[2]/div[5]/form[1]/input[1]")
    WebElement fieldAddressEvent;
    public void inputFieldAddresEvent(String data){
        fieldAddressEvent.sendKeys(data);
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        fieldAddressEvent.sendKeys(Keys.ARROW_DOWN);
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        fieldAddressEvent.sendKeys(Keys.ENTER);
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public Boolean checkEvent(String data){
        WebElement element = getDriver().findElement(By.xpath("//*[text()=\""+data+"\"]"));
        return element.isDisplayed();
    }
}
