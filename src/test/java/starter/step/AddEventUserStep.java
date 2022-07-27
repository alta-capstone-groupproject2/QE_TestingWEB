package starter.step;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.openqa.selenium.Keys;
import starter.pages.AddEventUserPage;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class AddEventUserStep {

    AddEventUserPage addEventUserPage;

    @Step
    public void verifyApplyEvent(){
        assertTrue(addEventUserPage.applyEventIsDisplayed());
    }

    @Step
    public void uploadFileDoc(String path){
        addEventUserPage.uploadFileDoc(path);
    }

    @Step
    public void inputFieldName(String data){
        addEventUserPage.inputFieldName(data);
    }

    @Step
    public void inputFieldHost(String data){
        addEventUserPage.inputFieldHost(data);
    }

    @Step
    public void inputFieldStartDate(String data){
        addEventUserPage.inputFieldStartDate(data);
    }

    @Step
    public void inputFieldEndDate(String data){
        addEventUserPage.inputFieldEndDate(data);
    }

    @Step
    public void inputFieldPrice(String data){
        addEventUserPage.inputFieldPrice(data);
    }

    @Step
    public void inputFieldAddresEvent(String data){
        addEventUserPage.inputFieldAddresEvent(data);
    }

    @Step
    public void verifyEventSuccessInput(String data){
        assertTrue(addEventUserPage.checkEvent(data));
    }
}
