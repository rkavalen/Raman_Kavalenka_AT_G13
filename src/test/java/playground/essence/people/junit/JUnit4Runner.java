package playground.essence.people.junit;

import day15.WeatherTask;
import day16.BookingTask;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
//        AutomatedEngineerJUnitTest.class,
//        ManualEngineerJUnitTest.class,
//        ParametrizedJUnitTest.class,
//        WeatherTask.class,
        BookingTask.class
})

public class JUnit4Runner {
}
