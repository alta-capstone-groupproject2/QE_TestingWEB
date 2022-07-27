package starter.stepdef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.step.*;

public class RegisterStepdefs {

    @Steps
    RegisterStep registerStep;
    @Steps
    LoginStep loginStep;
    @Steps
    UpgradeAccountStep upgradeAccountStep;
    @Steps
    LandingStep landingStep;
    @Steps
    AddCultureStep addCultureStep;
    @Steps
    DashboardStep dashboardStep;
    @Steps
    CulturesStep culturesStep;
    @Steps
    CultureAdminStep cultureAdminStep;
    @Steps
    MyEventStep myEventStep;
    @Steps
    AddEventUserStep addEventUserStep;
    @Steps
    ListEventSubmissionStep listEventSubmissionStep;
    @Steps
    DetailEventAdminStep detailEventAdminStep;
    @Steps
    EventsStep eventsStep;
    @Steps
    EventDetailStep eventDetailStep;

    @Given("User already on the {string} page")
    public void userAlreadyOnThePage(String page) {

        switch (page){
            case "sign up" :
                registerStep.openRegisterPage();
                break;
            case "login" :
                loginStep.openLoginPage();
                break;
            case "landing" :
                landingStep.openLandingPage();
                break;
            default:
        }
    }

    @Then("{string} page appear")
    public void signupPageAppear(String page) {
        switch (page) {
            case "sign up":
                registerStep.verifySignUpPage();
                break;
            case "login":
                loginStep.verifyLoginPage();
                break;
            case "upgrade account" :
                upgradeAccountStep.verifyUpgradeAccountHead();
                break;
            case "admin" :
                loginStep.verifyAdminPage();
                break;
            case "dashboard user" :
                dashboardStep.verifyProfileHeader();
                break;
            case "cultures" :
                culturesStep.verifyListCulturesPage();
                break;
            case "culture detail" :
                culturesStep.verifyCulturesDetailPage();
                break;
            case "my event" :
                myEventStep.verifyMyEventPage();
                break;
            case "apply event user" :
                addEventUserStep.verifyApplyEvent();
                break;
            case "events" :
                eventsStep.verifyEventsPage();
                break;
            default:
        }
    }

    @When("User input field {string} with {string}")
    public void userInputFieldUsername(String field, String data) {
        switch (field.toLowerCase()){
            case "username" :
                registerStep.inputFieldUsername(data);
                break;
            case "email" :
                registerStep.inputFieldEmail(data);
                break;
            case "password" :
                registerStep.inputFieldPassword(data);
                break;
            case "store" :
                upgradeAccountStep.inputFieldStore(data);
                break;
            case "owner" :
                upgradeAccountStep.inputFieldOwner(data);
                break;
            case "phone" :
                upgradeAccountStep.inputPhoneField(data);
                break;
            case "city" :
                upgradeAccountStep.inputFieldCity(data);
                break;
            case "address" :
                upgradeAccountStep.inputFieldAddress(data);
                break;
            case "title" :
                addCultureStep.inputFieldTitle(data);
                break;
            case "detail" :
                addCultureStep.inputFieldDetail(data);
                break;
            case "city culture" :
                addCultureStep.inputFieldCity(data);
                break;
            case "report culture" :
                culturesStep.inputFieldReportCulture(data);
                break;
            case "name" :
                addEventUserStep.inputFieldName(data);
                break;
            case "host" :
                addEventUserStep.inputFieldHost(data);
                break;
            case "date start" :
                addEventUserStep.inputFieldStartDate(data);
                break;
            case "date end" :
                addEventUserStep.inputFieldEndDate(data);
                break;
            case "price" :
                addEventUserStep.inputFieldPrice(data);
                break;
            case "address events" :
                addEventUserStep.inputFieldAddresEvent(data);
                break;
            case "city event" :
                addCultureStep.inputFieldCity(data);
                break;
            default:
        }

    }

    @And("User click {string} button")
    public void userClickSignUpButton(String page) {
        if(page.equalsIgnoreCase("upgrade account")){
            upgradeAccountStep.clickButtonUpgradeAccount();
        } else if(page.equalsIgnoreCase("submit report culture")){
            culturesStep.clickSubmitReport();
        } else if(page.equalsIgnoreCase("detail culture")){
            cultureAdminStep.clickButtonDetail();
        } else if(page.equalsIgnoreCase("detail event submission")){
            listEventSubmissionStep.clickDetail();
        } else if (page.equalsIgnoreCase("accept event")) {
            detailEventAdminStep.clickAcceptButton();
        } else if (page.equalsIgnoreCase("join")) {
            eventDetailStep.clickButtonJoin();
        } else {
            registerStep.clickButtonSignup();
        }
    }

    @Then("Popup message {string} Appear")
    public void popupMessageAppear(String message) {
        registerStep.popUpMessage(message);
    }
}
