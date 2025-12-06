package runners;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import tests.engineers.junit4.AutomatedEngineerJUnitTest;
import tests.engineers.junit4.ManualEngineerJUnitTest;
import tests.engineers.junit4.ParametrizedJUnitTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        AutomatedEngineerJUnitTest.class,
        ManualEngineerJUnitTest.class,
        ParametrizedJUnitTest.class
})

public class Junit4EngineerRunner {
}