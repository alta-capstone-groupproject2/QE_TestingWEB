package starter.step;

import net.thucydides.core.annotations.Step;
import starter.pages.UpgradeAccountPage;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class UpgradeAccountStep {

    UpgradeAccountPage upgradeAccountPage;

    @Step
    public void clickButtonUpgradeAccount(){
        upgradeAccountPage.clickButtonUpgradeAccount();
    }

    @Step
    public void verifyUpgradeAccountHead(){
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        assertTrue(upgradeAccountPage.upgradeAccountHead());
    }

    @Step
    public void uploadFileDoc(String path){
        upgradeAccountPage.uploadFileDoc(path);
    }

    @Step
    public void inputFieldStore(String data){
        upgradeAccountPage.inputFieldStore(data);
    }

    @Step
    public void inputFieldOwner(String data){
        upgradeAccountPage.inputFieldOwner(data);
    }

    @Step
    public void inputPhoneField(String data){
        upgradeAccountPage.inputPhoneField(data);
    }

    @Step
    public void inputFieldCity(String data) {
        upgradeAccountPage.inputFieldCity(data);
    }

    @Step
    public void inputFieldAddress(String data){
        upgradeAccountPage.inputFieldAddress(data);
    }
}
