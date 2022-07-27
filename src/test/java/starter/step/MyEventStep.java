package starter.step;

import net.thucydides.core.annotations.Step;
import starter.pages.MyEventPage;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class MyEventStep {

    MyEventPage myEventPage;

    @Step
    public void verifyMyEventPage(){
        assertTrue(myEventPage.myEventHeadIsDisplayed());
    }

    @Step
    public void clickButtonAdd(){
        myEventPage.buttonPlus();
    }

}
