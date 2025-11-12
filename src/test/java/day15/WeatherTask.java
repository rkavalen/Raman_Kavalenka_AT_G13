package day15;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class WeatherTask {
    private WebDriver driver;

    @Before
    public void setDriver() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
    }

    @Test
    public void getTomorrowNoonTemp() {
        driver.get("https://google.com");
        driver.findElement(By.name("q")).sendKeys("погода Минск");
        driver.findElement(By.xpath("//ul[@role='listbox']/li[1]")).click();
        String theDay = driver.findElement(By.xpath("//div[@data-wob-di='1']/div")).getAttribute("aria-label");
        driver.findElement(By.xpath("//div[@data-wob-di='1']")).click();
        String ariaLabel = String.format("//*[contains(@aria-label, 'Celsius %s 12:00')]", theDay);
        String temp = driver.findElement(By.xpath(ariaLabel)).getAttribute("aria-label").split("°")[0];
        System.out.printf("Завтра в 12.00 будет %s градусов\n", temp);
    }

    @After
    public void quitDriver(){
        driver.quit();
    }
}