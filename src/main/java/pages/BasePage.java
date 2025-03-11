package pages;

import elements.BaseElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BasePage extends BaseElement {
    private static final Logger logger = LoggerFactory.getLogger(BasePage.class);
    private String pageName;
    private String xpath;
    private WebDriverWait wait = new BaseElement().Wait();

    public BasePage(){}

    public BasePage(String locator, String pageName) {
        super(locator);
        this.pageName = pageName;
    }

    public boolean isPageOpen(){
        logger.info("Waiting for page {} to open", pageName);
        return isLocated().isDisplayed();
    }


    public boolean isPageClosed(){
        try {
            wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(xpath)));
            return true;
        } catch (Exception e) {
            System.out.println(pageName+" did not close: " + e.getMessage());
            return false;
        }
    }
}
