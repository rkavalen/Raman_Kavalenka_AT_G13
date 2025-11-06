package playground.essence.people.junit;

import org.junit.Test;
import playground.essence.people.ManualEngineer;

import static org.junit.Assert.assertEquals;

public class ManualEngineerJUnitTest {
    @Test
    public void getAgeTest() {
        ManualEngineer manualEngineer = new ManualEngineer(20, 1);
        assertEquals("getAgeTest failure", 20, manualEngineer.getAge());
    }

    @Test
    public void getExperienceTest() {
        ManualEngineer manualEngineer = new ManualEngineer(20, 1);
        assertEquals("getExperienceTest failure", 1, manualEngineer.getExperience());
    }

    @Test
    public void getSkillTest() {
        ManualEngineer manualEngineer = new ManualEngineer(20, 1);
        assertEquals("getSkillTest failure", 2, manualEngineer.getSkill());
    }

    @Test
    public void setAgeTest() {
        ManualEngineer manualEngineer = new ManualEngineer(20, 1);
        manualEngineer.setAge(21);
        assertEquals("setAgeTest failure", 21, manualEngineer.getAge());
    }

    @Test
    public void setExperienceTest() {
        ManualEngineer manualEngineer = new ManualEngineer(20, 1);
        manualEngineer.setExperience(2);
        assertEquals("setExperienceTest failure", 2, manualEngineer.getExperience());
    }

    @Test
    public void setSkillTest() {
        ManualEngineer manualEngineer = new ManualEngineer(20, 1);
        manualEngineer.setSkill(3);
        assertEquals("getSkillTest failure", 3, manualEngineer.getSkill());
    }

}
