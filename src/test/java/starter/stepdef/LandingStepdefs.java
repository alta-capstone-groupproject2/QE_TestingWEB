package starter.stepdef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import net.thucydides.core.annotations.Steps;
import starter.step.AdminStep;
import starter.step.DashboardStep;
import starter.step.EventsStep;
import starter.step.LandingStep;

public class LandingStepdefs {

    @Steps
    LandingStep landingStep;
    @Steps
    AdminStep adminStep;
    @Steps
    DashboardStep dashboardStep;

    @Given("User open lamiApp")
    public void userOpenLamiApp() {
        landingStep.openLandingPage();
    }

    @And("User click {string} menu")
    public void userClickMenu(String menu) {
        switch (menu){
            case "login" :
                landingStep.clickLoginMenu();
                break;
            case "Culture" :
                adminStep.clickCultureMenu();
                break;
            case "Cultures" :
                landingStep.clickCultureMenu();
                break;
            case "My Event" :
                dashboardStep.clickMyEvent();
                break;
            case "events" :
                landingStep.clickEventMenu();
                break;
            default:
        }
    }
}
