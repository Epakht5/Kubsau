package testCases;

import org.junit.Before;
import org.junit.Test;
import pages.MainKubsauPage;
import pages.SchedulePage;

public class CheckClassSchedule extends BaseTest{

    private MainKubsauPage mainKubsauPage;
    private SchedulePage schedulePage;

    @Before
    public void initializePageObjects(){
        mainKubsauPage = new MainKubsauPage();
        schedulePage = new SchedulePage();
    }

    @Test
    public void checkShedule() {

        mainKubsauPage.clickOnLogo();

        mainKubsauPage.isUniqueElementOnMainPage();

        mainKubsauPage.clickOnDropDownList();

        mainKubsauPage.clickOnEducationButton();

        mainKubsauPage.clickOnScheduleClass();

        schedulePage.fillFieldByGroup();

        schedulePage.clickOnSubmit();

        schedulePage.fillFieldByClass();

        schedulePage.clickOnSubmit();

    }
}
