package playground.essence.people.testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import playground.essence.people.AutomatedEngineer;
import playground.essence.people.Engineer;
import playground.essence.people.ManualEngineer;

import static org.testng.Assert.assertEquals;

public class ParametrizedTestNGTest {
    @DataProvider(name = "test1")
    public static Object[][] engineers() {
        return new Object[][]{
                {new ManualEngineer(30, 5), 30, 5, 10},
                {new AutomatedEngineer(30, 5), 30, 5, 15}
        };
    }

    @Test(dataProvider = "test1")
    public void verifyAgeGetter(Engineer engineer, Integer expectedAge, Integer expectedExp, Integer expectedSkill) {
        assertEquals(engineer.getAge(), expectedAge, "Engineer age field is not correct");
    }

    @Test(dataProvider = "test1")
    public void verifySkillGetter(Engineer engineer, Integer expectedAge, Integer expectedExp, Integer expectedSkill) {
        assertEquals(engineer.getSkill(), expectedSkill, "Engineer skill field is not correct");
    }

    @Test(dataProvider = "test1")
    public void verifyExpGetter(Engineer engineer, Integer expectedAge, Integer expectedExp, Integer expectedSkill) {
        assertEquals(engineer.getExperience(), expectedExp, "Engineer exp field is not correct");
    }

    @Test(dataProvider = "test1")
    public void verifyAgeSetter(Engineer engineer, Integer expectedAge, Integer expectedExp, Integer expectedSkill) {
        int newAge = expectedAge + 1;
        engineer.setAge(newAge);
        assertEquals(engineer.getAge(), newAge, "Engineer age field is not set correctly");
    }

    @Test(dataProvider = "test1")
    public void verifySkillSetter(Engineer engineer, Integer expectedAge, Integer expectedExp, Integer expectedSkill) {
        int newSkill = expectedSkill + 1;
        engineer.setSkill(newSkill);
        assertEquals(engineer.getSkill(), newSkill, "Engineer skill field is not set correctly");
    }

    @Test(dataProvider = "test1")
    public void verifyExpSetter(Engineer engineer, Integer expectedAge, Integer expectedExp, Integer expectedSkill) {
        int newExp = expectedExp + 1;
        engineer.setExperience(newExp);
        assertEquals(engineer.getExperience(), newExp, "Engineer exp field is not set correctly");
    }
}
