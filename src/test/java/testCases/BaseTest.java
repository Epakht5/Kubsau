package testCases;

import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import properties.SingletonWebDriver;

abstract class BaseTest {
    private static final Logger logger = LoggerFactory.getLogger(BaseTest.class);
    protected WebDriver driver;

    @Before
    public void setUp(){
        logger.info("Setting up web driver before tests starting");
        driver = SingletonWebDriver.getInstance().getDriver();
        driver.get("https://kubsau.ru/");
    }

//    @After
//    public void tearDown(){
//        logger.info("Closing WebDriver");
//        SingletonWebDriver.quitDriver();
//        logger.debug("WebDriver successfully closed");
//    }
}
