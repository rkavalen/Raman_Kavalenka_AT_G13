package day16;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.invisibilityOf;
import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated;

public class BookingToolTip {
    private WebDriver driver;

    @Before
    public void setDriver() {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--disable-blink-features=AutomationControlled");
        chromeOptions.addArguments("--start-maximized");
        chromeOptions.addArguments("--disable-infobars");
        driver = new ChromeDriver(chromeOptions);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @Test
    public void checkToolTip() {
        driver.get("https://booking.com");
        try {
            driver.findElement(By.xpath("//button[@aria-label='Скрыть меню входа в аккаунт.']")).click();
        } catch (NoSuchElementException e) {
//            e.printStackTrace();
        }

        Actions actions = new Actions(driver);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        By.ByXPath tooltipLocator = new By.ByXPath("//body/div[last()]/div");

        WebElement ccyButton = driver.findElement(By.xpath("//button[@data-testid='header-currency-picker-trigger']"));
        actions.moveToElement(ccyButton).perform();
        wait.until(visibilityOfElementLocated(tooltipLocator));
        WebElement ccyToolTip = driver.findElement(tooltipLocator);
        Assert.assertEquals("ccy tooltip text check failed", "Выберите валюту", ccyToolTip.getText());

        actions.moveToElement(driver.findElement(By.xpath("//div[@data-testid='searchbox-layout-wide']"))).perform();
        wait.until(invisibilityOf(driver.findElement(tooltipLocator)));

        WebElement laguageButton = driver.findElement(By.xpath("//button[@data-testid='header-language-picker-trigger']"));
        actions.moveToElement(laguageButton).perform();
        wait.until(visibilityOfElementLocated(tooltipLocator));
        WebElement languageToolTip = driver.findElement(tooltipLocator);
        Assert.assertEquals("language tooltip text check failed", "Выберите язык", languageToolTip.getText());

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @After
    public void quitDriver() {
        if (null != driver) {
            driver.quit();
        }
    }
}
