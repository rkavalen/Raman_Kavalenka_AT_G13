package day16;

import org.junit.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.time.LocalDate;
import java.util.Collections;

public class BookingTask {
    private WebDriver driver;

    @Before
    public void setDriver() {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--disable-blink-features=AutomationControlled");
        chromeOptions.addArguments("--start-maximized");
        chromeOptions.addArguments("--disable-infobars");
        chromeOptions.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
        driver = new ChromeDriver(chromeOptions);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @Test
    public void sortingAndFilteringTest() {
        driver.get("https://booking.com");
        try {
            driver.findElement(By.xpath("//button[@aria-label='Скрыть меню входа в аккаунт.']")).click();
        } catch (NoSuchElementException e) {
//            e.printStackTrace();
        }

        WebElement searchField = driver.findElement(By.name("ss"));
        searchField.clear();
        searchField.sendKeys("Париж");
        driver.findElement(By.xpath("//div[text()='Париж']")).click();

        LocalDate fromDay = LocalDate.now().plusDays(3);
        LocalDate toDay = fromDay.plusDays(7);
        driver.findElement(By.xpath(String.format("//*[@data-date='%s']", fromDay))).click();
        driver.findElement(By.xpath(String.format("//*[@data-date='%s']", toDay))).click();

        driver.findElement(By.xpath("//button[@data-testid='occupancy-config']")).click();
        WebElement adultAdder = driver.findElement(By.xpath("//input[@id='group_adults']/..//button[2]"));
        adultAdder.click();
        adultAdder.click();

        driver.findElement(By.xpath("//input[@id='no_rooms']/..//button[2]")).click();

        driver.findElement(By.xpath("//button[@type='submit']")).click();

        driver.findElement(By.xpath("//div[@data-filters-item='class:class=5']")).click();
        driver.findElement(By.xpath("//div//button[@data-testid='sorters-dropdown-trigger']")).click();
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.xpath("//div//button[@data-id='class_asc']")));
        driver.findElement(By.xpath("//div//button[@data-id='class_asc']")).click();


        Assert.assertEquals("Рейтинг первого отеля не 5", "5 из 5", driver.findElement(By.xpath("//div[@role='button'][1]")).getAttribute("aria-label"));
    }

    @After
    public void quitDriver() {
        if (driver != null) {
            driver.quit();
        }
    }
}
