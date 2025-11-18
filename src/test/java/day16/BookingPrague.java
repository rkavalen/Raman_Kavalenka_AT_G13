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
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Set;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated;

public class BookingPrague {
    private WebDriver driver;

    @Before
    public void setDriver() {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--disable-blink-features=AutomationControlled");
        chromeOptions.addArguments("--start-maximized");
        chromeOptions.addArguments("--disable-infobars");
        driver = new ChromeDriver(chromeOptions);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test
    public void firstPragueHotelRating() {
        driver.get("https://booking.com");
        try {
            driver.findElement(By.xpath("//button[@aria-label='Скрыть меню входа в аккаунт.']")).click();
        } catch (NoSuchElementException e) {
//            e.printStackTrace();
        }

        WebElement searchField = driver.findElement(By.name("ss"));
        searchField.clear();
        searchField.sendKeys("Прага");
        driver.findElement(By.xpath("//div[text()='Прага']")).click();

        driver.findElement(By.xpath("//button[@type='submit']")).click();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(visibilityOfElementLocated(By.xpath("//div[@data-testid='property-card']")));
        driver.findElement(By.xpath("//div[@data-testid='filters-group-label-content']")).click();
        wait.until(visibilityOfElementLocated(By.xpath("//div[@data-testid='property-card']")));

        driver.findElement(By.xpath("//div[@data-testid='property-card'][1]//h3")).click();

        String currentWindowHandle = driver.getWindowHandle();
        Set<String> allWindowHandles = driver.getWindowHandles();
        for (String handle : allWindowHandles) {
            if (!handle.equals(currentWindowHandle)) {
                driver.switchTo().window(handle);
            }
        }

        wait.until(visibilityOfElementLocated(By.xpath("//div[@data-testid='review-score-right-component']")));
        String rating = driver.findElement(By.xpath("//div[@data-testid='review-score-right-component']/div[@aria-hidden]")).getText();

        Assert.assertTrue("Rating is less than 9", Double.parseDouble(rating.replace(',', '.')) >= 9.0);
    }

    @After
    public void quitDriver() {
        if (null != driver) {
            driver.quit();
        }
    }
}
