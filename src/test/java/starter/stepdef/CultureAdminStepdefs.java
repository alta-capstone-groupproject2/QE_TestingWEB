package starter.stepdef;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.step.AddCultureStep;
import starter.step.CultureAdminStep;

public class CultureAdminStepdefs {

    @Steps
    CultureAdminStep cultureAdminStep;
    @Steps
    AddCultureStep addCultureStep;

    @Then("List culture page admin appear")
    public void listCulturePageAdminAppear() {
        cultureAdminStep.cultureHeaderAdminIsDisplayed();
    }

    @When("User click add button")
    public void userClickAddButton() {
        addCultureStep.openAddCulturePage();
    }

    @Then("Reports culture appear")
    public void reportsCultureAppear() {
        cultureAdminStep.verifyReportData();
    }
}
