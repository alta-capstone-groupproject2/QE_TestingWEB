package starter.step;

import net.thucydides.core.annotations.Step;
import starter.pages.LoginPage;

import java.util.concurrent.TimeUnit;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoginStep {

    LoginPage loginPage;

    @Step
    public void openLoginPage(){
        loginPage.open();
    }

    @Step
    public void verifyLoginPage(){
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        assertTrue(loginPage.headerLoginIsDisplayed());
    }

    @Step
    public void clickAlertOK(){
        loginPage.clickAlertOK();
    }

    @Step
    public void verifyAdminPage(){
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        assertThat(loginPage.getAdminHeader(), containsString("admin"));
    }
}
