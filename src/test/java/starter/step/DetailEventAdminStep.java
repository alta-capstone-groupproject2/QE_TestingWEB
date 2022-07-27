package starter.step;

import net.thucydides.core.annotations.Step;
import starter.pages.DetailEventAdminPage;

public class DetailEventAdminStep {

    DetailEventAdminPage detailEventAdminPage;

    @Step
    public void clickAcceptButton(){
        detailEventAdminPage.clickAcceptButton();
    }
}
