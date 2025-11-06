package classwork.day16;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BookingTask {
    /**
     * WEBDRIVER
     * <p>
     * Задание:
     * 1. Перейти на сайт booking.com
     * 2. Найти отели для города «Париж»,
     * с проживанием на 7 ночей заездом через 3 дня,
     * для 4 взрослых в 2 номерах
     * 3. Отфильтровать отели с рейтингом 5
     * 4. Отсортировать по рейтингу начиная с самого низкого
     * и проверить, что у первого в списке он == 5
     * <p>
     * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
     * new WebDriverWait(driver, Duration.ofSeconds(10)).until(
     * ExpectedConditions.invisibilityOfElementLocated(By.xpath("//span[contains(., 'сейчас')]")));
     *
     */
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://booking.com");
        try {
            driver.findElement(By.xpath("//button[@aria-label='Скрыть меню входа в аккаунт.']")).click();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
        }
        WebElement searchField = driver.findElement(By.name("ss"));
        searchField.click();
        searchField.sendKeys("Париж");

    }
}
