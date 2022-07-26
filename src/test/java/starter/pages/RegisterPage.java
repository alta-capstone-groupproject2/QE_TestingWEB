package starter.pages;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://lamiapp.netlify.app/signup")
public class RegisterPage extends PageObject {

    @FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div/div[1]/p")
    WebElement headerElement;
    public Boolean headerRegisterPage(){
        return headerElement.isDisplayed();
    }

    @FindBy(id = "input-username")
    WebElement fieldUsername;
    public void inputNameField(String username){
        fieldUsername.sendKeys(username);
    }

    @FindBy(id = "input-email")
    WebElement fieldEmail;
    public void inputEmailField(String email){
        fieldEmail.sendKeys(email);
    }

    @FindBy(id = "input-password")
    WebElement fieldPassword;
    public void inputPasswordField(String password){
        fieldPassword.sendKeys(password);
    }

    @FindBy(id = "button-submit")
    WebElement buttonSignUp;
    public void clickButtonSignup(){
        buttonSignUp.click();
    }

    public Boolean popUpMessage(String message){
        WebElement alert = getDriver().findElement(By.xpath("//*[ text() = \""+message+"\" ]"));
        return alert.isDisplayed();
    }
}
