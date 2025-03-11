package testCases;

import org.junit.Before;
import org.junit.Test;
import pages.MainKubsauPage;

public class CheckVK extends BaseTest{

    private MainKubsauPage mainKubsauPage;

    @Before
    public void initializePageObject(){
        mainKubsauPage = new MainKubsauPage();
    }

    @Test
    public void testVk(){

        mainKubsauPage.clickOnLogo();

        mainKubsauPage.isUniqueElementOnMainPage();

        mainKubsauPage.clickOnDropDownList();

        mainKubsauPage.clickOnVkIcon();

    }

}
