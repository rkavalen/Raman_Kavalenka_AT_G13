package runners;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import tests.selenium.Demoqa;
import tests.selenium.W3schools;
import tests.selenium.WeatherTask;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        WeatherTask.class,
        W3schools.class,
        Demoqa.class
})

public class Junit4SeleniumRunner {
}