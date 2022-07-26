package starter.step;

import net.thucydides.core.annotations.Step;
import org.apache.commons.lang3.RandomStringUtils;
import starter.pages.RegisterPage;

import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RegisterStep {
    RegisterPage registerPage;

    @Step
    public void openRegisterPage(){
        registerPage.open();
    }

    @Step
    public void verifySignUpPage(){
        assertTrue(registerPage.headerRegisterPage());
    }

    @Step
    public void inputFieldUsername(String username){
        registerPage.inputNameField(username);
    }

    @Step
    public void inputFieldEmail(String email){
        registerPage.inputEmailField(email);
    }

    @Step
    public void inputFieldPassword(String password){
        registerPage.inputPasswordField(password);
    }

    @Step
    public void clickButtonSignup(){
        registerPage.clickButtonSignup();
    }

    @Step
    public void popUpMessage(String message){
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        assertTrue(registerPage.popUpMessage(message));
    }
}
