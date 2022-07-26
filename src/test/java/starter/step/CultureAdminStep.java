package starter.step;

import net.thucydides.core.annotations.Step;
import starter.pages.CultureAdminPage;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class CultureAdminStep {

    CultureAdminPage cultureAdminPage;

    @Step
    public void cultureHeaderAdminIsDisplayed(){
        assertTrue(cultureAdminPage.cultureAdminHeader());
    }

    @Step
    public void clickAddButton(){
        cultureAdminPage.clickaddButton();
    }

    @Step
    public void clickButtonDetail(){
        cultureAdminPage.clickButtonDetail();
    }

    @Step
    public void verifyReportData(){
        assertTrue(cultureAdminPage.reportTextIsDisplayed());
        assertTrue(cultureAdminPage.reportDataIsDisplayed());
    }
}
