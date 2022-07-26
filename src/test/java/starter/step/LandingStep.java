package starter.step;

import net.thucydides.core.annotations.Step;
import starter.pages.LandingPage;

import java.util.concurrent.TimeUnit;

public class LandingStep {

    LandingPage landingPage;

    @Step
    public void openLandingPage(){
        landingPage.open();
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Step
    public void clickCultureMenu(){
        landingPage.clickLinkCultures();
    }

    @Step
    public void clickLoginMenu(){
        landingPage.clickLogin();
    }
}
