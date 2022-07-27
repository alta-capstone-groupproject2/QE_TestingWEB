package starter.stepdef;

import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.step.CulturesStep;
import starter.step.EventsStep;
import starter.step.MyEventStep;

public class CulturesStepdefs {

    @Steps
    CulturesStep culturesStep;
    @Steps
    EventsStep eventsStep;

    @When("User click data {string}")
    public void userClickDataCulture(String data) {
        switch (data.toLowerCase()){
            case "culture" :
                culturesStep.clickCulture();
                break;
            case "event" :
                eventsStep.clickDataEvents();
                break;
            default:
        }
    }
}
