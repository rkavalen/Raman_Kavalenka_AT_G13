package tests.booking;

import driver.Driver;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

public class BaseTest {
    private WebDriver driver;

    @Before
    public void setDriver() {
        driver = Driver.getDriver();
        Driver.setTimeout(5);
    }

    @After
    public void destroyDriver() {
        Driver.destroy();
    }
}
