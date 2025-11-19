package day16;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated;

public class w3schools {
    private WebDriver driver;
    private Actions make;

    @Before
    public void setDriver() {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--disable-blink-features=AutomationControlled");
        chromeOptions.addArguments("--start-maximized");
        chromeOptions.addArguments("--disable-infobars");
//        chromeOptions.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
        driver = new ChromeDriver(chromeOptions);
        make = new Actions(driver);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));


    }

    @Test
    public void checkGoogleOutput() {
        driver.get("https://www.w3schools.com/java/");

        WebElement tutorialH1 = driver.findElement(By.xpath("//*[text()='Tutorial']"));

        make
                .doubleClick(tutorialH1)
                .keyDown(Keys.LEFT_CONTROL)
                .sendKeys("c")
                .keyUp(Keys.LEFT_CONTROL)
                .build().perform();

        driver.navigate().to("https://google.com");
        driver.findElement(By.name("q")).click();

        make
                .keyDown(Keys.LEFT_CONTROL)
                .sendKeys("v")
                .keyUp(Keys.LEFT_CONTROL)
                .sendKeys(Keys.ENTER)
                .build()
                .perform();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(visibilityOfElementLocated(By.xpath("//div[@id='rso']//div[@data-rpos = 32]")));
        List<WebElement> searchResults = driver.findElements(By.xpath("//div[@id='rso']//div[contains(@data-rpos, '') and @data-rpos != 12]"));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        int numberOfResultsWithTheWord = 0;

        for (WebElement searchResult : searchResults) {
            String text = searchResult.getText().toLowerCase();
            if (text.contains("туториал") || text.contains("tutorial")) {
                numberOfResultsWithTheWord++;
            }
        }

        Assert.assertEquals("At least one of 10 search results does not contain word tutorial or туториал", 10, numberOfResultsWithTheWord);
    }

    @After
    public void quitDriver() {
        if (null != driver) {
            driver.quit();
        }
    }

}
