package driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Optional;


public class Driver {
    private static WebDriver driver;

    public enum Config {
        CHROME,
        FF,
        REMOTE
    }

    protected static Config config =
            Optional.ofNullable(System.getProperty("CONFIG")).isEmpty() ?
                    Config.CHROME : Config.valueOf(System.getProperty("CONFIG"));

    public static WebDriver getDriver() {
        if (null == driver) {
            driver = getWebDriver();
        }
        return driver;
    }

    private static WebDriver getWebDriver() {
        return switch (config) {
            case FF -> getFFDriver();
            case REMOTE -> getRemoteDriver();
            default -> getChromeDriver();
        };
    }

    private static WebDriver getChromeDriver() {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--disable-blink-features=AutomationControlled");
        chromeOptions.addArguments("--start-maximized");
        chromeOptions.addArguments("--disable-infobars");
        return new ChromeDriver(chromeOptions);
    }

    public static void get(String url) {
        driver.get(url);
    }

    public static void setTimeout(int seconds) {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(seconds));
    }

    public static void waitUntillVisible(String xPath) {
        Driver.setTimeout(0);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xPath)));
        Driver.setTimeout(5);
    }

    public static void waitUntillClickable(By.ByXPath xPath) {
        Driver.setTimeout(0);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(xPath));
        Driver.setTimeout(5);
    }

    public static WebElement findByXpath(String xPath) {
        return driver.findElement(By.xpath(xPath));
    }

    public static WebElement findByName(String name) {
        return driver.findElement(By.name(name));
    }

    public static WebElement findByID(String id) {
        return driver.findElement(By.id(id));
    }

    public void quit() {
        if (null != driver) {
            driver.quit();
        }
    }

    //TODO
    private static WebDriver getRemoteDriver() {
        return null;
    }

    //TODO
    private static WebDriver getFFDriver() {
        return null;
    }
}
