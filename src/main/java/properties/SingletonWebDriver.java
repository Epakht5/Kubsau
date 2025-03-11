package properties;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SingletonWebDriver {

    private static SingletonWebDriver instance = null;
    private static WebDriver driver;

    private SingletonWebDriver(){
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--incognito");
        driver = new ChromeDriver(chromeOptions);
        driver.manage().window().setSize(new Dimension(375,920));
    }

    public static SingletonWebDriver getInstance(){
        if (instance == null)
            instance = new SingletonWebDriver();
        return instance;
    }

    public WebDriver getDriver(){
        return driver;
    }

    public static void quitDriver(){
        driver.quit();
    }
}
