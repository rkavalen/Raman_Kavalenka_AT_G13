package classwork.day21;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;

public class AndroidWebAppTest {
    public static void main(String[] args) throws InterruptedException, URISyntaxException, MalformedURLException {
        ChromeOptions caps = new ChromeOptions();
        caps.setCapability("appium:deviceName", "Emulator");
        caps.setCapability("appium:automationName", "UiAutomator2");
        caps.setCapability("platformName", "Android");
        caps.setCapability("browserName", "chrome");

        WebDriver driver = new RemoteWebDriver(new URI("http://localhost:4723").toURL(), caps);

        driver.get("https://stackoverflow.com/");

        Thread.sleep(10000);

        driver.quit();
    }
}