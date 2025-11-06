package classwork.day15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WeatherComTask {
    public static void main(String[] args) throws InterruptedException {
        // runs chromedriver LOCALLY
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");
        driver.findElement(By.name("q")).sendKeys("погода Минск");
        Thread.sleep(500);
        driver.findElement(By.xpath("//ul[@role='listbox']/li[1]")).click();
        Thread.sleep(500);
        // captcha
//        driver.findElement(By.id("res")).findElement(By.xpath())
    }
}
