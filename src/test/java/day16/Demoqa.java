package day16;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class Demoqa {
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
    public void selectOptions() {
        driver.get("https://demoqa.com/select-menu");

//setTimeout(function(){debugger;}, 5000);
        driver.findElement(By.id("withOptGroup")).click();
        driver.findElement(By.id("react-select-2-option-0-0")).click();

        driver.findElement(By.id("selectOne")).click();
        driver.findElement(By.xpath("//div[text()='Mr.']")).click();

        WebElement oldStyleSelectMenu = driver.findElement(By.id("oldSelectMenu"));
        Select oldStyleSelect = new Select(oldStyleSelectMenu);
        oldStyleSelect.selectByVisibleText("Red");
        oldStyleSelect.selectByValue("1");
        oldStyleSelect.selectByIndex(3);

        WebElement multiselectDropDown = driver.findElement(By.id("react-select-4-input"));
        multiselectDropDown.sendKeys("Bl");
        multiselectDropDown.sendKeys(Keys.TAB);
        multiselectDropDown.sendKeys("Black");
        multiselectDropDown.sendKeys(Keys.ENTER);

        WebElement standartMultiSelect = driver.findElement(By.id("cars"));
        Select standartMulti = new Select(standartMultiSelect);
        standartMulti.selectByValue("saab");
        standartMulti.selectByVisibleText("Audi");
    }

    @After
    public void quitDriver() {
        if (null != driver) {
            driver.quit();
        }
    }
}
