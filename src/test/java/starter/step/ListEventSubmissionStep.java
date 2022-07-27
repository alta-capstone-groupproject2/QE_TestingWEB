package starter.step;

import net.thucydides.core.annotations.Step;
import starter.pages.ListSubmissionEventPage;

public class ListEventSubmissionStep {

    ListSubmissionEventPage listSubmissionEventPage;

    @Step
    public void openListSubmission(){
        listSubmissionEventPage.open();
    }

    @Step
    public void clickDetail(){
        listSubmissionEventPage.clickDetailButton();
    }

}
