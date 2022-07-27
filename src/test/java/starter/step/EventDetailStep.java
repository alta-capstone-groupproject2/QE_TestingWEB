package starter.step;

import net.thucydides.core.annotations.Step;
import starter.pages.EventDetailPage;

public class EventDetailStep {

    EventDetailPage eventDetailPage;

    @Step
    public void clickButtonJoin(){
        eventDetailPage.clickButtonJoin();
    }
}
