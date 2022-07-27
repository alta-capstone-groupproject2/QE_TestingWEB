package starter.stepdef;

import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;
import starter.step.AddEventUserStep;

public class AddEventUserStepdefs {

    @Steps
    AddEventUserStep addEventUserStep;

    @Then("Content {string} appear in {string}")
    public void contentAppearIn(String data, String arg1) {
        addEventUserStep.verifyEventSuccessInput(data);
    }
}
