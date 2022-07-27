package starter.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MyEventPage extends PageObject {

    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[2]/p[1]")
    WebElement myEventHead;
    public Boolean myEventHeadIsDisplayed(){
        return myEventHead.isDisplayed();
    }

    public void buttonPlus(){
        WebElement buttonPlus = getDriver().switchTo().activeElement().findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/a[1]/div[1]"));
        buttonPlus.click();
    }
}
