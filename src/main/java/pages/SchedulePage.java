package pages;

import elements.Button;
import elements.TextBox;

public class SchedulePage extends BasePage{

    private String fieldForFillingGroupOrClass = "//input[@class='form-control ui-autocomplete-input']";
    private String submit = "//button[@type='submit']";
    private String searchByClass = "//fieldset[@class='form-check radio-button']/child::label[@for='by_class']";

    public void fillFieldByGroup(){
        new TextBox(fieldForFillingGroupOrClass).sendKeys("ИТ2204");
    }

    public void clickOnSubmit(){
        new Button(submit, "Submit button").click();
    }

    public void fillFieldByClass(){
        new Button(searchByClass, "By class radio-button").click();
        new TextBox(fieldForFillingGroupOrClass).sendKeys("420гд");
    }
}
