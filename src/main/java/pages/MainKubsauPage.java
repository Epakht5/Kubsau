package pages;

import elements.Button;
import org.openqa.selenium.support.ui.WebDriverWait;
import properties.SingletonWebDriver;

import java.util.Set;

public class MainKubsauPage extends BasePage{

    private String mainPageLogo = "//*[@class='container header-logo']/*";
    private String uniqueMainPageElement = "//div[@class='index-news-list']";
    private String education = "//*[@class='wrapper']/descendant::*[contains(text(),'Обучение')]";
    private String scheduleClass = "//*[@class='is-section']/descendant::a[contains(text(),'Расписание занятий')]";
    private String dropDownList = "//div[@data-toggle-link='mobileMenu']";
    private String vk = "//a[@class='m-rounded-links__link flex-center'][1]";
    private WebDriverWait wait = Wait();

    public boolean isUniqueElementOnMainPage(){
        return new BasePage(uniqueMainPageElement, "News list").isPageOpen();
    }

    public void clickOnLogo(){
        new Button(mainPageLogo, "Main logo").click();
    }

    public void clickOnDropDownList(){
        new Button(dropDownList, "Hamburger main menu").click();
    }

    public void clickOnEducationButton(){
        new Button(education, "Education button").click();
    }

    public void clickOnScheduleClass(){
        new Button(scheduleClass, "ScheduleClass button").click();
        String mainWindow = SingletonWebDriver.getInstance().getDriver().getWindowHandle();
        wait.until(d -> d.getWindowHandles().size() > 1);

        Set<String> allWindows = SingletonWebDriver.getInstance().getDriver().getWindowHandles();
        for (String window : allWindows) {
            if (!window.equals(mainWindow)) {
                SingletonWebDriver.getInstance().getDriver().switchTo().window(window);
                break;
            }
        }
    }

    public void clickOnVkIcon(){
        new Button(vk, "VK button").click();
    }

}
