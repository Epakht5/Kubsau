package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import properties.SingletonWebDriver;


import java.time.Duration;

public class BaseElement {
    private static final Logger logger = LoggerFactory.getLogger(BaseElement.class);
    private final int timeOutInSeconds = 10;
    private String xpath;
    private String elementName;

    public BaseElement(){}

    public BaseElement(String locator){
        this.xpath=locator;
    }

    public BaseElement(String locator, String elementName){
        this.xpath = locator;
        this.elementName = elementName;
    }

    public WebElement isLocated(){
        return new WebDriverWait(SingletonWebDriver.getInstance().getDriver(), Duration.ofSeconds(timeOutInSeconds))
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
    }

    public WebElement getElement() {
        logger.info("Finding element {} located by {}", elementName, xpath);
        return new WebDriverWait(SingletonWebDriver.getInstance().getDriver(), Duration.ofSeconds(timeOutInSeconds))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
    }

    public String getElementName() {
        return elementName;
    }

    public WebDriverWait Wait(){
        return new WebDriverWait(SingletonWebDriver.getInstance().getDriver(), Duration.ofSeconds(timeOutInSeconds));
    }
}
