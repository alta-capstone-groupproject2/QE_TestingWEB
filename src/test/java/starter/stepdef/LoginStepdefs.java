package starter.stepdef;

import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.step.LoginStep;

public class LoginStepdefs {

    @Steps
    LoginStep loginStep;

    @When("User click {string}")
    public void adminClick(String obj) {
        loginStep.clickAlertOK(obj);
    }
}
