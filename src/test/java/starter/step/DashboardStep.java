package starter.step;

import net.thucydides.core.annotations.Step;
import starter.pages.DashboardPage;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class DashboardStep{

    DashboardPage dashboardPage;

    @Step
    public void verifyProfileHeader(){
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        assertTrue(dashboardPage.profilHeaderIsDisplayed());
    }

}
