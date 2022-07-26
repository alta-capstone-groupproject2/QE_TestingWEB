package starter.step;

import net.thucydides.core.annotations.Step;
import starter.pages.AdminPage;

public class AdminStep {

    AdminPage adminPage;

    @Step
    public void clickCultureMenu(){
        adminPage.clickMenuCulture();
    }
}
