package starter.step;

import net.thucydides.core.annotations.Step;
import starter.pages.CulturesPage;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class CulturesStep {

    CulturesPage culturesPage;

    @Step
    public void verifyListCulturesPage(){
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        assertTrue(culturesPage.cultureHeaderIsDisplayed());
        assertTrue(culturesPage.cultureData());
    }

    @Step
    public void verifyCulturesDetailPage(){
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        assertTrue(culturesPage.locationCulture());
        assertTrue(culturesPage.detailCulture());
        assertTrue(culturesPage.imageCulture());
    }

    @Step
    public void clickCulture(){
        culturesPage.clickCulture();
    }

    @Step
    public void inputFieldReportCulture(String report){
        culturesPage.inputFieldReportCulture(report);
    }

    @Step
    public void clickSubmitReport(){
        culturesPage.clickSubmitReport();
    }
}
