package starter.stepdef;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.step.AddCultureStep;
import starter.step.CultureAdminStep;
import starter.step.MyEventStep;

public class CultureAdminStepdefs {

    @Steps
    CultureAdminStep cultureAdminStep;
    @Steps
    AddCultureStep addCultureStep;
    @Steps
    MyEventStep myEventStep;

    @Then("List culture page admin appear")
    public void listCulturePageAdminAppear() {
        cultureAdminStep.cultureHeaderAdminIsDisplayed();
    }

    @When("User click add button {string}")
    public void userClickAddButton(String page) {
        switch (page){
            case "culture admin" :
                addCultureStep.addCultureAdmin();
                break;
            case "event user" :
                myEventStep.clickButtonAdd();
                break;
            default:
        }
    }

    @Then("Reports culture appear")
    public void reportsCultureAppear() {
        cultureAdminStep.verifyReportData();
    }
}
