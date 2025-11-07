package playground.essence.people.junit;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.junit.runners.Parameterized;
import playground.essence.people.AutomatedEngineer;
import playground.essence.people.Engineer;
import playground.essence.people.ManualEngineer;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ParametrizedJUnitTest {
    private final Engineer en;
    private final int age;
    private final int skill;
    private final int experience;

    public ParametrizedJUnitTest(Engineer en, int age, int experience, int skill) {
        this.en = en;
        this.age = age;
        this.skill = skill;
        this.experience = experience;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> engineers() {
        return Arrays.asList(new Object[][]{
                {new ManualEngineer(30, 5), 30, 5, 10},
                {new AutomatedEngineer(30, 5), 30, 5, 15}
        });
    }

    @Rule
    public TestName name = new TestName();

    @Test
    public void verifyAgeGetter() {
        System.out.println(String.format("Executing %s test .. ", name.getMethodName()));
        Assert.assertEquals("Engineer age field is not correct", age, en.getAge());
    }

    @Test
    public void verifyExpGetter() {
        System.out.println(String.format("Executing %s test .. ", name.getMethodName()));
        Assert.assertEquals("Engineer experience field is not correct", experience, en.getExperience());
    }

    @Test
    public void verifySkillGetter() {
        System.out.println(String.format("Executing %s test .. ", name.getMethodName()));
        Assert.assertEquals("Engineer skill field is not correct", skill, en.getSkill());
    }

    @Test
    public void verifyAgeSetter() {
        System.out.println(String.format("Executing %s test .. ", name.getMethodName()));
        int newage = 33;
        en.setAge(newage);
        Assert.assertEquals("Engineer age field is not set correctly", newage, en.getAge());
    }

    @Test
    public void verifyExpSetter() {
        System.out.println(String.format("Executing %s test .. ", name.getMethodName()));
        int newexp = 33;
        en.setExperience(newexp);
        Assert.assertEquals("Engineer experience field is not set correctly", newexp, en.getExperience());
    }

    @Test
    public void verifySkillSetter() {
        System.out.println(String.format("Executing %s test .. ", name.getMethodName()));
        int newSkill = 33;
        en.setSkill(newSkill);
        Assert.assertEquals("Engineer skill field is not set correctly", newSkill, en.getSkill());
    }
}
