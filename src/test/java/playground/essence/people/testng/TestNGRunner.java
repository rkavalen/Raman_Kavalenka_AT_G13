package playground.essence.people.testng;

import org.testng.TestNG;

public class TestNGRunner {
    public static void main(String[] args) {
        TestNG testNG = new TestNG();
        testNG.setTestClasses(new Class[]{ParametrizedTestNGTest.class});
        testNG.setVerbose(3);
        testNG.run();
    }
}
