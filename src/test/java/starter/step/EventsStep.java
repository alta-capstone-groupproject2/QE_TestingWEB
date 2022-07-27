package starter.step;

import net.thucydides.core.annotations.Step;
import starter.pages.EventsPage;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class EventsStep {
    EventsPage eventsPage;

    @Step
    public void verifyEventsPage(){
        assertTrue(eventsPage.eventHeadIsDisplayed());
    }

    @Step
    public void clickDataEvents(){
        eventsPage.clickDataEvents();
    }
}
