package starter.step;

import net.thucydides.core.annotations.Step;
import starter.pages.AddCulturesPage;

public class AddCultureStep {

    AddCulturesPage addCulturesPage;

    @Step
    public void openAddCulturePage(){
        addCulturesPage.open();
    }

    @Step
    public void inputFieldTitle(String title){
        addCulturesPage.inputFieldTitle(title);
    }

    @Step
    public void inputUploadPhoto(String path){
        addCulturesPage.inputUploadPhoto(path);
    }

    @Step
    public void inputFieldDetail(String detail){
        addCulturesPage.inputFieldDetail(detail);
    }

    @Step
    public void inputFieldCity(String city){
        addCulturesPage.inputFieldCity(city);
    }
}
