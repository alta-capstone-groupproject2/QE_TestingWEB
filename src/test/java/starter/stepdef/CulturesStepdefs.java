package starter.stepdef;

import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.step.CulturesStep;

public class CulturesStepdefs {

    @Steps
    CulturesStep culturesStep;

    @When("User click data culture")
    public void userClickDataCulture() {
        culturesStep.clickCulture();
    }
}
