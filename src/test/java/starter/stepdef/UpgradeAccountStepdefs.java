package starter.stepdef;

import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.step.AddCultureStep;
import starter.step.UpgradeAccountStep;

public class UpgradeAccountStepdefs {

    @Steps
    UpgradeAccountStep upgradeAccountStep;
    @Steps
    AddCultureStep addCultureStep;

    @When("User upload file in directory {string} for {string}")
    public void userUploadFileInDirectory(String path, String type) {
        switch (type){
            case "upgrade account" :
                upgradeAccountStep.uploadFileDoc(path);
                break;
            case "add culture" :
                addCultureStep.inputUploadPhoto(path);
                break;
            default:
        }

    }
}
