package tests;

import driver.Driver;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;

import java.io.File;
import java.io.IOException;

import static org.apache.commons.io.FileUtils.copyFile;

public class BookingLondon {
    private WebDriver driver;

    @Before
    public void setDriver() {
        driver = Driver.getDriver();
        Driver.setTimeout(5);
    }

    @Test
    public void tenthLondonHotel() throws IOException {
        driver.get("https://booking.com");
        try {
            driver.findElement(By.xpath("//button[@aria-label='Скрыть меню входа в аккаунт.']")).click();
        } catch (NoSuchElementException e) {
//            e.printStackTrace();
        }

        WebElement searchField = driver.findElement(By.name("ss"));
        searchField.clear();
        searchField.sendKeys("London");
        driver.findElement(By.xpath("//div[text()='London']")).click();
        driver.findElement(By.xpath("//button[@type='submit']")).click();

        WebElement tenthHotel = driver.findElement(By.xpath("//div[@data-testid='property-card'][10]"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true)", tenthHotel);
        ((JavascriptExecutor) driver).executeScript("arguments[0].style.backgroundColor = 'green'", tenthHotel);
        ((JavascriptExecutor) driver).executeScript("arguments[0].style.color = 'red'", tenthHotel);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click()", tenthHotel);

        File screen = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        copyFile(screen, new File("pic.png"));
    }
}
